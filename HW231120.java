package com.demo.helloworld;
import java.lang.Math;

public class HW231120 {
	public static void main(String[] args) {
		//hw1();
		//hw2();
		hw3();
	}

	public static void hw1() {
		//draw8(4);
	}

	public static void draw1(int i) {
		for (int count = 1; count <= i; count++) {
			System.out.print("*");
		}
	}

	public static void draw2(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1;count2 <= i; count2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void draw3(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1;count2 <= i; count2++) {
				System.out.print(count2);
			}
			System.out.println();
	}
}
	public static void draw4(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = i;count2 > 0; count2--) {
				System.out.print(count2);
			}
			System.out.println();
	}
}
	public static void draw5(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1;count2 <= i; count2++) {
				System.out.print(count);
			}
			System.out.println();
	}
}
	public static void draw6(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1;count2 <= i; count2++) {
				System.out.print(i-count+1);
			}
			System.out.println();
	}
}
	public static void draw7(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1+i*(count-1);count2 <= i*count; count2++) {
				System.out.print(count2);
			}
			System.out.println();
	}
}
	public static void draw8(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1+i*(count-1);count2 <= i*count; count2++) {
				System.out.print(i*i-count2 +1);
			}
			System.out.println();
	}
}
	public static void hw2() {
		String[][] table = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
		multiply(table);
	}
	public static void multiply(String [][] table) {
		for(int i=0; i<table.length;++i) {
			for(int j = 0;j<table[i].length;++j) {
				int a = Integer.parseInt(table[i][j]);
				System.out.print(a*2);
				if (j<2) {
					System.out.println(",");
				}
			}
			System.out.println();
		}
		
	}
	public static void hw3() {
		draw17(4);
	}
	public static void draw9(int i) {
		for(int count = 0; count <= i-1; count++) {
			System.out.println(count*2);
		}
	}
	public static void draw10(int i) {
		for(int count = 1; count <= i; count++) {
			System.out.println(count*2);
		}
	}
	public static void draw11(int i) {
		for(int count = 1;count <= i; count++) {
			for(int count2 = 1;count2 <= i; count2++) {
				System.out.print(count2*count);
			}
			System.out.println();
	}
}
	public static void draw12(int n) {
		for(int i = 1;i <= i; i++) {
			for(int j = 1;j <= i; j++) {
				if(i == j) {
					System.out.print("_");
				}else {
					System.out.print(("*"));
				}	
			}
			System.out.println();
	}
}
	public static void draw13(int n) {
		for(int i = 1;i <= n; i++) {
			for(int j = 1;j <= n; j++) {
				if(i + j == n+1) {
					System.out.print("_");
				}else {
					System.out.print(("*"));
				}	
			}
			System.out.println();
	}
}
		
	public static void draw14(int n) {
		for(int i = 1;i <= n; i++) {
			for(int j = 1;j <= n; j++) {
				if(i < j) {
					System.out.print("_");
				}else {
					System.out.print(("*"));
				}	
			}
			System.out.println();
	}
}
	public static void draw15(int n) {
		for(int i = 1;i <= n; i++) {
			for(int j = 1;j <= n; j++) {
				if(n-i+1 < j) {
					System.out.print("_");
				}else {
					System.out.print(("*"));
				}	
			}
			System.out.println();
	}
}
	public static void draw16(int n) {
		for(int i = 1;i <= (n*2)-1; i++) {
			for(int j = 1;j <= n; j++) {
				if (j <= n - Math.abs(n-i)) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}	
			}
			System.out.println();
	}
}
	public static void draw17(int n) {
		for(int i = 1;i <= (n*2)-1; i++) {
			for(int j = 1;j <= n; j++) {
				if (j <= n - Math.abs(n-i)) {
					System.out.print(n - Math.abs(n-i));
				}else {
					System.out.print("_");
				}	
			}
			System.out.println();
	}
}
}

