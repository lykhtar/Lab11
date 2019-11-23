package lab11_3;

public class AdressNotificationListener implements Subcribers {

    private String adress;

    public AdressNotificationListener(String adress) {
        this.adress = adress;
    }

    public void update(String eventType, String name) {
        System.out.println("Newspapers " + adress + ": Mail has  " + eventType + " new newspaper " + name);
    }
}
