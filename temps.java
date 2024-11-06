
import java.util.Arrays;

/**
 * 
 */
public class temps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] temperatures = { { 0.6, 1.2, 6.3, 12.3, 17.8, 23.1, 25.7, 25.1, 20.3, 14.5, 8.7, 3.2 }, // New York
                { 13.3, 14.2, 15.6, 17.8, 19.9, 22.1, 24.6, 24.9, 23.7, 20.3, 15.4, 12.6 }, // Los Angeles
                { -6.4, -3.3, 3.9, 10.9, 16.3, 21.1, 23.9, 23.1, 18.7, 11.5, 4.6, -2.3 }, // Chicago
                { 20.1, 21.1, 22.9, 24.7, 26.8, 28.7, 29.7, 29.5, 28.2, 25.4, 23.1, 21.0 }, // Miami
                { 5.1, 6.1, 8.9, 12.2, 15.6, 18.8, 22.1, 22.3, 18.7, 12.2, 8.0, 5.0 } // Seattle
        };
		
		displayAll(temperatures);
		
		System.out.printf("\nThe average temperature is: "+"%.1f",calculateAverageTemp(temperatures));
		
		System.out.println("\n");
		
		displaySortedTemps(temperatures);
	}
	
	/**
	 * method that prints the 2d array to screen
	 * @param temps
	 */
	public static void displayAll(double[][] temps) {
		
		for (int row = 0; row < temps.length; row++) {
			for (int col = 0; col < temps[row].length; col++) {
				System.out.printf("%7.1f",temps[row][col]);
			}
			
			System.out.println();
		}
	}
	
	
	/**
	 * method that calculates the average temps of the data
	 * @param temps
	 * @return returns average 
	 */
	public static double calculateAverageTemp(double[][] temps) {
		
		double sum = 0;
		int count = 0;
		
		for (int row = 0; row < temps.length; row++) {
			for (int col = 0; col < temps[row].length; col++) {
				sum+=temps[row][col];
				count++;
			}
			
		}
		
		return sum / count;

	}
	
	/**
	 * method that displays the temperatures sorted in ascending order and colours any over the average in red text
	 * @param temps
	 */
	
	public static void displaySortedTemps(double[][]temps) {
		
		String whiteText = "\u001B[0m";
		
		String redText = "\u001B[31m";
		
		for (int city = 0; city < temps.length; city++) {
			Arrays.sort(temps[city]);
			
			for (int temp = 0; temp < temps[city].length; temp++) {
				
				if (temps[city][temp] > calculateAverageTemp(temps)) {
					//change to red text
					System.out.printf(redText);
					System.out.printf("%7.1f", temps[city][temp]);
					//change back to white text
					System.out.print(whiteText);
				} else {
					System.out.printf("%7.1f", temps[city][temp]);
				}
				
			}
			
			System.out.println();
		}
	}
	
	/**
	 * method that works out the average temperature
	 * @param array
	 * @param i
	 * @return
	 */
	
	public static double workOutAverage(double[] array) {
		
		int count = 0;
		double sum = 0;
		
		for (int number = 0; number < array.length; number++) {
			count++;
			sum+=number;
		}
		
		return sum / count;
	}
}
