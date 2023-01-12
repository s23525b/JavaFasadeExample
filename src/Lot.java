class Lot {
    int czasTrwania;
    String data;
    String lotniskoWylotu;
    String lotniskoOdlotu;
    String modelSamolotu;
    int numerLotu;

    public Lot(int czasTrwania, String data, String lotniskoWylotu,
               String lotniskoOdlotu, String modelSamolotu, int numerLotu) {
        this.czasTrwania = czasTrwania;
        this.data = data;
        this.lotniskoWylotu = lotniskoWylotu;
        this.lotniskoOdlotu = lotniskoOdlotu;
        this.modelSamolotu = modelSamolotu;
        this.numerLotu = numerLotu;
        System.out.println("Stworzono nowy lot o numerze: " + this.numerLotu);
    }


    public void wyszukajPolaczeniePrzesiadkowe(int numerLotu) {
        System.out.println("Istnieje lot przesiadkowy o numerze: LOT2415");
    }
}
