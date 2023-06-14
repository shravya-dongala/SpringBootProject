class ThreadImplements implements Runnable {
	    @Override
	    public void run() {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(i);
	        }
	    }
	    public static void main(String[] args) {
	        ThreadImplements T = new ThreadImplements();
	        Thread thread = new Thread(T);
	        thread.start();
	    }
	}
