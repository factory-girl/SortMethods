
public class BubbleSort {
	private static int[] a;
	private static boolean swapped;
	
	public BubbleSort(int[] anArray) {
		a = anArray;
	}
	
	public static void sort() {
		swapped = true;
		for (int i = a.length - 1; i > 0 && swapped; i--) {
			boolean swapped = false;
			for (int j = a.length - 1; j >= a.length - i; j--) {
				if (a[j] < a[j-1]) {
					swap(j, j-1);
					swapped = true;
				}
			}
		}
	}
	
	 private static void swap(int i, int j)
	   {
	      int temp = a[i];
	      a[i] = a[j];
	      a[j] = temp;
	   }
}
