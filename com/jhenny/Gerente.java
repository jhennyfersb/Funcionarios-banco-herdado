package com.jhenny;

public class Gerente extends Funcionario implements FuncionarioAutenticavel{
    private int senha;

    public boolean autenticaSenha(int senha){
        if (this.senha == senha){
            return true;
        }else {
            return false;
        }
    }
    public double getBonificacao() {
        return getSalario() * 0.1;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
