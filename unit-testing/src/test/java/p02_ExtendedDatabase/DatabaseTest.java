package p02_ExtendedDatabase;

import static org.junit.Assert.*;

import javax.naming.OperationNotSupportedException;

import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {
	Database database;
	Person person1;
	Person person2;

	@Before
	public void setUp() throws Exception {
		person1 = new Person(1, "Pesho");
		person2 = new Person(2, "Gosho");
		database = new Database(person1, person2);
	}

	@Test(expected = OperationNotSupportedException.class)
	public void testThrowsIfThereAreUsersWithSameID() throws OperationNotSupportedException {
		database.add(new Person(1, "Kalin"));
		database.findById(1);

	}

	@Test(expected = OperationNotSupportedException.class)
	public void testThrowsIfNoUsersWithThatName() throws OperationNotSupportedException {
		database.findByUsername("Kalin");
	}

	@Test
	public void testUserIsPresentWithThatName() throws OperationNotSupportedException {
		Person person = database.findByUsername(person2.getUsername());
		assertEquals(person2.getUsername(), person.getUsername());
		assertEquals(person2.getId(), person.getId());

	}

	@Test(expected = OperationNotSupportedException.class)
	public void testThrowsIfUserParameterIsNull() throws OperationNotSupportedException {
		database.findByUsername(null);
	}

	@Test
	public void testUserIsPresentWithThatID() throws OperationNotSupportedException {
		Person person = database.findById(person1.getId());

		assertEquals(person.getUsername(), person1.getUsername());
		assertEquals(person.getId(), person1.getId());

	}

	@Test(expected = OperationNotSupportedException.class)
	public void testThrowsIfNoUserWithThatID() throws OperationNotSupportedException {
		database.findById(111);
	}

}
