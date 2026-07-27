public class Task {
    private int id;
    private String description;
    private int priority;
    private boolean isDone;

    Task(int id, String description, int priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return this.isDone;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        String status = this.isDone ? "[X]" : "[ ]"; // Operador Ternário -> [ (condição) ? (retorno caso verdadeiro) : (retorno caso falso) ]
        return status + " " + this.id + " - " + this.description + " - (Priority: " + this.priority + ")";
    }
}
