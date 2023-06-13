
public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c[][]= new int[3][3];     // Defining multi-dimensional array
			c[0][0]=2;                // Assigning values in multi-dimensional array 
			c[0][1]=4;
			c[0][2]=6;
			c[1][0]=8;
			c[1][1]=9;
			c[1][2]=11;
			c[2][0]=13;
			c[2][1]=15;
			c[2][2]=17;
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		
		int d[][]= {{2,4,6},{8,11,13},{15,17,19}};   //Another way of defining & assigning values for multi-dimensional array
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(d[i][j]);
			}
		}	
	}

}
