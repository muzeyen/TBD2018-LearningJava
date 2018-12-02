
package pkg21labdeneme;
public class Main 
{
    public static void main(String[] args) 
    {
		int sayi,count=0,x=0;
		for(int i=2;i>0;i++)
		{
			sayi=0;
			for(int j=2; j<=i/2;j++)
			{
				if(i%j==0)
                                    sayi++;				
			}
			if(sayi==0)
			{
				System.out.print(i+" ");
				count=count+1;
				x=x+1;
			}
			if(count==5)
			{
				System.out.println();
				count=0;
			}
			if(x==40)
				break;
		}		
    } 
    
}
