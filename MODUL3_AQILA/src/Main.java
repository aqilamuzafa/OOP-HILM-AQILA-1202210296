import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();
    boolean repeat = true;

    do {
      try {
        System.out.println("==Menu program=");
        System.out.println("1. Square (persegi)");
        System.out.println("2. Circle (lingkaran)");
        System.out.println("3. Trapezoid (trapesium)");
        System.out.println("0. Exit");
        System.out.print("\nSelect Menu: ");

        int choice = scanner.nextInt();
        switch (choice) {
          case 1:
            System.out.print("\nMasukkan sisi persegi: ");
            double side = scanner.nextDouble();
            calculation.setSquare(side);
            System.out.println("\nLuas persegi: " + calculation.getSquare());
            break;
          case 2:
            System.out.print("\nMasukkan jari-jari lingkaran: ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            System.out.println("\nLuas lingkaran: " + calculation.getCircle());
            break;
          case 3:
            System.out.print("\nMasukkan sisi atas trapesium: ");
            double a = scanner.nextDouble();
            System.out.print("Masukkan sisi bawah trapesium: ");
            double b = scanner.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            double t = scanner.nextDouble();
            calculation.setTrapezoid(a, b, t);
            System.out.println("\nLuas trapesium: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("\nProgram selesai.");
            repeat = false;
            break;
          default:
            System.out.println("\nOption not available.\n");
            continue;
        }
      } catch (InputMismatchException e) {
        System.out.println("\n===Error: Input must be a number.===\n");
        scanner.nextLine();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } 
    } while (repeat);

    scanner.close();
  }
}
