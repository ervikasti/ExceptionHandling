class Arithmetic 
{
	public static void main(String[] args) 
	{
		//Exception handling
		try{
			//It is a block which contain execption statement
			//Any statement below the exception statement is not executed
			int a = 100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("CANT DIVIDE BY ZERO ");
			System.out.println("Error :"+e );
		}
		
	}
}
