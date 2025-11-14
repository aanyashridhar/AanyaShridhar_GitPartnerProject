public class Aanya_Version {
	public static void main(String[] args){
		int[][] arr = SquareArray(10);
		System.out.println("First even: " + firstEven(arr));
	}
	public static int[][] SquareArray(int n){
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = (int)(Math.random()*n);
			System.out.println(arr[i][j]);
			}
		}
		return arr;
	}
	public static int firstEven(int[][] arr){
		int first = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] %2 == 0)
					first = arr[i][j];
			}
		}
		return first;
	}
}
