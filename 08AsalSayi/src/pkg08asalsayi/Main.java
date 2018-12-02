package pkg08asalsayi;

import javax.swing.JOptionPane;
/*
 *Girdiğin sayının asal olup olmadığını gösteren program
 */
public class Main 
{
    public static void main(String[] args) 
    {
        String asalsayilar="";
        int sinir;
        sinir= Integer.parseInt(JOptionPane.showInputDialog(null,"Sayı Giriniz")); //Windows formdaki gibi kutucuk açılır
        boolean asalMi=false;
        for(int i=2;i<sinir;i++)
        {
            if(sinir%i==0)
                asalMi=true;
        }
        if(asalMi==false)
            asalsayilar="Sayı asal sayıdır";
        else
            asalsayilar="Sayı asal sayı değildir";       
       JOptionPane.showMessageDialog(null,asalsayilar);
    }    
}
