package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i++) {
            // Запрашиваем название автомобиля
            String name;
            while (true) {
                System.out.println("Введите название машины №" + i + ":");
                name = scanner.next();
                if (!name.isEmpty()) {
                    break;
                }
                System.out.println("Ошибка: название не может быть пустым. Попробуйте снова.");
            }

            // Запрашиваем скорость автомобиля
            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + i + ":");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 1 до 250 км/ч. Попробуйте снова.");
                    }
                } else {
                    System.out.println("Ошибка: введите целое число. Попробуйте снова.");
                    scanner.next(); // сбрасываем неверный ввод
                }
            }

            Car car = new Car(name, speed);
            race.checkLeader(car);
        }

        scanner.close();
        System.out.println("Самая быстрая машина: " + race.getLeaderName());
    }
}
