package lab11_3;

public class Lab11_3 {

    public static void main(String[] args) {
        Mail mail = new Mail();
        mail.publish.subscribe("get", new LogOpenListener("Times NY"));
        mail.publish.subscribe("send", new AdressNotificationListener("Lenina str, 28"));

        try {
            mail.get("Times NY");
            mail.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
