package view;

import controller.MapaController;
import model.MalhaViaria;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class MalhaViariaView extends JFrame {

    private JPanel jp_painelPrincipal;
    private MapaController controller;

    class MalhaModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return controller.getMalhaViaria().getAltura();
        }

        @Override
        public int getColumnCount() {
            return controller.getMalhaViaria().getLargura();
        }

        @Override
        public Object getValueAt(int linha, int coluna) {
            return controller.retornaCelula(linha, coluna).getIcon();
        }
    }

    class SectionRederer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
            setIcon((ImageIcon) value);
            return this;
        }
    }

    public MalhaViariaView(MalhaViaria malhaViaria) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        jp_painelPrincipal = new JPanel(new BorderLayout());
        this.add(jp_painelPrincipal);
        controller = MapaController.getInstance();
        controller.setMalhaViaria(malhaViaria);
        montarGrid();
    }

    private void montarGrid() {
        JTable jt_grid = new JTable();
        jt_grid.setBackground(Color.black);
        jt_grid.setModel(new MalhaModel());
        for (int i = 0; i < jt_grid.getColumnModel().getColumnCount(); i++) {
            jt_grid.getColumnModel().getColumn(i).setWidth(35);
            jt_grid.getColumnModel().getColumn(i).setMaxWidth(45);
        }
        jt_grid.setRowHeight(32);
        jt_grid.setShowGrid(false);
        jt_grid.setDefaultRenderer(Object.class, new SectionRederer());
        jp_painelPrincipal.add(jt_grid);
    }
}
