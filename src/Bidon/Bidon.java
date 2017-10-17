package Bidon;

class Bidon {
    private final int maxCapacite ;
    private int capacite ;

    Bidon(int maxCapacite, int capacite) {
        this.maxCapacite = maxCapacite;
        this.capacite = capacite;
    }
     Bidon(Bidon b){
        maxCapacite = b.maxCapacite;
        capacite = b.capacite;
    }
     void vider(){
        capacite = 0;
    }
     void remplir(){
        capacite = maxCapacite;
    }
     void transferer(Bidon bidon){
        int valeurMaxATransferer = bidon.maxCapacite - bidon.capacite;
        int valeurATransferer = Math.min(valeurMaxATransferer ,capacite);
        capacite-=valeurATransferer;
        bidon.setCapacite(bidon.capacite+valeurATransferer);
    }
     int getMaxCapacite() {
        return maxCapacite;
    }

     int getCapacite() {
        return capacite;
    }

     private void setCapacite(int capacite) {
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
