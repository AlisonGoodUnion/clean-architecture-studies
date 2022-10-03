package escola.domain;

import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;

import java.util.List;

//podemos ter multiplas implementacoes para essa interface
//podemos usar um mongo um oracle messageria, jdbc, jpa, files etc...
public interface IAlunoRepository {

    //bussines fala matricular e nao salvar ou cadastrar
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);

    List<Aluno> matriculados();

    //...
    // implementação fica fora da classe de domain e fora
    // do module assim não misturamos os detalhes tecnicos de infra.
    // inversão de dependencias usando interfaces.

}
