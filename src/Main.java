public class Main {

    static int counter = 1;
    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.printf("\nФИО сотрудника — %s\n", fullName);
    }
}