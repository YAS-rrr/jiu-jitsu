public class Main {
   
    public static void main(String[] args) {
      
        Lista mosseList = new Lista();
        MosseJiujitsu mossa1 = new MosseJiujitsu("Armbar", 1, "Leve");
        MosseJiujitsu mossa2 = new MosseJiujitsu("Triangle Choke", 2, "Strangolamenti");
        MosseJiujitsu mossa3 = new MosseJiujitsu("Kimura", 3, "Leve");
        MosseJiujitsu mossa4 = new MosseJiujitsu("Rear Naked Choke", 4, "Strangolamenti");
        MosseJiujitsu mossa5 = new MosseJiujitsu("Guillotine Choke", 2, "Strangolamenti");
        MosseJiujitsu mossa6 = new MosseJiujitsu("Omoplata", 3, "Leve");
        nodo nodo1 = new nodo(mossa1);
        nodo nodo2 = new nodo(mossa2);
        nodo nodo3 = new nodo(mossa3);
        nodo nodo4 = new nodo(mossa4);
        nodo nodo5 = new nodo(mossa5);
        nodo nodo6 = new nodo(mossa6);
        mosseList.inserimento(nodo1, 0);
        mosseList.inserimento(nodo2, 1);
        mosseList.inserimento(nodo3, 2);
        mosseList.inserimento(nodo4, 3);
        mosseList.inserimentoordinato(nodo5);
        mosseList.inserimentoordinato(nodo6);
        System.out.println(mosseList.visita());
        
    }
}
