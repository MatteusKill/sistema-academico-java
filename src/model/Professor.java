package model;
public class Professor extends Pessoa {
    String registro;

    public Professor(String nome, String cpf, String email, String registro) {
        super(nome, cpf, email);
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public Aluno cadastrarAluno(String nome, String cpf, String email) {
        String matricula = String.valueOf(Aluno.contador);
        Aluno aluno = new Aluno(nome, cpf, email, matricula);
        Aluno.contador++;
        return aluno;
    }

    public Disciplina cadastrarDisciplina(String nome, int cargaHoraria) {
        return null;
    }

    public Turma criarTurma(Disciplina disciplina, Professor professor) {
        return null;
    }

    public Nota lancarNota(Aluno aluno, double valor, String descricao) {
        return null;
    }
}