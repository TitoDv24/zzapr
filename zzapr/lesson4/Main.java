package zzapr.zzapr.lesson4;

import java.util.Objects;

public class Main {
	
	public static void main(String[] args) {
		Arrays matrixA = new Arrays(4, 1);
		matrixA.generateRandomElements(-20, +20);
		System.out.println("Matrix A:");
		System.out.println(matrixA);

		Arrays matrixB = new Arrays(1,4);
		matrixB.generateRandomElements(-20, +20);

		System.out.println("Matrix B:");
		System.out.println(matrixB);

		Arrays matrixC = matrixA.sumMatrix(matrixB);
		System.out.print("matrix A + matrix B = \n");
		if (!Objects.isNull(matrixC)) {
			System.out.println(matrixC);
		} else {
			System.out.println("it is impossible to calculate\n" + "matrix A size is different from matrix B size.");
		}
		Arrays matrixD = matrixA.multiplyMatrices(matrixB);
		System.out.print("matrix A * matrix B = \n");
		if (!Objects.isNull(matrixD)) {
			System.out.println(matrixD);
		} else {
			System.out.println("it is impossible to calculate the multiplication\n");
		}
	}
}
