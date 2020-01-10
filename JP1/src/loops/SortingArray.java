package loops;

public class SortingArray {

	public static void main(String[] args) {
		BubbleSort bs1= new BubbleSort();
		System.out.println("BubbleSort - "+ java.util.Arrays.toString(bs1.sortingArray()));

		
		SelectionSort ss1= new SelectionSort();
		System.out.println("SelectionSort -"+java.util.Arrays.toString(ss1.sortingArray()));
		
	}
	
	

}


class SelectionSort{
	
	private int[] array = { 21,200,6,88, 89,50,100, 23, 66, 29, 16};
	public int[] getArray() {
		return array;
	}
	
	int n=getArray().length;
	int[] numbers=getArray(); 
	int temp;int k=1;
	public int[] sortingArray(){
		 System.out.println(java.util.Arrays.toString(numbers));
		for (int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(numbers[i]>numbers[j]){
				 temp=numbers[j]; numbers[j]=numbers[i]; numbers[i]=temp;				 
				 System.out.println("Pass"+(k++)+":"+java.util.Arrays.toString(numbers));						 
				}
			}
		}		
		return numbers;
	}
	
}

class BubbleSort{
	
	private int[] array = {21,200,6,88, 89,50,100, 23, 66, 29, 16};
	public int[] getArray() {
		return array;
	}
	
	int n=getArray().length;
	int[] numbers=getArray(); 
	int temp;int k=1;
	public int[] sortingArray(){
		 System.out.println(java.util.Arrays.toString(numbers));
		for (int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(numbers[j]>numbers[j+1]){
				 temp=numbers[j+1]; numbers[j+1]=numbers[j]; numbers[j]=temp;				 
				 System.out.println("Pass"+(k++)+":"+java.util.Arrays.toString(numbers));
				}
			}
		}		
		return numbers;
	}
	
}
