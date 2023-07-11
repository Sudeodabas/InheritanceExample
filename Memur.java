public class Memur extends Calisan {
    private String departman;
    private String mesai;
    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesai){
        super(adSoyad,telefon,eposta);
        this.departman=departman;
        this.mesai=mesai;
    }
    public String getDepartman(){
        return departman;
    }
    public void setDepartman(){
        this.departman=departman;
    }
    public String getMesai(){
        return mesai;
    }
    public void setMesai(){
        this.mesai=mesai;
    }
    public void calis(){
        System.out.println(this.getAdSoyad()+" memur görevlerini yapıyor.");
    }
}
