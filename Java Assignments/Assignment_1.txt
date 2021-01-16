import java.util.Scanner;
class  Exam
{
	 public  static void main(String args[])
	{
		int choice,counter=0,n,x;
		System.out.println("Online Examination");
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Choose section: 1.English   2.Math   3.GK");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:  	System.out.println("1.Please,stop ---- so many mistakes.\n");
					System.out.println("1)to make     2)make    3)making    4)makes");
					System.out.print("select answer:");
					n=sc.nextInt();
					if(n==3){
						counter+=10;
					}
				
					System.out.println("\n\n");
					System.out.println("Find the correctly spelt word");
					System.out.println("1)Adulation  2)Adlation   3)Aduletion  4)Addulation");
					System.out.print("select answer:");
					n=sc.nextInt();
					if(n==4){
						counter+=10;
					}
						
					System.out.println("\n\n");
					System.out.println("select synonym of Massive");
					System.out.println("1)lump sum   2)strong    3)little   4)huge ");
					System.out.print("select answer:");
					n=sc.nextInt();
					if(n==4){
						counter+=10;
					};
					break;
				case 2: 	System.out.println("\n10+20=");
					System.out.println("1)30    2)50    3)60     4)-30");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==1)
						counter+=10;
					
					System.out.println("\n10-20=");
					System.out.println("1)30    2)-10    3)10     4)-30");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==2)
						counter+=10;

					System.out.println("\n10*20=");
					System.out.println("1)30    2)20    3)60     4)-30");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==2)
						counter+=10;
					
					break;
				case 3:	System.out.println("\nWhat is the capital of india");
					System.out.println("1)jaipur    2)mumbai   3)delhi     4)pune");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==3)
						counter+=10;
		
					System.out.println("\nWho is the prime minister of india");
					System.out.println("1)Virat kohli    2)Salman Khan   3)Raj Thakre     4)Narendra Modi");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==4)
						counter+=10;


					System.out.println("\nHow many days are there in a week:");
					System.out.println("1)8    2)6   3)7     4)5");
					System.out.print("select answer :");
					n=sc.nextInt();
					if(n==3)
						counter+=10;
					break;
				default:System.out.println("Wrong choice");
			}
			System.out.print("\n\nDo u want to continue? 1.yes 2.no   :");
			x=sc.nextInt();
			
		}while(x==1);

		if(counter>=70)
		{
			counter=counter+10;
		}
		System.out.println("Result: "+counter+"%");
		if(counter>=90)
		{
			System.out.println("You are selected");
		}
		else
			System.out.println("Try next time");
	}
			
}






















