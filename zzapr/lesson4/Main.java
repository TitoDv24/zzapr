package zzapr.zzapr.lesson4;

import java.util.Objects;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for matrix A: ");
		int numberOfRowsA = scanner.nextInt();

		System.out.print("Enter the number of columns for matrix A: ");
		int numberOfColumnsA = scanner.nextInt();

		System.out.print("Enter the number of rows for matrix B: ");
		int numberOfRowsB = scanner.nextInt();

		System.out.print("Enter the number of columns for matrix B: ");
		int numberOfColumnsB = scanner.nextInt();
		Arrays matrixA = new Arrays(numberOfRowsA, numberOfColumnsA);

		System.out.print("Enter the minimum value of the random range: ");
		int start = scanner.nextInt();

		System.out.print("Enter the maximum value of the random range: ");
		int stop = scanner.nextInt();
		matrixA.generateRandomElements(start, stop);
		System.out.println("Matrix A:");
		System.out.println(matrixA);

		Arrays matrixB = new Arrays(numberOfRowsB, numberOfColumnsB);



		matrixB.generateRandomElements(start, stop);

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
