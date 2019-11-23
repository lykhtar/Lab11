package lab11_2;
//абстрактный класс 
public abstract class Create {

    public void create() {
        Shape shape = createShape();
        shape.shape();
     }

    public abstract Shape createShape();
}
