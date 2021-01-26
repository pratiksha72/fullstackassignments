package bean;
import java.io.Serializable;

public class Product implements Serializable
{

	
		int pid;
		String pname;
		float price;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Product(int pid, String pname, float price) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.price = price;
		}
		public Product() {
			// TODO Auto-generated constructor stub
		}
		
		
	

}
