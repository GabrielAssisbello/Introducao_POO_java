public class LivroDeNotas{
    
    private String nomeDoCurso;

    //construtor com parâmetro
    public LivroDeNotas(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }

    //construtor padrão
    public LivroDeNotas(){
        
    }

    //métodos de acesso - envia - getters - public
    public String getNomeDoCurso(){
        return nomeDoCurso;
    }


    //métodos modificadores - recebe - setters 
    public void setNomeDoCurso(String nomeDoCurso){
        this.nomeDoCurso = nomeDoCurso;
    }


    public void exibirMensagem(String string){
        System.out.println("Bem Vindo aaaaa: "+ nomeDoCurso);



    }
}