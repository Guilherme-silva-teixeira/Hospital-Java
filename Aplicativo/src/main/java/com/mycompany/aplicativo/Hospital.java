package com.mycompany.aplicativo;

public class Hospital
{
    private String nome;
    private String endereco;
    private String email;
    private String telefone;

    public Hospital(String nome, String endereco, String email, String telefone)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Hospital \n email=" + email + "\n nome=" + nome + "\n telefone=" + telefone;
    }

}