package p03_IteratorTest;

import static org.junit.Assert.*;

import javax.naming.OperationNotSupportedException;

import org.junit.Before;
import org.junit.Test;

public class ListIteratorTest {
	ListIterator list;
	String text1;
	String text2;
	String text3;

	@Before
	public void setUp() throws Exception {
		list = new ListIterator(text1, text2, text3);

	}

	@Test(expected = OperationNotSupportedException.class)
	public void testConstructorShouldThrowWithNull() throws OperationNotSupportedException {
		String[] emptyArray = null;
		new ListIterator(emptyArray);
	}

	@Test
	public void testMove() {
		assertTrue(list.move());
		assertTrue(list.move());
		assertFalse(list.move());
	}

	@Test
	public void testHasNext() throws OperationNotSupportedException {
		assertTrue(list.hasNext());
		list.move();
		assertTrue(list.hasNext());
		list.move();
		assertFalse(list.hasNext());
	}

	@Test
	public void testPrintingWithElemnts() {
		assertEquals(text1, list.print());
	}

	@Test(expected = IllegalStateException.class)
	public void testPrintingWithNoElements() throws OperationNotSupportedException {
		ListIterator emptyList = new ListIterator();
		emptyList.print();
	}
}
