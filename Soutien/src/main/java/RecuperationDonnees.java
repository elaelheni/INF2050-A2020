import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RecuperationDonnees {

    static ArrayList<String> lectureFichier (String fichierEntree) throws FileNotFoundException {
        ArrayList<String> lignes =new ArrayList<>();
        try {

            Scanner sc = new Scanner(new File(fichierEntree));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lignes.add(line);
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Le fichier n'existe pas");
            System.exit(0);
        }

        return lignes;
    }

    static ArrayList<Personne> personnes (ArrayList<String> lignes){
        ArrayList<Personne> p = new ArrayList<>();
        for (String l:lignes){
            List<String> elements = Arrays.asList(l.split(","));
            p.add(new Personne(elements));
        }

        return p;

    }
}
