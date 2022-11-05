public class Reader {
    public String fio;
    public int reader_ticket;
    public String faculty;
    public String birthdate;
    public String phone_number;

    public Reader(String fio, int reader_ticket, String faculty, String birthdate, String phone_number) {
        this.fio = fio;
        this.reader_ticket = reader_ticket;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.phone_number = phone_number;
    }

//    Метод returnBook и takeBook - перегружены
    public void takeBook(int x) {
        /**
         * Метод показывающий сколько читатель взял книг в целочисленном выражении
         */
        if (x%100 == 2 || x%100 ==3 || x%100 ==4) {
            System.out.println(this.fio + " взял " + x + " книги.");
        } else if (x == 1) {
            System.out.println(this.fio + " взял " + x + " книгу.");
        } else {
            System.out.println(this.fio + " взял " + x + " книг.");
        }
    }

    public void takeBook(String []books){
        /**
         * Метод показывающий какие читатель взял книги в виде строки
         */
        String str_books = "";
        for (String book : books){
            str_books += (book + ", ");
        }
        str_books = str_books.trim().substring(0, str_books.length()-2);
        System.out.println(this.fio + " взял книги: " + str_books + ".");
    }

    public void takeBook(Book []books){
        /**
         * Метод показывающий какие читатель взял книги (через объект класса Book)
         */
        String str_books = "";
        for (Book book : books){
            str_books += (book.book_name + ", ");
        }
        str_books = str_books.trim().substring(0, str_books.length()-2);
        System.out.println(this.fio + " взял книги: " + str_books.trim() + ".");
    }

    public void returnBook(int x) {
        /**
         * Метод показывающий сколько читатель вернул книг в целочисленном выражении
         */
        if (x%100 ==2 || x%100 ==3 || x%100 ==4) {
            System.out.println(this.fio + " вернул " + x + " книги.");
        } else if (x == 1) {
            System.out.println(this.fio + " вернул " + x + " книгу.");
        } else {
            System.out.println(this.fio + " вернул " + x + " книг.");
        }
    }

    public void returnBook(String []books){
        /**
         * Метод показывающий какие читатель вернул книги в виде строки
         */
        String str_books = "";
        for (String book : books){
            str_books += (book + ", ");
        }
        str_books = str_books.trim().substring(0, str_books.length()-2);
        System.out.println(this.fio + " вернул книги: " + str_books.trim() + ".");
    }

    public void returnBook(Book []books){
        /**
         * Метод показывающий какие читатель вернул книги (через объект класса Book)
         */
        String str_books = "";
        for (Book book : books){
            str_books += (book.book_name + ", ");
        }
        str_books = str_books.trim().substring(0, str_books.length()-2);
        System.out.println(this.fio + " вернул книги: " + str_books.trim() + ".");
    }
}
