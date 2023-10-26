package org.example;

public class Shop {
    static class Customer {
        String name;
        int age;
        String phone;

        public Customer(String name, int age, String phone) {
            this.name = name;
            this.age = age;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Покупатель (имя = " + name + ", возраст = " + age + ", телефон = " + phone + ")";
        }
    }

    static class Item {
        String name;
        int cost;

        public Item(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Товар (наименование ='" + name + "',стоимость =" + cost + ")";
        }
    }

    private static class Order {
        Customer customer;
        Item item;
        int amount;

        public Order(Customer customer, Item item, int amount) {
            this.customer = customer;
            this.item = item;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Заказ ( " + customer + "\n" + item + "\n"  + "Количество: " + amount + ")";
        }
    }

    public static class CustomerException extends RuntimeException {
        public CustomerException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return super.getMessage();
        }
    }

    public static class ProductException extends RuntimeException {
        public ProductException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return super.getMessage();
        }
    }

    public static class AmountException extends RuntimeException {
        public AmountException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return super.getMessage();
        }
    }

    final static Customer[] people = {
            new Customer("Ivan", 20, "+1-222-333-44-55"),
            new Customer("Petr", 30, "+2-333-444-55-66")
    };
    final static Item[] items = {
            new Item("Ball", 100),
            new Item("Sandwich", 1000),
            new Item("Table", 10000),
            new Item("Car", 100000),
            new Item("Rocket", 10000000)
    };
    static Order[] orders = new Order[5];
    public static int getOrdersLength () {
        return orders.length;
    }

    private static boolean isInArray(Object[] arr, Object o) {
        for (Object object : arr) {
            if (object.equals(o))
                return true;
        }
        return false;
    }

    static Order buy(Customer who, Item what, int howMuch) {
        if (!isInArray(people, who)) throw new CustomerException("Неизвестный покупатель:" + who);
        if (!isInArray(items, what)) throw new ProductException("Неизвестный товар:" + what);
        if (howMuch < 0 || howMuch > 100) throw new AmountException("Некорректное количество заказов:" + howMuch);
        return new Order(who, what, howMuch);
    }
}
