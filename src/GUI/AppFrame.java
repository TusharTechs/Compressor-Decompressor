package GUI;

/**
 *
 * @author Tushar
 */

import comp_decomp.Compressor;
import comp_decomp.Decompressor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AppFrame extends JFrame implements ActionListener {

    JButton compressButton;
    JButton decompressButton;

    public AppFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("File Compressor/Decompressor");
        this.getContentPane().setBackground(new Color(240, 240, 240));
        this.setLayout(new FlowLayout());

        Font buttonFont = new Font("Arial", Font.BOLD, 14);

        compressButton = new JButton("Select file to compress");
        compressButton.setFont(buttonFont);
        compressButton.setPreferredSize(new Dimension(200, 40));
        compressButton.addActionListener(this);

        decompressButton = new JButton("Select file to decompress");
        decompressButton.setFont(buttonFont);
        decompressButton.setPreferredSize(new Dimension(200, 40));
        decompressButton.addActionListener(this);

        this.add(compressButton);
        this.add(decompressButton);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == compressButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.print(file);

                try {
                    Compressor.compress(file);
                    JOptionPane.showMessageDialog(this, "File compressed successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Compression error: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (e.getSource() == decompressButton) {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.print(file);

                try {
                    Decompressor.decompress(file);
                    JOptionPane.showMessageDialog(this, "File decompressed successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Decompression error: " + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppFrame::new);
    }
}
