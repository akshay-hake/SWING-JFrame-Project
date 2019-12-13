
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Counter {
    
    public static void main(String args[])
    {
        MyCounter obj=new MyCounter();
        obj.startThread();
    }
    
}

class MyCounter extends Frame implements Runnable
{
    Button btnstart;
    TextField time;
    Thread t;
    boolean flag=false;
    int x=0;
    
    MyCounter()
    {
        t=new Thread(this);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        
        btnstart=new Button("Start/Stop");
        btnstart.setBounds(50, 100, 50, 50);
        add(btnstart);
        
        time=new TextField(String.valueOf(x));       
        time.setBounds(50, 50, 50, 50);
        add(time);
        
        Mylistener obj=new Mylistener(this);
        btnstart.addActionListener(obj);
    }
    
    
    void startThread()
    {
        t.start();
    }
    @Override
    public void run() {
        
        while(flag)
        {
           
            time.setText(String.valueOf(x));
             x+=1;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                
            }
            
            
        }
    
    }
}

class Mylistener implements ActionListener
{
    MyCounter ref;

    public Mylistener(MyCounter x) {
        ref=x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       ref.flag=!ref.flag;
       ref.t=new Thread(ref);
       ref.startThread();
    }
}
