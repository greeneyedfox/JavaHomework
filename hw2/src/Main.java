public class Main {
    public static void main(String[] args) {
//        Задача 1 и 2
        UndoStringBuilder ex = new UndoStringBuilder();
        ex.setListener(new Listener());
        ex.append("Hello");
        ex.append(" Rex");
        ex.capacity();
        System.out.println(ex.toString());
        ex.undo();
        ex.delete(2,4);
        ex.undo();
    }
}