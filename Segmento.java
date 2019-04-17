/**
 * Segmento di uno spazio affine a 2 dimensioni.
 * 
 * @author (AMPRG-2019) 
 * @version (2019-01)
 */
public class Segmento
{
    /**
     * Instance variables
     */
    private Punto p, q;

    /**
     * Constructor for objects of class Segmento
     */
    public Segmento(Punto p, Punto q)
    {
        this.p = p;
        this.q = q;
    }

    /**
     * Methods for objects of class Punto
     */
    public String toString()
    {
        String s = "";
        s = "[ " +p.toString()+" : "+q.toString()+" ]";
        return s;
    }
    
    
    public void print()
    {   
        // definire (le secifiche e) il codice
        return;
    }
    

    
    /**
     * Altri metodi?
     * 
     * - misura del segmento
     * - identità di due segmenti?
     */
}
