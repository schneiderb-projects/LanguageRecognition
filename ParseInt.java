import java.util.Arrays;

public class ParseInt extends Parse<Array2d<Integer>> {
	ParseInt(int sizeOfInput, int numberOfOutputs) {
		super(sizeOfInput, numberOfOutputs);
	}


	public String outputTToString(Array2d<Integer> t) {
		String str = "";
		for(int i: t.array[0])
			str += i;
		return str;
	}


	public double[][] parseOne(Array2d<Integer> data) {
		double[][] doubles = new double[data.array.length][data.array[0].length];
		for(int i = 0; i < data.array.length;i++)
			for(int j = 0; j < data.array[0].length; j++)
				doubles[i][j] = data.array[i][j];
		return doubles;
	}

	//remove the first character of the input, then parse to double
	public double[][] parseUserInput(String input) {
		double[][] toReturn = new double[1][lengthOfInput]; 
		Arrays.fill(toReturn[0], 0);
		String[] strArray = input.split("");
		int maxIndex = lengthOfInput < input.length() - 1 ? lengthOfInput : input.length() - 1;
		for(int i = 0; i < maxIndex; i++) {
			if(!(strArray[i+1].equals("0") || strArray[i+1].equals("1")))
				return toReturn;
			toReturn[0][i] = Double.parseDouble(strArray[i+1]);	
		}
		return toReturn;
	}


	public String unparseData(double[] data) {
		String str = "";
		for(double d: data)
			str += ", " + Integer.toString((int)d);
		return str.substring(2,str.length());
	}
}