package zzapr.lesson3;

public class Main {
	public static void main(String[] args) {
		int lenght = 10;		
		int min=0;
		int max=100;
		
		ArraySorting arrayObject = new ArraySorting(lenght, min, max);
		
		arraytoString(arrayObject.getBaseArray());
		
		arraytoString(arrayObject.sortedArray());
		
		arraytoString(arrayObject.revSortedArray());
	}

	public static void arraytoString (int[] array) {
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]);
			if (i!=array.length-1) {
				System.out.print(", ");
			}
			else {
				System.out.print(".");
			}
		}
	System.out.println();
	}

}