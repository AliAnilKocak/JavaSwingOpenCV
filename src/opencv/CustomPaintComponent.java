/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static opencv.BufferedImageBlur.image;

/**
 *
 * @author alian
 */
 class CustomPaintComponent extends Component {

    public void paint(Graphics g) {

// Retrieve the graphics context; this object is used to paint
// shapes
        Graphics2D g2d = (Graphics2D) g;

        /**
         *
         * Draw an Image object The coordinate system of a graphics context
         *
         * is such that the origin is at the northwest corner and x-axis
         *
         * increases toward the right while the y-axis increases toward the
         *
         * bottom.
         *
         */
        int x = 0;

        int y = 0;

        g2d.drawImage(image, x, y, this);

    }

}
