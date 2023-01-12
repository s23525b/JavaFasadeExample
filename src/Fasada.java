public class Fasada {
    public static void main(String[] args) {

        Lot lot1 = new Miedzynarodowy(206, "2023-01-30","WAW","CLE",
                "Boeing 777", 214, 6);

        Lot lot2 = new Krajowy(206, "2023-01-31","WAW","GDA",
                "Boeing 717", 215, 5000);

        OfertaPromocyjna oferta1 = new OfertaPromocyjna(lot2, "zniżka świąteczna", 310);
        oferta1.wylicz();

        Rezerwacja rezerwacja1 = new Rezerwacja(true,"2023-01-04",4214);
        rezerwacja1.oplac();
        rezerwacja1.anuluj();

        Bilet bilet1 = new Bilet(rezerwacja1, 451, 24);

        Reklamacja reklamacja1 = new Reklamacja(bilet1, "2023-02-22", "Opożnienie samolotu", 2430);
        reklamacja1.rozpatrz("pozytywnie");
        reklamacja1.anuluj();



    }
}
