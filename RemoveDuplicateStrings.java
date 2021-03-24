import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateStrings {

	public static void main(String args[]) {

		String str = "Learning Automation Using Using Selenium";

		String[] strWords = str.split("\\s+");
		HashSet<String> stringSet = new HashSet<String>(Arrays.asList(strWords));
		StringBuilder stringBuilder = new StringBuilder();
		int index = 0;

		for (String s : stringSet) {

			if (index > 0)
				stringBuilder.append(" ");

			stringBuilder.append(s);
			index++;
		}
		str = stringBuilder.toString();
		System.out.println("String after removing duplicates: ");
		System.out.println(str);

	}

}
