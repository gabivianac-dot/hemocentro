import br.edu.unisales.hemocentro.estruturas.ListaEncadeada;
public class App {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        System.out.println("vazia? " + lista.estaVazia()); //esperado: true
        System.out.println("Tamanho: " + lista.tamanho()); // esperado: 0

        lista.inserirInicio("C");
        lista.inserirInicio("B");
        lista.inserirInicio("A");

        System.out.println("vazia? " + lista.estaVazia()); //esperado: false
        System.out.println("Tamanho: " + lista.tamanho()); // esperado: 3
     ListaEncadeada<String> outra = new ListaEncadeada<>();
    outra.inserirFim("A");
    outra.inserirFim("B");  
    outra.inserirFim("C");
           System.out.println(outra.obter(0));   // esperado: A
        System.out.println(outra.obter(2));   // esperado: C  
 System.out.println(outra.remover(0));         // esperado: A
System.out.println(outra.obter(0));           // esperado: B
System.out.println(outra.tamanho());          // esperado: 2
System.out.println(outra.remover(1));         // esperado: C (remoção do meio/fim)
System.out.println(outra.tamanho());          // esperado: 1
System.out.println(outra.contem("B"));    // esperado: true
System.out.println(outra.contem("Z"));    // esperado: false
    }
    
}


