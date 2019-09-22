package vining_p1_encrypt;
import java.util.Scanner;

public class vining_p1_encrypt {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int userNum;
		int[] numbers = new int[4];
		int temp;
		
		System.out.printf("Please enter a 4-digit number:%n");
		
		userNum = in.nextInt();
		
		numbers[0] = userNum / 1000;
		userNum = userNum - (numbers[0] * 1000);
		numbers[1] = userNum / 100;
		userNum = userNum - (numbers[1] * 100);
		numbers[2] = userNum / 10;
		userNum = userNum - (numbers[2] * 10);
		numbers[3] = userNum % 10;
		
		System.out.printf("%nYour number is: %d%d%d%d %n", numbers[0],numbers[1],numbers[2],numbers[3]);
		
		numbers[0] = (numbers[0] + 7) % 10;
		numbers[1] = (numbers[1] + 7) % 10;
		numbers[2] = (numbers[2] + 7) % 10;
		numbers[3] = (numbers[3] + 7) % 10;
		
		temp = numbers[0];
		numbers[0] = numbers[2];
		numbers[2] = temp;
		
		temp = numbers[1];
		numbers[1] = numbers[3];
		numbers[3] = temp;
		
		System.out.printf("%nYour encrypted number is: %d%d%d%d %n", numbers[0],numbers[1],numbers[2],numbers[3]);

	}

}
