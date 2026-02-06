public class Main {
   
    public static void main(String[] args) {
      
        Lista mosseList = new Lista();
        MosseJiujitsu mossa1 = new MosseJiujitsu("Armbar", 1, "Leve");
        MosseJiujitsu mossa2 = new MosseJiujitsu("Triangle Choke", 2, "Strangolamenti");
        MosseJiujitsu mossa3 = new MosseJiujitsu("Kimura", 3, "Leve");
        MosseJiujitsu mossa4 = new MosseJiujitsu("Rear Naked Choke", 4, "Strangolamenti");
        nodo nodo1 = new nodo(mossa1);
        nodo nodo2 = new nodo(mossa2);
        nodo nodo3 = new nodo(mossa3);
        nodo nodo4 = new nodo(mossa4);
        mosseList.inserimento(nodo1, 0);
        mosseList.inserimento(nodo2, 1);
        mosseList.inserimento(nodo3, 2);
        mosseList.inserimento(nodo4, 3);
      
         System.out.println(mosseList.lettura(2));
    }
}
