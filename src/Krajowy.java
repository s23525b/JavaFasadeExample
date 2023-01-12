public class Krajowy extends Lot{
    int maxWysokoscPrzelotowa;

    public Krajowy(int czasTrwania, String data, String lotniskoWylotu, String lotniskoOdlotu,
                   String modelSamolotu, int numerLotu, int maxWysokoscPrzelotowa) {
        super(czasTrwania, data, lotniskoWylotu, lotniskoOdlotu, modelSamolotu, numerLotu);
        this.maxWysokoscPrzelotowa = maxWysokoscPrzelotowa;
    }
}
