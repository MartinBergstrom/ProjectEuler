package problem11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LargestProductInAGrid {
	public static void main(String[] args){
		final long startTime = System.currentTimeMillis();
		new LargestProductInAGrid();
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + " ms");
	}

	public LargestProductInAGrid(){
		int[][] grid = new int[20][20];
		Long product = 0L;

		File file = new File("src/problem11/grid.txt");
		try {
			Scanner input = new Scanner(file);

			while(input.hasNext()){
				for(int i = 0; i<grid.length; i++){
					for(int j = 0; j<grid.length; j++){
						int number = Integer.parseInt(input.next());
						grid[i][j] = number;
					}
				}
			}			
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//sök vertikalt
		for(int i = 0; i<grid.length-3; i++){
			for(int j = 0; j<grid.length; j++){
				Long newProduct = (long) (grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j]);
				if( newProduct>product){
					product = newProduct;
				}
			}
		}
		//sök horisontellt
		for(int i = 0; i<grid.length; i++){
			for(int j = 0; j<grid.length-3; j++){
				Long newProduct = (long) (grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3]);
				if( newProduct>product){
					product = newProduct;
				}
			}
		}
		//sök diagonalt, snett ner höger
		for(int i = 0; i<grid.length-3; i++){
			for(int j = 0; j<grid.length-3; j++){
				Long newProduct = (long) (grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3]);
				if( newProduct>product){
					product = newProduct;
				}
			}
		}
		
		//sök diagonalt, snett uppåt höger
		for(int i = grid.length-1; i>3; i--){
			for(int j = 0; j<grid.length-3; j++){
				Long newProduct = (long) (grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3]);
				if( newProduct>product){
					product = newProduct;
				}
			}
		}
		System.out.println(product);
	}
}