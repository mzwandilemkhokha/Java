public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable runner = ()->{for(int i=1;i<=10;i++){System.out.println(i+": Mzwandile");}};
        runner.run();
    }
}
