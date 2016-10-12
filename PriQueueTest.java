import java.util.*;

public class PriQueueTest
{
	public static void main(String[] args)
	{
		PriorityQueue<Patient> pq = new PriorityQueue<Patient>();
		Patient p1 = new Patient("John Smith",3);
		Patient p2 = new Patient("Mary Jones",1);
		Patient p3 = new Patient("Kathy Gibb",2);

		pq.add(p1);
		pq.add(p2);
		pq.add(p3);

		while(!pq.isEmpty())
		{
			System.out.println("The next patient for liver transplant is ");
			System.out.println(pq.remove());
		}
	}
}