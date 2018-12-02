package pkg09odev;
import javax.swing.JOptionPane;
/*
 *Kullanıcıdan OptionPain üzerinden sayı al
 *Sayıları ayır
 *İçlerinden en küçüğünü yazdır.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        String sayilar= JOptionPane.showInputDialog("Sayıları giriniz(sayılar arasına '-' koymayı unutmayın):");
        System.out.println("Girilen sayılar:"+sayilar);
        String sayidizisi [] = sayilar.split("-");  //tırnak işaretine göre ayırıyor stringi
        int adet=sayidizisi.length;
        int intSayiDizisi[];
        intSayiDizisi = new int[adet];
        int i=0;
        for(String sayi : sayidizisi) //atama yapması için
        {
            intSayiDizisi[i]=Integer.parseInt(sayi);
            i++;
        }
        System.out.println("Tamsayılar: ");
        for(i=0;i<intSayiDizisi.length;i++)
        {
            System.out.println(intSayiDizisi[i]);
        }
        int min=intSayiDizisi[0];
        for(i=1;i<intSayiDizisi.length;i++)
        {
            if(intSayiDizisi[i]<min)
                min=intSayiDizisi[i];
        }
        System.out.println("En küçük sayı:"+min);
        
    }
}
