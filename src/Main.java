import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        Dimensions new_dim = new Dimensions(0.9, 2.3, 4.1);

        CargoInfo cargo = new CargoInfo(new Dimensions(12.3, 3.4, 8), 200,
                "Green Street, 18", true, "234HJ67", true);
        System.out.println("ЗАДАНИЕ №2:");
        System.out.println("cargo: "+cargo.toString());
        System.out.println("После изменения адреса:");
        CargoInfo cargo1 = cargo.setDeliveryAddress("Galushkin street, 12");
        System.out.println("cargo: "+cargo.toString());
        System.out.println("cargo1: "+cargo1.toString());
        System.out.println("После измененения габаритов:");
        CargoInfo cargo2 = cargo1.setDimensions(new_dim);
        System.out.println("cargo: "+cargo.toString());
        System.out.println("cargo1: "+cargo1.toString());
        System.out.println("cargo2: "+cargo2.toString());
        System.out.println("После измененения массы:");
        CargoInfo cargo3 = cargo2.setMass(2.0);
        System.out.println("cargo: "+cargo.toString());
        System.out.println("cargo1: "+cargo1.toString());
        System.out.println("cargo2: "+cargo2.toString());
        System.out.println("cargo3: "+cargo3.toString());

        System.out.println("ЗАДАНИЕ №1:");

        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }




    }
}

