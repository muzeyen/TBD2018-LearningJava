package pkg04odev;

import java.util.Scanner;

/**
Kullanıcıdan iki sayı alacağız.Bu sayılarla 4 işlemide yapıp her sonucu bir değişkene atayacağız.Daha sonra 
* bu değişkenleri ekrana yazdıracağız
 */
public class Main 
{
    public static void main(String[] args)
    {   
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz:");       
        int sayi1=input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        int sayi2=input.nextInt();
        int toplama= sayi1+sayi2;
        int cikarma=sayi1-sayi2;
        int carpma=sayi1*sayi2;
        float bolme=(float) sayi1/sayi2;
        System.out.println("Toplama: "+toplama);
        System.out.println("Çıkarma: "+cikarma);
        System.out.println("Çarpma: "+carpma);
        System.out.println("Bölme: "+bolme);  
    }
    
}
