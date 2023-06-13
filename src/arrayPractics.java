

public class arrayPractics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a array Value at "+i+"th index is "+a[i]);
		}
		
		
		int b[]= {11,22,33,44,55,66};  // This way of defining array is called as Array literals.
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b array Value at "+i+"th index is "+b[i]);
		}

	}

}
