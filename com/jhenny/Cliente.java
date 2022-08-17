package com.jhenny;

public class Cliente implements FuncionarioAutenticavel{
    @Override
    public void setSenha(int senha) {

    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
