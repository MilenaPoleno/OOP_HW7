import java.util.*;


public class Main {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("Мария", "Петрова", "закупки", 56400);
        Employee e2 = new Employee("Елена", "Суворова", "продажи", 87750);
        Employee e3 = new Employee("Елена", "Суворова", "администрация", 24390);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    
        System.out.println("Результат сравнения: " + e1.equals(e2) + "\n");
        System.out.println("Результат сравнения: " + e2.equals(e3) + "\n");
    
        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
        }
}
