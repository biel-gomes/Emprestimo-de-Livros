package entities;

import java.util.Date;

import entities.enums.Idioma;
import entities.enums.Situacao;

public class Livro {
    private int idLivro;
    private int idTitulo;
    private String titulo;
    private String autor;
    private String genero;
    private String resumo;
    private Idioma idioma;
    private String editora;
    private Date dataPublicacao;
    private int nPaginas;
    private double nota;
    private Situacao situacao;

    /**
     * @return int return the idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }

    /**
     * @param idLivro the idLivro to set
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    /**
     * @return int return the idTitulo
     */
    public int getIdTitulo() {
        return idTitulo;
    }

    /**
     * @param idTitulo the idTitulo to set
     */
    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return String return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    /**
     * @return Idioma return the idioma
     */
    public Idioma getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    /**
     * @return String return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return Date return the dataPublicacao
     */
    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * @param dataPublicacao the dataPublicacao to set
     */
    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    /**
     * @return int return the nPaginas
     */
    public int getNPaginas() {
        return nPaginas;
    }

    /**
     * @param nPaginas the nPaginas to set
     */
    public void setNPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    /**
     * @return double return the nota
     */
    public double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * @return Situacao return the situacao
     */
    public Situacao getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

}
