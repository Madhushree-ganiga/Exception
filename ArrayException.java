
public class ArrayException {
public static void main(String[] args)
{
	String []names= {"Madhushree","Prateeka","Raksha"};
	for(int i=0;i<names.length;i++)
	{ 
		try{
		System.out.println(names[i]);
	}
	catch(ArrayIndexOutOfBoundsException e){
	System.out.println("e.getMessage()");	
	}
}
}
}