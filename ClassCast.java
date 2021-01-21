
class p1
{
	void s1(){
		System.out.println("P1");
	}
}
class p2 extends p1
{
	void s2(){
	System.out.println("P2");
	}
}
class ClassCast
{
	public static void main(String[] args) 
	{
		p1 obj1 = new p1();

		try
		{
			p2 obj2 =(p2)obj1;
		}
		catch (ClassCastException e)
		{
			System.out.println(e);
			System.out.println("Create instance of subclass in Object_Reference then try to downcast");
		}
	}
}
