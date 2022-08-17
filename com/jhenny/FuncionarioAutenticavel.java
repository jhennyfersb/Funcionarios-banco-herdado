package com.jhenny;

public interface FuncionarioAutenticavel  {

    default void setSenha(int senha) {

    }

    default boolean autentica(int senha) {
        return false;
    }

}
