public class Reklamacja {
    private Bilet bilet;
    String data;
    String powod;
    int rekompensata;
    StatusReklamacji statusReklamacji;

    public Reklamacja(Bilet bilet, String data, String powod, int rekompensata) {
        this.bilet = bilet;
        this.data = data;
        this.powod = powod;
        this.rekompensata = rekompensata;
        this.statusReklamacji = StatusReklamacji.Nowa;
        System.out.println("Stworzono nową reklamację na bilet o numerze " + this.bilet.numerBiletu);
    }

    public void anuluj() {
        this.statusReklamacji = StatusReklamacji.Anulowana;
    }

    public void rozpatrz(String wniosek) {
        if (wniosek == "pozytywnie")
            this.statusReklamacji = StatusReklamacji.RozpatrzonaPozytywnie;
        else if (wniosek == "negatywnie")
            this.statusReklamacji = StatusReklamacji.RozpatrzonaNegatywnie;
    }
}
