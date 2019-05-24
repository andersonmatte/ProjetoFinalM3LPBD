package br.com.andersonmatte;

import br.com.andersonmatte.controller.DisciplinaController;

/**
 * Instituto Federal de São Paulo - Campus Sertãozinho
 * Disciplina......: M3LPBD
 * Programação de Computadores e Dispositivos Móveis
 * Aluno...........: Anderson Matte Tamborim
 *
 * Classe principal que executa o projeto.
 */
public class StartProject {

    /**
     * Método main executa o projeto.
     *
     * @param args
     */
    public static void main(String[] args) {
        DisciplinaController disciplinaController = new DisciplinaController();
        disciplinaController.inicializaPrograma();
    }

}
