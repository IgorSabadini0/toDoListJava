public class Task {
    private int id;
    private String description;
    private boolean isDone;

    Task(int id, String description) {
        this.id = id;
        this.description = description;
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

    public void markAsDone() {
        this.isDone = true;
    }

    @Override
    public String toString() {
        String status = this.isDone ? "[X]" : "[ ]"; // Operador Ternário -> [ (condição) ? (retorno caso verdadeiro) : (retorno caso falso) ]
        return status + " " + this.id + " - " + this.description;
    }
}
