package pkg13odev;

import java.util.Random;
import java.util.Scanner;

/*           ***VAMPİR-KÖYLÜ OYUNU***
 *20 elemanlı boolean tipinde dizi oluşturulacak
 *Dizi içerisi false ile doldurulacak
 *[0-19] aralığında 5 random sayı belirlenecek
 *Bu random indislerdeki değeri true yapacağız(true olanlar vampir)
 *Kullanıcının 5 tahmin hakkı olacak
 *Her tahminde dizinin o elemanı kontrol edilecek.Seçilen eleman diziden çıkartılarak yeni diye eklenecek
 *Kullanıcı 5 tahmininde 3 vampir bilirse oyunu kazanacak
 *Her tahmin ettiğinde ekranda kaç vampir kaç köylü kaldığını yazdıracak.
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        boolean kasaba[]=new boolean [20];
        int tahminDizisi[];
        tahminDizisi = new int[5];
        int vampircounter=0,koylucounter=0;
        for(int i=0; i<kasaba.length;i++)
        {
            kasaba[i]=false;        
        }
        Random rndm = new Random();//Random nesnesi oluşturduk
        for(int j=0;j<5;j++)
            kasaba[rndm.nextInt(19)]=true; 
        System.out.println("5 tahmin hakkınız var\n");
        for(int k=0;k<5;k++)
        {
            System.out.println("Tahminizi söyleyin:");
            int tahminEdilen=scn.nextInt();
            tahminDizisi[k]=tahminEdilen;
            if(kasaba[tahminEdilen]==true)
            {
                vampircounter++;
                System.out.println("Kalan Vampir Sayısı:"+(5-vampircounter));
                System.out.println("Kalan Köylü Sayısı: "+(15-koylucounter));
            }
            else
            {
                koylucounter++;
                System.out.println("Kalan Vampir Sayısı:"+(5-vampircounter));
                System.out.println("Kalan Köylü Sayısı: "+(15-koylucounter));
            }           
        }
        if(vampircounter>=3)
            System.out.println("KAZANDINIZ");
        else
            System.out.println("KAYBETTİNİZ");        
    }   
}
