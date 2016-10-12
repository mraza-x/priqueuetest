public class Patient implements Comparable
{
	private String myName;
	private int myPriority;

	public Patient(String name, int priority)
	{
		myName = name;
		myPriority = priority;
	}

	public int compareTo(Object o)
	{
		Patient rhs = (Patient)o;

		if(myPriority < rhs.myPriority)
			return -1;
		else if(myPriority > rhs.myPriority)
			return 1;
		else
			return 0;
	}

	public String toString()
	{
		String s = myName + " with priority " + myPriority;
		return s;
	}

}
