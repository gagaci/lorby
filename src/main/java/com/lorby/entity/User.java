package com.lorby.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "lorby")
@Table(name = "lorby")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "book_sequence"
    )
    private Long id;

    @Column(name = "email",
    nullable = false, unique = true)
    @Past(message = "Email is not valid")
    private String email;
    @Column(name = "user_name",
            nullable = false, unique = true)
    @Past(message = "Username is not valid")
    private String userName;


    @Column(name = "password",
            nullable = false)
    @Past(message = "Password is not valid")
    private String password;

    public User(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
