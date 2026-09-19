public class Professor extends Pessoa{
    String registro;

    public Professor(String nome, String cpf, String email, String registro){
        super(nome, cpf, email);
        this.registro = registro;
    }

    public String getRegistro(){
        return registro;
    }

    public Aluno cadastrarAluno(String nome, String cpf, String email){
        String matricula = String.valueOf(Aluno.contador);
        Aluno aluno = new Aluno(nome, cpf, email, matricula);
        Aluno.contador++;
        return aluno;
    }
}
