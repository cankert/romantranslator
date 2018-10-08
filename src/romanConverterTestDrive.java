import java.util.Scanner;

public class romanConverterTestDrive {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Please put in the Number you want translated:");

        int userInput = reader.nextInt();
        reader.close();
        //Simulate User Input

        // Initialize emtpy result
        String result;

        //call method to convert int to roman number

        result = "Your Number corresponds to the Roman Number: " + romanConverter.convert(userInput);


        // Print out Result
        System.out.println(result);


    }
}
