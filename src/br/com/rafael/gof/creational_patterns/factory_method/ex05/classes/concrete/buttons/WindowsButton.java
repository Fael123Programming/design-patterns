package br.com.rafael.gof.creational_patterns.factory_method.ex05.classes.concrete.buttons;

import br.com.rafael.gof.creational_patterns.factory_method.ex05.interfaces.Button;

import javax.swing.*;
import java.awt.*;

public class WindowsButton implements Button {
    private final JPanel panel = new JPanel();
    private final JFrame frame = new JFrame();
    private JButton button;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);
        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(e -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
}
