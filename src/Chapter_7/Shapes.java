package Chapter_7;

class TwoDShape{
    private double width;
    private double height;

    TwoDShape() {

        width = height = 0.0;
    }

    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    TwoDShape(double x) {

        width = height = x;
    }

    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
    }

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

    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h);
        style = s;
    }
    Triangle(double x) {
        super(x);
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

class ColorTriangle extends Triangle {
    private String color;

    ColorTriangle(String c, String s, double w, double h) {
        super(s,w,h);
        color = c;
    }

    String getColor() {
        return color;
    }
    void showColor() {
        System.out.println("Цвет - " + color);
    }
}

public class Shapes {
    public static void main(String arg[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("контурный", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);

        t1 = t2;

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
        System.out.println("About t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

        ColorTriangle t4 = new ColorTriangle("Синий", "контурный", 8.0, 12.0);
        ColorTriangle t5 = new ColorTriangle("Красный", "закрашенный", 2.0, 2.0);

        System.out.println();
        System.out.println("About t4: ");
        t4.showStyle();
        t4.showDim();
        t4.showColor();
        System.out.println("Площадь - " + t4.area());

        System.out.println();
        System.out.println("About t5: ");
        t5.showStyle();
        t5.showDim();
        t5.showColor();
        System.out.println("Площадь - " + t5.area());

        Triangle t6 = new Triangle(t5);

        System.out.println();
        System.out.println("About t6: ");
        t6.showStyle();
        t6.showDim();
        //t6.showColor();
        System.out.println("Площадь - " + t6.area());


    }
}