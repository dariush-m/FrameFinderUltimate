package FrameFinderUltimate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI extends JFrame{
    private JLabel inputLabel;
    protected JTextField inputField;
    private JButton inputSelectBtn;
    private JLabel outputORFLabel;
    protected JTextField outputField;
    private JButton outputSelectBtn;
    private JPanel actionPane;
    private JPanel inputPane;
    private JPanel outputPane;
    private JButton analyseBtn;
    private JPanel mainPane;

    public GUI() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(671, 246);
        setTitle("GB-Explorer");
        setVisible(true);
        setContentPane(mainPane);

        inputSelectBtn.addActionListener(e -> BackBone.setInput());

        outputSelectBtn.addActionListener(e -> BackBone.setOutput());
        analyseBtn.addActionListener(e -> {
            try {
                BackBone.analyse();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

}
