public class nodo {

private MosseJiujitsu jiujitsu;
private nodo next;


    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }

    public MosseJiujitsu getJiujitsu(){
        return jiujitsu;
    }

    public void setJiujitsu(MosseJiujitsu jiujitsu){
        this.jiujitsu = jiujitsu;
    }




public nodo(MosseJiujitsu jiujitsu){
    this.jiujitsu = jiujitsu;
    this.next = null;
}




@Override
public String toString (){
    return jiujitsu.toString();

}
}