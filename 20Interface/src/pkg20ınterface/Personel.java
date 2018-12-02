package pkg20ınterface;
public class Personel implements Erkek  //interfaceleri implement ile tanımlıyoruz
{
    @Override
    public String isimBirlestir() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean erkekMi() 
    {
        return true;
    }
    public String getTur()
    {
        return tur;
    } 
    class CalisanPersonel //innerclass
    {
        
    }
}

