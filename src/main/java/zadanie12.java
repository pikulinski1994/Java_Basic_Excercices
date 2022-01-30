import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe : ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj 2 liczbe : ");
        int num2 = scanner.nextInt();
        System.out.println("Podaj 3 liczbe : ");
        int num3 = scanner.nextInt();

        System.out.println("Average of the three numbers is : " + (num1+num2+num3)/3);

    }
}
