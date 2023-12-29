public class Main {

  public static void main(String[] args) {

    System.out.println("Thread Inherit running...");
    ThreadInherit threadInherit = new ThreadInherit();
    threadInherit.start();

    System.out.println("Thread implements running...");
    ThreadImplements threadImplements = new ThreadImplements();
    Thread thread = new Thread(threadImplements);
    thread.start();

  }

}
