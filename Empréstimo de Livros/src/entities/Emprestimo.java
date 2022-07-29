package entities;

import java.util.Date;

public class Emprestimo {
    private int idEmprestimo;
    private int idUsuario;
    private int idLivro;
    private Date dataRetirada;
    private Date dataReservada;
    private Date devolucaoPrevista;
    private Date devolucaoReal;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

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
     * @return Date return the dataReservada
     */
    public Date getDataReservada() {
        return dataReservada;
    }

    /**
     * @param dataRetirada the dataReservada to set
     */
    public void setDataReservada(Date dataReservada) {
        this.dataReservada = dataReservada;
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
