import java.util.*;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 12
 * @author Litokho Maksym
 * @version 13.02.2024
 */

public class HomeWork12 {
    static List<Integer> idxList = new ArrayList<>();
    public static void main(String[] args) {

        // Task #1
        // generated array with size 20
        Random rn = new Random();
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(21) - 10;
        }
        System.out.println("There is an array:");
        System.out.println(Arrays.toString(array));

        // Linear search in an array
        int toSearch;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to search in the array: ");
        toSearch = in.nextInt();
        linearSearch(array, toSearch);
        System.out.println((idxList.isEmpty())? "Can't find " + toSearch : "Found " + toSearch + " in position #: " + idxList);

        // Task #2

        System.out.println("Selection sorted array:");
        selectionSort(array);       // selection sorted array

        // Task #3
        // Binary search in an array
        System.out.print("Enter a number to search in the array: ");
        toSearch = in.nextInt();
        binarySearch(array, toSearch);
        System.out.println((idxList.isEmpty())? "Can't find " + toSearch : "Found " + toSearch + " in position #: " + idxList);
    }

    // linear search
    public static List<Integer> linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                idxList.add(i + 1);
                break;
            }
        }
        return idxList;
    }

    // binary search
    public static List<Integer> binarySearch(int[] arrSort, int n) {
        idxList.clear();
        int low = 0;
        int pos;
        int high = arrSort.length;
        while (low < high) {
            pos = low + (high - low) / 2;
            if (arrSort[pos] < n) {
                low = pos + 1;
            } else if (arrSort[pos] > n) {
                high = pos - 1;
            } else if (arrSort[pos] == n) {
//                // if in the array several matches
//                while (pos >= 0 && arrSort[pos] == n) {
//                    pos --;
//                }
//                pos++;
//                while (pos < arrSort.length && arrSort[pos] == n) {
                idxList.add(pos + 1);
//                    pos++;
//                }
                break;
            }
        }
        return idxList;
    }

    // selection sorted
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIdx = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIdx = j;
                }
            }
            arr[minIdx] = arr[i];
            arr[i] = min;
        }
//        System.out.println(Arrays.toString(arr));;
    }
}