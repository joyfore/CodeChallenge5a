
import java.util.Random;
import java.util.Scanner;

class CodeChallenge5 {
    public static void main(String[] args) {


        // Generate number between 1 and 10.


        // Ask user question.
        System.out.println("give a num");

        // add cases.
  /*
 Print 3 bad endings and one happy ending
  */

        // Also add a defult ending

        // Create Java input.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(10);

        scanner.close();
        String message;

        switch (num){
            case 1:
                message="hi good afternoon";
                break;
            case 2:
                message ="motivation;";
                break;
            case 3:
                message = "Uh oh, bad ending!";
                break;
            case 4:
                message = "U picked the lucky number 4. happen ending";
                break;
            default:
                message = "chose a number 4 or under";
                break;
        }

        System.out.println(message); // prints message based
    }
}
