package ch09.resolve07.answer03;

public class ArrayUtility1_2 {
	public static double[] intToDouble(int[] source) {
		if (source == null) {
			return null;
		}

		int length = source.length;
		double[] result = new double[length];

		for (int i = 0; i < length; i++) {
			result[i] = (double) source[i];
		}
		return result;

	}

	public static int[] doubleToInt(double[] source) {
		if(source ==null) { 
			return null;
		}
		int length = source.length;
		int[] result = new int[length];
		
		for (int i  = 0; i < length; i++) {
			result[i] = (int)source[i];
		}
		return result;
	}
	
}
