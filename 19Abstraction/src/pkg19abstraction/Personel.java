package pkg19abstraction;

public class Personel extends Insan
{
    @Override
    public int yasHesapla() 
    {
        return 2018 -super.getdYili();
    }  
}
