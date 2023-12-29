public class ThreadInherit extends Thread {
  private Long counter = 0L;
  public ThreadInherit() {}

  public void run() {
    for (int i = 0; i < 10; i++) {
      counter += 1L;
    }
    System.out.println(ThreadImplements.class + ".counter = " + counter);
  }
}