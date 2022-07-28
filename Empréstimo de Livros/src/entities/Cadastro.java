package entities;

import java.util.List;

public class Cadastro {
    private Usuario usuario;
    private List<Administrador> funcionarios;
    private List<Livro> livros;

    /**
     * @return Usuario return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return List<Administrador> return the funcionarios
     */
    public List<Administrador> getFuncionarios() {
        return funcionarios;
    }

    /**
     * @param funcionarios the funcionarios to set
     */
    public void setFuncionarios(List<Administrador> funcionarios) {
        this.funcionarios = funcionarios;
    }

    /**
     * @return List<Livro> return the livros
     */
    public List<Livro> getLivros() {
        return livros;
    }

    /**
     * @param livros the livros to set
     */
    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

}
