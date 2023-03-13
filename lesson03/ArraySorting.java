package lesson03;


public class ArraySorting {
	private int[] baseArray;
	
	public ArraySorting(int lenght, int min, int max) {
		this.baseArray =  new int[lenght];
		for(int i=0; i < lenght; i++) {
			this.baseArray[i]= (int) Math.floor(Math.random() *(max - min + 1) + min); 
		}
	}
	
	public int[] sortedArray() {
		int[] ascSortArray = new int[this.baseArray.length];
		
		
		
		for(int i=0; i<ascSortArray.length;i++ ) {
			ascSortArray[i]=this.baseArray[i];			
		}
		        int lowest;
		        int lowestIndex;
		        for (int i = 0; i < ascSortArray.length; i++){
		            lowestIndex = i;
		            lowest = ascSortArray[i];
		            for (int j = (i + 1); j < ascSortArray.length; j++){
		                if(lowest >= ascSortArray[j]){
		                    lowest = ascSortArray[j];
		                    lowestIndex = j;
		                }
		            }
		            ascSortArray[lowestIndex] = ascSortArray[i];
		            ascSortArray[i] = lowest;
		        }
		
		return ascSortArray;
	}
	
	public int[] revSortedArray() {
		int[] ascSortArray = sortedArray();
		
		int last = ascSortArray.length -1;
		for (int i = 0; i < ascSortArray.length / 2; i++) {
			int tmp = ascSortArray[i];
			ascSortArray[i]= ascSortArray[last];
			ascSortArray[last]=tmp;
			
			last = last -1;
		}
		
		
		return ascSortArray;
	}
	
	
	public int[] getBaseArray() {
		return baseArray;
	}

	public void setBaseArray(int[] baseArray) {
		this.baseArray = baseArray;
	}
	
	
}