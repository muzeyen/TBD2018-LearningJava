package pkg18odev;
public class Personel extends Insan
{
    float maas;
    String departman;
    String tarih;
    protected float yillikMaas(float maas)
    {
        float sonuc=12*maas;
        return sonuc;
    }
    Personel (String isim,String soyisim)
    {
        yazdir(isim, soyisim);       
    }
    Personel()
    {
        System.out.println("Kişi oluştu");
    }
}
