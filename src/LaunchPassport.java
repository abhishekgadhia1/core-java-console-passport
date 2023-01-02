import java.util.*;
import java.util.Map.Entry;

class Information
{
	private String name;
	private int age;
	private String fatherName;
	private String city;
	
	public Information(String name, int age, String fatherName, String city)
	{
		this.name=name;
		this.age=age;
		this.fatherName=fatherName;
		this.city=city;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString()
	{
		return name + " " + age + " " + fatherName + " " + city;
	}
}

class Key
{
	int key;
	
	public Key(int key)
	{
		this.key=key;
	}
}

public class LaunchPassport
{
	public static void main(String[] args)
	{
		Information info1 = new Information("Rohan", 22, "Rakesh", "Pune");
		Information info2 = new Information("Mohan", 32, "Mahesh", "Mumbai");
		Information info3 = new Information("Sohan", 42, "Suresh", "Zelhi");
		
		HashMap hm = new HashMap();
		hm.put(111, info1);
		hm.put(222, info2);
		hm.put(333, info3);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Passport Portal");
		System.out.println("Please enter Passport number");
		Integer k = s.nextInt();
		
		boolean flag = false;
		
		Set set = hm.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry passport = (Entry) itr.next();
			Integer key = (Integer) passport.getKey();
			if(k==key)
			{
				System.out.println("Info : "+passport.getValue());
				flag=true;
				//break;
			}
		}
		if(flag==false)
		{
			System.out.println("Invalid passport number");
		}
	}
}
