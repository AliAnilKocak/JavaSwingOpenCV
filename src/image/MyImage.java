package image;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;

public class MyImage {

    private BufferedImage image;
    private int width, height;
    private int pixels[];
    private int totalPixels;

    private enum ImageType {
        JPG, PNG
    };

    private ImageType imgType;

    public MyImage() {
    }

    public static int getPixelValueFromARGBValue(int a, int r, int g, int b) {
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    public MyImage(int width, int height) {
        this.width = width;
        this.height = height;
        this.totalPixels = this.width * this.height;
        this.pixels = new int[this.totalPixels];
        image = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_ARGB);
        this.imgType = ImageType.PNG;
        initPixelArray();
    }

    public MyImage(MyImage img) {
        this.width = img.getImageWidth();
        this.height = img.getImageHeight();
        this.totalPixels = this.width * this.height;
        this.pixels = new int[this.totalPixels];

        this.imgType = img.imgType;
        if (this.imgType == ImageType.PNG) {
            this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        } else {
            this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        }

        //copy original image pixels value to new image and pixels array
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                this.image.setRGB(x, y, img.getPixel(x, y));
                this.pixels[x + y * this.width] = img.getPixel(x, y);
            }
        }
    }

    public void readImage(String filePath) {
        try {
            File f = new File(filePath);
            image = ImageIO.read(f);
            String fileType = filePath.substring(filePath.lastIndexOf('.') + 1);
            if ("jpg".equals(fileType)) {
                imgType = ImageType.JPG;
            } else {
                imgType = ImageType.PNG;
            }
            this.width = image.getWidth();
            this.height = image.getHeight();
            this.totalPixels = this.width * this.height;
            this.pixels = new int[this.totalPixels];
            initPixelArray();
        } catch (IOException e) {
            System.out.println("Error Occurred!\n" + e);
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    private void initPixelArray() {
        PixelGrabber pg = new PixelGrabber(image, 0, 0, width, height, pixels, 0, width);
        try {
            pg.grabPixels();
        } catch (InterruptedException e) {
            System.out.println("Error Occurred: " + e);
        }
    }

    public int getImageWidth() {
        return width;
    }

    public int getImageHeight() {
        return height;
    }

    public int getImageTotalPixels() {
        return totalPixels;
    }

    public int getRed(int x, int y) {
        return (pixels[x + (y * width)] >> 16) & 0xFF;
    }

    public int getPixel(int x, int y) {
        return pixels[x + (y * width)];
    }

    public void setPixel(int x, int y, int alpha, int red, int green, int blue) {
        pixels[x + (y * width)] = (alpha << 24) | (red << 16) | (green << 8) | blue;
        updateImagePixelAt(x, y);
    }

    public void setPixelToValue(int x, int y, int pixelValue) {
        pixels[x + (y * width)] = pixelValue;
        updateImagePixelAt(x, y);
    }

    private void updateImagePixelAt(int x, int y) {
        image.setRGB(x, y, pixels[x + (y * width)]);
    }

}
