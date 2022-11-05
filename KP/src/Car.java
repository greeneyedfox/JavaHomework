public abstract class Car {
    protected String color;
    protected double max_speed;
    protected String transmission;
    double current_speed;
    protected double price;

    public abstract void start();

    public abstract void stop();

    public abstract void accelerate(double speed);
}
