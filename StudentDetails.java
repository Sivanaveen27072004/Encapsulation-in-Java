
class Student{

	private String name;
	private int age;
	private int number;
	private String gender;
	private String status;

	private Student(String name,int age,int number,String gender,String status)
	{
		this.name=name;
		this.age=age;
		this.number=number;
		this.gender=gender;
		this.status=status;
	}

	public String getName()
	{
	       return name;
	}
	public void setName(String name)
	{
	         this.name=name;
	}
	public int getAge()
	{
	        return age;
	}
	public void setAge()
	{
	          this.age=age;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber()
	{
		this.number=number;
	}
	public String getGender()
	{
	       return gender;
	}
	public void setGender(String gender)
	{
	         this.gender=gender;
	}
	public String getStatus()
	{
	       return status;
	}
	public void setStatus(String status)
	{
	         this.status=status;
	}
	public static Student getStudentObject(String name,int age,int number,String gender,String status)
	{
		Student obj=new Student(name,age,number,gender,status);
		return obj;
	}
	
}
class StudentDetails
{
public static void main(String[]args)
{

 Student obj3=Student.getStudentObject("siva",20,132,"Male","On");
                     System.out.println();
	    System.out.println("Student Name         :    "+obj3.getName());
 	    System.out.println("Student Age          :    "+obj3.getAge());
 	    System.out.println("Student Roll Numder  :    "+obj3.getNumber());
 	    System.out.println("Student Gender       :    "+obj3.getGender());
 	    System.out.println("Student Status       :    "+obj3.getStatus());
	    
}
}
