package basic.programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Integer n = 1234;
			int z = n;
			int l = n.SIZE;
			int[] a = new int[l];
			int sum = 0;
			
			for(int i=1; n>0; i++){
				
				for(int j =0; j<l; j++){
					
					a[j] = n%10;
					n = n/10;
				}
			}
			
			for(int x:a){
				
				sum = x*x*x + sum;
			}
			
			
			if(sum==z){
				
				System.out.println("Armstrong");
			}
			else
			System.out.println("Not");
	}

}
