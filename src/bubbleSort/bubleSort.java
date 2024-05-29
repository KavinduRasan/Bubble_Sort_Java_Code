package bubbleSort;

public class bubleSort {

	
		// TODO Auto-generated method stub

	
	
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        int lastSwapped;
	        do {
	            lastSwapped = 0;
	            for (int i = 1; i < n; i++) {
	                if (arr[i - 1] > arr[i]) {
	                    int temp = arr[i - 1];
	                    arr[i - 1] = arr[i];
	                    arr[i] = temp;
	                    lastSwapped = i;
	                }
	            }
	            n = lastSwapped; 
	        } while (lastSwapped != 0);
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 1, 4, 2, 8};
	        bubbleSort(arr);
	        System.out.println("Sorted array:");
	        for (int value : arr) {
	            System.out.print(value + " ");
	        }
	    }
	}


