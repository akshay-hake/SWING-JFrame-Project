
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

class Myframe2 extends Frame implements Runnable
{
    Button btnclick;
    Label lbltxt;
    Thread t;
    boolean flag=false;
    int xc=50;
    
    Myframe2()
    {
        t=new Thread(this);
        setLayout(null);
        setVisible(true);
         setSize(500,500);
        setTitle("MyApp");
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
        
        MyWindowListner1 var=new MyWindowListner1(this);
        addWindowListener(var);
        
        btnclick=new Button("CLICK");
        btnclick.setBounds(50, 220, 80, 60);
        
        add(btnclick);
        
        
        
        lbltxt=new Label("Hello");
        lbltxt.setBounds(50, 100, 100, 50);
        
        add(lbltxt);
        
        MyListener obj=new MyListener(this);
        btnclick.addActionListener(obj);
        
        
    }
    
    @Override
    public void paint(Graphics g)
    {
       // g.setColor(Color.red);
       // g.drawString(msg, x, y);
       /* g.draw3DRect(100, 100, 100, 100, false);
        g.fill3DRect(100, 100, 100, 100, true);
         g.setColor(Color.MAGENTA);*/
       // g.drawOval(xc, 50, 500, 50);
       // g.fillOval(xc, 50, 500, 50);
        
    }
    
    void startThread()
    {
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

class MyListener implements ActionListener
{
    Myframe2 ref;

    public MyListener(Myframe2 x) {
        ref=x;
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       ref.lbltxt.setText("Button Clicked");
        
       // ref.flag=!ref.flag;
       // ref.t=new Thread(ref);
       // ref.startThread();
        
        
    }
    
}

class MyWindowListner1 implements WindowListener
{
    Myframe2 ref;
    @Override
    public void windowClosing(WindowEvent e)
    {
       
        ref.dispose();
       // ref.setVisible(false);
    }
    MyWindowListner1(Myframe2 x)
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
 
public class ButtonProg {
    
    public static void main(String args[])
    {
        Myframe2 obj =new Myframe2();
      //  obj.startThread();
    }
    
}
