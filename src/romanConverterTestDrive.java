public class romanConverterTestDrive {
    public static void main (String[] args){

        //Simulate User Input
        int userInput = 85;
        // Initialize emtpy result
        String result;

        //call method to convert int to roman number

        result = romanConverter.convert(userInput);


        // Print out Result
        System.out.println(result);


    }
}
