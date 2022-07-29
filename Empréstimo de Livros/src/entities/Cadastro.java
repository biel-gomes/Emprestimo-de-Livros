package entities;

import java.util.List;
import java.util.stream.Collectors;

public class Cadastro {
    private static List<Usuario> usuarios;
    private static List<Administrador> funcionarios;
    private static List<Livro> livros;
    
    public static int buscaLivro(String titulo) {
        List<Livro> temp = livros.stream().filter(x -> x.getTitulo().equals(titulo)).collect(Collectors.toList());
        
        if(temp.size() > 0) {
            return temp.get(0).getIdTitulo();
        }
        return -1;
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
