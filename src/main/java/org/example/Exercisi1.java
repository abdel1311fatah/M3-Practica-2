package org.example;

import java.io.*;
import java.util.Arrays;

public class Exercisi1 {
    public Exercisi1(){
    }
    public void exercisi1() throws IOException {
        File llista = new File("llista.txt");
        String texte = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20";

        if (!llista.exists()) {

            llista.createNewFile();

            FileWriter fw = new FileWriter(llista, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(texte);
            bw.newLine();
            bw.close();

            FileReader fr = new FileReader(llista);
            BufferedReader br = new BufferedReader(fr);

            String[] texteLlista = (String.valueOf(br.readLine()).split(",")); // separem per comes
            Integer[] numerosLlista = new Integer[20]; // array on es guardaran els numeros

            for (int i = 0; i < texteLlista.length; i++) { // per omplir el array de numeros
                numerosLlista[i] = Integer.valueOf(texteLlista[i]); // https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
            }

            int gran = 0;

            for (int i = 0; i < numerosLlista.length; i++) {
                if (gran <= numerosLlista[i]){
                    gran = numerosLlista[i];
                }
            }

            System.out.println("El numero mes gran de la llista es: " + gran);

            br.close();
            fr.close();

        }else{

            FileReader fr = new FileReader(llista);
            BufferedReader br = new BufferedReader(fr);

            String[] texteLlista = (String.valueOf(br.readLine()).split(",")); // separem per comes
            Integer[] numerosLlista = new Integer[20]; // array on es guardaran els numeros

            for (int i = 0; i < texteLlista.length; i++) { // per omplir el array de numeros
                numerosLlista[i] = Integer.valueOf(texteLlista[i]); // https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
            }

            int gran = 0;

            for (int i = 0; i < numerosLlista.length; i++) {
                if (gran <= numerosLlista[i]){
                    gran = numerosLlista[i];
                }
            }

            System.out.println("El numero mes gran de la llista es: " + gran);

            br.close();
            fr.close();
        }
    }
}
