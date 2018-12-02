package pkg10wrappers;
public class Main 
{
    public static void main(String[] args) 
    {
        String s="127";
        int a=23;
        int b=7;
        Integer nesneTamsayi;
        nesneTamsayi= Integer.valueOf(s);       
        //INTEGER
        System.out.println(s+a); //yanyana yazar
        System.out.println(nesneTamsayi+a); //burda toplar.
        System.out.println(Integer.sum(a, b));
        System.out.println("Integer maximum değeri: "+Integer.MAX_VALUE);
        System.out.println("Integer minimum değeri: "+Integer.MIN_VALUE);
        System.out.println("Integer boyutu: "+Integer.SIZE+"bit");
        //CHARACTER
        System.out.println(Character.compare('a', 'b')); //ilk değer küçükse eksi değer döndürür
        System.out.println(Character.compare('A', 'a'));
        System.out.println(Character.isDigit('M'));
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetter('A'));      
        System.out.println(Character.isLowerCase('C'));   
        //STRING
        char [] isim= {'A','l','i','V','e','l','i','K','o','n','y','a'};
        String adi= String.copyValueOf(isim); // char dizisindeki harfleri stringe kopyaladı 
        System.out.println(adi);
        adi=String.valueOf(isim, 3, 4); //3.indisten 4 karakter kadar olan kısmı yazdırdı.
        System.out.println(adi);
        String memleket=String.valueOf(isim, 7, 5);
        char sehir[]=new char[memleket.length()];
        memleket.getChars(0, memleket.length(),sehir,0 ); //memleket stringinin en başından en sonuna kadar hepsini sehir dizisine ata demek
        System.out.println(sehir.length);
        
    }   
}
