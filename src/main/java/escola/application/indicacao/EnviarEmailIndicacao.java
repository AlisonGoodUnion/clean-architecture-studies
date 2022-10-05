package escola.application.indicacao;

import escola.domain.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
