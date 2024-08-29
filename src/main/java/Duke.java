import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exitMsg = "Bye, see u again!";
        System.out.println("Hello, I'm Axel, nice to meet you!");
        while (true) {
            String prompt = sc.nextLine();
            if (prompt.equals("bye")) {
                System.out.println(exitMsg);
            } else {
                System.out.println(prompt);
            }
        }
    }
}
