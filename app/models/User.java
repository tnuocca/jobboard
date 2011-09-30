package models;

import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
@Table(name="my_user")
public class User extends Model {

    public String email;
    public String fullname;
    public boolean isAdmin;

    public User(String email, String fullname, boolean isAdmin) {
        this.email = email;
        this.fullname = fullname;
        this.isAdmin = isAdmin;
    }

}