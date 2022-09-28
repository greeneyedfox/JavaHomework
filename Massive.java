import java.util.Random;

public class Massive {
    int []arr;
    int []weights;
    public Massive(int []arr, int []weights){
        this.arr = arr;
        this.weights = weights;
    }

    public void getRandom(){
        /**
         * Метод позволяет получить случайное число с учетом его веса,
         * для этого сперва создается массив с количеством элементов каждого
         * числа из массива равным соответствующему весу, а затем уже
         * применяется функция Random
         */
        int size = 0;
        for (int i=0; i<this.weights.length; i++){
            size += weights[i];
        }
        int []lst = new int[size];
        int num;
        int c = 0;
        for (int i=0; i<this.arr.length; i++){
            for (int j=0; j<this.weights[i]; j++){
                lst[c] = arr[i];
                c += 1;
            }
        }
        int rnd = new Random().nextInt(lst.length);
        num = lst[rnd];
        System.out.println("Рандомное число (с учетом веса): " + num);
    }
}
