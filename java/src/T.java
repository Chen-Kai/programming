import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T {
	public static final String PATTERN = "http://pic.nipic.com/2007-06-20/*.jpg";

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = null;

//		matcher = pattern.matcher(line);

		boolean find = matcher.find();
		System.out.println("T.main() " + find);
		if (find) {
			String group = matcher.group();
			System.out.println("App.parseUrl() " + group);
		}
	}
}
