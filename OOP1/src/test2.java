import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class test2 {

	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		String r;
		boolean n1= true,n2=false,n3=false,b=false;
		
		System.out.printf("Enter Input : ");
		r = m.next();
		
		for(int i=0;i<r.length();i++)
		{
			char a;
			a = r.charAt(i);
			if((a != 'A') && (a != 'B') && (a != 'C'))
			{
				System.out.println("error");
				r = " ";
			}
		}
		
		for(int i=0;i<r.length();i++)
		{
			char a;
			a = r.charAt(i);
			if(a == 'A')
			{
				b = n2;
				n2 = n1;
				n1 = b;
			}
			else if(a == 'B')
			{
				b = n3;
				n3 = n2;
				n2 = b;
			}
			else if(a == 'C')
			{
				b = n3;
				n3 = n1;
				n1 = b;
			}
		}
		
		if(r.equals(" "))
		{
			
		}
		else if(n1)
		{
			System.out.println("1");
		}
		else if(n2)
		{
			System.out.println("2");
		}
		else if(n3)
		{
			System.out.println("3");
		}
	}

}
