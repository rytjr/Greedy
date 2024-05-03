package ATM;

import java.util.*;

public class ATM {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		
		int[] arr = new int[Num];
		int[] list = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < Num; i++) {
			sum += arr[i];
			list[i] = sum;
		}
		
		for(int i = 0; i < Num; i++) {
			sum2 += list[i];
		}
		
		System.out.print(sum2);
	}

}
