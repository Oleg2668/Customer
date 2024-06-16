package app;

public class Main {
    public static void main(String[] args) {
        // Отримуємо дані для створення об'єкта Customer
        String[] data = getData();
        // Створюємо об'єкт Customer з отриманих даних
        Customer customer = getCustomer(data);
        // Формуємо вихідний рядок для виведення на консоль
        String output = "Customer: " + customer.getName() + ", phone " + customer.getPhone();
        // Виводимо результат на консоль
        getOutput(output);
    }

    // Метод для отримання даних (в даному випадку, вони вказані як константи)
    public static String[] getData() {
        return new String[]{"Tom", "555 123-8596"};
    }

    // Метод для створення об'єкта Customer з масиву даних
    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    // Метод для виведення результату на консоль
    public static void getOutput(String output) {
        System.out.println(output);
    }

}
