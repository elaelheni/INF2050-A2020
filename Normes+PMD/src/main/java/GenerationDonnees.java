import java.io.IOException;
import java.util.ArrayList;

public class GenerationDonnees {
    static String contenu(ArrayList<Personne> listePersonnes) {
        int age = 0;
        String s = "";
        for (int i = 1; i < listePersonnes.size(); ++i) {
            age = (Personne.calculAge(listePersonnes.get(i).getDateNaissance()));
            s += listePersonnes.get(i).getNom() + "," + age + "\n";
        }

        return s;
    }

    static void creationFichier(ArrayList<Personne> listePersonnes, String fichierSortie) throws IOException {
        String s = "Nom,Age\n";
        s += contenu(listePersonnes);
        Utf8File.saveStringIntoFile(fichierSortie, s);
    }
}
