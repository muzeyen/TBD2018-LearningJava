package pkg03modifiers;


public class Main 
{
    int sayi=5; //default erişim seviyesinde bir değer
    private int sayi2=3; //sadece main classı erişebilir
    
    public static void main(String[] args) 
    {
        //Main içindeki sayi değişkenine A sınıfı ile erişme
       A kisi1= new A();
       A kisi2=new A();
       kisi2.soyisim="Mete";
       System.out.println("Kişi 1: "+ A.isim +" "+kisi1.soyisim);
       System.out.println("Kişi 2: "+A.isim+" "+kisi2.soyisim);
       
       A.isim="Ahmet";
       System.out.println("Kişi 1: "+ A.isim +" "+kisi1.soyisim);
       System.out.println("Kişi 2: "+ A.isim +" "+kisi2.soyisim);
       
       System.out.println(B.yas);
       
       int a=10;
       int b=10;
       System.out.println(a++ + ++a);
       System.out.println(b++ + b++);
    }
    
}

