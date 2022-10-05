package escola.domain.aluno;

//esta na camada de domain mas a implementacao de criptografica fica em outra camada.
// nao interessa para o domain quem implementa :)
public interface CifradorSenha {
    String cifrarSenha(String senha);
    boolean validarSenha(String senhaCifrada, String senha);
}
