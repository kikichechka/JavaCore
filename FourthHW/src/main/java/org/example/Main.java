package org.example;

import static org.example.Shop.*;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
    }

    public static void task1() {
        String[][] credentials = {
                {"ivan", "1i2v3a4n5i6v7a8n910111", "1i2v3a4n5i6v7a8n910111"},
                {"1i2v3a4nпррп5i6v7a8n91011", "", ""},
                {"ivan", "1i2v3a4n5i6v7a8n91011", "1i2v3a4n5"},
                {"ivan", "1i2v3a4n5", "1i2v3a4n5"},
                {"ivan", "1i2v3a4n5", "1i"}
        };

        for (String[] credential : credentials) {
            try {
                System.out.println(checkCredentials(credential[0], credential[1], credential[2]));
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean checkCredentials(String login,
                                           String password,
                                           String confirmPassword) {
        boolean conf = password.equals(confirmPassword);
        int lLen = login.length();
        int pLen = password.length();
        if (lLen >= 20) throw new WrongLoginException(lLen);
        else if (pLen > 20 || !conf) throw new WrongPasswordException(pLen, conf);
        else return true;
    }

    public static void task2() {
        Object[][] info = {
                {people[0], items[0], 1},
                {people[1], items[1], -1},
                {people[0], items[2], 150},
                {people[1], new Shop.Item("Flower", 10), 1},
                {new Shop.Customer("Fedor", 40, "+3-444-555-66-77"), items[3], 1},
        };
        var capacity = 0;
        var i = 0;
        while (capacity != getOrdersLength() - 1 && i != info.length -1 ) {
            try {
                System.out.println(orders[capacity] = buy((Customer) info[i][0], (Item) info[i][1], (int) info[i][2]));
                capacity++;
            } catch (ProductException | CustomerException e) {
                System.out.println(e.getMessage());
                System.out.println();
            } catch (AmountException e) {
                System.out.println(e.getMessage());
                System.out.println();
                System.out.println(orders[capacity++] = buy((Customer) info[i][0], (Item) info[i][1], 1));
            }
            System.out.println("Заказ:" + capacity);
            System.out.println();
            ++i;
        }
    }
}