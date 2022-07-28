package entities;

import java.util.List;

import java.util.Date;

public class Usuario extends Perfil{
    public static int geraId = 1;
    
    private int id;
    private boolean situacaoCadastral;
    private List<Emprestimo> historico;

    public Usuario(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
        super(nome, dataNascimento, cpf, email, telefone, endereco);
        this.situacaoCadastral = true;
        this.id = geraId;
        geraId ++;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return boolean return the situacaoCadastral
     */
    public boolean isSituacaoCadastral() {
        return situacaoCadastral;
    }

    /**
     * @param situacaoCadastral the situacaoCadastral to set
     */
    public void setSituacaoCadastral(boolean situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    /**
     * @return List<Emprestimo> return the historico
     */
    public List<Emprestimo> getHistorico() {
        return historico;
    }

    /**
     * @param historico the historico to set
     */
    public void setHistorico(List<Emprestimo> historico) {
        this.historico = historico;
    }

}