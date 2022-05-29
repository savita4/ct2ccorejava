package my_first_project;

public class ArrDemo {

	//public ArrDemo() {
		// TODO Auto-generated constructor stub
	//}

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		int [] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		/*for(int i=0;i<4 ;i++)
		{
			System.out.println(arr[i]);
		}
		*/
		// enhanced for loop
		/*for(int i:arr)
		{
			System.out.println(i);
		}*/
		

		int a[]= {1,2,3,4};
		int b[]= {5,8,9};
		int c[]= {10,20,30};
		int d[][]= {a,b,c,};
		for(int i=0;i<d.length;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\t"+d[i][j]);
			}
			
				
			System.out.println("\n");
		}
		
		
		
		
		
		
	}

}
