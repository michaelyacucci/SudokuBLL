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

		for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
			for (int iCol = 0; iCol < myLatinSquare.length; iCol++) {

				if (myLatinSquare[iRow][iCol] == 0)
					return true;
			}
		}
		return false;
	}

	public boolean doesElementExist(int iValue) {

		for (int i : myLatinSquare) {

			if (i == iValue)
				return true;
		}
		return false;
	}

	public int[][] getLatinSquare() {
		return myLatinSquare;
	}

	public int[] getRow(int num) {

		return myLatinSquare[num];
	}

	public int[] getColumn(int num) {

		int[] column = new int[myLatinSquare.length];

		for (int i = 0; i < myLatinSquare.length; i++) {
			column[i] = myLatinSquare[i][num];
		}
		return column;
	}

	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare;
	}

	public boolean hasDuplicates(int[] arr) {

		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1])
				return true;
		}
		return false;
	}

	public boolean hasAllValues(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public boolean isLatinSquare() {

		if (ContainsZero())
			return false;

		for (int i = 0; i < myLatinSquare.length; i++) {

			if (hasDuplicates(getColumn(i)))
				return false;
			if (hasDuplicates(getRow(i)))
				return false;
		}

		int[] arrRow = getRow(0);
		int[] arrCol = getColumn(0);

		for (int j = 1; j < myLatinSquare.length; j++) {
			if (hasAllValues(arrRow, myLatinSquare[j]) == false)
				return false;
			if (hasAllValues(arrCol, getColumn(j)) == false)
				return false;
		}

		return true;
	}

}
