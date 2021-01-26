package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import bean.Product;
import service.ProductService;

public class DemoTest {

	
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		
		String name,prid;
		float price;
		int demopid=10,id,value;
		ProductService prdservice=new ProductService();
		List <Product> list=new ArrayList<>();
		
		
		
		do
		{
			System.out.println("Enter your choice:");
			System.out.println("1. Add  \n2. Update \n3. Delete \n4. DisplayAll \n5. Price \n6. Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Add any Product");
				sc.nextLine();
				System.out.println("Enter product name:");
				name=sc.next();
				System.out.println("Enter product price:");
				price=sc.nextFloat();
				
				prdservice.addProduct(demopid, name, price);
				demopid++;
				
				System.out.println("Your product has been added");
				System.out.println("Product id :" +demopid);
				
				
				
				break;
			case 2:
				System.out.println("Enter product id :");
				id=sc.nextInt();
				list=prdservice.displayAllProduct();
				
				Iterator<Product> itr1=list.iterator();
				while(itr1.hasNext())
				{
					//Iterator itr1=list.iterator();
					//String next=(String) itr.next();
					Product prd=itr1.next();
					if(itr1.equals(prd.getPid()))
					{
						System.out.println("Enter the price:");
						price=sc.nextFloat();
						value=prdservice.updateProduct(id, price);
						System.out.println("price is updated");
						
						
					}
					else
					{
						break;
					}
				}
				
				
			case 3:
				System.out.println("Enter product id:");
				id=sc.nextInt();
				value=prdservice.deleteProduct(id);
				System.out.println("Product deleted successfully");
				break;
				
				
				
			case 4:
				list=prdservice.displayAllProduct();
				Iterator<Product>itr2=list.iterator();
				while(itr2.hasNext())
				{
					System.out.println(itr2.next());
				}
				
				
				break;
			case 5:
				System.out.println("Enter product id:");
				id=sc.nextInt();
				price=prdservice.retrieveProduct(id);
				System.out.println("Price of product:"+price);
				
				break;
			case 6:
				System.out.println("you are exited");
				
			
				
			}
			
		}while(choice!=6);
		
	}

	

}
