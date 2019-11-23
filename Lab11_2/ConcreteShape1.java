package lab11_2;

public class ConcreteShape1 extends Create {

    @Override
    public Shape createShape() {
        return new Shape1();
    }
}
