
/**
 * Definizione dei numeri razionali come oggetti.
 * I numeri razionali sono rappresentati come frazione.
 *
 * @author (AMPRG-2019)
 * @version (2019-01-16)
 */
public class Razionale
{
    /*
     *  Variabili di istanza.
     *  num: il numeratore
     *  den: il denominatore
     */
    private int num, den;

    /**
     * Constructor for objects of class Ratio
     */
    public Razionale(int x, int y)
    {
        // initialise instance variables
        num = x;
        den = y; // deve essere diverso da zero!
    }

    /**
     * Riscrittura di toString() ...
     *
     * @param  (this)  implicito
     * @return    rappresentazione del numero razionale come stringa
     */
    public String toString()
    {
        String s = ""+num+"/"+den; // conversione automatica numeri -> stringhe (con trucco)
        return s;
    }

    /**
     * Somma di due numeri razionali
     *
     * @param  (this)  (parametro implicito) il numero razionale che `ospita` il metodo
     * @param  r  un numero razionale
     * @return    un nuovo numero razionale ottenuto sommando r a ... (?) 
     */
    public Razionale somma(Razionale r)
    {
        int n = num*r.den+r.num*den;
        int d = den*r.den;
        return new Razionale(n,d);
    }
    
    /*
     * Completare la classe definendo tutte le operazioni necessarie,
     * compresa l'uguaglianza, la relazione d'ordine,
     * la riduzione ai minimi termini, ...
     */

    public boolean Uguaglianza(Razionale r){
        if(num==r.num){
            if(den==r.den)
                return true;
        }
        return false;
    }


}
