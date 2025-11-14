public class Aanya_Version {
	public static void main(String[] args){
		int[][] arr = SquareArray(10);
		System.out.println("First even: " + FirstEven(arr));
		System.out.println("First even w/ sum > 17: " + SumNeighborsGreater17(arr));
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
	public static int FirstEven(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] %2 == 0)
					return arr[i][j];
			}
		}
		return -1;
	}
	public static int SumNeighborsGreater17(int[][] arr){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] %2 == 0){
					if(j != 0)
						sum += arr[i][j - 1];
					if(j != arr.length - 1)
						sum += arr[i][j + 1];
					if(sum > 17)
						return arr[i][j];
				}
			}
		}
		return -1;
	}
}
