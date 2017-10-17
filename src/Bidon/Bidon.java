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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bidon bidon = (Bidon) o;

        if (maxCapacite != bidon.maxCapacite) return false;
        return capacite == bidon.capacite;
    }

    @Override
    public int hashCode() {
        int result = maxCapacite;
        result = 31 * result + capacite;
        return result;
    }
}
