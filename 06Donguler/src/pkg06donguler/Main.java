package pkg06donguler;

import java.util.Scanner;

/**
 * 0dan 20 ye kadar olan tüm sayılardan tek olanları yazdır.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        for(int i=0;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
        /*
        dışardan durdurabilmek için while döngüleri kullanılır. örneğin kullanıcı sıfır girdiğinde durmasını sağlarken while döngüsünü kulanılır
        */
        //kullanıcıdan sayı istiyoruz 0 girene kadar sayı giriyor.Girdiği sayının karesini alıyoruz.
        int sayi1,sonuc;
        Scanner scn=new Scanner(System.in);
       /* System.out.println("Sayı giriniz:");
        sayi1=scn.nextInt();       
        while(sayi1!=0)
        {   
            sonuc=sayi1*sayi1;          
            System.out.println(sonuc);
            System.out.println("Sayı giriniz:"); 
            sayi1=scn.nextInt();
        }
       */ 
       
        //do while kullanımı        
        do
        {
            System.out.println("Sayı giriniz:");
            sayi1=scn.nextInt();
            sonuc=sayi1*sayi1;          
            System.out.println(sonuc);
        }
        while(sayi1!=0);
        
       
    
        
        
        
        
        
        
        
    }   
}
