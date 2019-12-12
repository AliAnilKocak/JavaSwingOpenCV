package image;

/**
 *
 * @author alian
 */

public class Erosion {

    public static MyImage binaryImage(MyImage img, boolean erodeForegroundPixel) {
        int width = img.getImageWidth();
        int height = img.getImageHeight();
        int output[] = new int[width * height];
        int targetValue = (erodeForegroundPixel == true) ? 0 : 255;
        int reverseValue = (targetValue == 255) ? 0 : 255;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (img.getRed(x, y) == targetValue) {
                    boolean flag = false;
                    for (int ty = y - 1; ty <= y + 1 && flag == false; ty++) {
                        for (int tx = x - 1; tx <= x + 1 && flag == false; tx++) {
                            if (ty >= 0 && ty < height && tx >= 0 && tx < width) {
                                if (img.getRed(tx, ty) != targetValue) {
                                    flag = true;
                                    output[x + y * width] = reverseValue;
                                }
                            }
                        }
                    }
                    if (flag == false) {
                        output[x + y * width] = targetValue;
                    }
                } else {
                    output[x + y * width] = reverseValue;
                }
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int v = output[x + y * width];
                img.setPixel(x, y, 255, v, v, v);
            }
        }
        return img;
    }

}
