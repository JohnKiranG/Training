import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

/**
 * Simple demo that uses java.util.Timer to schedule a task to execute once 5
 * seconds have passed.
 */

public class StopWatch {
	Timer timer;

	public StopWatch(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds * 1000);
	}

	class RemindTask extends TimerTask {
		public void run() {
			System.out.println("Time's up!");
			timer.cancel(); // Terminate the timer thread
		}
	}

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		System.out.println("press start");

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();

		if (a == 1) {
			new StopWatch(5);
			System.out.println("Task scheduled.");
		}
		if (a == 0) {
			// RemindTask();
		}

	}
}
