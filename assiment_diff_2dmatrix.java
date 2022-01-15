package jan11;
import java.util.*;
public class assiment_diff_2dmatrix {
	
	public static int[][] get_diff(int[][] arr1,int[][] arr2){
		int r=arr1.length;
		int c=arr1[0].length;
		
		int result[][]=new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				result[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		return result;
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first matrix number of row : ");
		int r1=sc.nextInt();
		System.out.println("Enter the first matrix number of colume : ");
		int c1=sc.nextInt();
		
		int[][] arr1=new int[r1][c1];
		
		System.out.println("Enter the 2nd matrix number of row : ");
		int r2=sc.nextInt();
		System.out.println("Enter the 2nd matrix number of colume : ");
		int c2=sc.nextInt();
		
		int[][] arr2=new int[r2][c2];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.println("Enter value 1st matrix : ");
				int val=sc.nextInt();
				arr1[i][j]=val;
			}
		}
		
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.println("Enter value 2nd matrix : ");
				int val=sc.nextInt();
				arr2[i][j]=val;
			}
		}
		
		System.out.println("First matrix is : ");
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(arr1[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("2nd matrix is : ");
		
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.print(arr2[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Difference is : ");
		if(r1==r2&&c1==c2) {
			int[][] result=get_diff(arr1,arr2);
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Difference not possible");
		}
		
		

	}

}
