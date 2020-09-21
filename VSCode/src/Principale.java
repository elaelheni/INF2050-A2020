package src;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principale {
    public static void main(String args[]) throws IOException {
        System.out.println("Hello World");

        int x = 7;
        int y = 5;

        System.out.printf("Avant la pérmutation:%nx:%d%ny:%d", x,y);

        int temp;

        temp = x;
        x = y;
        y = temp;

        System.out.printf("%nAprès la pérmutation:%nx:%d%ny:%d%n", x,y);

        //LectureFichier.affichage();

        try {
            System.out.println(Utf8File.loadFileIntoString("Livres.txt"));
            
        } catch (FileNotFoundException e) {
            System.out.println ("Le fichier n'existe pas");
            System.exit(0);
        }





    }
}