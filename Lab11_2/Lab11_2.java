package lab11_2;
//главнй класс для вызова фигур
public class Lab11_2 {

    private static Create shape;

    public static void main(String[] args) {

        int max = 7;
        int min = 1;
       
        for (int i = 0; i < 7; i++) {
             int rand = (int) ((Math.random() * ((max - min) + 1)) + min);
            switch (rand) {
                case (1):
                    shape = new ConcreteShape1();
                    break;
                case (2):
                    shape = new ConcreteShape2();
                    break;
                case (3):
                    shape = new ConcreteShape3();
                    break;
                case (4):
                    shape = new ConcreteShape4();
                    break;
                case (5):
                    shape = new ConcreteShape5();
                    break;
                case (6):
                    shape = new ConcreteShape6();
                    break;
                case (7):
                    shape = new ConcreteShape7();
                    break;
            }
        }
    }
}
