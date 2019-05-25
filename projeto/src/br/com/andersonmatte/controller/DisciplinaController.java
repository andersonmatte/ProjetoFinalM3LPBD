package br.com.andersonmatte.controller;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Instituto Federal de São Paulo - Campus Sertãozinho
 * Disciplina......: M3LPBD
 * Programação de Computadores e Dispositivos Móveis
 * Aluno...........: Anderson Matte Tamborim
 * 
 * Classe Controller onde contém toda a lógica do projeto.
 * 
 * Referências utilizadas:
 * 
 * https://docs.oracle.com/javase/8/docs/api/index.html
 * https://www.javatpoint.com/java-swing
 */
public class DisciplinaController {

	private ResourceBundle mensagens;
	private JFrame frame;

	/**
	 * Método construtor da classe DisciplinaController é aproveitada para
	 * carregar o arquivo de properties que contém as mensagens de interação com
	 * o usuário.
	 */
	public DisciplinaController() {
		this.mensagens = PropertyResourceBundle.getBundle("br.com.andersonmatte.mensagens.Mensagens");
	}

	/**
	 * Método principal que faz a inicialização do programa para cadastro,
	 * consulta e exclusão de disciplinas.
	 */
	public void inicializaPrograma() {
		// Frame
		this.frame = this.getjFrame();
		// Panel
		JPanel btnPnl = this.getjPanel();
		// Table e Scroll
		JTable table = this.getjTable();
		JScrollPane tabelaComScroll = this.getScroll(table);
		// Adicionando componentes ao Frame.
		this.frame.add(tabelaComScroll, BorderLayout.CENTER);
		this.frame.add(btnPnl, BorderLayout.NORTH);
		this.frame.pack();
		//garante abertura no centro da tela.
		this.frame.setLocationRelativeTo(null);
		// Visibilidade.
		this.frame.setVisible(true);
	}

	/**
	 * Inicialização do frame e preferências tais como tamanho e nome.
	 * 
	 * @return JFrame
	 */
	private JFrame getjFrame() {
		JFrame frame = new JFrame(this.mensagens.getString("title.frame"));
		frame.setPreferredSize(new Dimension(720, 468));
		return frame;
	}

	/**
	 * Inicialização dos panels para os botões.
	 * 
	 * @return
	 */
	private JPanel getjPanel() {
		JPanel btnPnl = new JPanel(new BorderLayout());
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), ""));
		// Adiciona os botões ao Painel.
		for (JButton registro : this.criarBotoes()) {
			panel.add(registro);
		}
		btnPnl.add(panel, BorderLayout.CENTER);
		btnPnl.setBackground(Color.WHITE);
		return btnPnl;
	}
	
	/**
	 * Método responsável pela criação dos botôes da tela de Disciplinas.
	 */
	private List<JButton> criarBotoes() {
		List<JButton> jButtons = new ArrayList<>();
		// Incluir
		JButton incluirDisciplina = new JButton(this.mensagens.getString("botao.incluir"));
		incluirDisciplina.setBounds(2, 1, 135, 30);
		jButtons.add(incluirDisciplina);
		// Excluir
		JButton excluirDisciplina = new JButton(this.mensagens.getString("botao.excluir"));
		excluirDisciplina.setBounds(150, 100, 135, 30);
		jButtons.add(excluirDisciplina);
		return jButtons;
	}

	/**
	 * Inicialização o Scroll e adicionado na tabela de disciplinas.
	 * 
	 * @return JScrollPane
	 */
	private JScrollPane getScroll(JTable table) {
		JScrollPane tabelaComScroll = new JScrollPane(table,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		tabelaComScroll.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(),
				this.mensagens.getString("fieldset.disciplina")));
		return tabelaComScroll;
	}

	/**
	 * Inicialização da tabela, preferencias e estilos.
	 * 
	 * @return JTable
	 */
	private JTable getjTable() {
		String data[][] = {
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" },
				{ "Matemática", "60", "Matemática", "30", "Noturno" } };
		String column[] = { "Nome Disciplina", "Carga Horária",
				"Curso Pertence", "Número Vagas", "Período" };

		JTable table = new JTable(data, column);
		table.getTableHeader().setReorderingAllowed(false);
		table.setFont(Font.getFont(Font.SANS_SERIF));
		table.setBackground(Color.WHITE);
		table.setGridColor(Color.BLACK);
		// Garante o preenchimento total das colunas dentro da tabela.
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		return table;
	}

}
