import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(n) + "\n"); 
    }
    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }

}
