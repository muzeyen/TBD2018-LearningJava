/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02veriyapıları;

/*
 * İlkel(Primitive) Veri Tipleri
 */
public class Main {

    
    public static void main(String[] args) 
    {
       byte _byte = 127; //en fazla 127 ve -128 alabiliyor
       
       short _short =10000; //byte iki katı
       
       int _int =100000; //daha büyük sayılar için
       
       long _long = 999999; //çok büyük tam sayılar için 
       
       char _char = 'A' ; //karakter ('$', '1', 'a')
       _char=(char)(_char+1); //bir sonraki char karakterini getiriyor
       _int=(int)_char; // burda ASCII tablodaki tam sayı değerini yazıyor
       
       boolean _boolean; //varsaylan false olarak atar
       
       float _float =3.14f; //ondalıklı sayılar için. Eğer f yazmak istemezsek (float) şeklinde sayının önüne tanımlamamız gerek
       
       double _double = 0.0; //daha büyük ondalıklı sayılar için
       
       System.out.println("Byte: "+ _byte + "\nShort: "+ _short);
       System.out.println("Int:"+_int);
       System.out.println("Char:"+_char);
       
       System.out.println("Hello World");
       System.out.println("Hello\tWorld"); //bir tab boşluk bırakır
       System.out.println("HelloWorld\b"); //son karakteri siler
       System.out.println("\"Hello World\""); //Slashdan sonra yazılan karakteri yazar
       
       
       
    }
    
}
