public class Driver {
	static Integer[][] i00 = {{0,0,0}};
	static Integer[][] a00 = {{0,0}};
	static Integer[][] i01 = {{0,0,1},{0,1,0},{1,0,0}};
	static Integer[][] a01 = {{0,1}};
	static Integer[][] i10 = {{0,1,1},{1,0,1},{1,1,0}};
	static Integer[][] a10 = {{1,0}};
	static Integer[][] i11 = {{1,1,1}};
	static Integer[][] a11 = {{1,1}};
	@SuppressWarnings("unchecked")
	static Array2d<Integer>[][] bit3Addition = (Array2d<Integer>[][]) new Array2d[4][2];

	public static void main(String args[]) 
	{
		String[][] s = {{ParseParagraphs.englishData,"english"},{ParseParagraphs.spanishData, "spanish"},{ParseParagraphs.germanData, "german"}};
		NeuralNetDriver<String> d = new NeuralNetDriver<String>(s, new ParseParagraphs(10, 3), new IOConsole("Enter phrase"), new FileManager("languageNet"), 200, .3, 50, .1);
		d.runDriver();

		bit3Addition[0][0] = new Array2d<Integer>(i00);
		bit3Addition[0][1] = new Array2d<Integer>(a00);
		bit3Addition[1][0] = new Array2d<Integer>(i01);
		bit3Addition[1][1] = new Array2d<Integer>(a01);
		bit3Addition[2][0] = new Array2d<Integer>(i10);
		bit3Addition[2][1] = new Array2d<Integer>(a10);
		bit3Addition[3][0] = new Array2d<Integer>(i11);
		bit3Addition[3][1] = new Array2d<Integer>(a11);
	
		NeuralNetDriver<Array2d<Integer>> d2 = new NeuralNetDriver<Array2d<Integer>>(bit3Addition, new ParseInt(3,4), new IOConsole("Enter \"\\\" plus 3 binary digits"),new FileManager("bit3Addition"), 100, .3, 8, 0);
		d2.runDriver();
	}
}
