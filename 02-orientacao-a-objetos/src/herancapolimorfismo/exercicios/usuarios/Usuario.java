package herancapolimorfismo.exercicios.usuarios;

public abstract sealed class Usuario permits Gerente, Vendedor, Atendente {

    protected String name;
    protected String email;
    protected String password;
    private boolean isLoggedIn = false;
    private final boolean admin;

    public Usuario(String name, String email, String password, boolean admin) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.admin = admin;
    }

    public boolean login(String email, String password){
        if (isLoggedIn) return false;

        if (this.email.equals(email) && this.password.equals(password)){
            isLoggedIn = true;
            return true;
        }else{
            return false;
        }
    }
    public boolean logoff(){
        if (!isLoggedIn) return false;

        isLoggedIn = false;
        return true;
    }

    public boolean updateData(String newName, String newEmail){
        if(!isLoggedIn){
            return false;
        }
        email = newEmail;
        name = newName;
        return true;
    }

    public boolean changePassword(String currentPassword, String newPassword){
        if (!currentPassword.equals(password)){
            return false;
        }

        password = newPassword;
        return true;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean isAdmin() {
        return admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
