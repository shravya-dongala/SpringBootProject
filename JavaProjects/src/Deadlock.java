public class Deadlock{
	    private static final Object resource1 = new Object();
	    private static final Object resource2 = new Object();
	    public static void main(String[] args) {
	        Thread thread1 = new Thread(() -> {
	            synchronized (resource1){
	                System.out.println("Thread1 - resource 1");

	                synchronized (resource2) {
	                    System.out.println("Thread1 - resource 2");
	                }
	            }
	        });
	        Thread thread2 = new Thread(() -> {
	            synchronized (resource2) {
	                System.out.println("Thread2 - resource 2");

	                synchronized (resource1) {
	                    System.out.println("Thread2 - resource 1");
	                }
	            }
	        });
	        thread1.start();
	        thread2.start();
	    }
	}
