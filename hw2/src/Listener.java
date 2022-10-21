public class Listener implements Observer {
    @Override
    public void changed(UndoStringBuilder str) {
        System.out.println("Изменилось значение — " + str.toString());
    }
}
