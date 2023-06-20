class CusException extends Exception {
	    public CusException(String message) {
	        super(message);
	    }
	    public static void main(String[] args) {
	        try {
	        	
	            int result = 8 / 0;
	        } catch (RuntimeException e) {
	         
	            CusException customException = new CusException("Custom exception" + e.getMessage());
	            System.out.println(customException.getMessage());
	        }
	    }
	    }
