package pom.pageobjects;

public class childClassDemo extends parentClassDemo{

	public void childColor()
	{
		System.out.println("child Color implemented");
	}
	
	public void engine()
	{
		System.out.println("Engine code for CHILD implemented");
	} 

	public String COLR = "REDD";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClassDemo cd=new childClassDemo();
		cd.color();
		cd.engine();
	}

}
