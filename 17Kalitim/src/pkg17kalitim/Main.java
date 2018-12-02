package pkg17kalitim;

public class Main 
{

    public static void main(String[] args) 
    {
        Employee el=new Employee("Mustafa");  //oluşturduğunda atasının da kurucu methodunu çalıştırıyor.
        System.out.println(el.tur);
    }
}
