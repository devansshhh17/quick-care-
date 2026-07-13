package Frames;

import javax.swing.JButton;

final class ButtonStyle {
    private ButtonStyle() {
    }

    static void keepColor(JButton button) {
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }
}
