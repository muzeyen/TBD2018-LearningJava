package pkg05kosullar;

import java.util.Scanner;
/*
 Kullanıcıdan alınan sayının tek veya çift olduğunu kontrol etme
 */ 
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=scn.nextInt();
        System.out.println("If: ");
        if(sayi%2==0)
        {
            System.out.println("Bu sayı çifttir");
        }
        else
        {
            System.out.println("Bu sayı tektir");
        }
        System.out.println("Switch: ");
        switch(sayi%2)
        {
            case 0:
            {
                System.out.println("Bu sayı çifttir");
                break;
            }
            default:
            {
                System.out.println("Bu sayı tektir");
                break;
            }       
        }
        System.out.println("Kısa if: ");
        String sonuc=sayi%2==0 ? "Bu sayı çifttir" : "Bu sayı tektir";
        System.out.println(sonuc);
    }   
}
