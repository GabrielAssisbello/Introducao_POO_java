public class LivroDeNotas{
    
    private String nomeDoCurso;

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