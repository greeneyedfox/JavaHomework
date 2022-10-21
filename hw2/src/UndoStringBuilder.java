import java.util.Stack;

public class UndoStringBuilder implements Command{
    Listener listener;
    StringBuilder str;

    Stack<Command> stack = new Stack<>();

    private class DeleteAction implements Command{
        private int size;

        public DeleteAction(int size) {
            this.size = size;
        }

        public void undo(){
            /**
             * Функция отменяет предыдущее действие (функцию)
             */
            str.delete(
                    str.length() - size, str.length());
        }
    }

    public void setListener(Listener listener){
        /**
         * Задать слушателя
         */
        this.listener = listener;
    }
    public UndoStringBuilder(){
        str = new StringBuilder("");
    }

    public void listenerNotifications(){
        /**
         * Функция оповещает об оповещении элемента
         */
        if (listener != null){
            listener.changed(this);
        }
    }


    public UndoStringBuilder delete(int start, int end) {
        /**
         * Функция удаляет часть строки
         */
        String deleted = str.substring(start, end);
        str.delete(start, end);
        listenerNotifications();
        stack.add(() -> str.insert(start, deleted));
        return this;
    }

    public UndoStringBuilder append(String text) {
        /**
         * Функция добавляет строку к строке
         */
        str.append(text);

        Command st = new Command(){
            public void undo() {
                str.delete(
                        str.length() - text.length(),
                        str.length());
            }
        };
        stack.add(st);
        return this;
    }

    public UndoStringBuilder insert(int start, String text){
        str.insert(start, text);
        listenerNotifications();
        return this;
    }

    public UndoStringBuilder reverse() {
        str.reverse();

        Command st = new Command() {
            public void undo() {
                str.reverse();
            }
        };
        stack.add(st);
        return this;
    }
    public void capacity(){
        /**
         * Функция отображает используемый объем памяти строки
         */
        System.out.println(str.capacity());
    }
    public String toString() {
        /**
         * Функция приводит объект к строке
         */
        return str.toString();
    }
    @Override
    public void undo(){
        /**
         * Функция удаляет из стэка последнюю операцию
         */
        if(!stack.isEmpty()){
            stack.pop().undo();
            listenerNotifications();
        }
    }
}
