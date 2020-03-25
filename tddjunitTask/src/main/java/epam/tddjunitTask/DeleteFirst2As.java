package epam.tddjunitTask;


public class DeleteFirst2As {

	public String delete(String string) {
		String result = string;
		if(string.charAt(0) == 'A' || string.charAt(0) == 'a' )
		{
			result = string.charAt(1) + string.substring(2, string.length());
			if( string.charAt(1) == 'A'|| string.charAt(1) == 'a')
			{
				result = string.substring(2, string.length());
			}
		}
		else if(string.charAt(1)=='A' || string.charAt(1)=='a')
			result=string.charAt(0)+string.substring(2, string.length());
		return result;
	}
	
	
}

