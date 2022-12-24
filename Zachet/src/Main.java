import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public void make_order(Table table){
        if (!table.flag){
            String quit = "q";
            Scanner msg = new Scanner(System.in);
            String message = "";
            while(message != quit){
                message = msg.nextLine();

            }
        }
        else {
            System.out.println("Столик уже занят");
        }
    }

    public static void main(String[] args) {
        LinkedList<String> total = new LinkedList<String>();
        Scanner order = new Scanner(System.in);
        Restaurant off1 = new Restaurant("Bob");
        Table dorsia = new Table("Dorsia");
        System.out.println(off1.id);
    }
}