package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

public class MainPage extends JFrame {
    public MainPage() throws HeadlessException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        createComponents();
    }

    protected void createComponents() {
        JPanel jp_painelPrincipal = new JPanel(new BorderLayout());
        JPanel jp_buttonPanel = new JPanel();
        JButton jb_openFileChoser = new JButton("Escolher malha");
        jp_buttonPanel.add(jb_openFileChoser);
        jp_painelPrincipal.add(jp_buttonPanel, BorderLayout.SOUTH);
        jb_openFileChoser.addActionListener((ActionEvent ae) -> {
            JFileChooser jf_escolherMalha = new JFileChooser();
            jf_escolherMalha.setCurrentDirectory(new File("./roads"));
            //atribuir a um controller o path ou algo assim para conseguir ler o arquivo e abrir a outra view
            if (jf_escolherMalha.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            }
        });
        this.add(jp_painelPrincipal);
    }
}
