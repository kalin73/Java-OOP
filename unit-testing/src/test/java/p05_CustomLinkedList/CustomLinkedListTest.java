package p05_CustomLinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CustomLinkedListTest {
	CustomLinkedList<Integer> list;

	@Before
	public void setUp() {
		list = new CustomLinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
	}

	@Test
	public void testAdd() {
		list.add(5);

		assertEquals(list.getCount() - 1, list.indexOf(5));
	}

	@Test
	public void testGet() {
		int element = list.get(2);

		assertEquals(3, element);
	}

	@Test
	public void testSet() {
		list.set(0, 55);

		assertEquals(Integer.valueOf(55), list.get(0));
	}

	@Test
	public void testRemoveAt() {
		int indexToRemove = list.get(1);
		int removedElement = list.removeAt(1);

		assertEquals(indexToRemove, removedElement);
	}

	@Test(expected = IllegalArgumentException.class)
	public void removeAtShouldThrowWithNegativeIndex() {
		list.removeAt(-1);
	}

	@Test
	public void testRemove() {
		int expected = 1;

		assertEquals(expected, list.remove(2));
	}

	@Test
	public void testIndexOf() {
		int expected = 2;

		assertEquals(expected, list.indexOf(3));
	}

	@Test
	public void testContains() {
		assertTrue(list.contains(1));
	}
}
