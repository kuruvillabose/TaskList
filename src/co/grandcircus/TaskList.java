package co.grandcircus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskList {

	public static void main(String[] args) {
		List<Task> addTask = new ArrayList<Task>();
		Scanner scan = new Scanner(System.in);
		int menuOption = 0;
		int i = 0;
		System.out.println("Welcome to the Task Manager");
		try {
			do {
				System.out.println("1.List tasks");
				System.out.println("2.Add task");
				System.out.println("3.Delete task");
				System.out.println("4.Mark task complete");
				System.out.println("5.Quit");
				System.out.println("What would you like to do...");
				menuOption = scan.nextInt();

				switch (menuOption) {

				case 1:
					//if(addTask.indexOf(addTask.get(i))<0) {System.out.println("No tasks added");}
					//else {
					System.out.println("LIST TASKS");
					System.out.printf("%10s%10s%25s%25s", "Done", "Due Date", "Team Member", "Description");
					System.out.println();
					System.out
							.println("==============================================================================");

					for (i = 0; i < addTask.size(); i++) {
						System.out.println(addTask.get(i));// task.getDone(),task.getDueDate(),task.getName(),task.getTaskDesc());
						System.out.println();
					}
					//}

					break;
				case 2:
					String name, taskDesc, dueDate;

					System.out.println("ADD TASK");
					System.out.println("Team Member Name:");
					name = scan.next();
					System.out.println("Task Description");
					taskDesc = scan.next();
					System.out.println("Due Date:");
					dueDate = scan.next();

					addTask.add(new Task(name, taskDesc, dueDate));
					System.out.println("Task Entered");

					break;
				case 3:
					System.out.println("Enter Task number to be deleted");
					int taskPos = scan.nextInt();

					if (taskPos > i || taskPos <= 0) {
						System.out.println("Enter a valid Task Number");
					} else {
						for (int j = 0; j < addTask.size(); j++) {
							int pos = addTask.indexOf(addTask.get(j));
							if (taskPos == (pos + 1)) {
								addTask.remove(j);
								System.out.println("Task No. " + taskPos + " Deleted");
							}
							else {
								System.out.println("Not found");
							}
						}
					}
					break;
				case 4:
					System.out.println("Enter the task number");
					int markTask = scan.nextInt();

					if (markTask > i || markTask <= 0) {
						System.out.println("Enter a valid Task Number");
					} else {
						for (int j = 0; j < addTask.size(); j++) {

							int pos = addTask.indexOf(addTask.get(j));
							if (markTask == (pos + 1)) {
								
								//System.out.println("Task No. " + markTask + " Deleted");
							}

							else {
								System.out.println("Not found");
							}
						}
					}
					break;
				case 5:
					System.out.println("Have a great day!!!");
					break;
				default:
					System.out.println("Sorry, please enter valid Option");
				}// End of switch statement
			} while (menuOption != 5);
			System.out.println("Thanks for using this Program...");
		} catch (Exception ex) {
			// Error Message
			System.out.println("Sorry problem occured within Program");
			// flushing scanner
			// scan.next();
			scan.close();
		}
	}

}
