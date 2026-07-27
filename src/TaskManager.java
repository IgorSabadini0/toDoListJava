import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> Tasks;
    private int nextId;

    public TaskManager() { // Constructor
        this.Tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public void addTask(String description, int priority) {
        if (priority > 5) {
            System.out.println("Error: Max value priority is 5.");
            System.out.println("Try again");
            return;
        }

        Task newTask = new Task(this.nextId, description, priority); // o status inicia FALSE
        this.Tasks.add(newTask);

        System.out.println("Task successfully added! (ID: " + this.nextId + ")");
        this.nextId++;
    }

    public void listAll() {
        System.out.println("\n ==== MY TASKS ====");
        if (this.Tasks.isEmpty()) {
            System.out.println("No tasks registered yet.");
            return;
        }

        for (Task t : this.Tasks) { // Foreach, mas tbm pode ser: for (int i = 0; i < this.Tasks.size(); i++) {  }
            System.out.println(t);
        }
    }

    public void markAsDoneById(int id) {
        for (Task t : this.Tasks) {
            if (t.getId() == id) {
                if (t.isDone()) {
                    System.out.println("Warning: Task ID " + id + " is already completed!");
                } else {
                    t.markAsDone();
                    System.out.println("Task ID " + id + " marked as completed!");
                }
                return;
            }
        }
        System.out.println("Error: No task found with ID " + id);
    }

    public void deleteTask(int id) {
        for (Task t : this.Tasks) {
            if (t.getId() == id) {
                this.Tasks.remove(t);
                System.out.println("Task ID " + id + " successfully removed!");
                return;
            }
            System.out.println("Error: No task found with ID " + id);
        }
    }

    public void changePriority(int id, int priority) {
        for (Task t : this.Tasks) {
            if (t.getId() == id) {
                t.toString();
                t.setPriority(priority);
                return;
            }
            System.out.println("Error: No task found with ID " + id);
        }
    }
}
