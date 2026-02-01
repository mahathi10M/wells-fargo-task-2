package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    // A list to track the numerous clients an advisor can have
    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients;

    protected Advisor() {}

    public Advisor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getAdvisorId() { return advisorId; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}