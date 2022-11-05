public class Main {
    public static void main(String[] args) {
//      Задание #1 (класс Reader и Book)
        Reader new_reader = new Reader("Иванов В.В.", 23, "Economics", "29.02.2000", "132");
        new_reader.takeBook(10);
        new_reader.returnBook(3);

        String []books = {"Что сказал Баффет?", "Макроэкономика"};
        new_reader.takeBook(books);
        new_reader.returnBook(books);

        Book []books1 = {new Book("Финансист", "Теодор Драйзер"),
                new Book("Как завоевывать друзей", "Дейл Карнеги"),
                new Book("Думай и богатей", "Наполеон Хилл")};
        new_reader.takeBook(books1);
        new_reader.returnBook(books1);

//        Задание #2
        Mercedes gls = new Mercedes("Серебристый", 240, "Auto", 0, 5500000);
        gls.start();
        gls.start();
        gls.accelerate(100);
        gls.accelerate(120);
        gls.show();
        gls.honk();
        gls.stop();
        gls.show();

        Porsche p911 = new Porsche("green", 390, "auto", 0, 6700000);
        p911.show();
        p911.start();
        p911.show();
        p911.toMaxSpeed();
        p911.accelerate(500);
        p911.stop();
        p911.stop();
    }
}