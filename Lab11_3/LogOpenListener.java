package lab11_3;

public class LogOpenListener implements Subcribers {

    private String log;

    LogOpenListener(String name) {
        this.log = name;
    }

    public void update(String eventType, String name) {
        System.out.println("Get " + log + ": Mail has  " + eventType + " new newspapers " + name);
    }
}
