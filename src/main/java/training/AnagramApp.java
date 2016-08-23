package training;

public class AnagramApp {

	int size;
	int count;
	char[] charArray;

	public AnagramApp(char[] charArray) {

		this.count = 0;
		this.charArray = charArray;
		this.size = this.charArray.length;
	}

	public void doAnagram(int newSize) {
		if (newSize == 1)
			return;
		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize - 1);
			if (newSize == 2)
				display();
			rotate(newSize);
		}
	}

	public void rotate(int newSize) {
		int i;
		int position = size - newSize;
		char temp = charArray[position];
		for (i = position + 1; i < size; i++)
			charArray[i - 1] = charArray[i];
		charArray[i - 1] = temp;

	}

	public void display() {
		System.out.print(++count + " ");
		for (int i = 0; i < size; i++)
			System.out.print(charArray[i]);
		System.out.println();
	}

	@Override
	public String toString() {
		String result = "";
		for (char ch : charArray) {
			result += ch;
		}
		return result;
	}

}
