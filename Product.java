import java.util.*;
class prdct
{
	int pcode;
	String pname;
	float price;
	
	
}
public class Product
{
	public static void main(String args[])
	{
		prdct obj1 = new prdct();
		prdct obj2 = new prdct();
		prdct obj3 = new prdct();
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		System.out.println("\nEnter details of product 1:");
		System.out.print("product code:");
		obj1.pcode = x.nextInt();
		System.out.print("product name:");
		obj1.pname = y.nextLine();
		System.out.print("product price:");
		obj1.price = x.nextFloat();
		System.out.println("\nEnter details of product 2:");
		System.out.print("product code:");
		obj2.pcode = x.nextInt();
		System.out.print("product name:");
		obj2.pname = y.nextLine();
		System.out.print("product price:");
		obj2.price = x.nextFloat(); 
		System.out.println("\nEnter details of product 3:");
		System.out.print("product code:");
		obj3.pcode = x.nextInt();
		System.out.print("product name:");
		obj3.pname = y.nextLine();
		System.out.print("product price:");
		obj3.price = x.nextFloat();
		if (obj1.price<obj2.price && obj1.price<obj3.price)
		{
			System.out.println("\nLeast price\n"+obj1.pname+" : "+obj1.price);
		}
		else if(obj2.price<obj1.price && obj2.price<obj3.price)
		{
			System.out.println("\nLeast price\n"+obj2.pname+" : "+obj2.price);
		}
		else
		{
			System.out.println("\nLeast price\n"+obj3.pname+" : "+obj3.price);		
		}
	}
}
