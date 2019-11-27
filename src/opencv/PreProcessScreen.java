/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.Math;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author alian
 */
public class PreProcessScreen extends javax.swing.JFrame {

    String imagePath;
    BufferedImage tempImage;
    String currentImagePath = "src//opencv//images//output//second.png";

    /**
     * Creates new form PreProcessScreen
     */
    public PreProcessScreen(String imagePath) throws IOException {
        File f = new File(imagePath);
        BufferedImage image = ImageIO.read(f);
        writeImage(image);
        this.imagePath = imagePath;
        initComponents();
        this.setLocationRelativeTo(null); //Ortada açılmasını sağlar

    }  
    
    public void writeImage(BufferedImage image) throws IOException {
        tempImage = image;
        BufferedImage bi = tempImage;  // retrieve image
        File outputfile = new File(currentImagePath);
        ImageIO.write(bi, "png", outputfile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSecondScreen = new javax.swing.ButtonGroup();
        imagePathTextField = new javax.swing.JLabel();
        imageBoxSecondScreen = new javax.swing.JLabel();
        acceptPreProcess = new javax.swing.JRadioButton();
        declinePreProcess = new javax.swing.JRadioButton();
        preProcessComboBox = new javax.swing.JComboBox<>();
        reduceMagnificationSlider = new javax.swing.JSlider();
        widthTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nextButtonOnSecondScreen = new javax.swing.JButton();
        backButtonOnSecondScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        imagePathTextField.setText("Resim Yolu");

        imageBoxSecondScreen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageBoxSecondScreenMouseMoved(evt);
            }
        });
        imageBoxSecondScreen.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                imageBoxSecondScreenMouseWheelMoved(evt);
            }
        });

        buttonGroupSecondScreen.add(acceptPreProcess);
        acceptPreProcess.setText("Ön İşleme istiyorum");

        buttonGroupSecondScreen.add(declinePreProcess);
        declinePreProcess.setSelected(true);
        declinePreProcess.setText("Ön İşleme istemiyorum");
        declinePreProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declinePreProcessActionPerformed(evt);
            }
        });

        preProcessComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ön İşlem Menusu", "(a) Renkli resmi gri seviye dönüştürme", "(b) Resim büyültme, küçültme", "(c) Resmi yeniden boyutlandırma", "(d) Resimden istenilen bölgenin kesilip alınması", "(e) Histogram oluşturma" }));
        preProcessComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preProcessComboBoxActionPerformed(evt);
            }
        });

        reduceMagnificationSlider.setMaximum(50);
        reduceMagnificationSlider.setValue(25);
        reduceMagnificationSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                reduceMagnificationSliderStateChanged(evt);
            }
        });

        widthTextField.setText("jTextField1");

        heightTextField.setText("jTextField2");

        jLabel1.setText("Genişlik");

        jLabel2.setText("Yükseklik");

        nextButtonOnSecondScreen.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        nextButtonOnSecondScreen.setText("İleri >");
        nextButtonOnSecondScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonOnSecondScreenActionPerformed(evt);
            }
        });

        backButtonOnSecondScreen.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backButtonOnSecondScreen.setText("< Geri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(acceptPreProcess)
                                .addComponent(declinePreProcess)
                                .addComponent(preProcessComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reduceMagnificationSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(imagePathTextField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageBoxSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButtonOnSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(nextButtonOnSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageBoxSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(acceptPreProcess)
                        .addGap(18, 18, 18)
                        .addComponent(declinePreProcess)
                        .addGap(37, 37, 37)
                        .addComponent(preProcessComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(reduceMagnificationSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addComponent(imagePathTextField)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButtonOnSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButtonOnSecondScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        imagePathTextField.setText(imagePath);
        ImageIcon icon = new ImageIcon(imagePath);
        imageBoxSecondScreen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(imageBoxSecondScreen.getWidth(), imageBoxSecondScreen.getHeight(), Image.SCALE_DEFAULT)));
        widthTextField.setText(imageBoxSecondScreen.getWidth() + "");
        heightTextField.setText(imageBoxSecondScreen.getHeight() + "");
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void declinePreProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declinePreProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declinePreProcessActionPerformed

    private void preProcessComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preProcessComboBoxActionPerformed

        System.out.println("Tetiklendi" + preProcessComboBox.getSelectedIndex() + "");

        if (preProcessComboBox.getSelectedIndex() == 1) {//Gri resim oluşturma
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                image = makeGray(image);
                imageBoxSecondScreen.setIcon(new ImageIcon(image));
                writeImage(image);
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (preProcessComboBox.getSelectedIndex() == 2) {//Resmi büyültme küçültme
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                image = scale(image, 300, 200);
                imageBoxSecondScreen.setIcon(new ImageIcon(image));
                writeImage(image);

            } catch (IOException ex) {
                Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (preProcessComboBox.getSelectedIndex() == 3) {//Resmi Yeniden boyutlandırma
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                image = scale(image, Integer.parseInt(widthTextField.getText()) / 2, Integer.parseInt(heightTextField.getText()) / 2);
                imageBoxSecondScreen.setIcon(new ImageIcon(image));
                writeImage(image);

            } catch (IOException ex) {
                Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (preProcessComboBox.getSelectedIndex() == 4) {//Resim kırpma
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                image = cropImage(image, 80, 100, 150, 200);
                imageBoxSecondScreen.setIcon(new ImageIcon(image));
                writeImage(image);

            } catch (IOException ex) {
                Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (preProcessComboBox.getSelectedIndex() == 5) {//Histogram
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                getHistogram(image);
                //imageBoxSecondScreen.setIcon(new ImageIcon(image));
            } catch (IOException ex) {
                Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        /*    String path = imagePath;
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat color = Imgcodecs.
                imread(path);
        Mat gray = new Mat();
        Mat draw = new Mat();
        Mat wide = new Mat();

        Imgproc.cvtColor(color, gray, Imgproc.COLOR_BGR2GRAY);
        Imgproc.Canny(gray, wide, 50, 150, 3, false);
        wide.convertTo(draw, CvType.CV_8U);

        String outputPath = "C:\\Users\\alian\\Documents\\NetBeansProjects\\OpenCVProject\\src\\opencv\\images\\output\\";
        if (Imgcodecs.imwrite(outputPath + "second.jpg", draw)) ;
        {
            ImageIcon ii = new ImageIcon(outputPath + "second.jpg");
            imageBoxSecondScreen.setIcon(new ImageIcon(
                    new ImageIcon(outputPath + "second.jpg").getImage()
                            .getScaledInstance(imageBoxSecondScreen.getWidth(), imageBoxSecondScreen.getHeight(),
                                    Image.SCALE_DEFAULT)));
        }*/

 /* Create and display the form */

    }//GEN-LAST:event_preProcessComboBoxActionPerformed
    private void reduceMagnificationSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_reduceMagnificationSliderStateChanged
        try {
            BufferedImage image;
            int width, height;
            image = ImageIO.read(new File(imagePath));
            width = reduceMagnificationSlider.getValue() * image.getWidth() / 25;
            height = reduceMagnificationSlider.getValue() * image.getHeight() / 25;
            imagePathTextField.setText(width + " " + height);
            image = scale(image, width, height);
            imageBoxSecondScreen.setIcon(new ImageIcon(image));

        } catch (IOException ex) {
            Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_reduceMagnificationSliderStateChanged

    private void imageBoxSecondScreenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageBoxSecondScreenMouseMoved
        System.out.println(evt.getXOnScreen() + " " + evt.getYOnScreen());
    }//GEN-LAST:event_imageBoxSecondScreenMouseMoved

    private void nextButtonOnSecondScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonOnSecondScreenActionPerformed
        try {
            writeImage(tempImage);
        } catch (IOException ex) {
            Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        FilterScreen filterScreen = new FilterScreen(currentImagePath);
        filterScreen.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_nextButtonOnSecondScreenActionPerformed

    private void imageBoxSecondScreenMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_imageBoxSecondScreenMouseWheelMoved

         /*   if (evt.getWheelRotation() < 0) {
                try {
                    BufferedImage image;
                    int width, height;
                    image = ImageIO.read(new File(imagePath));
                    width = image.getWidth() + 4;
                    height = image.getHeight() +4;
                    imagePathTextField.setText(width + " " + height);
                    image = scale(image, width, height);
                    imageBoxSecondScreen.setIcon(new ImageIcon(image));

                } catch (IOException ex) {
                    Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    BufferedImage image;
                    int width, height;
                    image = ImageIO.read(new File(imagePath));
                    width = image.getWidth() - 4;
                    height = image.getHeight() - 4;
                    imagePathTextField.setText(width + " " + height);
                    image = scale(image, width, height);
                    imageBoxSecondScreen.setIcon(new ImageIcon(image));

                } catch (IOException ex) {
                    Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
*/
        // TODO add your handling code here:
    }//GEN-LAST:event_imageBoxSecondScreenMouseWheelMoved
    public BufferedImage makeGray(BufferedImage img) {
        for (int x = 0; x < img.getWidth(); ++x) {
            for (int y = 0; y < img.getHeight(); ++y) {
                int rgb = img.getRGB(x, y);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xFF);

                // Normalize and gamma correct:
                float rr = (float) Math.pow(r / 255.0, 2.2);
                float gg = (float) Math.pow(g / 255.0, 2.2);
                float bb = (float) Math.pow(b / 255.0, 2.2);

                // Calculate luminance:
                float lum = (float) (0.2126 * rr + 0.7152 * gg + 0.0722 * bb);

                // Gamma compand and rescale to byte range:
                int grayLevel = (int) (255.0 * Math.pow(lum, 1.0 / 2.2));
                int gray = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
                img.setRGB(x, y, gray);

            }
        }
        return img;
    }

    public BufferedImage scale(BufferedImage img, int targetWidth, int targetHeight) {

        int type = (img.getTransparency() == Transparency.OPAQUE) ? BufferedImage.TYPE_INT_RGB : BufferedImage.TYPE_INT_ARGB;
        BufferedImage ret = img;
        BufferedImage scratchImage = null;
        Graphics2D g2 = null;

        int w = img.getWidth();
        int h = img.getHeight();

        int prevW = w;
        int prevH = h;

        do {
            if (w > targetWidth) {
                w /= 2;
                w = (w < targetWidth) ? targetWidth : w;
            }

            if (h > targetHeight) {
                h /= 2;
                h = (h < targetHeight) ? targetHeight : h;
            }

            if (scratchImage == null) {
                scratchImage = new BufferedImage(w, h, type);
                g2 = scratchImage.createGraphics();
            }

            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(ret, 0, 0, w, h, 0, 0, prevW, prevH, null);

            prevW = w;
            prevH = h;
            ret = scratchImage;
        } while (w != targetWidth || h != targetHeight);

        if (g2 != null) {
            g2.dispose();
        }

        if (targetWidth != ret.getWidth() || targetHeight != ret.getHeight()) {
            scratchImage = new BufferedImage(targetWidth, targetHeight, type);
            g2 = scratchImage.createGraphics();
            g2.drawImage(ret, 0, 0, null);
            g2.dispose();
            ret = scratchImage;
        }

        return ret;

    }

    public BufferedImage cropImage(BufferedImage img, int x, int y, int w, int h) {
        BufferedImage subImgage = img.getSubimage(x, y, w, h);
        return subImgage;
    }

    public void getHistogram(BufferedImage image) {
        try {
            int iW = image.getWidth();
            int iH = image.getHeight();
            int a[][][] = new int[255][255][255];

            for (int i = 0; i < iH; i++) {
                for (int j = 0; j < iW; j++) {
                    Color c = new Color(image.getRGB(j, i));
                    a[c.getRed()][c.getGreen()][c.getBlue()]++;

                }
            }
            for (int i = 0; i < 255; i++) {
                for (int j = 0; j < 255; j++) {
                    for (int k = 0; k < 255; k++) {
                        if (a[i][j][k] > 0) {
                            System.out.println("colour[" + i + "][" + j + "][" + k + "] repeated " + a[i][j][k] + "times \n");
                            //i->Red j-Green k->Blue                        

                        }
                    }
                }
            }
        } catch (Exception e) {
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PreProcessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreProcessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreProcessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreProcessScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            ;
            public void run() {
                try {
                    new PreProcessScreen("").setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PreProcessScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton acceptPreProcess;
    private javax.swing.JButton backButtonOnSecondScreen;
    private javax.swing.ButtonGroup buttonGroupSecondScreen;
    private javax.swing.JRadioButton declinePreProcess;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel imageBoxSecondScreen;
    private javax.swing.JLabel imagePathTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton nextButtonOnSecondScreen;
    private javax.swing.JComboBox<String> preProcessComboBox;
    private javax.swing.JSlider reduceMagnificationSlider;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
