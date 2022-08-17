package com.jhenny;

public class Administrador extends  Funcionario implements FuncionarioAutenticavel{
    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public void setSenha(int senha) {
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
