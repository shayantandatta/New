package sam;

import java.util.Arrays;

public class MyTest {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 9, 6, 15, 7, 5, 9};
		
	int	temp = 0;
		
		for(int i=0;i<arr.length;i++ ){
		for(int j=i;j<arr.length;j++ ){
			
			if(arr[j]>arr[i]){
				
				temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
		
				
			}
		}
		
		for(int k=0;k<arr.length;k++ ){
			System.out.println(arr[k]);
			
		}
		
			
			
		}
		
	//	Arrays.asList(arr);

	}

}
