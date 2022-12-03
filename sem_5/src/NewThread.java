public class NewThread  extends Thread{
    NewThread(String name){
        super(name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " started...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток был выключен");
        }
        System.out.println(Thread.currentThread().getName() + " finished...");
    }

}
