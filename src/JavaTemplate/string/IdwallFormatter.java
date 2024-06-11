package string;

public class IdwallFormatter extends StringFormatter{
	
	public IdwallFormatter() {
		
	}
	
	
	@Override
	public String format(String text) {
		 Integer limit = getLimit();
		 
		 if (text == null || limit == null || limit <= 0) {
			 throw new UnsupportedOperationException();
		}
		 
		StringBuilder formattedText = new StringBuilder();
		
		String[] words = text.split("\\s+");
		int currentLength = 0;
		
		for (String word : words) {
	        if (currentLength + word.length() > limit) {
	            formattedText.append("\n");
	            currentLength = 0;
	        } else if (currentLength > 0) {
	            formattedText.append(" ");
	            currentLength++;
	        }
	        formattedText.append(word);
	        currentLength += word.length();
	    }

	    return formattedText.toString();
		
	}

}
