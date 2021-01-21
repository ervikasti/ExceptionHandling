class NullPointer 
{
	public static void main(String[] args) 
	{
		Null obj1 = new Null();
		obj1 = null;
		try
		{
			System.out.println(obj1.a);
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Check the object_reference properly");
		}
		
	}
}

class Null
{
	int a;
	public void msg()
	{
		System.out.println(" This is NUll class");
	}
}
