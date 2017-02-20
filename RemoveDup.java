package Paypal;


public class RemoveDup {

	public static void main(String[] args) {
		int[] cArray = new int[]{1,2,3,1,2,5};
		System.out.println(removeDup(cArray));

	}
	
	private static String removeDup(int[] arr){		
		if(arr ==null || arr.length==0){
			return "";
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]);
					arr[j] = -1;
			}
		}
		return arr.toString();
	}

}
