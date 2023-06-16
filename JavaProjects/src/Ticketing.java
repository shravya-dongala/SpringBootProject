public class Ticketing {
	    private int total = 8;

	    public synchronized void bookTicket(String threadName, int numTickets) {
	        if (total >= numTickets) {
	            System.out.println(threadName + " booked " + numTickets + " tickets");
	            total -= numTickets;
	        } else {
	            System.out.println(threadName + " failed" + total);
	        }
	    }
	    public static void main(String[] args) {
	        Ticketing bookingSystem = new Ticketing();
	        Runnable bookingTask = () -> {
	            String threadName = Thread.currentThread().getName();
	            int numTickets = (int) (Math.random() * 5) + 1;
	            bookingSystem.bookTicket(threadName, numTickets);
	        };
	        Thread thread1 = new Thread(bookingTask, "Thread 1");
	        Thread thread2 = new Thread(bookingTask, "Thread 2");
	        Thread thread3 = new Thread(bookingTask, "Thread 3");
	        thread1.start();
	        thread2.start();
	        thread3.start();
	    }
	}
