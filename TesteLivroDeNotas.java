import javax.swing.JOptionPane;

public class TesteLivroDeNotas {

    public static void main(String[] args) {

        LivroDeNotas livroDeNotas1 = new LivroDeNotas();
        LivroDeNotas livroDeNotas2 = new LivroDeNotas();
        
        String nome1 = JOptionPane.showInputDialog("digite o curso: ");
        livroDeNotas1.setNomeDoCurso(nome1);
        JOptionPane.showMessageDialog(null, livroDeNotas1.getNomeDoCurso(),"o curso:", JOptionPane.INFORMATION_MESSAGE);

        String nome2 = JOptionPane.showInputDialog("digite o curso novamente: ");
        livroDeNotas2.setNomeDoCurso(nome2);
        JOptionPane.showMessageDialog(null, livroDeNotas2.getNomeDoCurso(),"o curso:", JOptionPane.INFORMATION_MESSAGE);

    }
    
}
