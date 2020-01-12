public class Array2d <T> {
	T[][] array;
	Array2d (T[][] a) {
		array = a;
	}

	public String toString() {
		String str = "[";
		for(T[] t: array)
			str +=t.toString();
		return str + "]";
	}
}