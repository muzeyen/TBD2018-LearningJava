package pkg18odev;
public class Main {

    public static void main(String[] args) 
    {
        Insan i= new Personel();       
        Personel p = (Personel) i; //cast
        if(p instanceof Insan)
            System.out.println("İnsan");
        if(p instanceof Personel)
            System.out.println("Personel");
        if(p instanceof Ik)
            System.out.println("Ik");
    }
    
}
