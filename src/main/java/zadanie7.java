import java.util.Scanner;

public class zadanie7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę : ");
        int num1 = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + "=" + (num1 * (i + 1)));
        }
    }
}

