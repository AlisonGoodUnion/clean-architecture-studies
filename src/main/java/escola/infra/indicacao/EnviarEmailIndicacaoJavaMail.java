package escola.infra.indicacao;

import escola.application.indicacao.EnviarEmailIndicacao;
import escola.domain.aluno.Aluno;

//enviar email pertence a camada de aplicacao e nao dominio
public class EnviarEmailIndicacaoJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //TODO logica de envio de email com a lib Java Mail.
    }
}
