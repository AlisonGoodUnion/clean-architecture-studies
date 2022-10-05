package escola.infra.aluno;

import escola.domain.aluno.CifradorSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifrarComMD5 implements CifradorSenha {

    @Override
    public String cifrarSenha(String senha) {
        //TODO Servico de hash
        // As nossas regras de negócio devem ficar nas entidades e VOs,
        // mas nem sempre isso faz sentido. Quando precisamos executar alguma ação
        // que não faça parte de nenhuma entidade nem de um VO, podemos utilizar uma
        // classe Service.
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(senha.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            //TODO for com hash;

            return    sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar hash");
        }

    }

    @Override
    public boolean validarSenha(String senhaCifrada, String senha) {
        return senhaCifrada.equals(cifrarSenha(senha));
    }
}
