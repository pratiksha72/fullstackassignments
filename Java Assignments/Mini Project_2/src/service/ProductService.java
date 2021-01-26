package service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Product;

public class ProductService implements Serializable
{
	
	List <Product> list=new ArrayList<>();
	
	
	
	public int addProduct(int pid,String name,float price)
	{
		
		
		Product prd=new Product(pid,name,price);
		list.add(prd);
		return pid;
		
	}
	public int updateProduct(int pid, float price)
	{
		Product prd=(Product)list.get(pid);
		prd.setPrice(price);
		return 1;
		
	}
	public int deleteProduct(int pid)
	{
		Product prd=new Product();
		list.remove(pid);
		return 1;
		
	}
	public List displayAllProduct()
	{
		return list;
		
	}
	
	
	public float retrieveProduct(int pid) {
		Product prd=(Product)list.get(pid);
		
		return prd.getPrice();
		
	}
	
}
