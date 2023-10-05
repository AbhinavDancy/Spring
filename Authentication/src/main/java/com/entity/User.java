package com.entity;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="user_details")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    private Long user_id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    //private List<String> courses;

    public Long getUser_id()
    {
        return user_id;
    }

    public void setUser_id(Long user_id)
    {
        this.user_id = user_id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{" + "user_id=" + user_id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\''
            + ", password='" + password + '\'' + '}';
    }

    public User(Long user_id, String firstName, String lastName, String email, String password)
    {
        this.user_id = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

    }
}

