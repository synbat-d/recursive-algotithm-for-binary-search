public class Test {
    public static void main(String[] args) {
        Helper helper = new Helper();
        int [] arr = {25, 31, 42, 50, 53, 64, 105, 203, 306};
        int position = helper.binarySearch(arr, 0, 8, 20);
        System.out.println(position);
    }
}
