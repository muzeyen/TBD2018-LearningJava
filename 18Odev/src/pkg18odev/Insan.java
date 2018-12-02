package pkg18odev;
public class Insan 
{
    private String isim;
    private String soyisim;
    private int dYili;
    final String tur="Homo Saphiens";
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getdYili() {
        return dYili;
    }

    public void setdYili(int dYili) {
        this.dYili = dYili;
    }
    protected int yasHesapla()
    {
        if(this.dYili>0)
            return 2018-this.dYili;
        else
            return 0;
    }   
    protected String yazdir(String isim,String soyisim)
    {
        this.isim=isim;
        this.soyisim=soyisim;
        String birlestir= isim+" "+soyisim;
        return birlestir;
    }
}
