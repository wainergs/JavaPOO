package application;

import java.util.Scanner;

public class matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int mat[][] = new int[n][n];
		
		//preenchendo os elementos de uma matriz
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		//matriz diagonal
		System.out.print("Main Diagonal: ");
		for(int i=0;i<n;i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		//negativos
		int negativos = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j] < 0) {
					negativos++;
				}
			}			
		}
		System.out.println();
		
		System.out.print("Negativos: "+negativos);
	}

}
