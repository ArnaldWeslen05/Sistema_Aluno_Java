package src.projetosTest;

import javax.swing.JOptionPane;

public class TestAluno {
    public static void main(String[] args) {
        // Criando um objeto da classe para poder chamar o método de calcularMedia()
        
        TestAluno c = new TestAluno();
        double nota1 = Integer.parseInt(
        JOptionPane.showInputDialog("digite a primeira nota")
        );

       double nota2 = Integer.parseInt(
        JOptionPane.showInputDialog("digite a segunda nota")
        );
        double resultado = c.calcularNotaFinal(nota1, nota2);
        
       JOptionPane.showMessageDialog(null, "o resultado é =" + resultado);
    
        String nome = Aluno.getNome();
        char turma = Aluno.getTurma();
        JOptionPane.showMessageDialog(null, " \nNome: " + nome + "\nTurma: " + turma + "\nNota Final:" + resultado);
        
    }

    
            
    

    public double calcularNotaFinal(double nota1, double nota2) {
        // Calculando a média aritmética das duas notas e retornando o resultado
        double resultado = (nota1 + nota2) / 2;
        return resultado;
    }
    
  
   
}
