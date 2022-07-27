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
		this.idade = getIdade(dataNascimento);
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

    public static int getIdade(Date dataNascimento) {
		Calendar dataFornecida = Calendar.getInstance();
		Calendar hoje = Calendar.getInstance();
		dataFornecida.setTime(dataNascimento);
		dataFornecida.set(Calendar.YEAR, hoje.get(Calendar.YEAR));
		int idade = dataFornecida.after(hoje) ? -1 : 0;
		dataFornecida.setTime(dataNascimento);
		idade += hoje.get(Calendar.YEAR) - dataFornecida.get(Calendar.YEAR);
		return idade;
	}

}