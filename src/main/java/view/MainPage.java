package view;

import controller.FileController;
import controller.MapaController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class MainPage extends JFrame implements Observer {

    private FileController controller;

    public MainPage() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        controller = new FileController();
        controller.addObservador(this);
        createComponents();
    }

    protected void createComponents() {
        JPanel jp_painelPrincipal = new JPanel(new BorderLayout());
        JPanel jp_especificacoesPanel = new JPanel();
        JLabel jl_numeroCarros = new JLabel("Numero maximo de Carros: ");
        JTextField jt_numeroCarros = new JTextField(10);
        JLabel jl_intervaloCarros = new JLabel("Intervalo entre a inserçao de Carros: ");
        JTextField jt_intervaloCarros = new JTextField(10);
        jp_especificacoesPanel.add(jl_numeroCarros);
        jp_especificacoesPanel.add(jt_numeroCarros);
        jp_especificacoesPanel.add(jl_intervaloCarros);
        jp_especificacoesPanel.add(jt_intervaloCarros);
        JPanel jp_buttonPanel = new JPanel();
        JButton jb_openFileChoser = new JButton("Escolher malha");
        jp_buttonPanel.add(jb_openFileChoser);
        jb_openFileChoser.addActionListener((ActionEvent ae) -> {
            JFileChooser jf_escolherMalha = new JFileChooser();
            jf_escolherMalha.setCurrentDirectory(new File("./roads"));
            if (jf_escolherMalha.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                controller.setFile(jf_escolherMalha.getSelectedFile());
            }
        });
        JButton jb_confirmar = new JButton("Confirmar");
        jb_confirmar.addActionListener((actionEvent -> {
            try {
                int numeroCarros = Integer.parseInt(jt_numeroCarros.getText());
                int intervaloCarros = Integer.parseInt(jt_intervaloCarros.getText());
                MapaController.getInstance().setNumeroCarros(numeroCarros);
                MapaController.getInstance().setIntervaloCarros(intervaloCarros);
                controller.notificar();
            } catch (Exception exception) {
                System.out.println("\nErro: " + exception.getMessage());
                System.out.println("Todos os campos devem ser preenchidos com numeros");
            }
        }));
        jp_buttonPanel.add(jb_confirmar);
        jp_painelPrincipal.add(jp_especificacoesPanel, BorderLayout.CENTER);
        jp_painelPrincipal.add(jp_buttonPanel, BorderLayout.SOUTH);
        add(jp_painelPrincipal);
    }

    @Override
    public void atualizar() {
        this.setVisible(false);
        try {
            MalhaViariaView malhaViaria = new MalhaViariaView(this.controller.criarMapa());
            malhaViaria.setVisible(true);
        } catch (Exception exception) {
            System.out.println("\nErro: " + exception.getMessage());
        }
    }
}
