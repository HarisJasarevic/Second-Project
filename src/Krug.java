import java.text.DecimalFormat;

public class Krug extends Predmet{

    private double r;
    private final static double Pi = Math.PI;

    @Override
    public void površina() {
        super.površina();
        DecimalFormat df = new DecimalFormat("0.00");
        double rezultat = Math.pow(this.r, 2) * Pi;
        System.out.println(df.format(rezultat));
    }
    //Overloading metoda
    public void površina(double r){
        super.površina();
        DecimalFormat df = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * Pi;
        System.out.println(df.format(rezultat));
    }

    public void površina(double r, String ispis){
        ispis = "Površina predmeta: ";
        DecimalFormat df = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * Pi;
        System.out.println(ispis + df.format(rezultat));
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
