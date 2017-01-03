import java.util.*;
public class Problem10 {
	public static void main(String[] args){
	Random r = new Random();
	// a.
	int sum = 0;
	int[][] days = new int[29][5];
	
	for (int i =0; i < days.length; i++){
		for(int j = 0; j < days[i].length; j++){
			days[i][j] = r.nextInt(101);
		}
	}

	for(int x=0;x < 29; x++){
		for(int y=0;y < 5; y++){
			sum += days[x][y];
			}
		}
	System.out.println(sum);
	
	int totalCol = 0;
	for( int row = 0; row < 29; row++)
	{
	totalCol = 0;
	for( int col = 0; col < 5; col++)
	totalCol = totalCol + days [row] [col];
		}
	System.out.println(totalCol);
	}
}


	
		
	

