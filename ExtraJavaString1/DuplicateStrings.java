import java.util.Scanner;
class DuplicateStrings {
	//method for checking the string duplicate remove
	public static void duplicateRemove(String text) {
		int textLength = text.length();
		String newText = "";

		for (int index = 0; index < textLength; index++) {
			char charStr = text.charAt(index);
			if (newText.indexOf(charStr) == -1) {
				newText += charStr;
			}
		}
		System.out.println("Remove Duplicate String is " + newText);

	}

	public static void main(String[] args) {

		// Taking Scanner object for user
		Scanner input = new Scanner(System.in);

		// Taking string text as input for user
		String text = input.nextLine();

		// calling method
		duplicateRemove(text);
	}
}
	