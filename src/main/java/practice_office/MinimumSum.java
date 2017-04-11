package practice_office;

public class MinimumSum {

	public static void main(String[] args) {
		int[][] arr = { { 1 }, { 2, 3 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		Display(arr);
       minimumSum(arr,3);
	}

	public static void Display(int[][] arr) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void minimumSum(int[][] arr,int n) {
		for (int i =n-1; i >=0 ; i--) {
			for (int j = 0; j <=i; j++) {
				/*int a=arr[i][j] + arr[i + 1][j];
				int b= arr[i][j] + arr[i+1][j + 1];
				int min=Math.min(arr[i][j] + arr[i + 1][j], arr[i][j] + arr[i+1][j + 1]);*/
				arr[i][j] = Math.min(arr[i][j] + arr[i + 1][j], arr[i+1][j] + arr[i+1][j + 1]);
			}
		}
		System.out.println(arr[0][0]);
	}

}
