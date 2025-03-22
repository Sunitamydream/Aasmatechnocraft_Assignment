package generics;

public class Dummy {
	public static void main(String[] args)
	{
        String message = GmailReader.readMessagesFromGmail();
        String link = Utils.fetchOnlyLink(message);
        System.out.println(message);
        System.out.println(link);
        

	}

}
