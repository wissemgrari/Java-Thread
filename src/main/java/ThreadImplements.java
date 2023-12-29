public class ThreadImplements implements Runnable{
  private Long counter = 0L;

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      counter += 1L;
    }
    System.out.println(ThreadInherit.class + ".counter = " + counter);
  }
}
