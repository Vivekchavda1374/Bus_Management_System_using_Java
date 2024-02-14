import java.awt.event.*;

import javax.swing.*;

class Bus1 extends JFrame {
    public JFrame jFrame;
    public JButton jButton;
   public JLabel lbl,jLabel1;
    public JTextField tf;
    private JButton seatCapacityButton;

    public Bus1(){

        jFrame =new JFrame("Bus Management System");
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setSize(1500,1000);
        JButton jButton= new JButton("Add Bus");
        jButton.setBounds(50,120,100,50);
        jLabel1.setVisible(true);
        JTextField tf1 = new JTextField();
        tf1.setBounds(200, 200, 50, 20);
        jFrame.add(tf1);
        JLabel  lbl1 = new JLabel();
        lbl1.setBounds(10,200,220,20);
        jFrame.add(lbl1);
        JTextField tf2 = new JTextField();
        tf1.setBounds(200, 220, 220, 20);
        jFrame.add(tf2);
        JLabel  lbl2 = new JLabel();
        lbl1.setBounds(10,220,220,20);
        jFrame.add(lbl2);
        tf1.setVisible(false);
        lbl1.setVisible(false);
        JLabel lbl3 = new JLabel();
        jFrame.add(lbl3);


        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("Bus name :");
                lbl1.setText("Enter The Bus name :");

                    tf1.setVisible(true);
                    lbl1.setVisible(true);

            }
        });

        JButton j1 = new JButton("Seat Capacity");
        j1.setBounds(150,120,120,50);
        jFrame.add(j1);
        JTextField tf = new JTextField();
        tf.setBounds(200, 170, 50, 20);
        jFrame.add(tf);
        JLabel  lbl = new JLabel();
        lbl.setBounds(10,170,30,20);
        jFrame.add(lbl);
        lbl.setVisible(false);
        tf.setVisible(false);
        j1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                tf.setText("Seat capacity");
                lbl.setText("Enter the Capacity of Seat");
                lbl.setVisible(true);
                tf.setVisible(true);
                tf1.setVisible(false);
                lbl1.setVisible(false);

            }
        });
        JButton j2 = new JButton("Book seat");
        j2.setBounds(270,120,120,50);
        jFrame.add(j2);
        JTextField textFieldf = new JTextField();
        tf.setBounds(200, 350, 300, 20);
        jFrame.add(textFieldf);
        lbl3 = new JLabel();
        lbl.setBounds(10,350,300,20);
        jFrame.add(lbl3);
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) Female");
        r1.setBounds(75, 250, 100, 30);
        r2.setBounds(75, 270, 100, 30);
        r1.setVisible(false);
        r2.setVisible(false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);


        j2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e3) {
                tf1.setText("Person name");
                lbl1.setText("Enter the Name of Person");
                tf1.setVisible(true);
                lbl1.setVisible(true);
                r1.setVisible(true);
                r2.setVisible(true);
                tf.setVisible(false);
                lbl.setVisible(false);
            }
        });



        JButton j3 = new JButton("Cancel seat");
        j3.setBounds(390,120,130,50);
        jFrame.add(j3);
//        JLabel  lbl4 = new JLabel();
//        lbl1.setBounds(10,200,220,20);
//        jFrame.add(lbl4);
//        JTextField tf4 = new JTextField();
//        tf4.setBounds(200, 220, 50, 20);
//        jFrame.add(tf4);
        j3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Cancel seat :");
                lbl.setText("Enter the Cancel seat number :");
                tf.setVisible(true);
                lbl.setVisible(true);
                tf1.setVisible(false);
                lbl1.setVisible(false);

            }
        });
 JButton j4 = new JButton("Source");
        j4.setBounds(520,120,100,50);
        jFrame.add(j4);
        j4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf1.setText("source name :");
                lbl1.setText("Enter the Sorce name :");
                tf1.setVisible(true);
                lbl1.setVisible(true);
                tf.setVisible(false);
                lbl.setVisible(false);

            }
        });
