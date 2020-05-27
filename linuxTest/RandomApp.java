package linuxTest;

import java.util.Random;

public class RandomApp {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextInt(10));
	}
}
