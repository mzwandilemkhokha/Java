public class Runner {
    public static void main(String[] args) {

        Runnable r2=()->{ for (int i = 0; i < 10; i++) {
           System.out.println(i+1+". Mzwandile");
              };};

        // Create a Thread with the Runnable instance
        Thread thread = new Thread(r2);

        // Start the Thread to execute the Runnable
        thread.start();
    }
}
