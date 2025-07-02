public class SearchArray {
   static int search_value(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -1;
    }
    public static void main(String args[]) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value" + (i + 1));
            arr[i] = sc.nextInt();
        }
        int index = search_value(arr, 10);
        if (index >= 0)
            System.out.println("The element is present in array at index= " + index);
        else
            System.out.println("No such element found in array");

    }
}