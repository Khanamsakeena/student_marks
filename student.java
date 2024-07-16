import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student {
    private JTextField txtStname;
    private JButton calculateButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;
    private JTextField txtAverage;
    private JTextField txtGrade;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("student");
        frame.setContentPane(new student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3,tot;
                double Average;

                m1=Integer.parseInt(txtMarks1.getText());
                m2=Integer.parseInt(txtMarks2.getText());
                m3=Integer.parseInt(txtMarks3.getText());



                tot=m1+m2+m3;
                txtTotal.setText(String.valueOf(tot));
                Average=tot/3;
                txtAverage.setText(String.valueOf(Average));


                if(Average>50)
                {
                    txtGrade.setText("Pass");
                }
                else
                {
                    txtGrade.setText("Fail");
                }
            }
        });
    }
}
