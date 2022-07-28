package entities;

import java.util.Date;
import java.util.Calendar;

public abstract class Perfil{
    protected String nome;
    protected Date dataNascimento;
    protected int idade;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected String endereco;

	public Perfil(String nome, Date dataNascimento, String cpf, String email, String telefone, String endereco){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.idade = calculaIdade(dataNascimento);
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

    public static int calculaIdade(Date dataNascimento) {
		Calendar dataFornecida = Calendar.getInstance();
		Calendar hoje = Calendar.getInstance();
		dataFornecida.setTime(dataNascimento);
		dataFornecida.set(Calendar.YEAR, hoje.get(Calendar.YEAR));
		int idade = dataFornecida.after(hoje) ? -1 : 0;
		dataFornecida.setTime(dataNascimento);
		idade += hoje.get(Calendar.YEAR) - dataFornecida.get(Calendar.YEAR);
		return idade;
	}


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Date return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
		idade = calculaIdade(dataNascimento);
    }

	public int getIdade(){
		return idade;
	}

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return String return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}