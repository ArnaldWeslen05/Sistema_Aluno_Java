package src.projetosTest;

public class Aluno {
    private static String nome = "arnald";
    private static char turma = 'a' ;
    private double notaFinal;
    

    
public static String getNome() {
    return nome;
}

public void setNome(String nome) {
    Aluno.nome = nome;
}

public static char getTurma() {
    return turma;
}

public void setTurma(char turma) {
    Aluno.turma = turma;
}

public double getNotaFinal() {
    return notaFinal;
}

public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
}

}
