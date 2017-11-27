/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar.entidade;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author rodrigo
 */

public class Cliente implements Serializable{
    
    private String nome;
    private String cpf;
    private String dataNasc;
    private int idade;
    private double totalPagar;
    private int valorDesconto;
    private Carro vendido;
    private String rua;
    private int num;
    private String qd;
    private String bairro;

    ArrayList<Carro> carros = new ArrayList<>();
    ArrayList<Carro> carrosaux = new ArrayList<>();
    
    public String getCarrosVendidos() {
        String a = null;
        if(carros.size()>0) {
            a = carros.get(0).getNome()+"\n";
            for(int i=1;i<carros.size();i++) {
                a = (a+carros.get(i).getNome()+"\n");
            }
        }
        if(a == null) {
            return ("Nenhum Carro Vendido");
        }
        return a;
    }
    
    public void setVendido(Carro locado) {
        this.vendido = locado;
        carros.add(this.vendido);
    }
    
    public String devolucao(String nome) {
        int x=0;
        for(int i=0;i<carros.size();i++) {
            if(nome.equals(carros.get(i).getNome())){
                x=1;
                this.totalPagar=this.totalPagar-carros.get(i).getPreco();
                
            }else carrosaux.add(carros.get(i));
        }
        carros.clear();
        for(int i=0;i<carrosaux.size();i++) {
            carros.add(carrosaux.get(i));
        }
        carrosaux.clear();
        if(x==1) {
            return "Devolução concluida";
        }else return "Carro não encontrado";
    }


    public Cliente(String nome, String cpf, String dataNasc, int idade, float valorDev, String rua, int num, String qd, String bairro) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.idade = idade;
        this.totalPagar = valorDev;
        this.rua = rua;
        this.num = num;
        this.qd = qd;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getQd() {
        return qd;
    }

    public void setQd(String qd) {
        this.qd = qd;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int prazoDev) {
        this.valorDesconto = prazoDev;
    }
}