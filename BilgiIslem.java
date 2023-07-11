public class BilgiIslem extends Memur{
    String gorev;
    public BilgiIslem(String adSoyad,String telefon, String eposta,String departman,String mesai){
        super(adSoyad,telefon,eposta,departman,mesai);
        this.gorev=gorev;
    }
    public String getGorev(){
        return gorev;
    }
    public void setGorev(){
        this.gorev=gorev;
    }
    public void networkKurulum(){
        System.out.println(this.getAdSoyad()+" network kurulum tamamlandı.");
    }
}
