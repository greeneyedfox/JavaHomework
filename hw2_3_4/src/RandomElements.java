import java.util.ArrayList;
import java.util.LinkedList;

public class RandomElements {
    public static void randomLists() {
        /**
         * Функция создает 2 разных массива
         * из 1000000 случайных элементов
         * и замеряет время выборки из них
         */
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();

        final int N = 1000000;
        final int G = 100000;

        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < G; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("Время потраченное на выборку 100'000 элементов из ArrayList = " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < G; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        System.out.println("Время потраченное на выборку 100'000 элементов из LinkedList (порядка 200 секунд) = " + (System.currentTimeMillis() - startTime));
    }
}
