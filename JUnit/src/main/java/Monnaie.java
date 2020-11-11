public class Monnaie {
    public long getSous() {
        return sous;
    }

    final long sous;

    public Monnaie(long sous) {
        this.sous = sous;
    }

    public Monnaie aditionner(Monnaie autre){
        return new Monnaie (this.sous + autre.sous);
    }

    Monnaie soustraire(Monnaie autre){
        return new Monnaie (this.sous - autre.sous);
    }

    Monnaie pourcentage (double pourcentage){
        return new Monnaie (Math.round(this.sous * (pourcentage/100)));
    }

    //1005 -> 10,05$
    //1010 -> 10,10$
    // 5 -> 0,05$

    @Override
    public String toString() {
        String decimale = this.sous %100 < 10 ? "0"+this.sous%100 : String.valueOf(this.sous%100);

        return this.sous/100 + "," + decimale + "$" ;

    }
}
