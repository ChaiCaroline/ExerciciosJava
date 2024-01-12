public class Usuario implements Autenticavel {
    private String usuario;
    private String senha;

    public Usuario(String novoUsuario, String novaSenha) {
        usuarioMinimo(novoUsuario);
        senhaMinimo(novaSenha);
    }

    public String getUsuario() {
        return usuario;
    }

    public void usuarioMinimo(String usuario) {
        if (usuario.length() < 5) {
            System.out.println("Minimo para Usuario e de 5 caracteres");
        } else {
            this.usuario = usuario;
        }
    }

    public void senhaMinimo(String senha) {
        if (senha.length() < 5) {
            System.out.println("Senha precisa no minimo 5 caracteres");
        } else if (senha.indexOf("@") == -1) {
            System.out.println("senha precisa ter um @");
        } else {
            this.senha = senha;
        }
    }

}
