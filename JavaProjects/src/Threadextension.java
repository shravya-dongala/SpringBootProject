class Threadextension extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Threadextension T = new Threadextension();
        T.start();
    }
}

	
