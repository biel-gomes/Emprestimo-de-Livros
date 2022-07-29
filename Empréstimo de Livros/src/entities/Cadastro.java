package entities;

import java.util.List;

public class Cadastro {
    private static List<Usuario> usuarios;
    private static List<Administrador> funcionarios;
    private static List<Livro> livros;
    
    public static int buscaLivro(String titulo) {
        Integer temp = livros.stream().filter(x -> x.getTitulo().equals(titulo)).findFirst().orElse(null).getIdTitulo();

        return (temp == null) ? -1 : temp;
    }

    public static void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void cadastrarFuncionario(Administrador funcionario) {
        funcionarios.add(funcionario);
    }
    
    public static void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }
}
