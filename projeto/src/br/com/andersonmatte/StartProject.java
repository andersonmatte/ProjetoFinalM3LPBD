package br.com.andersonmatte;

/******************************************************

 //Instituto Federal de São Paulo - Campus Sertãozinho

 //Disciplina......: M3LPBD

 //Programação de Computadores e Dispositivos Móveis

 //Aluno...........: Anderson Matte Tamborim

 ******************************************************/

import br.com.andersonmatte.controller.DisciplinaController;

public class StartProject {

    /**
     * @param args
     */
    public static void main(String[] args) {
        DisciplinaController disciplinaController = new DisciplinaController();
        disciplinaController.start();
    }
}
