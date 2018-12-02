package pkg16sinifyapisi;
public class Main 
{
    public static void main(String[] args) 
    {
        Person p1=new Person();                     //Person() çalıştı
        Person p2=new Person("Berkay");             //Person(String isim) çaıştı
        Person p3=new Person("Berkay","Aydemir");   //Peron(String isim,String soyisim) çalıştı
        p3.setIsim("Ahmet");
        System.out.println("Main.java:");
        System.out.println( p3.getIsim()+" "+p3.getSoyisim()+" kişisi oluştu"); 
        p3.setdYili(1995);
        System.out.println(p3.getIsim()+" "+p3.yasHesapla()+" yaşındadır.");
    } 
}
