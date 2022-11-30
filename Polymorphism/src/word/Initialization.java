package word;

public class Initialization {
	
	  static CommandImpl buildCommandInterface(StringBuilder text) {
	        return new CommandImpl(text);
	    }
}