
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class StopWatch {
    
    public static void main(String args[])
    {
        Mycounter obj=new Mycounter();
        obj.startThread();
    }
    
}

class Mycounter extends Frame implements Runnable
{
    Button btnstart,btnstop,btnreset;
    TextField txtmin,txtsec,txtms;
    Label lmin,lsec,lms;
    Thread t;
    int min=0,sec=0,ms=0;
    boolean flag1=false,flag2=false,flag3=false;
    int x=0;
    
    Mycounter()
    {
        t=new Thread(this);
        setLayout(null);
        setVisible(true);
        setSize(800,500);
        setBackground(Color.ORANGE);
        
        btnstart=new Button("Start");
        btnstart.setBounds(50, 300, 150, 50);
         btnstart.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
         btnstart.setBackground(Color.GREEN);
        add(btnstart);
        
        btnstop=new Button("Stop");
        btnstop.setBounds(250, 300, 150, 50);
        btnstop.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        btnstop.setBackground(Color.red);
        add(btnstop);
        
        btnreset=new Button("Reset");
       // btnreset.setLabel("xxx");
        btnreset.setBounds(450, 300, 150, 50);
        btnreset.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        btnreset.setBackground(Color.LIGHT_GRAY);
        add(btnreset);
        
        lmin=new Label("Minutes");
        lmin.setBounds(120, 100, 100, 50);
        lmin.setFont(new java.awt.Font("Palatino Linotype", 1, 15));
        add(lmin);
        
        txtmin=new TextField(String.valueOf(x)); 
        txtmin.setBounds(120, 150, 100, 50);
        txtmin.setFont(new java.awt.Font("Palatino Linotype", 1, 17));
        add(txtmin);
        
        lsec=new Label("Seconds");
        lsec.setBounds(270, 100, 100, 50);
         lsec.setFont(new java.awt.Font("Palatino Linotype", 1, 15));
        add(lsec);
        
        txtsec=new TextField(String.valueOf(x));       
        txtsec.setBounds(270, 150, 100, 50);
        txtsec.setFont(new java.awt.Font("Palatino Linotype", 1, 17));
        add(txtsec);
        
        lms=new Label("Miliseconds");
        lms.setBounds(420, 100, 100, 50);
         lms.setFont(new java.awt.Font("Palatino Linotype", 1, 15));
        add(lms);
        
        txtms=new TextField(String.valueOf(x));       
        txtms.setBounds(420, 150, 100, 50);
        txtms.setFont(new java.awt.Font("Palatino Linotype", 1, 17));
        add(txtms);
        
        Mylistener1 obj1=new Mylistener1(this);
        Mylistener2 obj2=new Mylistener2(this);
        Mylistener3 obj3=new Mylistener3(this);
        btnstart.addActionListener(obj1);
        btnstop.addActionListener(obj2);
        btnreset.addActionListener(obj3);
        
        MyWindowListner8 var=new MyWindowListner8(this);
        addWindowListener(var);
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
        
        while(true)
        {
           
           if(flag2)
           {
               break;
           }
           else if(flag3)
           {
               min=sec=ms=0;
               txtmin.setText(String.valueOf(min));
               txtsec.setText(String.valueOf(sec));
               txtms.setText(String.valueOf(ms));
               break;
           }
           else if(flag1)
           {
               if(ms==10)
               {
                   ms=0;
                   sec+=1;
               }
               if(sec==60)
               {
                   sec=0;
                   min+=1;
               }
               try
               {
                   Thread.sleep(100);
               }
               catch(InterruptedException e)
               {
                   
               }
               txtmin.setText(String.valueOf(min));
               txtsec.setText(String.valueOf(sec));
               txtms.setText(String.valueOf(ms));
               ms+=1;
            }
           else 
           {
               break;
           }
        }
           
            
            
    }
    
    
}

class Mylistener1 implements ActionListener
{
    Mycounter ref;

    public Mylistener1(Mycounter x) {
        ref=x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       /*ref.flag=!ref.flag;
       ref.t=new Thread(ref);
       ref.startThread();*/
        
        String name;
        if(!ref.flag1)
        {
        ref.flag1=true;
        ref.flag2=ref.flag3=false;
        ref.t=new Thread(ref);
        ref.startThread();
        }
        
    }
}


class Mylistener2 implements ActionListener
{
    Mycounter ref;

    public Mylistener2(Mycounter x) {
        ref=x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       /*ref.flag=!ref.flag;
       ref.t=new Thread(ref);
       ref.startThread();*/
        
        ref.flag2=true;
        ref.flag1=ref.flag3=false;
        ref.t=new Thread(ref);
        ref.startThread();
       
    }
}


class Mylistener3 implements ActionListener
{
    Mycounter ref;

    public Mylistener3(Mycounter x) {
        ref=x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       /*ref.flag=!ref.flag;
       ref.t=new Thread(ref);
       ref.startThread();*/
        
         ref.flag3=true;
        ref.flag1=ref.flag2=false;
        ref.t=new Thread(ref);
        ref.startThread();
        
    }
}
class MyWindowListner8 implements WindowListener
{
    Mycounter ref;
    @Override
    public void windowClosing(WindowEvent e)
    {
        ref.flag1=ref.flag2=ref.flag3=false;
        ref.dispose();
       // ref.setVisible(false);
    }
    MyWindowListner8(Mycounter x)
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
 
