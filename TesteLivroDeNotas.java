import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

    public static void main(String[] args) {

        String nome1 = JOptionPane.showInputDialog("digite o curso: ");
        LivroDeNotas livroDeNotas1 = new LivroDeNotas(nome1);
        livroDeNotas1.setNomeDoCurso(nome1);

        String nome2 = JOptionPane.showInputDialog("digite o curso novamente: ");
        LivroDeNotas livroDeNotas2 = new LivroDeNotas(nome2);
        livroDeNotas2.setNomeDoCurso(nome2);

        livroDeNotas1.exibirMensagem(nome1);
        livroDeNotas2.exibirMensagem(nome2);

    }
    
}
