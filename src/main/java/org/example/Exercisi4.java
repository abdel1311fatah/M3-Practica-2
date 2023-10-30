package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercisi4 {
    public Exercisi4() {
    }

    public void exercisi4() throws IOException {

        File llista = new File("llista2.txt");

        if (!llista.exists()) { // si no existeix

            llista.createNewFile();

            String texte = "1,2,3,4,5,\n6,7,8,9,10,\n11,12,13,14,15,\n16,17,18,19,20";

            FileWriter fw = new FileWriter(llista);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(texte);
            bw.newLine();
            bw.close();

            BufferedReader br;
            texte = "";
            int gran = 0, petit = 0, fila = 0;
            ArrayList<Integer> grans = new ArrayList<>();
            ArrayList<Integer> petits = new ArrayList<>();

            try {
                List<String> allLines = Files.readAllLines(Paths.get(llista.toURI()));

                for (String line : allLines) {
                    String[] numeros = line.split(",");
                    for (String numeroStr : numeros) {
                        int numero = Integer.parseInt(numeroStr);

                        if (gran <= numero) {
                            gran = numero;
                        }
                        if (petit > numero) {
                            petit = numero;
                        }
                    }
                    grans.add(gran);
                    petits.add(petit);
                    petit = 0;
                    gran = 0;
                    fila++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 4; i++) {
                System.out.println("El numero mes gran de la fila " + (i + 1) + " es " + grans.get(i));
                System.out.println("El numero mes petit de la fila " + (i + 1) + " es " + petits.get(i));
            }

        } else {

            String texte = "1,2,3,4,5,\n6,7,8,9,10,\n11,12,13,14,15,\n16,17,18,19,20";

            FileWriter fw = new FileWriter(llista);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(texte);
            bw.newLine();
            bw.close();

            BufferedReader br;
            texte = "";
            int fila = 0;
            ArrayList<Integer> grans = new ArrayList<>();
            ArrayList<Integer> petits = new ArrayList<>();

            try {
                List<String> allLines = Files.readAllLines(Paths.get(llista.toURI()));

                for (String line : allLines) {
                    String[] numeros = line.split(",");
                    int gran = 0;
                    int petit = 0;

                    for (String numeroStr : numeros) {
                        int numero = Integer.parseInt(numeroStr);
                        if (gran <= numero) {
                            gran = numero;
                        }
                        if (petit >= numero) {
                            petit = numero;
                        }
                    }

                    grans.add(gran);
                    petits.add(petit);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 4; i++) {
                System.out.println("El numero mes gran de la fila " + (i + 1) + " es " + grans.get(i));
                System.out.println("El numero mes petit de la fila " + (i + 1) + " es " + petits.get(i));
            }
        }
    }
}
