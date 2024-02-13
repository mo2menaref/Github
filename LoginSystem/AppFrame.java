import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame implements ActionListener{
    //Intialize objects and variables
    JLabel login_l,signup_l,wel,username,pass_l,age,id,gen,repass,alert;
    JButton login_b,signup_b,confirm,confirm1,back;
    JTextField user_t,age_t,id_t;
    JPasswordField pass_t,repas;
    JComboBox<String>gender;
    HashMap<String,String> login = new HashMap <String,String>();
    ArrayList<String> arr=new ArrayList<String>();
    public String users;
    public String passs;
    
    public AppFrame(HashMap<String,String> logininfo){
        //The start of Frame project
        login=logininfo;
        setTitle("Data System");
        setSize(500,300);
        setResizable(false);
        setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    //The first Page Objects
    login_b =new JButton("Login");
    signup_b=new JButton("SignUp");
    login_l =new JLabel("Have an account");
    signup_l=new JLabel("New Here");
    add(login_b);
    add(signup_b);
    signup_b.addActionListener(this);
    login_b.addActionListener(this);
    //Sign up ,Login and Welcome Pages
    wel     =new JLabel("Welcome!");
    back=new JButton("<--");
    username=new JLabel("UserName");
    pass_l=  new JLabel("Password");
    repass= new JLabel ("Re-write Pass");
    String Gen[]={"Choose....","Male","Female"};
    gender=new JComboBox<String>(Gen);    
    gender.setEditable(false);
    back.addActionListener(this);
    
    age=     new JLabel("Age");
    id=      new JLabel("ID");
    gen=     new JLabel("Gender");
    alert=   new JLabel();
    confirm= new JButton("Confirm");
    confirm1=new JButton("Confirm");
    
    add(login_l);
    add(signup_l);
    add(wel);
    wel.setFont(new Font("Arial", Font.PLAIN, 40));
    //Text/PasswordField of Login and Signup page
    user_t =new JTextField(2);
    pass_t =new JPasswordField(2);
    repas =new JPasswordField(2);
    age_t = new JTextField(2);
    id_t= new JTextField(2);
    
    wel.setBounds(150,20,300,30);
    login_b.setBounds(125,70,100,30);
    login_l.setBounds(290,70,100,30);
    signup_b.setBounds(125,110,100,30);
    signup_l.setBounds(290,110,100,30);
    
}
@Override
public void actionPerformed(ActionEvent a) {
    if(a.getSource()==signup_b){
        wel.setVisible(false);
        login_b.setVisible(false);
        login_l.setVisible(false);
        signup_b.setVisible(false);
        signup_l.setVisible(false);
        confirm1.setVisible(true);
        username.setVisible(true);
        user_t.setVisible(true);
        pass_t.setVisible(true);
        pass_l.setVisible(true);
        repas.setVisible(true);
        repass.setVisible(true);
        age.setVisible(true);
        age_t.setVisible(true);
        gender.setVisible(true);
        gen.setVisible(true);
        id.setVisible(true);
        id_t.setVisible(true);
        user_t.setText("");
        pass_t.setText("");
        repas.setText("");
        age_t.setText("");
        id_t.setText("");
        add(username);
        username.setBounds(100,20,100,20);
        add(user_t);
        user_t.setBounds(210,22,100,20);
        add(gen);
        gen.setBounds(100, 45, 100, 20);
        add(gender);
        gender.setBounds(210,45,100,20);
        add(age);
        age.setBounds(100, 75, 50,20);
        add(age_t);
        age_t.setBounds(210, 75, 100,20);
        add(id);
        id.setBounds(100, 100, 50,20);
        add(id_t);
        id_t.setBounds(210, 102, 100,20);
        add(pass_l);
        pass_l.setBounds(100, 125, 100,20);
        add(pass_t);
        pass_t.setBounds(210, 127, 100,20);
        add(repass);
        repass.setBounds(100,150,100,20);
        add(repas);
        repas.setBounds(210,152,100,20);
        add(confirm1);
        confirm1.setBounds(160,200,150,50);
            
    confirm1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent a) {
            if(a.getSource()==confirm1){
                users= user_t.getText();
                passs= String.valueOf(pass_t.getPassword());
                arr.add(login.put(users,passs));
                        
                wel.setVisible(true);
                login_b.setVisible(true);
                signup_b.setVisible(true);
                confirm1.setVisible(false);
                username.setVisible(false);
                user_t.setVisible(false);
                pass_t.setVisible(false);
                pass_l.setVisible(false);
                repas.setVisible(false);
                repass.setVisible(false);
                age.setVisible(false);
                age_t.setVisible(false);
                gender.setVisible(false);
                gen.setVisible(false);
                id.setVisible(false);
                id_t.setVisible(false);
            }
        }
    });
}
//End of Signup Condition
        if(a.getSource()==login_b){
        wel.setVisible(false);
        login_b.setVisible(false);
        login_l.setVisible(false);
        signup_b.setVisible(false);
        signup_l.setVisible(false);
        back.setVisible(false);
        confirm.setVisible(true);
        username.setVisible(true);
        user_t.setVisible(true);
        pass_l.setVisible(true);
        pass_t.setVisible(true);
        user_t.setText("");
        pass_t.setText("");
        
        add(confirm);
        confirm.setBounds(160,150,150,50);
        add(username);
        username.setBounds(100,40,100,20);
        add(user_t);
        user_t.setBounds(210,42,100,20);
        add(pass_l);
        pass_l.setBounds(100,90,100,20);
        add(pass_t);
        pass_t.setBounds(210,92,100,20);
        
        confirm.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent a) {
if(a.getSource()==confirm){
    login.put(users,passs);
    String userl= user_t.getText();
    String passl= String.valueOf(pass_t.getPassword());
    alert.setVisible(true);
                    
    if(login.containsKey(userl)){
        if(login.get(userl).equals(passl)){
            wel.setVisible(true);
            confirm.setVisible(false);
            username.setVisible(false);
            user_t.setVisible(false);
            pass_t.setVisible(false);
            pass_l.setVisible(false);
            alert.setVisible(false);
            add(back);
            back.setBounds(20,20,60,30);
            back.setVisible(true);
            back.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent a) {
                    if(a.getSource()==back){
                        wel.setVisible(false);
                        login_b.setVisible(false);
                        login_l.setVisible(false);
                        signup_b.setVisible(false);
                        signup_l.setVisible(false);
                        back.setVisible(false);
                        confirm.setVisible(true);
                        username.setVisible(true);
                        user_t.setVisible(true);
                        pass_l.setVisible(true);
                        pass_t.setVisible(true);
                        user_t.setText("");
                        pass_t.setText("");
                    }
                }
                });
        }
        else{
            add(alert);
            alert.setText("Wrong Password");
            alert.setForeground(Color.red);
            alert.setBounds(200,110,100,20);
        }
    }
    else{
        add(alert);
        alert.setText("User Name Not Found");
        alert.setForeground(Color.red);
        alert.setBounds(200,110,150,20);
    }
    }
}
});
}
   //End of Login Condition
} //Action Listener
}//Public Class