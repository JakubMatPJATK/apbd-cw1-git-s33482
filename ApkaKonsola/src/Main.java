import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do{
            System.out.println("Podaj liczbe inna niż 0");
            i = sc.nextInt();

        }while (i!=0);
    }
}