public class Kvadrat extends Predmet{

    int a;

    @Override
    public void površina() {
        super.površina();
        System.out.println("Površina kvadrata je: " + Math.pow(a, 2));
    }
}
