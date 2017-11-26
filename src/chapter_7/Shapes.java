package chapter_7;

abstract class TwoDShape{
    private double width;
    private double height;
    private String name;

    TwoDShape() {

        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    double getWidth() {return width; }
    double getHeight() {return height; }

    String getName() {return name;}

    void setWidth(double w) {width = w; }
    void setHeight(double h) {height = h; }


    void showDim() {
        System.out.println("Ширина и высота - "
                + width + " и " + height);
    }

    abstract double area();

}


class Triangle extends TwoDShape {
    private String style;

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "треугольник");
        style = s;
    }
    Triangle(double x) {
        super(x, "треугольник");
        style = "закрашенный";
    }
    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    double area() {
        return getWidth() * getHeight() /2;
    }

    void showStyle() {
        System.out.println("Треугольник " + style);
    }
}

class Rectangle extends TwoDShape {
    Rectangle() {
        super();
    }
    Rectangle(double w, double h) {
        super(w, h, "прямоугольник");
    }
    Rectangle(double x) {
        super(x, "квадрат");
    }
    Rectangle(Rectangle ob) {
        super(ob);
    }

    boolean isSquare() {
        return getWidth() == getHeight();
    }
    double area() {
        return getWidth() * getHeight();
    }
}

class Circle extends TwoDShape{
    Circle () {
        super();
    }

    Circle(double x){
        super(x, "Круг");
    }
    Circle(Circle ob) {
        super(ob);
    }
    double area(){
        return (getHeight()/2) * (getHeight()/2) *Math.PI;
    }
}

public class Shapes {
    public static void main(String arg[]) {
        TwoDShape shapes[] = new TwoDShape[4];

        shapes[0] = new Triangle("контурный", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        //shapes[4] = new TwoDShape(10, 20, "фигура");

        for (TwoDShape d:shapes) {
            System.out.println("Объект - " + d.getName());
            System.out.println("Площадь - " + d.area());
            System.out.println();
        }
        Circle c = new Circle(3);
        System.out.println(c.area());
    }
}