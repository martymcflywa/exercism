class ReverseString {

    String reverse(String inputString) {
        if(isNullOrSingleChar(inputString))
            return inputString;

        return reverse(inputString.substring(1)) + inputString.charAt(0);
    }

    boolean isNullOrSingleChar(String input) {
        return input == null || input.length() <= 1;
    }
}