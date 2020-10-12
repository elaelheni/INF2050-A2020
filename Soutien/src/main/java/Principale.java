import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Principale {

    public static void main (String[] args) throws IOException {
        validationNbrArguments(args.length);
        ArrayList<String> lignes = RecuperationDonnees.lectureFichier(args[0]);
        ArrayList<Personne> liste = RecuperationDonnees.personnes(lignes);
        GenerationDonnees.creationFichier(liste, args[1]);

    }

   static void validationNbrArguments (int args){
        if (args != 2){
            System.out.println("Le programme a besoin de 2 arguments!");
            System.exit(0);
        }
   }
}
