
public class printSmallestNumInArray3by3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[][]= {{12,4,1},{13,22,8},{15,27,2}};   //Another way of defining & assigning values for multi-dimensional array
		int lowest=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int Num=a[i][j];  // Num variable shows next number to be compared & this is just for Info purpose
				if(lowest>=a[i][j])
				{	
					lowest=a[i][j];
				}
				
			}
		}
		System.out.println("Smallest Number from 3*3 Array is "+lowest);
	}

}
