import br.edu.unisales.hemocentro.estruturas.Fila;
import br.edu.unisales.hemocentro.estruturas.ListaEncadeada;
import br.edu.unisales.hemocentro.estruturas.*;
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
    
    Fila<String> triagem = new Fila<>();
System.out.println(triagem.estaVazia());        // true
triagem.enfileirar("Ana");
triagem.enfileirar("Bruno");
triagem.enfileirar("Carla");
System.out.println(triagem.tamanho());          // 3
System.out.println(triagem.primeiro());         // Ana (sem remover)
System.out.println(triagem.desenfileirar());    // Ana
System.out.println(triagem.desenfileirar());    // Bruno
System.out.println(triagem.desenfileirar());    // Carla — fila fica vazia
System.out.println(triagem.estaVazia());        // true
triagem.enfileirar("Diego");                    // ← aqui quebra se você errou o ultimo
System.out.println(triagem.primeiro());         // Diego
Deque<String> d = new Deque<>();
d.inserirFim("B");
d.inserirInicio("A");
d.inserirFim("C");                      // A B C
System.out.println(d.primeiro());       // A
System.out.println(d.ultimo());         // C
System.out.println(d.removerInicio());  // A
System.out.println(d.removerFim());     // C
System.out.println(d.tamanho());        // 1
System.out.println(d.removerFim());     // B — esvazia
System.out.println(d.estaVazia());      // true
d.inserirInicio("D");                   // testa se as pontas zeraram certo
System.out.println(d.ultimo());         // D
}
}


