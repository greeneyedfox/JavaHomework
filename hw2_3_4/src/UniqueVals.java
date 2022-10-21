import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UniqueVals {
    List<String> arr = new ArrayList(Arrays.asList());
    {}
    public void show(){
        /**
         * Функци показывает коллекцию
         */
        System.out.println(arr);
    }

    public void add(String text){
        /**
         * Функция добавляет элемент в коллекцию
         */
        arr.add(text);
    }

    public void setArray(){
        /**
         * Функция переделывает коллекцию из уникальных элементов
         */
        HashSet set = new HashSet(arr);
        this.arr.clear();
        arr.addAll(set);
    }
}
