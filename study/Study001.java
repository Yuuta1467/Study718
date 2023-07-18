package study;

public class Study001 {
	
	public static void main(String[] args) {
		
		int[] x = new int[20];
		
		for (int i = 0; i < x.length; i++) {
            x[i] = i * 5 + 5;
		}

		for (int i = 0; i <= 10; i++) {
            if (x[i] % 2 != 0) {
                System.out.print(x[i]);
                if (i != 10) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
        
        for (int i = 11; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                System.out.print(x[i]);
                if (i != x.length - 1) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
	}

}
