public class OfertaPromocyjna {
    private Lot lot;
    String nazwa;
    int znizka;

    public OfertaPromocyjna(Lot lot, String nazwa, int znizka) {
        this.lot = lot;
        this.nazwa = nazwa;
        this.znizka = znizka;
        System.out.println("Stworzono nową ofertę promocyjną na lot o numerze: "
                + this.lot.numerLotu + " o nazwie: " + this.nazwa);
    }

    public void wylicz() {
        double mnoznik = 1.6;
        double wysokoscZnizki = znizka * mnoznik;
        System.out.println("Wysokosc znizki oferty promocyjnej o nazwie: " +nazwa + ", wynosi: " + wysokoscZnizki);
    }
}
