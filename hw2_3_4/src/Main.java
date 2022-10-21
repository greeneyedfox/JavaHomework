public class Main {
    public static void main(String[] args) {
        // Задача #3
        UniqueVals array = new UniqueVals();
        array.add("asda");
        array.add("asda");
        array.add("123a");
        array.add("qwe");
        array.add("123a");
        array.add("asda");
        array.show();
        array.setArray();
        array.show();
        // Задача #4
        RandomElements rel = new RandomElements();
        rel.randomLists();
    }
}