JButton j5 = new JButton("Destination");
        j5.setBounds(620,120,100,50);
        jFrame.add(j5);
        j5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Destination name  :");
                lbl.setText("Enter the Destination name  :");
                tf.setVisible(true);
                lbl.setVisible(true);
                tf1.setVisible(false);
                lbl1.setVisible(false);

            }
        });
        JButton j6 = new JButton("Ok");
        j6.setBounds(400,500,50,50);
        jFrame.add(j6);
        JLabel  lbl6 = new JLabel("Thank you for Visiting !!");
        lbl6.setBounds(300,550,500,20);
        jFrame.add(lbl6);
        JLabel j7 =new JLabel();

        j6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                j7.setIcon(new ImageIcon("C:\\Users\\Jolly InfoTech\\OneDrive\\Pictures\\smile.png"));
                j7.setBounds(400,550,225,225);
                jFrame.add(j7);

            }
        });
        JButton j8 = new JButton("Schedule");
        j8.setBounds(720,120,100,50);
        jFrame.add(j8);
        JLabel jLabel1 = new JLabel();
        jFrame.add(jLabel1);
        jLabel1.setBounds(900,120,200,50);
        jLabel1.setVisible(false);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel1.setText("Schedule :");
                jLabel1.setVisible(true);
                tf.setVisible(false);
                lbl.setVisible(false);
                tf1.setVisible(false);
                lbl1.setVisible(false);
            }
        });
        JLabel jLabel2 = new JLabel();
        jFrame.add(jLabel2);
        jLabel2.setBounds(950,220,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel2.setText(" Gondal to Bhavnagar 10:45 am :");
            }
        });
        JLabel jLabel3 = new JLabel();
        jFrame.add(jLabel3);
        jLabel3.setBounds(950,270,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel3.setText(" Rajkot to Gondal 12:45 pm :");
            }
        });
        JLabel jLabel4 = new JLabel();
        jFrame.add(jLabel4);
        jLabel4.setBounds(950,320,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel4.setText(" Jamnagar to Rajkot   1:00 pm :");
            }
        });
        JLabel jLabel5 = new JLabel();
        jFrame.add(jLabel5);
        jLabel5.setBounds(950,370,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel5.setText(" Gondal to Bhavnagar 8:00 am:");
            }
        });
        JLabel jLabel6 = new JLabel();
        jFrame.add(jLabel6);
        jLabel6.setBounds(950,420,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel6.setText(" Bhavnagar to Gondal 5:00 pm :");
            }
        });
        JLabel jLabel7 = new JLabel();
        jFrame.add(jLabel7);
        jLabel7.setBounds(950,470,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel7.setText(" Rajkot to Mumbai 5:00 pm :");
            }
        });
        JLabel jLabel8 = new JLabel();
        jFrame.add(jLabel8);
        jLabel8.setBounds(950,520,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel8.setText(" Amreli to Gondal 06:00 pm :");
            }
        });
        JLabel jLabel9 = new JLabel();
        jFrame.add(jLabel9);
        jLabel9.setBounds(950,570,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel9.setText(" Bhavnagar to Gondal 11:00 pm :");
            }
        });
        JLabel jLabel10 = new JLabel();
        jFrame.add(jLabel10);
        jLabel10.setBounds(950,620,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel10.setText(" Mumbai to Rajkot 9:00 pm :");
            }
        });
        JLabel jLabel12 = new JLabel();
        jFrame.add(jLabel12);
        jLabel12.setBounds(950,670,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel12.setText(" Jamnagar to Amreli 4:00 pm :");
            }
        });
        JLabel jLabel13 = new JLabel();
        jFrame.add(jLabel13);
        jLabel13.setBounds(950,720,200,50);
        j8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                jLabel6.setText(" Dahod to Rajkot 2:00 pm :");
            }
        });


        JLabel jLabel11 =new JLabel();
        jLabel11.setIcon(new ImageIcon("C:\\Users\\Jolly InfoTech\\OneDrive\\Pictures\\commonbg01.jpg"));
        jLabel11.setBounds(50,10,720,100);
        jFrame.add(jLabel11);

        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
 }
}
class Bus{
    public static void main(String[] args) {
        Bus1 b =new Bus1();

    }
}
