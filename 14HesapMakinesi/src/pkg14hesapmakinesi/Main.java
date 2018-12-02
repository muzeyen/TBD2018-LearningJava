package pkg14hesapmakinesi;
import java.util.Scanner;
/**
 *          *Hesap Makinesi* 
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int sayi1 = 0,sayi2 = 0,secim=0;
        System.out.println("Lütfen ilk sayıyı giriniz:");
        try
        {
            sayi1=input.nextInt();
            System.out.println("Lütfen ikinci sayıyı giriniz:");
        try
        {
            sayi2=input.nextInt();
            System.out.println("Yapmak istediğiniz işlemi seçiniz:\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");        
            secim=input.nextInt();
                switch (secim) 
                {
                case 1:
                    System.out.println("Toplama: "+(sayi1+sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma: "+(sayi1-sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma: "+sayi1*sayi2);
                    break;
                case 4:
                    System.out.println("Bölme: "+((float) sayi1/sayi2));
                    if(sayi2==0)
                        System.out.println("Sonsuz");
                    break;
                default:
                    System.out.println("1-4 arasında sayı giriniz.");
                    break;                   
                }
        }    
        catch(Exception e)
        {
            System.out.println("Lütfen sayı giriniz!!");
        }
        }catch(Exception e)
        {
            System.out.println("Lütfen sayı giriniz!!");
        }     
    }         
}

