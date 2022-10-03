package escola.infra.aluno;

import escola.domain.IAlunoRepository;
import escola.domain.aluno.Aluno;
import escola.domain.aluno.CPF;
import escola.domain.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AlunoJDBCRepository implements IAlunoRepository {

    private final Connection connection;

    //nao podemos deixar esse codigo responsavel por gerenciar a conexao
    //por isso ele apenas recebe
    public AlunoJDBCRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO ALUNO VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, aluno.getCpf());
            preparedStatement.setString(2, aluno.getNome());
            preparedStatement.setString(3, aluno.getEmail());
            preparedStatement.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            for (Telefone telefone: aluno.getTelefones()) {
                preparedStatement.setString(1, telefone.getDdd());
                preparedStatement.setString(2, telefone.getNumero());
                preparedStatement.execute();
            }

        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> matriculados() {
        return null;
    }
}
