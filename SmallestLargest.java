import java.awt.event.*;
import javax.swing.*;
public class SmallestLargest extends JFrame implements ActionListener {
    JButton button;
    JTextField x,y,z;
    JLabel label1, label2;
    SmallestLargest() {
        x= new JTextField();
        x.setBounds(90, 50, 150, 30);
        add(x);

        y= new JTextField();
        y.setBounds(90, 80, 150, 30);
        add(y);
        
        z= new JTextField();
        z.setBounds(90, 110, 150, 30);
        add(z);

        label1= new JLabel("Smallest :");
        label1.setBounds(90, 140, 150, 30);
        add(label1);
        
        label2= new JLabel("Largest :");
        label2.setBounds(90, 160, 150, 30);
        add(label2);
        
        button= new JButton("Get ur Ans");
        button.setBounds(90, 250, 100, 30);
        add(button);
        
        button.addActionListener(this);
        setLayout(null);
        setSize(600, 400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int a= Integer.parseInt(x.getText());
        int b= Integer.parseInt(y.getText());
        int c= Integer.parseInt(z.getText());
        int largest= a, smallest= a;
        if(b > largest) {
            largest= b;
        }
        if(c > largest) {
            largest= c;
        }
        if(b < smallest) {
            smallest= b;
        }
        if(c < smallest) {
            smallest= c;
        }
        this.label1.setText("Smallest: "+smallest);
        this.label2.setText("Largest  : "+largest);
    }
    public static void main(String args[]) {
    	// TODO Auto-generated method stub
    	SmallestLargest project= new SmallestLargest();
    }
}