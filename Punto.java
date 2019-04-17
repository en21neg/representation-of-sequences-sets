/**
 * Punto di uno spazio affine a 2 dimensioni.
 * 
 * Scrivere o completare le specifiche
 * 
 * @author (AMPRG-2019) 
 * @version (2019-01)
 */
public class Punto
{
    /**
     * Instance variables
     */
    private double ascissa, ordinata;

    /**
     * Constructor for objects of class Punto
     */
    public Punto(double ascissa, double ordinata)
    {
        this.ascissa = ascissa;
        this.ordinata = ordinata;
    }

    /**
     * Methods for objects of class Punto
     */
    public String toString()
    {   
        String s ="(" + ascissa +" , "+ordinata+")";
        return s;
    }
    
    public void print()
    {   
        System.out.print(this.toString());
        return;
    }
    
    /**
     * metodo: distanza dall'origine
     *
     * @param      (nessuno?)
     * @return     distanza del punto dall'origine
     */
    public double distanza()
    {
        double d = Math.sqrt(ascissa*ascissa+ordinata*ordinata);
        return d;
    }

    /**
     * metodo: distanza tra due punti
     *
     * @param      ...
     * @return     distanza ...
     */
    
    public double distanza(Punto p)
    {
        double x = p.ascissa-ascissa;
        double y = p.ordinata-ordinata;
        double d = Math.sqrt(x*x+y*y);
        return d;
    }

}
