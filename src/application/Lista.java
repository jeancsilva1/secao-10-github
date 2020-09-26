
package application;

import java.util.ArrayList;
import java.util.List;


public class Lista {
    
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("Jean");
        lista.add("Táina");
        lista.add("Thomas");
        System.out.println(lista);
        System.out.println(lista.lastIndexOf("Thomas"));
        System.out.println(lista.remove("Jean"));
        System.out.println(lista);
        System.out.println(lista.remove(0));
        System.out.println(lista);
        String nome = "abc";
        lista.add(nome);
        if(lista.contains("abcd")){
            System.out.println("Achou");
            System.out.println(lista);
        }else {
            System.out.println("Nao achou");
        }
        
    }
    
}
