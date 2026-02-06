public class Lista{

    private int size;
    private nodo head;
    private nodo cursor;

        public Lista(){
         this.size = 0 ;
         this.head = null;
         this.cursor = null;
        }   
   

 public void inserimento(nodo n, int indice) {
    if (indice < 0 || indice > size) {
        throw new IndexOutOfBoundsException();
    }

    if (indice == 0) { 
        n.setNext(head);
        head = n;
        size++;
        
    }

    cursor = head;
    for (int i = 0; i < indice - 1; i++) {
        cursor = cursor.getNext();
    }
    n.setNext(cursor.getNext());
    cursor.setNext(n);
    size++; 
    
}
   

 public void eliminazione(int indice){
    if (indice == 0) { 
        head = head.getNext();
        size--;
        return;
    }
    
    cursor = head;
    for(int i = 0; i < indice - 1; i++){
        cursor = cursor.getNext();
    }
    cursor.setNext(cursor.getNext().getNext());
    size--;
}

   public String lettura(int indice){
        cursor = head;
        while (indice-- > 0 && cursor != null) {
            cursor = cursor.getNext();
        }
        if (cursor != null) {
            if(cursor.getNext() != null){
                cursor.getJiujitsu().setSuccessiva(cursor.getNext().getJiujitsu().getNome());
                return cursor.getJiujitsu().toString() + " Successiva: " + cursor.getNext().getJiujitsu().getNome();
            }
            cursor.getJiujitsu().setSuccessiva("Nessuna mossa successiva");
            return cursor.getJiujitsu().toString();
        }
        return null;
    }



    public void eliminazionediuncomputer(nodo n){
        cursor = head;
        for(int i = 0; i < size; i++){
          while(cursor != null && cursor.getNext() != null && cursor.getNext().getJiujitsu().compareTo(n.getJiujitsu()) == 0){
                cursor.setNext(cursor.getNext().getNext());
                size--;
            }
            cursor = cursor.getNext();
        }

    }


    public void accodamento(nodo n){
        if (head == null) {
            head = n;
        } else {
            cursor = head;
            while (cursor.getNext() != null) {
                cursor = cursor.getNext();
            }
            cursor.setNext(n);
        }
        size++;
   }


     
    public int  ricerca(nodo n){
        cursor = head;
        for(int i = 0; i < size; i++){
            if(cursor.getJiujitsu().compareTo(n.getJiujitsu()) == 0){
                return i;
            }
            cursor = cursor.getNext();
        }
        return -1;
      
    }




    public String visita(){
        String result = "";
        cursor = head;
        while (cursor != null) {
            result += cursor.getJiujitsu().toString() + " ";
            cursor = cursor.getNext();
        }
        return result.trim();
    }


    public void inserimentoordinato (nodo n){
        if (head == null || head.getJiujitsu().compareTo(n.getJiujitsu()) > 0) {

            n.setNext(head);
            head = n;
        } else {
            cursor = head;
            while (cursor.getNext() != null && cursor.getNext().getJiujitsu().compareTo(n.getJiujitsu()) < 0) {
                cursor = cursor.getNext();
            }
            n.setNext(cursor.getNext());
            cursor.setNext(n);
        }
        size++;                 
    }

   

}
  