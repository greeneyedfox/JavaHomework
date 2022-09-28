public class Shape {
    double volume;

    public Shape(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        /**
         * Метод возвращающий объем полученной фигуры
         */
        return this.volume;
    }
}

class Box extends Shape{
    int c = 0;
    public Box(double volume) {
        super(volume);
        this.volume = volume;
    }

    public boolean add(Shape shape){
        /**
         * Метод возвращающий true/false в зависимости
         * от доступного объема в контейнере
         */
        if (volume>=shape.getVolume()){
            c += 1;
            volume -= shape.getVolume();
            System.out.println("Еще помещается");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

class Pyramid extends Shape{
    /**
     * Пирамида (не МММ)
     */
    double s;
    double h;
    public Pyramid(double s, double h) {
        super(s*h/3);
        this.s = s;
        this.h = h;
    }
}

class SolidOfRevolution extends Shape{
    /**
     * Класс для фигур полученных путем вращения
     */
    double radius;
    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        /**
         * Функция возвращает радиус фигуры
         */
        return radius;
    }
}

class Ball extends SolidOfRevolution{
    public Ball(double volume, double radius) {
        super(4/3*Math.PI*Math.pow(radius, 3), radius);
    }
}

class Cylinder extends SolidOfRevolution{
    double height;
    public Cylinder(double volume, double radius, double height) {
        super(Math.PI*Math.pow(radius, 2)*height, radius);
        this.height = height;
    }
}
