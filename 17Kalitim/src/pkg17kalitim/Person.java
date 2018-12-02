package pkg17kalitim;

public class Person 
{
    private String isim;
    private String soyisim;
    
    final String tur="Homo Saphiens"; //ne olursa olsun bu kesin olduğu için statik tanımladık.
    //Method Overloading
    Person()
    {
        System.out.println("Kişi oluştu");
    }
    Person(String ad)
    {
        this.isim=ad;
        System.out.println( isim+" kişisi oluştu");
    }
    Person(String isim,String soyisim)
    {
        this(isim);
        this.isim=isim;
        this.soyisim=soyisim;
        System.out.println( "Person.java:");
        System.out.println( isim+soyisim+" kişisi oluştu");
    }
    public String getIsim()
    {
        return this.isim;
    }
    public String getSoyisim()
    {
        return this.soyisim;
    }
    public void setIsim(String isim)
    {
        if(isim.equals ("Ahmet"))   //burda kontrol yapıp doğrudan erişmesini engelleyebiliriz
            this.isim="Şukufe";  
        else
            this.isim=isim;       
    }
    public void setSoyisim(String soyisim)
    {
        this.soyisim=soyisim;
    }
    private int dYili;

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
}
