class SplitDigits {
    public static int[] split(int intToSplit) {
        int result;

        //Convert input to String, so we can use .split()
        String intToSplitAsString = Integer.toString(intToSplit);
        String[] splitDigits = intToSplitAsString.split("");

        //Create new int array that can hold all the digits from the input
        int[] integers = new int[splitDigits.length];

        // for every item in the String Array, create an entry in the int array
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(splitDigits[i]);
        }

        // return the splitted int array to the caller
        return integers;
    }
}