package zzapr.lesson4;

import zzapr.utils.RandomGenerator;

public class Arrays {
 
	private int[][] elements;
	
	
	
	public Arrays(int numberOfRows, int numberOfColumns) {
		if (0 < numberOfRows && 0 < numberOfColumns) {
		elements = new int[numberOfRows][numberOfColumns];
		}
	}



	void generateRandomElements(int from, int to) {
		for (int i = 0; i < elements.length; i++) { //iterate rows
			for (int j = 0; j < elements[0].length; j++) { //iterate columns
			elements[i][j]= RandomGenerator.getRandomNumber(20, 20);
			}
		}
	}



	@Override
	public String toString() {
		String text = "";
		for (int i = 0; i < elements.length; i++) {
			for (int j=0; j< elements[0].length; j++) {
			text += String.format("%6d", elements[i][j]);
				}
			text += "\n";
			}
		return text;
	}
	
	
}

	

