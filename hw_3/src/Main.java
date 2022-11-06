import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Employee> employeeList = new ArrayList<>();
        Hour_worker hw1 = new Hour_worker("Павел Прилучный", 2000, "Таксист");
        Hour_worker hw2 = new Hour_worker("Сергей Поздняков", 9809, "Топ-менеджер");
        Hour_worker hw3 = new Hour_worker("Алексей Невзоров", 300, "Юрист");
        Fixed_worker fw1 = new Fixed_worker("Станислав Романович", 3400000, "Предприниматель");
        Fixed_worker fw2 = new Fixed_worker("Антонина Столыпина", 34000, "Учитель");
        Fixed_worker fw3 = new Fixed_worker("Герман Грефф", 999999999, "Бизнесмен");

        employeeList.add(hw1);
        employeeList.add(hw2);
        employeeList.add(hw3);
        employeeList.add(fw1);
        employeeList.add(fw2);
        employeeList.add(fw3);

        Collections.sort(employeeList);
        for (int i=0; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i).show());
        }

        Collections.sort(employeeList);
        for (int i=0; i<5; i++){
            System.out.println(employeeList.get(i).getName());
        }

        Collections.sort(employeeList);
        for (int i=employeeList.size()-3; i<employeeList.size(); i++){
            System.out.println(employeeList.get(i).getId());
        }

    }
}