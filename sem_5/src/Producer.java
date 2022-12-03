import java.util.Queue;

class Producer implements Runnable {
    private final Queue<Double> stack; //Создали стек
    private final int volume;
    private final int nums;

    public Producer(Queue<Double> stack, int size, int nums) {
        this.stack = stack;
        this.volume = size;
        this.nums = nums;
    }

    @Override
    public void run() {
        int c = 0;
        /**
         * Метод просто вызывает функцию генерации числа
         * и выводит это число на экран
         */
        while (c<=nums) {
            try {
                System.out.println("Produced: " + produce());
                c+=1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private double produce() throws InterruptedException {
        /**
         * Метод добавляет значения в общую очередь и не допускает ее
         * использование другому потоку, благодаря synchronized,
         * а также приостанавливает добавление в очередь и пробуждает другой поток
         */
        synchronized (stack) {
            if (stack.size() == volume) {
                stack.wait();
            }
            double val = Math.round(Math.random()*1000);
            stack.add(val);
            stack.notifyAll(); //Если мы не пробудим другой поток, после ожидания, то он так и не начнется
            return val;
        }
    }
}
