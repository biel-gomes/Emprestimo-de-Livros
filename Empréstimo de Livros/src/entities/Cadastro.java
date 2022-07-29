package entities;

import java.util.List;

public class Cadastro {
    private List<Usuario> usuarios;
    private List<Administrador> funcionarios;
    private List<Livro> livros;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public List<Administrador> getFuncionarios() {
        return funcionarios;
    }

    public void cadastrarFuncionario(Administrador funcionario) {
        this.funcionarios.add(funcionario);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void cadastrarLivro(Livro livros) {
        this.livros.add(livros);
    }
}
