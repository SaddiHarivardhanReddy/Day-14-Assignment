package com.codegnan.patterns;
import java.util.Scanner;
public class FloydTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch = 'A';
		int rows=s.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
                System.out.print(" ");
            }
            System.out.println();
        }

	}

}
