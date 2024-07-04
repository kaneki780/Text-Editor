package org.kaneki780.text.editor;

import org.kaneki780.text.editor.view.Frame;

import java.awt.*;

public class ApplicationRunner {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Frame view = new Frame();
            Controller controller = new Controller(view);
            controller.setListeners();
        });
    }
}
