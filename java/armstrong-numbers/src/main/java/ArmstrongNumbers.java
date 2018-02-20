class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		int[] numbers = splitNumbers(numberToCheck);
		int power = numbers.length;
		int sum = 0;

		for(int i = 0; i < power; i++)
			sum += Math.pow(numbers[i], power);

		return numberToCheck == sum;
	}

	int[] splitNumbers(int n) {

		char[] asChars = String.valueOf(n).toCharArray();
		int size = asChars.length;
		int[] numbers = new int[size];

		for(int i = 0; i < size; i++)
			numbers[i] = Character.getNumericValue(asChars[i]);

		return numbers;
	}
}
