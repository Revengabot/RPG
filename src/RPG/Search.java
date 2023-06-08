package RPG;

public class Search {

	
	public static int binarySearch(int[]array,int input){		
		int left = 0;
	    int right = array.length - 1;
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        
			if (array[mid] == input) {
	            return 1;
	        }
	        if (array[mid] < input) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1; // target not found

		
	}
	
	public static double binarySearch(double[]array,double input){		
		int left = 0;
	    int right = array.length - 1;
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        
			if (array[mid] == input) {
	            return 1;
	        }
	        if (array[mid] < input) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1; // target not found

		
	}//method overloading yeah!1!
	
	
	
	
	
	
//	public static int findClosest(Superhero[] heros , double input) {
//		int target =0;
//		int index=0;
//		while(true) {
//		if (heros[index].getPower()>input&heros[index].getPower()<input) {
//			return index;
//		}
//		else if(heros[index].getPower()<input) {
//			index++;
//		}else if(heros[index].getPower()>input) {
//			index--;
//		}
//		}
//		
//		
//	}//bursting with tears

}
