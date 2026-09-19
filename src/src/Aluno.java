public class Aluno extends Pessoa{
    String matricula;

    //contador incremental para matrcula
    static int contador = 1;

    public Aluno(String nome, String cpf, String email,String matricula){
        super(nome, cpf, email);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void consultarNotas(){

    }

    public void consultarTurmas(){

    }
}
