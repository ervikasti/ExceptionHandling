class IndexOutException 
{	
	static
	{
		System.out.println("This Program Contains Two IndexBoundsOfException \n");
	}
	public static void main(String[] args) 
	{
		int a[] ={1,2,3};
		
		try{
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Mistake :"+e+"\n");
		}
		String s = "MindTree";

		try{
			System.out.println(s.charAt(10));
		}
		catch(ArrayIndexOutOfBoundsException e ){
			System.out.println("Catch Block 1 :"+e);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Catch block 2 :"+e);
		}

		
	}
}
