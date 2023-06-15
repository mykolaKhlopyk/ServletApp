package entity;
public class Admin extends User {

    public Admin(int id, String name, String password) {
        super(id,UserType.ADMINISTRATOR, name, password,  false);
    }

    public Admin(int id, String name, String password, boolean blocked) {
        this(id, name, password);
    }
}