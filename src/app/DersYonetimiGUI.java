package app;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DersYonetimiGUI extends JFrame {

    private ArrayList<String> dersler = new ArrayList<>();
    private JTextArea textArea;}

//    public DersYonetimiGUI() {
//
//        setTitle("Ders Yönetimi");
//        setSize(450, 350);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        // Üst panel (form)
//        JPanel ustPanel = new JPanel(new FlowLayout());
//
//        JTextField dersAdiField = new JTextField(10);
//        JTextField kodField = new JTextField(6);
//        JButton ekleBtn = new JButton("Ders Ekle");
//
//        ustPanel.add(new JLabel("Ders Adı:"));
//        ustPanel.add(dersAdiField);
//        ustPanel.add(new JLabel("Ders Kodu:"));
//        ustPanel.add(kodField);
//        ustPanel.add(ekleBtn);
//
//        // Orta alan (liste)
//        textArea = new JTextArea();
//        textArea.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//
//        // Buton olayı
//        ekleBtn.addActionListener(e -> {
//            String ders = kodField.getText() + " - " + dersAdiField.getText();
//            dersler.add(ders);
//            listeyiGuncelle();
//            dersAdiField.setText("");
//            kodField.setText("");
//        });
//
//        add(ustPanel, BorderLayout.NORTH);
//        add(scrollPane, BorderLayout.CENTER);
//
//        setVisible(true);
//    }
//
//    private void listeyiGuncelle() {
//        textArea.setText("");
//        for (String d : dersler) {
//            textArea.append(d + "\n");
//        }
//    }
//}
