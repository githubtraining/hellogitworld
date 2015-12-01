package main.java.com.github;

public class MultipleNumbers {

	public static void main(String[] args) {
		int mult = 1;
		for(int i=0;i<= 10;i++){
			mult *= (int)(1+Math.random()*10);
		}
		System.out.println(mult+"dd");
	}

}
