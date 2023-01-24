package p01_Database;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.naming.OperationNotSupportedException;

import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {
	Database database = null;
	Integer[] numbers = { 1, 2, 3 };

	@Before
	public void setUp() throws OperationNotSupportedException {
		database = new Database(numbers);
	}

	@Test
	public void testConstructor() throws OperationNotSupportedException {
		Integer[] result = database.getElements();
		assertArrayEquals(numbers, result);
	}

	@Test(expected = OperationNotSupportedException.class)
	public void testConstructorShouldThrowWithMoreThan16Elements() throws OperationNotSupportedException {
		Integer[] arr = new Integer[17];
		new Database(arr);
	}

	@Test(expected = OperationNotSupportedException.class)
	public void testConstructorShouldThrowWithNoElemnts() throws OperationNotSupportedException {
		Integer[] arr = new Integer[0];
		new Database(arr);
	}

	@Test
	public void testAddingElemenAtTheNextFreeCell() throws OperationNotSupportedException {
		database.add(55);
		Integer[] elements = database.getElements();
		int expected = 55;

		assertEquals(Integer.valueOf(expected), elements[elements.length - 1]);
		assertEquals(numbers.length + 1, elements.length);

	}

	@Test(expected = OperationNotSupportedException.class)
	public void testAddOperationCantAddNull() throws OperationNotSupportedException {
		database.add(null);
	}

	@Test(expected = OperationNotSupportedException.class)
	public void testRemovingShouldFromEmptyArrayShouldThrow() throws OperationNotSupportedException {
		database = new Database(1);
		database.remove();
		database.remove();
	}

	@Test
	public void testRemoveShouldRemove() throws OperationNotSupportedException {
		Integer[] dbBefore = database.getElements();
		int beforeLastElement = dbBefore[dbBefore.length - 2];

		database.remove();

		Integer[] dbAfter = database.getElements();
		int lastElement = dbAfter[dbAfter.length - 1];

		assertEquals(dbBefore.length - 1, dbAfter.length);
		assertEquals(beforeLastElement, lastElement);

	}

	@Test
	public void testReturnType() throws OperationNotSupportedException {
		database = new Database(1);
		assertTrue(database.getElements().getClass().getSimpleName().equals("Integer[]"));
	}

}
