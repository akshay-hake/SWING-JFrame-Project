/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.awt.*;
import java.awt.event.*;

class Myframes extends Frame implements Runnable
{
    String msg="Hello";
    int x=50,y=70,xc=50;
    boolean flag=true;
    Thread t;
    Myframes()
    {
        t=new Thread(this);
        setVisible(true);
        setSize(500,500);
        setTitle("MyApp");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        MyWindowListner obj=new MyWindowListner(this);
        addWindowListener(obj);
        MyMouseListener var=new MyMouseListener(this);
        addMouseListener(var);
        MyKeyListener o1=new MyKeyListener(this);
        addKeyListener(o1);
        MyMouseWheelListener o2=new MyMouseWheelListener(this);
        addMouseWheelListener(o2);
    }
    
    @Override
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
       // g.drawString(msg, x, y);
       /* g.draw3DRect(100, 100, 100, 100, false);
        g.fill3DRect(100, 100, 100, 100, true);
         g.setColor(Color.MAGENTA);*/
        g.drawOval(xc, 50, 50, 50);
      //  g.fillOval(300, 300, 300, 300);
        
    }
    void startThread()
    {
        if(flag==true)
        t.start();
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while(flag)
        {
            if(xc==getWidth())
            {
                xc=-30;
            }
            xc=xc+1;
            try
            {
                Thread.sleep(5);
            }
            catch(InterruptedException e)
            {
                
            }
            repaint();
        }
    }
        
        
        
}

class MyWindowListner implements WindowListener
{
    Myframes ref;
    @Override
    public void windowClosing(WindowEvent e)
    {
       
        ref.dispose();
       // ref.setVisible(false);
    }
    MyWindowListner(Myframes x)
    {
        ref=x;
    }

    @Override
    public void windowOpened(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 
class MyMouseListener implements MouseListener
{
    Myframes var;
    MyMouseListener(Myframes x)
    {
        var=x;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       var.msg="Mouse Clicked";
       var.x=e.getX();
       var.y=e.getY();
       var.flag=!var.flag;
       var.repaint();
       var.t=new Thread(var);
       var.startThread();
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       var.msg="Mouse Pressed"; 
       var.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var.msg="Mouse Released";
        var.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var.msg="Mouse Entered";
        var.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        var.msg="Mouse Exited";
        var.repaint();
    }
    
}
class MyKeyListener implements KeyListener
{
    Myframes ref;

    public MyKeyListener(Myframes x) {
        ref=x;
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ref.msg="Key pressed";
       char ch= e.getKeyChar();
       ref.msg=String.valueOf(ch);
        ref.repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class MyMouseWheelListener implements MouseWheelListener
{
    Myframes ref;

    public MyMouseWheelListener(Myframes x) {
        ref=x;
    }
    
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ref.msg="wheeeeeeel";
        ref.repaint();
    }
    
}
public class FrameApp {
    
    public static void main(String args[])
    {
        Myframes obj=new Myframes();
        obj.startThread();
    }
    
}

