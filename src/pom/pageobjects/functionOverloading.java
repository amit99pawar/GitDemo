package pom.pageobjects;

public class functionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		functionOverloading obj = new functionOverloading();

		obj.getData(54);
		obj.getData("AAAAAA");
		obj.getData(123, 433);
	}

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(int a,int b) {
		System.out.println(a+"  "+b);
	}

}
