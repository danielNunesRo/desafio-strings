package string;

public abstract class StringFormatter {
	
		private Integer limit;

	    public StringFormatter() {
	        this.limit = 40;
	    }
	    
	    
	    public Integer getLimit() {
			return limit;
		}


		public abstract String format(String text);
	
}
