import java.util.Scanner;

public class zadanie6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 1 liczbe : ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj drugą liczbe : ");
        int num2 = scanner.nextInt();

        System.out.println(num1 +  "+" +  num2 + "=" +(num1+num2));
        System.out.println(num1 +  "x" +  num2 + "=" +(num1*num2));
        System.out.println(num1 +  "/" +  num2 + "=" +(num1/num2));
        System.out.println(num1 +  "mod" +  num2 + "=" +(num1%num2));

    }
}
