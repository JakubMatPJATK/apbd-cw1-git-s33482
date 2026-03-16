import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        pustaKlasa p = new pustaKlasa('*');
        do{
            System.out.println("Podaj liczbe inna niż 0");
            i = sc.nextInt();


        }while (i!=0);

        System.out.println("Wreszcie dałeś zero " + p.nazwa());

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(7);
        lista.add(8);


        int[] lista2 = {2,4,5,4,1,1,6,3,8};
        System.out.println(p.dzialanie(lista.get(0),lista.get(1),p.nazwa()));
    }
}