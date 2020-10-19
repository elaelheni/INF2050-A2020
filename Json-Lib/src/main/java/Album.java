public class Album {
    String titre;
    String artiste;
    String type;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPublication() {
        return publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    int publication;
    int rating;

    public Album (String type, String artiste, String titre, int publication, int rating){
        this.type = type;
        this.artiste = artiste;
        this.titre = titre;
        this.publication = publication;
        this.rating = rating;
    }

}
