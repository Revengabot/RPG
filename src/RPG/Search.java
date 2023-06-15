package RPG;

import java.util.ArrayList;

public class Search {

public static int binarySearchString(ArrayList<Product> arr, String target) {
    int left = 0;
    int right = arr.size() - 1;
    int mid;

    while (left <= right) {
        mid = (left + right) / 2;

        if (arr.get(mid).getName().compareTo(target) < 0) {
            left = mid + 1;
        } else if (arr.get(mid).getName().compareTo(target) > 0) {
            right = mid - 1;
        } else {
            return mid;
        }
    }

    return -1;
}
	
	

}
