public class CoureurImplements implements Runnable{

  private String nom_coureur;

  public CoureurImplements(String nom_coureur) {
    this.nom_coureur = nom_coureur;
  }

  @Override
  public void run() {
    for(int i=1; i<=10; i++) {
      System.out.println(i*100 + "m par " + nom_coureur);
      try {
        // pause alétoire de 1 seconde maximum qui simule le temps mis par chaque coureur pour franchir 100m
        Thread.sleep((int)(Math.random() * 1000));

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(nom_coureur + " est arrive !");
    }
  }
}

class CourseTest {
  public static void main(String[] args) {
    System.out.println("Passage aux: ");
    CoureurImplements j = new CoureurImplements("Jean");
    Thread tj = new Thread(j);
    CoureurImplements p = new CoureurImplements("Paul");
    Thread tp = new Thread(p);
    // on lance les deux coureurs
    tj.start();
    tp.start();
  }
}