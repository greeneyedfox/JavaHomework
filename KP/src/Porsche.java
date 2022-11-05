public class Porsche extends Car{
    protected String color;
    protected double max_speed;
    protected String transmission;
    protected double current_speed;
    protected double price;
    protected boolean convertible;
    protected boolean driving;

    public Porsche(String color, double max_speed, String transmission, double current_speed, double price){
        this.color = color;
        this.max_speed = max_speed;
        this.transmission = transmission;
        this.current_speed = current_speed;
        this.price = price;
        this.convertible = true;
        this.driving = false;
    }

    @Override
    public void start() {
        if (!this.driving){
            System.out.println("RrrrRRRRr");
            this.driving = true;
            this.current_speed = 60;
        }
        else{
            System.out.println("Машина уже заведена");
        }
    }

    @Override
    public void stop() {
        if (this.driving){
            System.out.println("Brr...");
            this.driving = false;
            this.current_speed = 0;
        }
        else {
            System.out.println("Машина уже выключена");
        }
    }

    @Override
    public void accelerate(double speed) {
        /**
         * Метод ускоряет машину + добавляет бонусную скорость (*1.1)
         */
        if ((this.current_speed + speed) <= this.max_speed) {
            System.out.println("Машина ускорилась на " + speed + " км/ч");
            this.current_speed += speed;
            System.out.println("Текущая скорость = " + this.current_speed + " км/ч");
        }
        else {
            this.current_speed = this.max_speed;
            System.out.println("Невозможно превысить максимальную скорость!");
            System.out.println("Текущая скорость = " + this.current_speed + " км/ч");
        }
    }

    public void toMaxSpeed(){
        /**
         * Метод показывает сколько можно еще разгоняться
         */
        double sp = this.max_speed-this.current_speed;
        System.out.println("До максимальной скорости нужно разогнаться на " + sp + " км/час");
    }
    public void show(){
        System.out.println("Характеристики мащины:");
        System.out.println("Цвет - " + this.color);
        System.out.println("Максимальная скорость = " + this.max_speed);
        System.out.println("Тип коробки передач - " + this.transmission);
        System.out.println("Текущая скорость = " + this.current_speed);
        System.out.println("Складываемая (с открытым верхом) - " + this.convertible);
    }
}
