public class MosseJiujitsu{
    
    private int grado;
    private String nome;
    private String successiva;
    private String categoria;


    public int getGrado(){
        return grado;
    }   

    
    public void setGrado(int grado){
        this.grado = grado;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSuccessiva(){
        return successiva;
    }

    public void setSuccessiva(String successiva){
        this.successiva = successiva;
    }



   
   

    public MosseJiujitsu(String nome, int grado, String categoria){
        this.nome = nome;
        this.grado = grado;
        this.categoria = categoria;
        
        
    }   

    public int compareTo(MosseJiujitsu Jiujitsu){
        return Integer.compare(this.grado, Jiujitsu.getGrado());
    }

    public int CompareTo2(MosseJiujitsu Jiujitsu){
        return this.nome.compareTo(Jiujitsu.getNome());
    }

    @Override
    public String toString(){
        return "la mossa " + nome + " ha grado " + grado + " ed è di categoria " + categoria + " e la mossa successiva che puoi imparare è " + successiva;
    }
}