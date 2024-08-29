import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;

public class Duke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String exitMsg = "Bye, see u again!";
        System.out.println("Hello, I'm Axel, nice to meet you!");
        while (true) {
            String prompt = sc.nextLine();
            if (prompt.equals("bye")) {
                System.out.println(exitMsg);
            } else {
                list.add(prompt);
                System.out.println(list);
            }
        }
    }
}
