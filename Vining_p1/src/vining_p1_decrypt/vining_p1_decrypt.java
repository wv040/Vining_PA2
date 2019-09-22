package vining_p1_decrypt;
import java.util.Scanner;


public class vining_p1_decrypt {

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
		
		temp = numbers[2];
		numbers[2] = numbers[0];
		numbers[0] = temp;
		
		temp = numbers[3];
		numbers[3] = numbers[1];
		numbers[1] = temp;
		
		for (int i = 0; i < 4; ++i)
		{
			if (numbers[i] >= 7)
			{
				numbers[i] = numbers[i] - 7;
			}
			else
			{
				numbers[i] = numbers[i] + 3;
			}
		}
		
		System.out.printf("%nYour decrypted number is: %d%d%d%d %n", numbers[0],numbers[1],numbers[2],numbers[3]);

	}

}
