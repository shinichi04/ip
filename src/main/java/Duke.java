import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;

public class Duke {
    public static void displayList(List<Task> anyList) {
        for (int i = 0; i < anyList.size(); i++) {
            System.out.println((i + 1) + "." + anyList.get(i).toString());
        }
    }
    public static void main(String[] args) {
        String welcomeMsg = " /\\_/\\  \n" +
                "( •.• ) Hii! I am Axel, nice to meet you\n" +
                "(  >❤< )";
        Scanner sc = new Scanner(System.in);
        List<Task> taskList = new ArrayList<>();
        String exitMsg = "Bye, see u again!";

        System.out.println(welcomeMsg);
        while (true) {
            String prompt = sc.nextLine();
            if (prompt.equals("bye")) {
                System.out.println(exitMsg);
            } else if (prompt.equals("list")) {
                System.out.println("Here are your tasks in the list:\n");
                displayList(taskList);
            } else if (prompt.startsWith("mark")) {
                String idxString = prompt.substring(5, 6);
                Integer idxInt = Integer.parseInt(idxString);
                taskList.get(idxInt - 1).mark();
                System.out.println("Very nice! I have marked this task as done:\n"
                        + taskList.get(idxInt - 1).toString());
            } else if (prompt.startsWith("unmark")) {
                String idxString = prompt.substring(5, 6);
                Integer idxInt = Integer.parseInt(idxString);
                taskList.get(idxInt - 1).mark();
                System.out.println("OK! I have marked this task as not done yet:\n"
                        + taskList.get(idxInt - 1).toString());
            } else {
                taskList.add(new Task(prompt));
                displayList(taskList);
            }
        }
    }
}
