/**
 * Definizione dei numeri razionali come oggetti.
 * I numeri razionali sono rappresentati come frazione.
 *
 * @author (AMPRG-2019)
 * @version (2019-01-16)
 */

public class Complesso{
    /*
     *  Variabili di istanza.
     *  re: parte reale
     *  im: parte immaginaria
     */
    private double re, im;

    /**
     * Constructor for objects of class Complesso
     */
    public Complesso(double x, double y)
    {
        // initialise instance variables
        re= x;
        im = y; // deve essere diverso da zero!
    }

    /**
     * Riscrittura di toString() ...
     *
     * @param  (this)  implicito
     * @return    rappresentazione del numero complesso come stringa
     */
    public String toString()
    {
        String s = ""+re+" + "+im+"i"; // conversione automatica numeri -> stringhe (con trucco)
        return s;
    }
    
    /*
     * METODI DI ACCESSO
     */
    
    /**
     * parte reale
     *
     * @param  (this)   implicito
     * @return          valore della parte reale
     */
    public double getRe()
    {
        return re;
    }

    /**
     * parte immaginaria
     *
     * @param  (this)   implicito
     * @return          valore della parte reale
     */
    public double getIm()
    {
        return im;
    }
    
    /**
     * Modifica della parte reale
     *
     * @param  r  un numero reale (double)
     * @return    (nulla) effetto collaterale
     */
    public void setRe(double r)
    {
        re = r;
        return;
    }

    /**
     * Modifica della parte reale
     *
     * @param  r  un numero reale (double)
     * @return    (nulla) effetto collaterale
     */
    public void setIm(double i)
    {
        im = i;
        return;
    }
    
    /*
     * Aggiungere le operazioni corrispondenti (getter e setter)
     * in coordinate polari
     */
   
    /*
     * OPERAZIONI COMPLESSE
     */

    /**
     * Somma di due numeri complessi
     *
     * @param  (this)  (parametro implicito) il numero complesso che `ospita` il metodo
     * @param  r  un numero complesso
     * @return    un nuovo numero complesso ottenuto sommando z a ... (?) 
     */
    public Complesso somma(Complesso z)
    {
        double r = re+z.re;
        double i = im+z.im;
        return new Complesso(r,i);
    }
    
    /*
     * Completare la classe definendo tutte le operazioni necessarie,
     * compresa l'uguaglianza, la relazione d'ordine,
     * ...
     */
}
