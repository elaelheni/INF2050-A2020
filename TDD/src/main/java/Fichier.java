public class Fichier {

    public static String nomFichier(String chemin){
        return chemin.substring(chemin.lastIndexOf('/')+1);
    }
    public static  String extensionFichier (String chemin){
        return chemin.contains(".") ? chemin.substring(chemin.lastIndexOf('.')+1) : "";
    }
}
