
/**
 * Write a description of class Rettangolo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rettangolo
{
    // instance variables - replace the example below with your own
    private int base;
    private int altezza;

    /**
     * Constructor for objects of class Rettangolo
     */
    public Rettangolo(int b, int a)
    {
        // initialise instance variables
        base = b;
        altezza=a;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int perimetroRett()
    {
        // put your code here
        return base * altezza;
    }
    
    
    
    /*MAIN*/
    public static void main(String[]args)
    {   /*primo contiene il riferimento(indirizzo di memoria) dell'oggetto
        di tipo Rettangolo*/
        Rettangolo primo = new Rettangolo(10,30);
        
        System.out.println("la variabile primo contiene "+primo);
        
        /*secondo contiene lo stesso riferimento presente in primo,
           ovvero primo e secondo puntano allo stesso oggetto Rettangolo*/
        Rettangolo secondo = primo;
        System.out.println("la variabile primo contiene "+primo);
        System.out.println("la variabile secondo contiene "+secondo);
        
        System.out.println("la base di primo è "+primo.base);
        System.out.println("l'altezza di primo è "+primo.altezza);
        
        secondo.base = 15;
        System.out.println("la base di secondo è "+secondo.base);
        
        
        
    }
}
