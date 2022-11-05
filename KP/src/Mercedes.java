public class Mercedes extends Car{

    protected String color;
    protected double max_speed;
    protected String transmission;
    protected double current_speed;
    protected double price;
    protected boolean convertible;
    protected boolean driving;

    public Mercedes(String color, double max_speed, String transmission, double current_speed, double price){
        this.color = color;
        this.max_speed = max_speed;
        this.transmission = transmission;
        this.current_speed = current_speed;
        this.price = price;
        this.convertible = false;
        this.driving = false;
    }


    @Override
    public void start() {
        /**
         * Метод заводит машину и запускает ее в движение
         */
        if (!this.driving){
            System.out.println("Rrrrrr");
            this.driving = true;
            this.current_speed = 60;
        }
        else{
            System.out.println("Машина уже заведена");
        }
    }

    @Override
    public void stop() {
        /**
         * Метод останавливает машину
         */
        if (this.driving){
            System.out.println("BrrBr...");
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
         * Метод ускоряет машину
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
    public void honk(){
        /**
         * Метод гудка машины
         */
        System.out.println("Bee-Beep");
    }

    public void show(){
        /**
         * Метод показывает все характеристики машины
         */
        System.out.println("Характеристики мащины:");
        System.out.println("Цвет - " + this.color);
        System.out.println("Максимальная скорость = " + this.max_speed);
        System.out.println("Тип коробки передач - " + this.transmission);
        System.out.println("Текущая скорость = " + this.current_speed);
        System.out.println("Складываемая (с открытым верхом) - " + this.convertible);
    }
}
