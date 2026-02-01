package com.wellsfargo.counselor.entities;

import jakarta.persistence.*;


@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long clientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private Advisor advisor;

    protected Client() {}

    public Client(String name, String email, Advisor advisor) {
        this.name = name;
        this.email = email;
        this.advisor = advisor;
    }

    public long getClientId() { return clientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }
}