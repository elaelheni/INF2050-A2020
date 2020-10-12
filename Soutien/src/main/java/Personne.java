import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Personne {
    String nom;
    String prenom;
    String dateNaissance;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Personne(List<String> element){
        this.nom = element.get(0);
        this.prenom = element.get(1);
        this.dateNaissance = element.get(2);
    }

    static LocalDate fromStringToDate (String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date,formatter);
        return localDate;
    }

    static int calculAge (String date){
        LocalDate dateNaissance = fromStringToDate(date);
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }


}
