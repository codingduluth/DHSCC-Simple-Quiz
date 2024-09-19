import java.util.Scanner;

public class SimpleQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // Keep track of the score

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("a) Madrid");
        System.out.println("b) Berlin");
        System.out.println("c) Paris");
        System.out.println("d) Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("c")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! The correct answer is 'c) Paris'.\n");
        }

        // Question 2
        System.out.println("Question 2: What is 5 + 7?");
        System.out.println("a) 10");
        System.out.println("b) 12");
        System.out.println("c) 13");
        System.out.println("d) 15");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! The correct answer is 'b) 12'.\n");
        }

        // Question 3
        System.out.println("Question 3: Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.println("d) Venus");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("b")) {
            score++;
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! The correct answer is 'b) Mars'.\n");
        }

        // Show final score
        System.out.println("Quiz over! Your final score is: " + score + "/3");

        // Closing the scanner
        scanner.close();
    }
}
