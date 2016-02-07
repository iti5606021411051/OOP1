import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
public class test3 {

	public static void main(String[] args) 
	{
		Scanner m = new Scanner(System.in);
		int r,n1=0,n2=0,n3=0;
		String a,b,c,answer=" ";
		a="ABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABCABC";
		b="BABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABCBABC";
		c="CCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABBCCAABB";
		
		System.out.printf("Enter Round : ");
		r = m.nextInt();
		while(r <=0 || r >100)
		{
			System.out.println("Error Round");
			System.out.printf("Enter Round : ");
			r = m.nextInt();
		}
			System.out.println();

			System.out.printf("Enter Answer : ");
			answer = m.next();
		while(answer.length() != r)
		{
			System.out.println("Error Answer");
			System.out.printf("Enter Answer : ");
			answer = m.next();
		}
			System.out.println();
		
		
		for(int i=0;i<r;i++)
		{
			if(answer.charAt(i) == a.charAt(i))
			{
				n1 = n1 + 1;
			}
			if(answer.charAt(i) == b.charAt(i))
			{
				n2 = n2 + 1;
			}
			if(answer.charAt(i) == c.charAt(i))
			{
				n3 = n3 + 1;
			}
		}
		
		
		
		if(n1 == n2)
		{
			if(n1 == n3)
			{
				System.out.println(n1);
				System.out.println("a");
				System.out.println("b");
				System.out.println("c");
			}
			else
			{
				System.out.println(n1);
				System.out.println("a");
				System.out.println("b");
			}
		}
		else if(n2 == n3)
		{
			System.out.println(n2);
			System.out.println("b");
			System.out.println("c");
		}
		else if(n1 == n3)
		{
			System.out.println(n1);
			System.out.println("a");
			System.out.println("c");
		}
		else if(n1 > n2)
		{
			if(n1 > n3)
			{
				System.out.println(n1);
				System.out.println("a");
			}
			else
			{
				System.out.println(n3);
				System.out.println("c");
			}
		}
		else if(n2 > n3)
		{
			System.out.println(n2);
			System.out.println("b");
		}
		else 
		{
			System.out.println(n3);
			System.out.println("c");
		}
	}

}
