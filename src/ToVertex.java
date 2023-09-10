import java.util.Scanner;

public class ToVertex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of 'a': ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of 'b': ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of 'c': ");
        int c = scanner.nextInt();
        // x koordinatis gamotvla
        double h = -1.0 * b / (2 * a);
        // y koordinatis gamotvla
        double k = a * Math.pow(h, 2) + b * h + c;
        // gantolebis vertex formad gardaqmna
        System.out.println("The vertex form of the parabola is:");
        System.out.println("y = " + a + "(x - " + h + ")^2 + " + k);
        scanner.close();
    }
}
