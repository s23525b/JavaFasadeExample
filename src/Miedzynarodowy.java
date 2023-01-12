public class Miedzynarodowy extends Lot{
    int iloscMinietychKrajow;

    public Miedzynarodowy(int czasTrwania, String data, String lotniskoWylotu, String lotniskoOdlotu,
                   String modelSamolotu, int numerLotu, int iloscMinietychKrajow) {
        super(czasTrwania, data, lotniskoWylotu, lotniskoOdlotu, modelSamolotu, numerLotu);
        this.iloscMinietychKrajow = iloscMinietychKrajow;
    }
}
