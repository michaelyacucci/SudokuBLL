package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] myLatinSquare;
	
	public LatinSquare() {
		
	}
	
	public LatinSquare(int[][] twoDimArray) {
		super();
		myLatinSquare = twoDimArray;
	}
	
	public boolean ContainsZero() {
		
		for(int iRow = 0; iRow < myLatinSquare.length; iRow++) {
			for(int iCol = 0; iCol < myLatinSquare.length; iCol++) {
				
				if (myLatinSquare[iRow][iCol]==0)
					return true;
			}
		}
		return false;
	}
	
	public boolean doesElementExist(int[] arr, int iValue) {
		
		for (int i : arr) {
			
			if (i == iValue)
				return true;
		}
		return false;
	}
	
	
	
	public int[][] getLatinSquare() {
		return myLatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare;
	}
	
	
	public boolean hasDuplicates(int [] arr)
	{
		boolean hasDuplicates = false;
		Arrays.sort(arr);
		
		
		return hasDuplicates;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i])
				return false;
		}
		return true;
	}
	

}
