public class Aanya_Version {
	public static void main(String[] args){
		SquareArray(10);
	}
  public static void SquareArray(int n){
	  int[][] arr = new int[n][n];
	  for(int i = 0; i < n; i++){
		  for(int j = 0; j < n; j++){
			  arr[i][j] = (int)(Math.random()*n);
			  System.out.println(arr[i][j]);
		  }
	  }
   }
}
