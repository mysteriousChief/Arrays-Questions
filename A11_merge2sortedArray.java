public class A11_merge2sortedArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 6, 7 };
        int[] arr2 = { 2, 5, 8, 9, 11 };
        merge(arr1, arr2);
    }

    // Time complexity : o(n1+n2);
    // Space Complexity : O(n1+n2);

    public static void merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println(arr3.length);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                k++;
                i++;
            } else {
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i < arr1.length) {
            arr3[k] = arr1[i];
            k++;
            i++;
        } 
        while(j < arr2.length) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        for (int ele : arr3) {
            System.out.print(ele + " ");
        }
    }

}
