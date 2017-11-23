package Chapter_7;

class TwoDShape{
    private double width;
    private double height;

    double getWidth() {return width; }
    double getHeight() {return height; }
    void setWidth(double w) {width = w; }
    void setHeight(double h) {height = h; }


    void showDim() {
        System.out.println("Ширина и высота - "
                + width + " и " + height);
    }
}

class Triangle extends TwoDShape {
    private String style;

    Triangle(String s, double w, double h) {
        setHeight(h);
        setWidth(w);
        style = s;
    }

    double area() {
        return getWidth() * getHeight() /2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangle extends TwoDShape {
    boolean isSquere() {
        return (getWidth() == getHeight());
    }

    double area() {
        return getWidth() * getHeight();
    }
}

public class Shapes {
    public static void main(String arg[]) {
        Triangle t1 = new Triangle("закрашенный", 4.0,4.0);
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);

        System.out.println("About t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();
        System.out.println("About t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();
        TwoDShape t3 = new TwoDShape();
        t3.setWidth(3.0);
        t3.setHeight(4.0);
        t3.showDim();

        System.out.println();
        Rectangle t4 = new Rectangle();
        t4.setHeight(5.0);
        t4.setWidth(5.0);
        if (t4.isSquere()) System.out.println("Квадрат");
        else System.out.println("Прямоугольник");
        System.out.println(t4.area());


    }
}