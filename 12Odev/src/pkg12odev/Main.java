package pkg12odev;
import java.util.Arrays;
import java.util.Scanner;
/**
 *Kullanıcıdan virgül ile sayı alacağız
 * sayıları Selection sort ile sıralayacağız
 * sonra sıralı sayıları virgül ile ekrana yazdıracağız
 * 
 */
public class Main 
{
    public static void main(String[] args) 
    {
       System.out.println("Sayı giriniz:");
       Scanner scn=new Scanner(System.in);
       String sayilar=scn.next();
       String sayidizisi [] = sayilar.split(","); 
       int adet=sayidizisi.length;
       int intSayiDizisi[];
       intSayiDizisi = new int[adet];
       int i=0;
       for(String sayi : sayidizisi) //atama yapması için
       {
           intSayiDizisi[i]=Integer.parseInt(sayi);
           i++;
       }
       Arrays.sort(intSayiDizisi);
       System.out.println("Sıralı sayılar:"+ Arrays.toString(intSayiDizisi));     
    }  
}
