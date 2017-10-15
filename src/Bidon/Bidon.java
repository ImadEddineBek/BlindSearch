package Bidon;

public class Bidon {
    private final int maxCapacite ;
    private int capacite ;

    public Bidon(int maxCapacite, int capacite) {
        this.maxCapacite = maxCapacite;
        this.capacite = capacite;
    }
    public Bidon(Bidon b){
        maxCapacite = b.maxCapacite;
        capacite = b.capacite;
    }
    public void vider(){
        capacite = 0;
    }
    public void remplir(){
        capacite = maxCapacite;
    }
    public void transferer(Bidon bidon){
        int valeurMaxATransferer = bidon.maxCapacite - bidon.capacite;
        int valeurATransferer = Math.min(valeurMaxATransferer ,capacite);
        capacite-=valeurATransferer;
        bidon.setCapacite(bidon.capacite+valeurATransferer);
    }
    public int getMaxCapacite() {
        return maxCapacite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    @Override
    public String toString() {
        return "Bidon{" +
                "maxCapacite=" + maxCapacite +
                ", capacite=" + capacite +
                '}';
    }
}
