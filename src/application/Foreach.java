package application;

/**
 *
 * @author Jean
 */
public class Foreach {
    
    public static void main(String[] args) {
        String[] nomes = new String[]{"Jean", "Thomas", "Táina"};
        for(int i = 0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }
        
        for(String lista: nomes){
            System.out.println(lista);
            
        }
    }
    
}
