package app;

public class Customer {
    private final String name; // Виправлено декларацію змінної name
    private final String phone;

    // Виправлено визначення конструктора
    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Додано getters для змінних класу
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

}
