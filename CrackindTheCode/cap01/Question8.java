package cap01;

public class Question8 {
	public boolean isSubstring(String str, String str2) {
		return false;
	}

	public boolean isRotation(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();

		if (length1 != length2)
			return false;

		if (isSubstring(str2, str1 + str1))
			return true;

		return false;
	}
}

// abcdefg
// efgabcd