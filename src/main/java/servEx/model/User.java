package servEx.model;

import java.time.LocalDate;

public class User {

    private long id;
    private String email;
    private String password;
    private String lastname;
    private String name;
    private String patronym;
    private LocalDate birthdate;
    private String cellPhone;
    private String homePhone;
    private int house;
    private int flat;

    public User(long id, String email, String password, String lastname,
                String name, String patronym, LocalDate birthdate, String cellPhone, String homePhone, int house, int flat) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.name = name;
        this.patronym = patronym;
        this.birthdate = birthdate;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.house = house;
        this.flat = flat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate age) {
        this.birthdate = birthdate;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", patronym='" + patronym + '\'' +
                ", birthdate=" + birthdate +
                ", cellPhone='" + cellPhone + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
