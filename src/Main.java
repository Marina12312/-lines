import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName =" Ivanov";
        String fullName = lastName+" "+ firstName+" "+ middleName;
        System.out.println(fullName);
    }

    private static void task2() {
        System.out.println("задача2");
        String fullName = " ivanov ivan ivanovach";
        System.out.println(fullName.toUpperCase());


    }

    private static void task3() {
        System.out.println("Задача3");
        String fullName ="Иванов Семён Семёнович";
        String newName = fullName.replace('ё', 'e');
        System.out.println(newName);

    }
}