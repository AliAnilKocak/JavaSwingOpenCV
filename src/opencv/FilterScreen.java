/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import imageFX.ImageFX;
import imageFX.MyImage;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.ImageObserver;
import static java.awt.image.ImageObserver.ALLBITS;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static opencv.BufferedImageBlur.imageLoaded;

/**
 *
 * @author alian
 */
public class FilterScreen extends javax.swing.JFrame {

    static BufferedImage image;
    static boolean imageLoaded = false;
    String imagePath;
    String currentImagePath = "src//opencv//images//output//third.png";

    /**
     * Creates new form FilterScreen
     */
    public FilterScreen(String imagePath) {
        this.imagePath = imagePath;
        initComponents();

        try {
            File f = new File(imagePath);
            BufferedImage image;
            image = ImageIO.read(f);
            writeImage(image);
            imageBoxThirdScreen.setIcon(new ImageIcon(image));
        } catch (IOException ex) {
            Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(this.imagePath);
        this.setLocationRelativeTo(null);
    }

    public void writeImage(BufferedImage image) throws IOException {
        File outputfile = new File(currentImagePath);
        ImageIO.write(image, "png", outputfile);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filterButtonGroup = new javax.swing.ButtonGroup();
        imageBoxThirdScreen = new javax.swing.JLabel();
        declineFilter = new javax.swing.JRadioButton();
        acceptFilter = new javax.swing.JRadioButton();
        FilterCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        filterButtonGroup.add(declineFilter);
        declineFilter.setText("Filtreleme uygulamak istemiyorum");
        declineFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineFilterActionPerformed(evt);
            }
        });

        filterButtonGroup.add(acceptFilter);
        acceptFilter.setText("Filtreleme uygulamak istiyorum");

        FilterCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtreleme İşlemleri", "(a) Bulanıklaştırma filtresi", "(b) Keskinleştirme filtresi", "(c) Ortanca filtresi", "(d) Laplace filtresi", "(e) Kenar bulma filtresi" }));
        FilterCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(declineFilter)
                    .addComponent(acceptFilter)
                    .addComponent(FilterCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(imageBoxThirdScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageBoxThirdScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(acceptFilter)
                .addGap(18, 18, 18)
                .addComponent(declineFilter)
                .addGap(49, 49, 49)
                .addComponent(FilterCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // imageBoxThirdScreen.setIcon(new ImageIcon(sharpenImage(this.imagePath)));
        //BufferedImage image = blurImage("C:\\Users\\alian\\Desktop\\b.png");    // TODO add your handling code here:
        // imageBoxThirdScreen.setIcon(new ImageIcon(blurImage("C:\\Users\\alian\\Desktop\\b.png")));
        //MyImage myImage = new MyImage(800, 600);
        // myImage.readImage("C:\\Users\\alian\\Desktop\\b.png");
        // myImage = Median.medianFilter(myImage, 3);
        //  imageBoxThirdScreen.setIcon(new ImageIcon(myImage.getImage()));
        //   BufferedImage edgeOutput = EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskLaplacian);
        //     imageBoxThirdScreen.setIcon(new ImageIcon(edgeOutput));
        // try {
        //     BufferedImage image = ImageIO.read(
        //             new File("C:\\Users\\alian\\Desktop\\a.png"));
        //       imageBoxThirdScreen.setIcon(new ImageIcon(EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskSobelX)));
        //   } catch (IOException ex) {
        //       Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
        //   }
        //ImageIcon icon = new ImageIcon(imagePath);
        //imageBoxThirdScreen.setIcon(new ImageIcon(icon.getImage().getScaledInstance(imageBoxThirdScreen.getWidth(), imageBoxThirdScreen.getHeight(), Image.SCALE_DEFAULT)));


    }//GEN-LAST:event_formWindowOpened

    private void FilterComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterComboboxActionPerformed
        System.out.println("Tetiklendi" + FilterCombobox.getSelectedIndex() + "");

        if (FilterCombobox.getSelectedIndex() == 1) {
            imageBoxThirdScreen.setIcon(new ImageIcon(blurImage(this.imagePath)));
            try {
                writeImage(blurImage(this.imagePath));
            } catch (IOException ex) {
                Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (FilterCombobox.getSelectedIndex() == 2) {
            BufferedImage image = sharpenImage(this.imagePath);    // TODO add your handling code here:
            imageBoxThirdScreen.setIcon(new ImageIcon(image));
            try {
                writeImage(image);
            } catch (IOException ex) {
                Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (FilterCombobox.getSelectedIndex() == 3) {
            MyImage myImage = new MyImage(800, 600);
            myImage.readImage(imagePath);
            myImage = Median.medianFilter(myImage, 3);
            imageBoxThirdScreen.setIcon(new ImageIcon(myImage.getImage()));
            try {
                writeImage(myImage.getImage());
            } catch (IOException ex) {
                Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (FilterCombobox.getSelectedIndex() == 4) {
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                imageBoxThirdScreen.setIcon(new ImageIcon(EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskLaplacian)));
                writeImage(EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskLaplacian));
            } catch (IOException ex) {
                Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (FilterCombobox.getSelectedIndex() == 5) {
            try {
                BufferedImage image = ImageIO.read(new File(imagePath));
                imageBoxThirdScreen.setIcon(new ImageIcon(EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskSobelX)));
                writeImage(EdgeDetection.applyEdgeDetection(image, EdgeDetection.maskSobelX));
            } catch (IOException ex) {
                Logger.getLogger(FilterScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_FilterComboboxActionPerformed

    private void declineFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declineFilterActionPerformed

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
            java.util.logging.Logger.getLogger(FilterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilterScreen("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FilterCombobox;
    private javax.swing.JRadioButton acceptFilter;
    private javax.swing.JRadioButton declineFilter;
    private javax.swing.ButtonGroup filterButtonGroup;
    private javax.swing.JLabel imageBoxThirdScreen;
    // End of variables declaration//GEN-END:variables

    public BufferedImage blurImage(String imagePath) {
        ImageObserver myImageObserver = new ImageObserver() {

            public boolean imageUpdate(Image image, int flags, int x, int y, int width, int height) {

                if ((flags & ALLBITS) != 0) {

                    imageLoaded = true;

                    System.out.println("Image loading finished!");

                    return false;

                }

                return true;

            }

        };

        // The image URL - change to where your image file is located!
        String imageURL = imagePath;

        /**
         *
         * This call returns immediately and pixels are loaded in the background
         *
         * We use an ImageObserver to be notified when the loading of the image
         *
         * is complete
         *
         */
        Image sourceImage = Toolkit.getDefaultToolkit().getImage(imageURL);

        sourceImage.getWidth(myImageObserver);

        // We wait until the image is fully loaded
        while (!imageLoaded) {

            try {

                Thread.sleep(100);

            } catch (InterruptedException e) {

            }

        }

        // Create a buffered image from the source image with a format that's compatible with the screen
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();

        GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();

        // If the source image has no alpha info use Transparency.OPAQUE instead
        image = graphicsConfiguration.createCompatibleImage(sourceImage.getWidth(null), sourceImage.getHeight(null), Transparency.BITMASK);

        // Copy image to buffered image
        Graphics graphics = image.createGraphics();

        // Paint the image onto the buffered image
        graphics.drawImage(sourceImage, 0, 0, null);

        graphics.dispose();

        // A 3x3 kernel that blurs an image
        Kernel kernel = new Kernel(3, 3,
                new float[]{
                    1f / 9f, 1f / 9f, 1f / 9f,
                    1f / 9f, 1f / 9f, 1f / 9f,
                    1f / 9f, 1f / 9f, 1f / 9f});

        BufferedImageOp op = new ConvolveOp(kernel);

        image = op.filter(image, null);

        // Create frame with specific title
        return image;
    }

    public BufferedImage sharpenImage(String imagePath) {
        ImageObserver myImageObserver = new ImageObserver() {

            @Override
            public boolean imageUpdate(Image image, int flags, int x, int y, int width, int height) {

                if ((flags & ALLBITS) != 0) {

                    imageLoaded = true;

                    System.out.println("Image loading finished!");

                    return false;

                }

                return true;

            }
        };

        // The image URL - change to where your image file is located!
        String imageURL = imagePath;

        /**
         *
         * This call returns immediately and pixels are loaded in the background
         *
         * We use an ImageObserver to be notified when the loading of the image
         *
         * is complete
         *
         */
        Image sourceImage = Toolkit.getDefaultToolkit().getImage(imageURL);

        sourceImage.getWidth(myImageObserver);

        // We wait until the image is fully loaded
        while (!imageLoaded) {

            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
            }

        }

        // Create a buffered image from the source image with a format that's compatible with the screen
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();

        GraphicsDevice graphicsDevice = graphicsEnvironment.getDefaultScreenDevice();

        GraphicsConfiguration graphicsConfiguration = graphicsDevice.getDefaultConfiguration();

        // If the source image has no alpha info use Transparency.OPAQUE instead
        image = graphicsConfiguration.createCompatibleImage(sourceImage.getWidth(null), sourceImage.getHeight(null), Transparency.BITMASK);

        // Copy image to buffered image
        Graphics graphics = image.createGraphics();

        // Paint the image onto the buffered image
        graphics.drawImage(sourceImage, 0, 0, null);

        graphics.dispose();

        // A 3x3 kernel that sharpens an image
        Kernel kernel = new Kernel(3, 3,
                new float[]{
                    -1, -1, -1,
                    -1, 9, -1,
                    -1, -1, -1});

        BufferedImageOp op = new ConvolveOp(kernel);

        image = op.filter(image, null);

        return image;
    }
}
