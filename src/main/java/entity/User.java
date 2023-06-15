package entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private final UserType type;
    private String name;
    private String password;
    private boolean blocked;

    public User(String name, String password, UserType type, boolean blocked) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.blocked = blocked;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        User registeredUser = ((User) obj);
        return id == registeredUser.id;
    }
}
