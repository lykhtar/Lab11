
import java.util.ArrayList;

public class Lab11_2 {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = null;
        shapes.add(1, new Shape1());
        shapes.add(2, new Shape2());
        shapes.add(3, new Shape3());
        shapes.add(4, new Shape4());
        shapes.add(5, new Shape5());
        shapes.add(6, new Shape6());
        shapes.add(7, new Shape7());
        int max = 7;
        int min = 1;
        for (int i = 1; i <= 10; i++) {
            if (i >= shapes.size()) {
                int rand = (int) ((Math.random() * ((max - min) + 1)) + min);
                shapes.get(rand).shape();
            }
        }
    }

}


public interface Shape {

    String shape();
}

public class Shape1 implements Shape {

    @Override
    public String shape() {

        return "Shape O";
    }

}

public class Shape2 implements Shape{

      @Override
    public String shape() {

        return "Shape I";
    }

    
}

public class Shape3 implements Shape {

     @Override
    public String shape() {

        return "Shape S";
    }

    
}

public class Shape4 implements Shape {

   @Override
    public String shape() {

        return "Shape Z";
    }


}

public class Shape5 implements Shape {

    @Override
    public String shape() {

        return "Shape L";
    }

    
}

public class Shape6 implements Shape {

    @Override
    public String shape() {

        return "Shape J";
    }

    
}

public class Shape7 implements Shape {

    @Override
    public String shape() {

        return "Shape T";
    }

}
