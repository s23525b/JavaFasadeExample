public class Bilet {
    private Rezerwacja rezerwacja;
    int numerBiletu;
    int wagaBagazu;

    public Bilet(Rezerwacja rezerwacja, int numerBiletu, int wagaBagazu) {
        this.rezerwacja = rezerwacja;
        this.numerBiletu = numerBiletu;
        this.wagaBagazu = wagaBagazu;
        System.out.println("Stworzono nowy bilet o numerze " + this.numerBiletu);
    }


}
