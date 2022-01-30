import java.util.Scanner;

public class zadnaie13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the width of the rectangle :");
        double width = scanner.nextInt();
        System.out.println("Provide the height of the rectangle :");
        double height = scanner.nextInt();

        double area = width*height;
        double permiter = 2*(width+height);
        System.out.println("Area is: " + area);
        System.out.println("Perimetere is: " + permiter);
    }
}
