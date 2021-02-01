import java.util.Scanner;
class Student
{

		
		int sid;
		String sname;
		int age;
		int marks[]=new int[4];
		char grade;
		
	
	    
	void read()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter Student Id: ");
		sid=scan.nextInt();
		System.out.println("Enter Student Name: ");
		sname=scan.next();
		System.out.println("Enter Student age: ");
		age=scan.nextInt();
		System.out.println("Enter Marks For four subjects: ");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=scan.nextInt();
		}	
	
	}

	void calGrade()
	{	

		int total=0;
		float avg;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		avg=total/marks.length;
		if(avg>90)
		{
			grade='A';

        	}
		else if(avg>80)
		{
			grade='B';

        	}
        	else if(avg>70)
		{
			grade='C';

        	}
        	else if(avg>60)
		{
			grade='D';

        	}
        	else
        	{
        		grade='E';

        	}
	}
		

	void display()
	{
			
		System.out.println("*****Student Details*****");
		System.out.println("Student ID ="+sid);
		System.out.println("Student Name ="+sname);
		System.out.println("Student Age ="+age);
		System.out.println("Student  Grade="+grade);
	
	}
}


class Assignment_5
{

	public static void main(String[] args) 
	{
		System.out.println("Number of Records  you Want to add?");
		Scanner scan= new Scanner(System.in);
		int rec=scan.nextInt();
		Student std[]=new Student[rec];
		for(int i=0;i<rec;i++) 
		{
			std[i]=new Student();
			std[i].read();
		}
		for(int i=0;i<rec;i++)
		{
			std[i].calGrade();
		}
		for(int i=0;i<rec;i++)
		{
			std[i].display();
		}
	}
}



		

