package pkg07loopconbreak;

import java.util.Scanner;
/**
 * Kullanıcıdan sayı istenecek
 * 0 yazdığında döngüden çıkacak
 * 1 yazdığında hiçbir şey yazmayacak 
 * diğer durumlarda karesini alacak
 */
public class Main 
{
    public static void main(String[] args) 
    {
      Scanner scn=new Scanner(System.in);
        int sayi;
        while(true)
        {
            System.out.println("Sayı giriniz: ");
            sayi=scn.nextInt();
            if(sayi==0)
                break;
            else if(sayi==1)
                continue;
            System.out.println(sayi*sayi);
        }
        
         
        //Bir sayının recursive olup oladığını yazan program
       
     /* Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        boolean asal = true;
        int sayi = scanner.nextInt();
        if (sayi <= 1)
            System.out.println("1 den büyük pozitif tam sayılar asal olabilir");
        else
        {       
            for (int i = 2; i < sayi; i++) 
            {
             int kalan = sayi % i;
             if (kalan == 0) 
             {
                 asal = false;
                 break;
              }
        }
        if( asal )
        {
            System.out.println("Girdiğiniz Sayi Asal Sayıdır");
        }
        else
        {
            System.out.println("Girdiğiniz Sayi Asal Degildir");
        }
        }*/
        
     // 50ye kadar olan asal sayıları ekrana yazdıran program.
            
        for (int sayi1 = 2; sayi1 <= 50; sayi1++)
            {
                boolean kontrol=false;
                for (int i = 2; i < sayi1; i++)
                {
                    if (sayi1 % i == 0) 
                    {
                        kontrol = true;
                        break;
                    }
                }
                if (kontrol != true)
                {
                    System.out.println(sayi1);
                }
            }      
    }
    
}
