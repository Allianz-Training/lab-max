package com.demo.helloworld;

public class Task231120 {
	public static void main(String[] args) {
		quest5();
	}
	public static void quest1() {
		int score = 50;
		switch(score) {
		case 10:
			System.out.println("10"); break;
		case 20:
			System.out.println("20"); break;
		case 30:
			System.out.println("30"); break;
		default:
			System.out.println("Default");
		}
	}
	public static void quest2() {
		for(int count = 0; count <=5; count++) {
			System.out.println("count"+ count);
		}
	}
	public static void quest3() {
		int myArray[] = {2,4,6,8,10};
		for(int count: myArray) {
			System.out.println(count/2);
		}
	}
	public static void quest4() {
		int i = 1 ;
		while (i <=100) {
			if(i % 12 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public static void quest5() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}


		public static void Lap8() {
		for(int count=0;count<=20;count++) {
		if(count == 11) {
			System.out.print(count);
		break;
		}
	}
}

		public static void LapF9() {
		for(int count=0;count<=20;count++) {
		if(count == 11) {
		System.out.print(count);
		continue;
		}
	}
}
		public static void Lap10() {
		int i = 0;
		while(i < 10) {
		i++;
		if (i == 2) {
		continue;
		}
		System.out.print(i);
	}
}

		public static void Lap11() {
		String a = "My dog name is";
		String b = " Baka";
		System.out.println(pet(a,b));
		myDog(a,b);
		}

		public static String pet(String word, String name) {
		return word + name;
		}

		public static void myDog(String word, String name) {
		System.out.println(word + name);
		}
	}
