package com.codegnan.patterns;

import java.util.Scanner;

public class AlphabeticalCharacters {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		int size =s.nextInt(); 
        char currentCharacter = 'A'; 

        // Outer loop for rows
        for (int i = 0; i < size; i++) {
            // Inner loop for columns
            for (int j = 0; j < size; j++) {
                System.out.print(currentCharacter); 
                currentCharacter++;
            }
            System.out.println(); 
        }
        }

}
