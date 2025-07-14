import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class todolist {

    public void printAllTasks(ArrayList<HashMap<String, Boolean>> taskList) {
        if (taskList.isEmpty()) {
            System.out.println("No tasks yet.");
            return;
        }
        System.out.println("Your tasks are:");
        int idx = 1;
        for (HashMap<String, Boolean> task : taskList) {
            for (Map.Entry<String, Boolean> entry : task.entrySet()) {
                String mark = entry.getValue() ? "\u2714" : " ";
                System.out.println(idx + ". [" + mark + "] " + entry.getKey());
                idx++;
            }
        }
    }

    public static void main(String[] args) {

        todolist obj = new todolist();
        Scanner input = new Scanner(System.in);
        ArrayList<HashMap<String, Boolean>> taskList = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Complete a task");
            System.out.println("4. Edit a task");
            System.out.println("5. Delete a task");
            System.out.println("Any other key to Exit.");
            System.out.print("What do you want to do? ");

            String userChoice = input.nextLine();
            if (userChoice.equals("1")) {
                System.out.print("Add a task: ");
                HashMap<String, Boolean> individualTask = new HashMap<>();
                String inputTask = input.nextLine();
                individualTask.put(inputTask, false);
                taskList.add(individualTask);
                System.out.println("Your task is added.");

            } else if (userChoice.equals("2")) {
                obj.printAllTasks(taskList);

            } else if (userChoice.equals("3")) {
                obj.printAllTasks(taskList);
                System.out.print("Enter the task number to complete: ");
                try {
                    int userNumber = Integer.parseInt(input.nextLine());
                    int indexOfTaskToComplete = userNumber - 1;
                    if (indexOfTaskToComplete >= 0 && indexOfTaskToComplete < taskList.size()) {
                        HashMap<String, Boolean> taskToComplete = taskList.get(indexOfTaskToComplete);
                        String completedTask = taskToComplete.keySet().iterator().next();
                        taskToComplete.put(completedTask, true);
                        System.out.println("'" + completedTask + "' marked as completed.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }

            } else if (userChoice.equals("4")) {
                obj.printAllTasks(taskList);
                System.out.print("Enter the task number to edit: ");
                try {
                    int userNumber = Integer.parseInt(input.nextLine());
                    int indexOfTaskToEdit = userNumber - 1;
                    if (indexOfTaskToEdit >= 0 && indexOfTaskToEdit < taskList.size()) {
                        System.out.print("Enter the new task: ");
                        String editedTask = input.nextLine();
                        HashMap<String, Boolean> newTask = new HashMap<>();
                        newTask.put(editedTask, false);
                        taskList.set(indexOfTaskToEdit, newTask);
                        System.out.println("Your task is edited.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }

            } else if (userChoice.equals("5")) {
                obj.printAllTasks(taskList);
                System.out.print("Enter the task number to delete: ");
                try {
                    int userNumber = Integer.parseInt(input.nextLine());
                    int indexOfTaskToDelete = userNumber - 1;
                    if (indexOfTaskToDelete >= 0 && indexOfTaskToDelete < taskList.size()) {
                        String removedTask = taskList.get(indexOfTaskToDelete).keySet().iterator().next();
                        taskList.remove(indexOfTaskToDelete);
                        System.out.println("'" + removedTask + "' has been deleted.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number.");
                }

            } else {
                System.out.println("Exiting...");
                break;
            }
        }
        input.close();
    }
}
