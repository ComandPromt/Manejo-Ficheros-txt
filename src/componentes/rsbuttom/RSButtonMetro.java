/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.rsbuttom;

/**
 *
 * @author Rojeru San
 */
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
* @author Rojeru San
 * @author Mouse
 */
public class RSButtonMetro extends JButton implements MouseListener, MouseMotionListener {

    /**
     * Icono por el boton
     */
//    private Icon icono = new ImageIcon(getClass().getResource("/jc/Bolivia/ModernUI/Resources/pc_mui8.png"));
//    ImageIcon imagenIcon = (ImageIcon) icono;
//    private Image image = imagenIcon.getImage();
//    private Image image_default = image;
    /**
     * Color para el fondo del boton
     */
    private Color colorPressed = new Color(0, 0, 0);
    private Color button_released = new Color(0, 139, 139);
    
    private Border bordeMoved = javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255));
    /**
     * Color para el texto
     */
    private Color texto_released = new Color(255, 255, 255);
    private Color colorTextPressed = new Color(255, 255, 255);
    
    private Font f = new Font("Tahoma", Font.BOLD, 14);

    /**
     * Constructor de clase
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public RSButtonMetro() {
        this.setFont(f);
        this.setPreferredSize(new Dimension(150, 35));
        this.setSize(new Dimension(150, 35));
        this.setBorder(null);
//        this.setBorderPainted(false);
        this.setContentAreaFilled(false);
        this.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setBackground(this.button_released);
        this.setForeground(this.texto_released);
        this.setOpaque(true);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    /**
     * se pinta la imagen con dimensiones de ancho y alto iguales al alto del
     * jbutton
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawImage(image,  getWidth() - this.getHeight(), 0 , this.getHeight() , this.getHeight() , this);
    }

    /**
     * Se sobreescribe el metodo SETICON para utilizar el mismo metodo para
     * colocar el icono
     */
//    @Override
//    public void setIcon(Icon icon)
//    {
//        if( icon != null )
//        {
//            this.icono = icon;
//            imagenIcon = (ImageIcon) icono;
//            this.image = imagenIcon.getImage();
//        }
//        else
//        {
//            this.image = this.image_default;
//        }
//        this.repaint();
//    }
    public void mouseClicked(MouseEvent e) {
    }

    /**
     * Cuando se presiona el boton se cambian los colores de fondo y de texto
     */
    public void mousePressed(MouseEvent e) {
        //capturamos valores iniciales
        this.button_released = this.getBackground();
        this.texto_released = this.getForeground();
        //se colocan los nuevos colores
        this.setForeground(this.colorTextPressed);
        this.setBackground(this.colorPressed);
    }

    /**
     * Cuando se leventa el mouse del jbutton se retoman los colores originales
     */
    public void mouseReleased(MouseEvent e) {
        this.setBackground(this.button_released);
        this.setForeground(this.texto_released);
    }

    public void mouseEntered(MouseEvent e) {
//        this.button_released = this.getBackground();
//        this.texto_released = this.getForeground();
//        //se colocan los nuevos colores
//        this.setForeground(this.texto_pressed);
//        this.setBackground(this.button_entered);
    }

    public void mouseExited(MouseEvent e) {
        this.setBorder(null);
//        this.setBackground(this.button_released);
//        this.setForeground(this.texto_released);
    }

    public Color getColorPressed() {
        return colorPressed;
    }

    public void setColorPressed(Color colorPressed) {
        this.colorPressed = colorPressed;
    }

    public Color getColorTextPressed() {
        return colorTextPressed;
    }

    public void setColorTextPressed(Color colorTextPressed) {
        this.colorTextPressed = colorTextPressed;
    }
    
    public Border getColorBorde() {
        return bordeMoved;
    }

    public void setColorBorde(Border bordeMoved) {
        this.bordeMoved = bordeMoved;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.setBorder(bordeMoved);
    }
}
