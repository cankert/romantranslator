public class romanConverter {


    public static String convert (int userInput){
        String result = "No Result";
        String[] oneToNine = new String[] {"I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tenToNinety = new String[] {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hundredToNinehundret = new String[] {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        int userInputLength = Integer.toString(userInput).length();

        // If the User Input has 1 Digit
        if (userInputLength==1){

           result = oneToNine[userInput-1];

        }
        // If the User Input has 2 Digits
        if (userInputLength==2){

            //Send User Input to SplitDigits Method to receive seperate Digits
            int[] splittedInput = SplitDigits.split(userInput);

            //Return the corresponding Results array for Zehnerschritt und Einserschritt
            result = tenToNinety[splittedInput[0]-1] + oneToNine[splittedInput[1]-1];

        }
        // If the User Input has 3 Digits
        if (userInputLength==3){
            // Todo split into 3 Digits but that's too easy!
        }
        return result;
    }

}

class SplitDigits {
    public static int[] split(int intToSplit){
        int result;

        //Convert input to String, so we can use .split()
        String intToSplitAsString = Integer.toString(intToSplit);
        String[] splitDigits = intToSplitAsString.split("");

        //Create new int array that can hold all the digits from the input
        int[] integers = new int[splitDigits.length];

        // for every item in the String Array, create an entry in the int array
        for (int i = 0; i < integers.length; i++) {
            integers[i]=Integer.parseInt(splitDigits[i]);
        }

        // return the splitted int array to the caller
        return integers;
    }
}
