package p04_BubbleSortTest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleTest {

	@Test
	public void testBubbleSort() {
		int[] arrayToSort = { 2, 1, 3 };
		int[] sortedArray = { 1, 2, 3 };

		Bubble.sort(arrayToSort);

		assertArrayEquals(sortedArray, arrayToSort);
	}
}
