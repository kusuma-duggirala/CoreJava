package StringFunctions;

public class BOTString {

	public static void main(String[] args) 
	{
		String s="$CARD_H$ [{\"description\":\"Send a picture of your receipt or type \\u201cTaxi for $30 last Monday\\u201d to expense.\",\"title\":\"Expenses\",\"actions\":[{\"postback\":{\"payload\":\"File my expense.\",\"system.botId\":BOTID,action\":\"HelpSampleIntent\",\"to\":TO,userResponse\":\"yes\"},\"label\":\"File my expense.\",\"type\":\"postback\"}]},{\"description\":\"Submit your feedback for Expenses Skill\",\"title\":\"Feedback Skill\",\"actions\":[{\"postback\":{\"payload\":\"Submit Feedback.\",\"system.botId\":BOTID,action\":\"HelpSampleIntent\",\"to\":SECONDTO,\"userResponse\":\"yes\"},\"label\":\"Submit Feedback.\",\"type\":\"postback\"}]}]";
		System.out.print(s.charAt(510));
		System.out.print(s.charAt(511));
		System.out.print(s.charAt(512));
		System.out.print(s.charAt(513));
		System.out.print(s.charAt(514));
		System.out.println(s.charAt(515));
		System.out.println(s.length());

	}

}
