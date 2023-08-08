public class Main {

    static int counter = 1;
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.printf("\nФИО сотрудника — %s\n", fullName);
    }

    static void task2() {
        System.out.printf("\nЗадание %d:", counter++);

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        String fullNameUpperCase = fullName.toUpperCase();
        System.out.printf("\nДанные ФИО сотрудника для заполнения отчета — %s\n", fullNameUpperCase);
    }

    static void task3() {
        System.out.printf("\nЗадание %d:", counter++);

        String firstName = "Иванов";
        String middleName = "Семён";
        String lastName = "Семёнович";
        String fullName = firstName + " " + middleName + " " + lastName;

        String replace = fullName.replace("ё", "е");
        System.out.printf("\nДанные ФИО сотрудника — %s\n", replace);
    }
}