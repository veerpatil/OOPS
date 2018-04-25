import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

class Mystudent
{
	int id;
	String name;
	
	void InsertRecord(int r, String n)
	{
		id=r;
		name=n;
	}
	void DisplayInfo()
	{
		System.out.println("The ID is: "+ id + " and name is:" + name);
	}
}

public class InitMethodTestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mystudent s = new Mystudent();
		s.InsertRecord(20,"John Decosta");
		s.DisplayInfo();

	}

}
