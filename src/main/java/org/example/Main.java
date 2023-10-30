//Abel Ibarra

package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main { // esta tot en mateix projecte per que a practiques volen que ho penja tot al github i aixi en lloc de fer 4 repositoris en faig 1
    public static void main(String[] args) throws IOException {

        System.out.println("1: Exercisi 1");
        System.out.println("2: Exercisi 2");
        System.out.println("3: Exercisi 3");
        System.out.println("4: Exercisi 4");
        int option = obtindreInt("Que vols fer? ");

        switch (option) {
            case 1:
                Exercisi1 exercisi1 = new Exercisi1();
                exercisi1.exercisi1();
                break;
            case 2:
                Exercisi2 exercisi2 = new Exercisi2();
                exercisi2.exercisi2();
                break;
            case 3:
                Exercisi3 exercisi3 = new Exercisi3();
                exercisi3.exercisi3();
                break;
            case 4 :
                Exercisi4 exercisi4 = new Exercisi4();
                exercisi4.exercisi4();
                break;
            default:
                System.out.println("No has introduit un numero valid");
        }


    }

    public static int obtindreInt(String text) {
        boolean TipusCorrecte;
        Scanner sc = new Scanner(System.in);
        int num_usuari = 0;

        do {
            System.out.print(text);
            TipusCorrecte = sc.hasNextInt();
            if (!TipusCorrecte) {
                sc.nextLine();
                System.out.println("Error: Valor no válido");
            } else {
                num_usuari = sc.nextInt();
            }
        } while (!TipusCorrecte);

        return num_usuari;
    }

}