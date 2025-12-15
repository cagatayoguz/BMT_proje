package app;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AkademisyenGUI extends JFrame {

    private JTextField txtAra;
    private JList<String> akademisyenList;
    private DefaultListModel<String> listModel;

    private List<String> tumAkademisyenler;

    public AkademisyenGUI() {
        setTitle("Akademisyenler");
        setSize(550, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // === ÜST PANEL (ARAMA) ===
        JPanel ustPanel = new JPanel(new BorderLayout(5, 5));
        JLabel lblAra = new JLabel("Akademisyen Ara:");
        txtAra = new JTextField();

        ustPanel.add(lblAra, BorderLayout.WEST);
        ustPanel.add(txtAra, BorderLayout.CENTER);

        // === LİSTE ===
        listModel = new DefaultListModel<>();
        akademisyenList = new JList<>(listModel);
        akademisyenList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(akademisyenList);

        // === VERİLER ===
        tumAkademisyenler = new ArrayList<>();
        tumAkademisyenler.add("Prof. Dr. Ahmet Yılmaz – Bilgisayar Mühendisliği");
        tumAkademisyenler.add("Doç. Dr. Ayşe Demir – Elektrik Elektronik Mühendisliği");
        tumAkademisyenler.add("Dr. Öğr. Üyesi Mehmet Kaya – Matematik");
        tumAkademisyenler.add("Prof. Dr. Selin Arslan – Yazılım Mühendisliği");
        tumAkademisyenler.add("Doç. Dr. Murat Çelik – Endüstri Mühendisliği");
        tumAkademisyenler.add("Dr. Öğr. Üyesi Zeynep Koç – Fizik");
        tumAkademisyenler.add("Prof. Dr. Hakan Şen – İnşaat Mühendisliği");
        tumAkademisyenler.add("Dr. Öğr. Üyesi Elif Aydın – İstatistik");

        // İlk yükleme
        tumAkademisyenler.forEach(listModel::addElement);

        // === ARAMA DİNAMİĞİ ===
        txtAra.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrele();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrele();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filtrele();
            }
        });

        // === FRAME ===
        setLayout(new BorderLayout(10, 10));
        add(ustPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void filtrele() {
        String aranan = txtAra.getText().toLowerCase();
        listModel.clear();

        for (String a : tumAkademisyenler) {
            if (a.toLowerCase().contains(aranan)) {
                listModel.addElement(a);
            }
        }
    }
}
