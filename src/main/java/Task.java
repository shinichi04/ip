public class Task {
    private boolean isDone;
    private String taskName;

    public Task(String name) {
        this.taskName = name;
        this.isDone = false;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }
    @Override
    public String toString() {
        return "[" + (isDone ? "X" : " ") + "] " + taskName;
    }
}
