public class OgretimGorevlisi extends Akademisyen {
    private String kapıNo;
    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapıNo){
        super(adSoyad,telefon,eposta,bolum,unvan);
        this.kapıNo=kapıNo;
    }
    public String getKapıNo(){
        return kapıNo;
    }
    public void setKapıNo(){
        this.kapıNo=kapıNo;
    }
    public void senatoToplanti(){
        System.out.println(this.getAdSoyad()+" toplantıda.");
    }
    public void sinavYap(){
        System.out.println(this.getAdSoyad()+" sınav yapıyor.");
    }
}
