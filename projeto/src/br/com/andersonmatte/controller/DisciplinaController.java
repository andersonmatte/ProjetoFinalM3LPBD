package br.com.andersonmatte.controller;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Instituto Federal de São Paulo - Campus Sertãozinho
 * Disciplina......: M3LPBD
 * Programação de Computadores e Dispositivos Móveis
 * Aluno...........: Anderson Matte Tamborim
 *
 * Classe Controller onde contém toda a lógica do projeto.
 */
public class DisciplinaController {

    private ResourceBundle mensagens;

    /**
     * Método mconstrutor da classe DisciplinaController é aproveitada para carregar o
     * arquivo de properties que contém as mensagens de interação com o usuário.
     *
     */
    public DisciplinaController(){
        this.mensagens = PropertyResourceBundle.getBundle("br.com.andersonmatte.mensagens.Mensagens");
    }

    /**
     *
     */
    public void start(){
    }

}
