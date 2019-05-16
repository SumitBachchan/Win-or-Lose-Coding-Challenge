import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Sumit Saini
 *
 */
public class winLose {

	public static void main(String[] args) {
		int k, i;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for (k = 0; k < testcases; k++) {

			int number = sc.nextInt();// Scan Total number of players in game

			/**
			 * Here: "av" used for Players and "th" for Villain
			 *
			 */
			int[] av = new int[number];// N no. of Players

			int[] th = new int[number];// N no. of Villain

			for (i = 0; i < th.length; i++) {
				th[i] = sc.nextInt();// enter villain strengths
			}

			for (i = 0; i < av.length; i++) {
				av[i] = sc.nextInt();// enter player energies
			}

			Arrays.sort(av);
			Arrays.sort(th);

			for (i = 0; i < number; i++) {
				result = 0;
				if (th[i] > av[i]) {

					result++;
					System.out.println("LOSE");

					break;
				}
			}

			if (result == 0) {
				System.out.println("WIN");
			}

		}
	}

}
