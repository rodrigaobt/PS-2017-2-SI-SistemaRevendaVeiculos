/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar.entidade;

import java.io.Serializable;

/**
 *
 * @author rodrigo
 */

public class Carro implements Serializable{
    
    private String nome;
    private String modelo;//Diretor
    private int ano;
    private String marca;//Genero
    private double preco;
    private int nVendidos;
    private int nTotal;
    

    public Carro(String nome, String modelo, int ano, String marca, double preco, int nVendidos, int nTotal) {
        this.nome = nome;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.preco = preco;
        this.nVendidos = nVendidos;
        this.nTotal = nTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double valorDiaria) {
        this.preco = valorDiaria;
    }

    public int getnVendidos() {
        return nVendidos;
    }

    public void setnVendidos(int nVendidos) {
        this.nVendidos = nVendidos;
    }

    public int getnTotal() {
        return nTotal;
    }

    public void setnTotal(int nTotal) {
        this.nTotal = nTotal;
    }
}