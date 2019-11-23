package lab11_5;

public class Lab11_5 {

    public static void main(String[] args) {
        Task task = new Task();
        TaskStates ts = new TaskStates(task);
        ts.changeSt();
    }

}
