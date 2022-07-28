package entities;

import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private Usuario usuario;
    private Livro livro;
    private Date dataRetirada;
    private Date devolucaoPrevista;
    private Date devolucaoReal;

    /**
     * @return int return the idEmprestimo
     */
    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    /**
     * @param idEmprestimo the idEmprestimo to set
     */
    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

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
     * @return Livro return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    /**
     * @return Date return the dataRetirada
     */
    public Date getDataRetirada() {
        return dataRetirada;
    }

    /**
     * @param dataRetirada the dataRetirada to set
     */
    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    /**
     * @return Date return the devolucaoPrevista
     */
    public Date getDevolucaoPrevista() {
        return devolucaoPrevista;
    }

    /**
     * @param devolucaoPrevista the devolucaoPrevista to set
     */
    public void setDevolucaoPrevista(Date devolucaoPrevista) {
        this.devolucaoPrevista = devolucaoPrevista;
    }

    /**
     * @return Date return the devolucaoReal
     */
    public Date getDevolucaoReal() {
        return devolucaoReal;
    }

    /**
     * @param devolucaoReal the devolucaoReal to set
     */
    public void setDevolucaoReal(Date devolucaoReal) {
        this.devolucaoReal = devolucaoReal;
    }

}
