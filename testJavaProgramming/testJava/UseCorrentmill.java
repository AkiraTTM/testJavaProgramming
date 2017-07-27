package testJava;

public class UseCorrentmill {
	public static void main(String[] args) {
		long getTime = getTime();
		displayTime(getTime);
	}

	private static long getTime() {
		long startTime = System.currentTimeMillis();

		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {};

		long endTime = System.currentTimeMillis();

		long getTime = endTime - startTime;

		return getTime;

	}

	private static void displayTime(long time) {

		System.out.println("プログラム起動から" + time + "ミリ秒経過");
	}
}
