package com.jhenny;

public class Main {

    public static void main(String[] args) {
    Funcionario testeFuncionario = new Gerente() ;
    testeFuncionario.setNome("Jhennyfer");
    testeFuncionario.setCpf("056872651-04");
    testeFuncionario.setSalario(2000.d);


        System.out.println(testeFuncionario.getNome());
        System.out.println(testeFuncionario.getCpf());
        System.out.println(testeFuncionario.getSalario());
        System.out.println(testeFuncionario.getBonificacao());


    Gerente testeGerente = new Gerente();
    testeGerente.setNome("Marcus");
    testeGerente.setCpf("022356987-41");
    testeGerente.setSalario(11000.d);
    testeGerente.setSenha(222);
        SistemaInterno si = new SistemaInterno();


        System.out.println(testeGerente.getNome());
        System.out.println(testeGerente.getCpf());
        System.out.println(testeGerente.getSalario());
        System.out.println(testeGerente.getBonificacao());


    Funcionario editorDevideo = new Gerente();
    editorDevideo.setSalario(1500.d);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(editorDevideo);
        System.out.println(controle.getSoma());

    FuncionarioAutenticavel gerente = new Gerente();
    }
}
