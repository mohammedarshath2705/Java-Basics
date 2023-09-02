package myfirst;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 44;
	    String s;

	    // switch statement to check size
	    switch (number) {

	      case 29:
	        s = "Small";
	        break;

	      case 42:
	        s = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        s = "Large";
	        break;

	      case 48:
	        s = "Extra Large";
	        break;
	      
	      default:
	        s = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + s);
	  }

	}

