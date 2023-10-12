package br.com.marshallliudev.todolist.User;

public class UserModel {

    // public String username;
    // public String name;
    // public String password;
    
    private String username;
    private String name;
    private String password;

    // Construtor padrão
    public UserModel() {
    }

    // Construtor com parâmetros, se necessário
    public UserModel(String username, String name, String password) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    // Getter para o campo username
    public String getUsername() {
        return username;
    }

    // Setter para o campo username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter para o campo name
    public String getName() {
        return name;
    }

    // Setter para o campo name
    public void setName(String name) {
        this.name = name;
    }

    // Getter para o campo password
    public String getPassword() {
        return password;
    }

    // Setter para o campo password
    public void setPassword(String password) {
        this.password = password;
    }


}

