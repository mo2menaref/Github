import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame implements ActionListener {
    JPanel p1, p2, p3, p4, p5, p6, p7;
    JLabel l1, l2, l3, l4, l5,l6;
    TextField s1,s2,s3;
    JButton b1;
    JComboBox<String> c1;
    Circle cir1=new Circle();
    Square squ1=new Square();
    Rectangle rec1 =new Rectangle();   
////////////////////////////////////////////////////////////
    public Frame(){
        setTitle("Geometric Calculator");
        setSize(700,400);
        setResizable(false);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String Geo[]={"Choose The Geometric....","Rectangle","Square","Circle"};
        c1=new JComboBox<String>(Geo);    
        c1.setEditable(false);
        //////////////////////////////////////////////////

         b1 =new JButton("Calculate & Display");
    
         l1 =new JLabel("The Geometric");
         l2 =new JLabel("The Width");
         l3 =new JLabel("The Height");
         l4 =new JLabel("The Radius");
         l5 =new JLabel("The Area is:-");
         l6 =new JLabel("The Perimeter is:-");
         
         s1=new TextField(2);
         s2=new TextField(2);
         s3=new TextField(2);

         p1=new JPanel();
         p2=new JPanel();
         p3=new JPanel();
         p4=new JPanel();
         p5=new JPanel();
         p6=new JPanel();
         p7=new JPanel();
        ////////////////////////////////////////////////

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);

        add(b1);
        
        add(s1);
        add(s2);
        add(s3);

        add(c1);
        ///////////////////////////////////////////////
        b1.addActionListener(this);

        s1.addActionListener(this);
        s2.addActionListener(this);
        s3.addActionListener(this);
        
        c1.addActionListener(this);
        ///////////////////////////////////////////////
        b1.setBounds(420,40,200,50);

        l1.setBounds(20,20,100,25);
        l2.setBounds(20,100,100,25);
        l3.setBounds(20,180,100,25);
        l4.setBounds(20,260,100,25);
        l5.setBounds(420,100,250,25);
        l6.setBounds(420,180,250,25);
        
        s1.setBounds(20,135,200,25);
        s2.setBounds(20,215,200,25);
        s3.setBounds(20,295,200,25);
        
        c1.setBounds(20,50,200,40);

        p1.setBounds(20,20,100,25);
        p2.setBounds(20,100,75,25);
        p3.setBounds(20,180,75,25);
        p4.setBounds(20,260,75,25);
        p5.setBounds(420,100,250,25);
        p6.setBounds(420,180,250,25);
        p7.setBounds(0,0,700,400);

        ////////////////////////////////////////////////
        p1.setBackground(Color.red);
        p2.setBackground(Color.red);
        p3.setBackground(Color.red);
        p4.setBackground(Color.red);
        p5.setBackground(Color.red);
        p6.setBackground(Color.red);
        p7.setBackground(Color.black);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);

    }
    @Override
    public void actionPerformed(ActionEvent a) {

if(c1.getItemAt(c1.getSelectedIndex())=="Circle"){
    String ob1;
    ob1=s3.getText();
    double res =Double.parseDouble(ob1);
    cir1.setRadius(res);
    cir1.getRadius();
    if(a.getSource()==b1){
        
        l5.setText("The Area is: " + cir1.getarea());
        l6.setText("The Perimeter is: " + cir1.getpre());
    }
}
/////////////////////////////////////////////////////////
if(c1.getItemAt(c1.getSelectedIndex())=="Rectangle"){
    String ob2,ob3;
    ob2=s1.getText();
    ob3=s2.getText();

    double res1 =Double.parseDouble(ob2);
    double res2 =Double.parseDouble(ob3);

    rec1.setheight(res1);
    rec1.setwidth(res2);
    rec1.getheight();
    rec1.getwidth();
    if(rec1.getheight()!=rec1.getwidth()&&rec1.getwidth()>0&&rec1.getheight()>0){

        if(a.getSource()==b1){
            
            l5.setText("The Area is: " + rec1.getarea());
            l6.setText("The Perimeter is: " + rec1.getpre());
        }
    }
    else{
        if(a.getSource()==b1){
            
            l5.setText("Not Rectangle");
            l6.setText("Not Rectangle");
        }
    }

}
//////////////////////////////////////////////////
if(c1.getItemAt(c1.getSelectedIndex())=="Square"){
    String ob2,ob3;
    ob2=s1.getText();
    ob3=s2.getText();

    double res1 =Double.parseDouble(ob2);
    double res2 =Double.parseDouble(ob3);

    squ1.setheight(res1);
    squ1.setwidth(res2);
    squ1.getheight();
    squ1.getwidth();

    if(squ1.getheight()==squ1.getwidth()){
        if(a.getSource()==b1){
            
            l5.setText("The Area is: " + squ1.getarea());
            l6.setText("The Perimeter is: " + squ1.getpre());
        }
    }
        else{
        if(a.getSource()==b1){
            l5.setText("Not Square");
            l6.setText("Not Square");
    }
}
    }
}
}