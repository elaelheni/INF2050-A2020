package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectureFichier {

    //décalrer une instance de classe
    public static Scanner fichier;


    //définir l'instance de classe
    static{
        try{
            fichier = new Scanner(new File("Livres.txt"));
        } catch (FileNotFoundException e){
            System.out.println ("Le fichier n'existe pas");
            System.exit(0);
        }
    }
  

    public static void affichage (){
        while(fichier.hasNextLine()){
            String line = fichier.nextLine();
            System.out.println(line);
        }
        fichier.close();
    }


}
