public class Rezerwacja {
    boolean czyOplacona;
    String data;
    int numerRezerwacji;
    StatusRezerwacji status;

    public Rezerwacja(boolean czyOplacona, String data, int numerRezerwacji) {
        this.czyOplacona = czyOplacona;
        this.data = data;
        this.numerRezerwacji = numerRezerwacji;
        if (czyOplacona)
            this.status = StatusRezerwacji.Oplacona;
        else
            this.status = StatusRezerwacji.Nieoplacona;
        System.out.println("Stworzono nową rezerwację o numerze: " + this.numerRezerwacji);
    }

    public void oplac() {
        if (!this.czyOplacona) {
            this.status = StatusRezerwacji.Oplacona;
            System.out.println("Opłacono rezerawcje o nr: " + this.numerRezerwacji);
        } else {
            System.out.println("Rezerawcja o nr: " + this.numerRezerwacji + " jest już opłacona");
        }
    }

    public void anuluj() {
        this.status = StatusRezerwacji.Anulowana;
        System.out.println("Rezerwacja o nr: " + this.numerRezerwacji + " anulowana");
    }
}
