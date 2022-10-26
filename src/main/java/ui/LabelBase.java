package ui;

import javax.swing.*;

abstract class LabelBase extends JLabel {
    private int id;

    public LabelBase(int id) {
        this.id = id;
    }
}
