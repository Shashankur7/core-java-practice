class AsciiCheck {

	public static void main(String[] args) {

		char ch = 'A';

		String res = (ch >= 0 && ch <= 127)
			? "ASCII"
			: "NOT ASCII";

		System.out.println(res);
	}
}