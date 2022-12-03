import java.util.Queue;

class Consumer implements Runnable {
    private final Queue<Double> stack; //создали стек

    public Consumer(Queue<Double> stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " + consume());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Double consume() throws InterruptedException {
        /**
         * Метод удаляет значение из общей очереди и не допускает ее
         * использование другому потоку, благодаря synchronized,
         * а также приостанавливает удаление из очереди, после чего пробуждает другой поток
         */
        synchronized (stack) {
            if (stack.isEmpty()) {
                stack.wait();
            }

            stack.notifyAll(); //Если мы не пробудим другой поток, после ожидания, то он так и не начнется
            return stack.poll();
        }
    }
}