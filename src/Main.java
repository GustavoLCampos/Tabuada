import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada:");
        tabuada = scan.nextInt();

        for (int i = 1; i <=10; i++){

            System.out.println(tabuada + "x" + i + " = " + (tabuada*i));

        }

    }
}
