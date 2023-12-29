public class CoureurExtends extends Thread {

  private String nom_coureur;

  public CoureurExtends(String nom_coureur) {
    this.nom_coureur = nom_coureur;
  }
  public void run() {
    for(int i=1; i<=10; i++) {
      System.out.println(i*100 + "m par " + nom_coureur);
      try {
        // pause alétoire de 1 seconde maximum qui simule le temps mis par chaque coureur pour franchir 100m
        sleep((int)(Math.random() * 1000));

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Course {
  public static void main(String[] args) {
    // Il s'agit d'une classe de coureurs
    System.out.println("Passage aux: ");
    CoureurExtends j = new CoureurExtends("Jean");
    CoureurExtends p = new CoureurExtends("Paul");

    // on lance les deux coureurs.
    j.start();
    p.start();
  }
}
