package study;

public class Stydy003 {
	
public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				n++;
				sum = sum + i;
			}
		}
		System.out.println("偶数の数:" + n);
		System.out.println("偶数の合計:" + sum);
		
	}

}
