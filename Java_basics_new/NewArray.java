package project;



public class NewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,23,11,33,45,21,15};
		 int b[] = new int[a.length];
		 for(int i=0;i<a.length;i++) {
				System.out.print(a[i] + " ");
			}
		 System.out.println(); 
	/*	for(int i=0; i < a.length;i++) {
			b[i]=a[i];
		} */
		 for(int i=a.length-1,j=0;i>=0;i--,j++) {
			 b[j]=a[i];
			 
		 }
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k] + " ");
		}
		
	/*	int a[]= new int[10];
		a[0]=2;
		a[1]=5;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		int index = 1;
		int M = 5;
		
		//int N =7;
		for(int i=0;i<M;i++) {
			System.out.print(a[i] + " ");
		}
		
		
		System.out.println();
		
		for(int i =index;i<M-1;i++) {
			a[index]=a[index+1];
			index++;
		}
		for(int i=0;i<M-1;i++) {
			System.out.print(a[i] + " ");
		}
		
	/*	for (int i=M;i>index;i--) {
			a[i] = a[i-1];
			
		}
		a[index]= N;
		M++;
		for(int i=0;i<M;i++) {
			System.out.print(a[i] + " ");
		}
		/*for(int y:b) {
			System.out.print(y + " ");
		}
		System.out.println();
		int key = 3;
		for(int i=0; i < a.length;i++) {
			if(key == a[i]) {
			System.out.print(a[i] +" " + "is found");
			System.exit(0);
		}

	}
		System.out.println("not found"); */
	/*	int max2;
		int max1 = max2 = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] > max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("first largest : " +max1);
		System.out.println("Second largest : " +max2);
	*/
	/*	int temp = a[0];
		for(int i=1;i<a.length;i++) {
			a[i-1] = a[i]; 
		}
		a[a.length - 1]=temp;
		for(int x:a) {
		System.out.print(x + " ");
		}*/
		
	
		

}
}