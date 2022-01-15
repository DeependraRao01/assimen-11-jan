package jan11;

public class assiment_count_odd_even {
	public static int odd(int[][] mtx) {
		int odd_count=0;
		for(int i=0;i<mtx.length;i++) {
			for(int j=0;j<mtx[0].length;j++) {
				if(mtx[i][j]%2!=0) {
					odd_count++;
				}
			}
		}
		return odd_count;
	}
	
	public static int even(int[][] mtx) {
		int even_count=0;
		for(int i=0;i<mtx.length;i++) {
			for(int j=0;j<mtx[0].length;j++) {
				if(mtx[i][j]%2==0) {
					even_count++;
				}
			}
		}
		return even_count;
	}
	
	
	

	public static void main(String[] args) {
		
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		
		
		System.out.println(odd(arr));
		System.out.println(even(arr));

	}

}
