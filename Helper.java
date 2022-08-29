public class Helper {
    public int binarySearch(int [] arr, int l, int h, int key) {
        if (l <= h && h<= arr.length-1) {
            int mid = (l+h)/2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                return binarySearch(arr, mid+1, h, key);
            }
            else {
                return binarySearch(arr, l, mid-1, key);
            }
            }
        return -1;
        }
    }

