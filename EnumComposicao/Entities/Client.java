package EnumComposicao.Entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;
    
    public Client(String name, String email, LocalDate birthDate){
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
