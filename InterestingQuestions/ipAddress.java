package Debugging;

public class ipAddress {

	public static void main(String[] args) {
		String ip = "192.168.123.456";
		String[] val = ip.split("\\.");
	    
	    if(val.length > 4){
	      System.out.println("Wrong IP");
	    }
	    boolean result = true;
	    for(int i = 0; i < val.length; i++){
	      if(!checkVal(val[i])){
	        result = false;
	      }
	    }
	    if(!result) {
	    	System.out.println("Wrong IP");
	    }
	    else {
	    	System.out.println("Correct IP");
	    }

	}
	
	static boolean checkVal(String val){
	    if(val.length() > 3){
	      return false;
	    }
	    int num = 0;
	    for(char c: val.toCharArray()){
	      if(c >= '0' && c <= '9'){
	        num = (num * 10) + (c - '0');
	      }
	      else{
	        return false;
	      }
	    }
	    System.out.println(num);
	    if(num > 255){
	     return false; 
	    }
	    return true;
	  }


}
;