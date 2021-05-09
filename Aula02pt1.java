package Alura;                            //declaração do pacote

import java.io.*;                        //imports de bibliotecas depois do pacote

public class Aula02pt1 {                 // publico só pode ter um e deve ser igual ao nome do arquivo
                                         // classes, interfaces e etc
    //definir estrutura de uma classe java
}
class Pessoa {                 //classes, interfaces e etc
    //definir estrutura de uma classe java
    String nome;            //variaveis
    Pessoa(String nome){    //construtor
        this.nome = nome;
    }
    public String getNome(){ //metodo
        String sobrenome = "carvalho";
        return nome + sobrenome;
    }                       //tem que ter um retorno
}

class B{
    int B;      //variavel
    B(){        //construtor nao faz nada, nao retorna
    }
    void B(){   //metodo retorna void
    }
}

interface A{
    final int tamanho =5; //nao se altera o valor pq é final  //por default é public e static
    void atutentica (String nome, String senha); // por default é public e abstract
}