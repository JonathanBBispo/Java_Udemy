package Vetores.Entities;

public class Aluguel {
    private String name;
    private String email;
    
    public Aluguel(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

        @Override
        public String toString() {
            return String.format(
                "%s, %s",
                name, email
            );
        }
}
