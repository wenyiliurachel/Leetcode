import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {

		int size = numbers.length;
		int[] sortedNumbers = new int[size];
		System.arraycopy(numbers, 0, sortedNumbers, 0, size);
		Arrays.sort(sortedNumbers);

		int head = 0;
		int tail = sortedNumbers.length - 1;

		while (head < tail) {
			if (sortedNumbers[head] + sortedNumbers[tail] < target) {
				head++;
				continue;
			} else if (sortedNumbers[head] + sortedNumbers[tail] > target) {
				tail--;
				continue;
			} else {
				break;
			}
		}

		// Find the index in original array
		int first = -1;
		int second = -1;

		for (int i = 0; i < size; i++) {
			if (numbers[i] == sortedNumbers[head]
					|| numbers[i] == sortedNumbers[tail]) {
				if (first == -1) {
					first = i + 1;
				} else {
					second = i + 1;
				}
			}
		}

		int[] result = new int[] { first, second };
		return result;
	}
}