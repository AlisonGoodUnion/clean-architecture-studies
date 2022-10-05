package escola.application.matricular;

import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;
import escola.domain.aluno.Email;

public class MatricularAlunoDTO {
    private String cpf;
    private String nome;
    private String email;

    public MatricularAlunoDTO(String cpf, String nome, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(this.cpf), this.nome, new Email(this.email));
    }
}
