import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Axel {
    public static void displayList(List<Task> anyList) {
        for (int i = 0; i < anyList.size(); i++) {
            System.out.println((i + 1) + "." + anyList.get(i).toString());
        }
    }
    public static void main(String[] args) {
        String welcomeMsg = " /\\_/\\\n" +
                "( ^.^ ) Hii! I am Axel, nice to meet you\n" +
                "(  >**< )";
        Scanner sc = new Scanner(System.in);
        List<Task> taskList = new ArrayList<>();
        String exitMsg = "Bye, see u again!";

        System.out.println(welcomeMsg);
        while (sc.hasNext()) {
            String prompt = sc.nextLine();
            if (prompt.equals("bye")) {
                System.out.println(exitMsg);
            } else if (prompt.equals("list")) {
                System.out.println("Here are the tasks in your list:");
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
            } else if (prompt.startsWith("todo")) {
                String taskName = prompt.substring(5);
                ToDo task = new ToDo(taskName);
                taskList.add(task);
                System.out.println("Got it. I've added this task:\n"
                + task.toString() + "\nNow you have " + taskList.size() + " tasks in the list");
            } else if (prompt.startsWith("deadline")) {
                String imm1 = prompt.substring(9);
                String[] partition = imm1.split("/by");
                String taskName = partition[0];
                String dueBy = partition[1];
                Deadline task = new Deadline(taskName, dueBy);
                taskList.add(task);
                System.out.println("Got it. I've added this task:\n"
                        + task.toString() + "\nNow you have " + taskList.size() + " tasks in the list");
            } else if (prompt.startsWith("event")) {
                String imm1 = prompt.substring(6);
                String[] partition1 = imm1.split("/from");
                String taskName = partition1[0];
                String imm2 = partition1[1];
                String[] partition2 = imm2.split("/to");
                String from = partition2[0];
                String to = partition2[1];
                Event task = new Event(taskName, from, to);
                taskList.add(task);
                System.out.println("Got it. I've added this task:\n"
                        + task.toString() + "\nNow you have " + taskList.size() + " tasks in the list");
            }
        }
    }
}
