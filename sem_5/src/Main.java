import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //# 1
//        System.out.println("Стартовал Main поток");
//        for (int i=1; i<=2; i++){
//            new NewThread("Новый поток_" + i).start();
//        }
//        System.out.println("Поток Main завершен");

        //# 2
        LinkedList<Double> stack = new LinkedList<>();
        int size = 3; //размер стека
        int nums = 2; //сколько всего чисел будет
        Thread producer = new Thread(new Producer(stack, size, nums), "Producer");
        Thread consumer = new Thread(new Consumer(stack), "Consumer");
        producer.start();
        consumer.start();
    }
}