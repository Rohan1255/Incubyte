package Incubyte;
public class StringCalculator {
	public int add(String s) {
		if (s.length() == 0)
			return 0;
		String defaultDelimiter = ",";
		String arr[] = s.split(defaultDelimiter);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		return sum;
	}
}