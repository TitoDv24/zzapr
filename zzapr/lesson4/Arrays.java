package zzapr.zzapr.lesson4;

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
				elements[i][j] = RandomGenerator.getRandomNumber(from,to);
			}
		}
	}

	public boolean dimensionAreTheSame(Arrays anotherMatrix) {

		return elements.length == anotherMatrix.elements.length && elements[0].length == anotherMatrix.elements[0].length;
	}
	public boolean canMultiplyMatrices(Arrays anotherMatrix) {
		return (anotherMatrix.elements.length == elements[0].length);
	}
	@Override
	public String toString() {
		String text = "";
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[0].length; j++) {
				text += String.format("%6d", elements[i][j]);
			}

			text += "\n";
		}
		return text;
	}

	public Arrays sumMatrix(Arrays anotherMatrix) {
		Arrays result = null;

		if (dimensionAreTheSame(anotherMatrix)) {
			result = new Arrays(5, 5);
			for (int i = 0; i < elements.length; i++) {
				for (int j = 0; j < elements[0].length; j++) {
					result.elements[i][j] = elements[i][j] + anotherMatrix.elements[i][j];
				}
			}
		}
		return result;
	}
	public Arrays multiplyMatrices(Arrays anotherMatrix) {
		Arrays result = null;

		if(canMultiplyMatrices(anotherMatrix)) {
			result= new Arrays(elements.length, anotherMatrix.elements[0].length);// Result matrix

			for (int i = 0; i < elements.length; i++) {
				for (int j = 0; j < anotherMatrix.elements[0].length; j++) {
					for (int k = 0; k < elements[0].length; k++) {
						result.elements[i][j] += elements[i][k] * anotherMatrix.elements[k][j];
					}
				}
			}
		}


		return result;
	}

}
