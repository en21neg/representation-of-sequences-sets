
/**
 * class IntSequenzaBase 
 * (orientata agli oggetti)
 * Descrizione di una sequenza di interi.
 * Si tratta di una struttura simile ad un array,
 * ma sovra-dimensionata; di conseguenza, 
 * e' necessario indicare quante posizioni sono effettivamente occupate.
 * Si conviene che possano essere occupate solo le prime posizioni:
 * la sequenza "non puo' avere buchi"!
 * 
 * Esercizio.
 * I metodi presenti non sfruttano appieno le proprieta' descritte.
 * Migliorare l'implementazione della struttura dati!
 *
 * @author  (AMPRG-2018)
 * @version (2019-03)
 */
public class IntSequenzaBase2{
    
    // VARIABILI (E COSTANTI) di CLASSE
    
    private final static int MAX = 1000; // massimo valore per gli elementi casuali
    private final static int NUM = 100;  // dimensione di default 
    
    // VARIABILI di ISTANZA
    private int[] elementi; // array contentente gli elementi della sequenza
    private int numero; // numero degli elementi effettivamente presenti
    
    // COSTRUTTORI
    
    /**
     * Costruttore: sostituisce quello di default
     *
     * @param   (nessuno)
     * @return  riferimento all'oggetto creato
     */
    public IntSequenzaBase2(){
        elementi = new int[NUM];
        numero = 0;
    }
    
    /**
     * Costruttore: 
     * crea una nuova sequenza 
     * con la capienza indicata dal parametro
     *
     * @param   n>0
     * @return  riferimento all'oggetto creato
     */
    public IntSequenzaBase2(int n){
        elementi = new int[n];
        numero = 0;
    }
   
    // METODI DI ISTANZA
    
    // Metodi di accesso

    /**
     * Dimensione della sequenza
     *
     * @return    numero di posizioni
     */
    public int length()
    {
        return elementi.length;
    }

    /**
     * Accesso all'elemento di posizione h
     *
     * @param  h  0<= h < numero, indice di posizione
     * @return    elementi[h]
     */
    public int get(int h)
    {
        return elementi[h];
    }

    /**
     * Modifica dell'elemento di posizione h
     * 
     * Esercizio: come posso migliorare il metodo
     * in modo che sia eventualemente in grado 
     * di scrivere un nuovo elemento 
     * nella prima posizione lecita?
     *
     * @param  h  0<= h < lunghezza, indice di posizione
     * @param  x  nuovo valore
     * @return    elementi[h] = e
     */
    public void set(int h, int e)
    {
        elementi[h] = e;
        numero++;
        return;
    }
    
    // Metodi di utilita'
    
    /**
     * Inizializzazione di una sequenza con valori casuali
     * 
     * Esercizio: anche questo metodo e' da migliorare!
     * 
     * @param   a   array
     * @param   max massimo valore intero degli elementi
     * @return  (nulla) valori resi casuali per effetto collaterale
     */
    public void randomize(int max){
        for (int h = 0; h<numero; h++){
            elementi[h] = (int) Math.round(max*Math.random());
        }
        return;
    }
    
    /**
     * Rappresentazione di una sequenza come stringa
     * 
     * @param   this   (implicito)
     * @return  ...
     */
    public String toString(){
        String s;
        if (elementi==null) s = "null";
        else {
            s = "[ "; 
            for (int i=0; i<numero-1; i++){
                s +=elementi[i]+", ";
            }
            s += elementi[numero -1]+" ]";
        }
        return s;
    }
     
    /**
     * Ricerca sequenziale semplice
     *
     * @param  e  elemento da cercare
     * @return    e appare in s?
     */
    public boolean find(int e)
    {
        boolean t = false;  // trovato e?
        int h = 0;          // indice di scorrimento
        while ((!t)&(h<numero)){
            if (e == elementi[h]) t = true; // trovato e!
            h++;        // incremento dell'indice
        }
        return t;
    }
    
    /**
     * Ricerca sequenziale con sentinella
     * 
     * Esercizio: questa implementazione non sembra molto bella!
     * 
     *
     * @param  e  elemento da cercare
     * @param  (this) elemento di posizione 0 non significativo
     * @return    e appare in s?
     */
    public boolean findS(int e)
    {
        boolean t = false;  // trovato e?
        int h = elementi.length-1; // indice di scorrimento
        System.out.println("numero: "+ numero);
        if (elementi[0] != e){

            elementi[0] = e;
        }
            
        else {
            return true;
        }   
            
       
        while (!t && h>0){
            if (e == elementi[h]) {
                    t = true;
                    System.out.println(elementi[h]);
                }
                    
            
            else
                return t;
            
                
                
            h--;          // decremento dell'indice
        }
        
        return t;
    }

    public static void main(String[] args){
        IntSequenzaBase2 array =new IntSequenzaBase2(10);

       // int[][] data = {1,4,7,2,6,4,8,9,0,2};
       // int [][] data = new int [5][5]; //inizializza
       // for (int i=0;i<5;i++){
       //     for(int j=0;j<i+1;j++){
                
        //    }
       // }
        for(int i = 0; i < 10; i++)
           array.set(i,2*i); 
        for(int i = 0; i < 10; i++)
           System.out.println(array.get(i));
           

        boolean risp = array.findS(4);
        if(risp)
           System.out.println("trovato");
        else
            System.out.println("non trovato");

        //System.out.println(array.elementi[5]);   

        boolean risposta = array.find(4);
        if(risp)
           System.out.println("trovato");
        else
            System.out.println("non trovato");

    }


}
