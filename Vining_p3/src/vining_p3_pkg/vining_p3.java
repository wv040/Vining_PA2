package vining_p3_pkg;
import java.util.Scanner;

public class vining_p3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String userString;
		int userRating;
		int rowTotal = 0;
		double totalResponses = 0.0;
		int maxPoints = 0;
		int minPoints = 10000;
		int maxPointsIndex = 0;
		int minPointsIndex = 0;
		int index = 0;
		
		String[] topics = {"Space Exploration", "Defense", "Mental Health", "Drinking Age", "Presidential Election"};
		
		int[][] ratings = new int[5][10];
		
		double[] avgRatings = new double[5];
		
		System.out.printf("Welcome to the poll!\n\nToday you will be rating 5 important political issues on their importance to you.\n\n");
		
		
		while (true)
		{
			System.out.printf("Would you like to continue? (y/n): \n");
			userString = in.next();
			
			if (userString.compareTo("n") == 0)
			{
				break;
			}
			else
			{
				for (int i = 0; i < 5; ++i)
				{
					System.out.printf("%d. Please rate %s from 1(least important) to 10(most important): \n", (i+1), topics[i]);
					userRating = in.nextInt();
					
					if (userRating > 0 && userRating < 11)
					{
						ratings[i][userRating - 1] += 1;
					}
					else 
					{
						System.out.print("Invalid Entry. Please Start over.");
						System.exit(0);
					}
				}
				++totalResponses;
			}
		}
		
		// average calculations
		for (int i = 0; i < 10; ++i)
		{
			rowTotal += (ratings[0][i] * (i+1));
		}
		avgRatings[0] = rowTotal / totalResponses;
		if (rowTotal > maxPoints)
		{
			maxPoints = rowTotal;
			maxPointsIndex = 0;
		}
		if (rowTotal < minPoints)
		{
			minPoints = rowTotal;
			minPointsIndex = 0;
		}
		rowTotal = 0;
		
		for (int i = 0; i < 10; ++i)
		{
			rowTotal += (ratings[1][i] * (i+1));
		}
		avgRatings[1] = rowTotal / totalResponses;
		if (rowTotal > maxPoints)
		{
			maxPoints = rowTotal;
			maxPointsIndex = 1;
		}
		if (rowTotal < minPoints)
		{
			minPoints = rowTotal;
			minPointsIndex = 1;
		}
		rowTotal = 0;
		
		for (int i = 0; i < 10; ++i)
		{
			rowTotal += (ratings[2][i] * (i+1));
		}
		avgRatings[2] = rowTotal / totalResponses;
		if (rowTotal > maxPoints)
		{
			maxPoints = rowTotal;
			maxPointsIndex = 2;
		}
		if (rowTotal < minPoints)
		{
			minPoints = rowTotal;
			minPointsIndex = 2;
		}
		rowTotal = 0;
		
		for (int i = 0; i < 10; ++i)
		{
			rowTotal += (ratings[3][i] * (i+1));
		}
		avgRatings[3] = rowTotal / totalResponses;
		if (rowTotal > maxPoints)
		{
			maxPoints = rowTotal;
			maxPointsIndex = 3;
		}
		if (rowTotal < minPoints)
		{
			minPoints = rowTotal;
			minPointsIndex = 3;
		}
		rowTotal = 0;
		
		for (int i = 0; i < 10; ++i)
		{
			rowTotal += (ratings[4][i] * (i+1));
		}
		avgRatings[4] = rowTotal / totalResponses;
		if (rowTotal > maxPoints)
		{
			maxPoints = rowTotal;
			maxPointsIndex = 4;
		}
		if (rowTotal < minPoints)
		{
			minPoints = rowTotal;
			minPointsIndex = 4;
		}
		rowTotal = 0;
		
		
		// output formatting
		
		for (int i = 0; i < 99; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n|%56s%42s%n", "Ratings Summary", "|");
		
		for (int i = 0; i < 99; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n| %-21s | %32s                          | %11s |%n", "Topics" , "Ratings", "Avg. Rating");
		
		for (int i = 0; i < 99; ++i)
		{
			System.out.print("-");
		}
		
		System.out.printf("\n|-----------------------|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |  10 |-------------|\n");
		
		for (int i = 0; i < 99; ++i)
		{
			System.out.print("-");
		}
		
		for (int i = 0; i < 5; ++i)
		{
			System.out.printf("\n| %-21s |%3d  |%3d  |%3d  |%3d  |%3d  |%3d  |%3d  |%3d  |%3d  |%3d  |%8.1f     |\n", topics[i], ratings[i][0], ratings[i][1], ratings[i][2],ratings[i][3],ratings[i][4],ratings[i][5],ratings[i][6],ratings[i][7],ratings[i][8],ratings[i][9],avgRatings[i]);
			
			for (int j = 0; j < 99; ++j)
			{
				System.out.print("-");
			}
		}
		
		System.out.printf("%n%n%n");
		
		System.out.printf("%s recieved the highest rating value overall with %d points.%n%n", topics[maxPointsIndex], maxPoints);
		
		System.out.printf("%s recieved the lowest rating value overall with %d points.%n", topics[minPointsIndex], minPoints);
	}

}
