package com.test2;

import java.util.Scanner;

public class PrintMatrics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row : ");
		int row = sc.nextInt();
		System.out.println("Enter size of column : ");
		int column = sc.nextInt();
		
		
		int matrics[][] = new int[row][column];
		for(int rowIndex=0;rowIndex<row;rowIndex++) {
			for(int columnIndex=0;columnIndex<column;columnIndex++) {
				matrics[rowIndex][columnIndex] = sc.nextInt();
			}
		}
		
		
		for(int [] rowMatrics :matrics) {
			for(int columnMatrics : rowMatrics ) {
				System.out.print(columnMatrics+" ");
			}
			System.out.println();
		}

	}

}
