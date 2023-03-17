package zzapr.lesson4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Arrays matrixA = new Arrays(4,5);
		matrixA.generateRandomElements(-20, +20);
		System.out.println(matrixA);
	}
}
