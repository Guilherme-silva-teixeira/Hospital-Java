package com.mycompany.aplicativo;
public class Paciente
{
    private String nome;
    private String endereco;
    private String cpf;
    private String telefone;
    private String dataNasc;

    public Paciente(String nome, String endereco, String cpf, String telefone, String dataNasc)
    {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getCpf()
    {
        return cpf;
    }

    public String getDataNasc()
    {
        return dataNasc;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public String getNome()
    {
        return nome;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc)
    {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    @Override

    public String toString()
    {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}