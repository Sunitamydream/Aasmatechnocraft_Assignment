package generics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public static String fetchOnlyLink(String stringToSearch)
	{
		Pattern p = Pattern.compile("\\b(http|https)://[-a-zA-Z0-9+&@#/%?=_|!:,.;]*[-a-zA-Z0-9+&@#/%=_|]",Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(stringToSearch);
		String foundUrl = "";
		while (matcher.find()) {
		  int matchStart = matcher.start(1);
		  int matchEnd = matcher.end();
		  foundUrl = stringToSearch.substring(matchStart, matchEnd);
		  
		}
		return foundUrl;
	}

}
