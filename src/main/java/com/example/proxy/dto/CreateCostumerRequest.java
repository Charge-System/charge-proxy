package com.example.proxy.dto;

public class CreateCostumerRequest {
    private String name;
    private String cpfCnpj;
    private String email;

    public CreateCostumerRequest() {
    }

    public CreateCostumerRequest(String name, String cpfCnpj, String email) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
