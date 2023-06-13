
public class printMaxNumInSmallNumColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program finds maxium number from smallest numbers column.
		
		int a[][]= {{12,10,1},{13,22,8},{15,27,2}};   //Another way of defining & assigning values for multi-dimensional array
		int lowest=a[0][0];
		int row = 0;
		int column = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				int Num=a[i][j];  // Num variable shows next number to be compared & this is just for Info purpose
				if(lowest>=a[i][j]) 
				{	
					lowest=a[i][j];
					row=i;
					column=j;
				}
				
			}
		}
		
		System.out.println("Smallest Number is from "+row+" Row & "+column+" Column");
	
		int max=a[0][column];
		
		for(int k=0;k<3;k++)
		{
			if(a[k][column]>max)
			{
				max=a[k][column];	
			}
		}
		
		System.out.println("Maximum Number from Smallest Numbers Column is "+max);

	}

}
