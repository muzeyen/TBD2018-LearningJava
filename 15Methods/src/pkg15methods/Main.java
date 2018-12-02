package pkg15methods;
/**
 * Method kullanımı ile asal sayı kontrolü
 */
public class Main 
{
    public static void main(String[] args) 
    {   
        boolean sonuc;
        for(int i=2;i<=50;i++)
        {
            sonuc=asalMi(i);
            if(sonuc)
            System.out.println("Sayi asal:"+i);
            else
            System.out.println("Sayi asal değil:"+i);      
        }
    }
    public static boolean asalMi(int sayi)
    {
        boolean sonuc=true;
        for(int i=2;i<Math.sqrt(sayi)+1;i++)
        {
            sonuc=true;
            if(sayi%i==0)
            {
                sonuc=false;
                break;
            }
        }
        return sonuc;
    }  
}
