/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_Figura;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Sebastian
 */
public class Romboide extends Regular {

    @Override
    public void dibujar(GraphicsContext lienzo) {
        lienzo.setStroke(Color.valueOf("#75FFA1"));
        x1=370;
        x2=250;
        int x=370;
        int y=250;
        
        for (int j = 0; j < 190; j++) {
            x1=x;
            x2=y;
            for (int i = 0; i < 70; i++) {
            lienzo.strokeLine(x1-i,x2+i, x1-i, x2+i);
            }
            x+=1;
        }
        
        lienzo.setStroke(Color.valueOf("#0F3D1D"));
        lienzo.setLineWidth(3.0);
        lienzo.strokeLine(370,250, 560, 250);
        lienzo.strokeLine(370,250, 300,320);
        
        lienzo.strokeLine(300,320, 490, 320);
        lienzo.strokeLine(490,320, 560, 250);
        
    }
    
}
