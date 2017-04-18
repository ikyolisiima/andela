/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fee;
import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import message.MessagePane;
/**
 *
 * @author Engr.Awais
 */
public class fee extends javax.swing.JFrame {

    /**
     * Creates new form fee
     */
    public fee() {
        initComponents();
        this.setLocationRelativeTo(this);
        connect();
    }
    //instance variable for mouse drag
    int xMouse;
    int yMouse;
    
//print jpanel by this method
    public void printWork(){
     PrinterJob pj = PrinterJob.getPrinterJob();
     pj.setJobName(" Opt De Solver Printing ");

     pj.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
         if(pageNum > 0)
             return Printable.NO_SUCH_PAGE;
         
         Graphics2D g2 = (Graphics2D)pg;
         g2.translate(pf.getImageableX(), pf.getImageableY());
         //this panel print out
         jPanel1.print(g2);
       
         return Printable.PAGE_EXISTS;
     });
     if(pj.printDialog() == false)
         return;
     try
     {
         pj.print();
     }
     catch(PrinterException xcp)
     {
         xcp.printStackTrace(System.err);
     }
 } 
    public void selected() throws SQLException{
      
    if(jComboMonth.getSelectedItem() == "JAN" && "Not Paid".equals(rs.getString("JAN"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("JAN", "Paid");
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_JAN","Rs. "+ amnt);
                rs.updateRow();
                  
                 
                 this.printWork();this.dispose();
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "FEB" && "Not Paid".equals(rs.getString("FEB"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("FEB", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_FEB","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "MAR" && "Not Paid".equals(rs.getString("MAR"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("MAR", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_MAR","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "APR" && "Not Paid".equals(rs.getString("APR"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("APR", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_APR","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "MAY" && "Not Paid".equals(rs.getString("MAY"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("MAY", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_MAY","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "JUN" && "Not Paid".equals(rs.getString("JUN"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("JUNE", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_JUN","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "JUL" && "Not Paid".equals(rs.getString("JUL"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("JUL", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_JUL","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "AUG" && "Not Paid".equals(rs.getString("AUG"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("AUG", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_AUG","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "SEP" && "Not Paid".equals(rs.getString("SEP"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("SEP", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_SEP","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "OCT" && "Not Paid".equals(rs.getString("DECEM"))){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("OCT", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_OCT","Rs. "+ amnt);
                rs.updateRow();
                  
         
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
        
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "NOV"){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("NOV", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_NOV","Rs. "+ amnt);
                rs.updateRow();  
         
                 MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
      
              this.printWork();this.dispose();
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else if(jComboMonth.getSelectedItem() == "DEC"){
             String sql = "Select * from MOIN.FEES";
            try {
                rs = stmt.executeQuery(sql);
                rs.next();
                rs.updateString("DECEM", "Paid");
                
                String amnt = TextAmount.getText();
                rs.updateString("AMOUNT_DEC","Rs. "+ amnt);
                rs.updateRow();
                  
                      
                 this.printWork();this.dispose();
      
                MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Successfully Paid & Print</font></html>");
                  
            } catch (SQLException | HeadlessException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
       else {   
           MessagePane ms = new MessagePane();ms.displayPane("<html><font size=\"1.5\">Already Paid & Duplicate Slip</font></html>");
         
        this.printWork();this.dispose();
        
            }
    }
    public void connect(){
        String uHost="jdbc:derby://localhost:1527/School Management";
        String uName="moin";
        String uPass="akhtar";
        
         try {
             con = DriverManager.getConnection(uHost, uName, uPass);
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             String sql = "Select * from MOIN.FEES";
             rs = stmt.executeQuery(sql);
             
            
         } catch (SQLException ex) {
             error.Error er = new error.Error();
            er.displayPane("Start NeatBeans Server");
         }
    
    }    
    Connection con;
     Statement stmt;
     ResultSet rs;
     PreparedStatement prp;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jclose = new javax.swing.JLabel();
        jmini = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboMonth = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDate = new javax.swing.JLabel();
        jClass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        jMonth = new javax.swing.JLabel();
        jAmount1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jID = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pay Fees");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/login/img/icon.png")));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(626, 670));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/close.png"))); // NOI18N
        jclose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jcloseMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcloseMouseReleased(evt);
            }
        });
        getContentPane().add(jclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 5, 26, 26));

        jmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/mini.png"))); // NOI18N
        jmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jminiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jminiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jminiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jminiMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jminiMouseReleased(evt);
            }
        });
        getContentPane().add(jmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 5, 24, 26));

        framedrag.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        framedrag.setForeground(new java.awt.Color(255, 255, 255));
        framedrag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        framedrag.setText("<html>\n<span style=\"text-shadow: 0 1px 0 #ccc,\n               0 2px 0 #c9c9c9,\n               0 3px 0 #bbb,\n               0 4px 0 #b9b9b9,\n               0 5px 0 #aaa,\n               0 6px 1px rgba(0,0,0,.1),\n               0 0 5px rgba(0,0,0,.1),\n               0 1px 3px rgba(0,0,0,.3),\n               0 3px 5px rgba(0,0,0,.2),\n               0 5px 10px rgba(0,0,0,.25),\n               0 10px 10px rgba(0,0,0,.2),\n               0 20px 20px rgba(0,0,0,.15); box-shadow:red 2px 2px \">\nPay Fees\n</span>\n<html>");
        framedrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                framedragMouseDragged(evt);
            }
        });
        framedrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                framedragMousePressed(evt);
            }
        });
        getContentPane().add(framedrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 23));

        jLabel26.setFont(new java.awt.Font("Traditional Arabic", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 652, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/t13.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 153));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Card in Use.png"))); // NOI18N
        jLabel16.setText("Fee Payment");

        jLabel17.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("If already pay fees then it will be print out duplicate Slip");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 2, true));

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Why Us Filled.png"))); // NOI18N
        jLabel1.setText("Student ID");

        TextSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 1, true));
        TextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSearchActionPerformed(evt);
            }
        });
        TextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextSearchKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Coins.png"))); // NOI18N
        jLabel8.setText("Amount");

        TextAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        TextAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextAmountKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/E Learning 2 Filled.png"))); // NOI18N
        jLabel9.setText("Month");

        jComboMonth.setBackground(new java.awt.Color(255, 0, 0));
        jComboMonth.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboMonth.setForeground(new java.awt.Color(255, 0, 51));
        jComboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUNE", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        jComboMonth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboMonth, 0, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jComboMonth))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel8)
                        .addComponent(TextAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setFocusCycleRoot(true);

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel10.setText("Student Signature");

        jLabel11.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel11.setText("Accountant Signature");

        jLabel12.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel12.setText("Email: MoinAkhtar00@gmail.com");

        jLabel13.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel13.setText("B-34 Gulshan e iqbal block 4 karachi Pakistan ");

        jLabel14.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jLabel14.setText("Contact No# 03412281694");

        jLabel15.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel15.setText("Stamp");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jName.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jName.setText("Moin Akhtar Moin");

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setText("Month:");

        jDate.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jDate.setText("1122345643");

        jClass.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jClass.setText("VIII");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setText("Class:");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel4.setText("Name:");

        jlabel.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jlabel.setText("Amount:");

        jMonth.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jMonth.setText("Jan");

        jAmount1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jAmount1.setText("123456789");

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel5.setText("Date:");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel2.setText("ID:");

        jID.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jID.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jID))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jlabel)
                                .addGap(18, 18, 18)
                                .addComponent(jAmount1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jClass)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jMonth)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jName)
                    .addComponent(jClass)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jMonth))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(jDate)
                    .addComponent(jLabel5)
                    .addComponent(jAmount1))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("FEES SLIP");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/school3.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 51));
        jLabel22.setText("Karachi Secondary School");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel15))
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Checked.png"))); // NOI18N
        jButton1.setText("Paid Fees");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jLabel17))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(204, 204, 204)
                                        .addComponent(jLabel16))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/b15.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 630, 20));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/menu/bc13.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSearchActionPerformed

    private void TextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextSearchKeyReleased
         String sql = "Select * from MOIN.FEES where ID=?";
        try {
            prp = con.prepareStatement(sql);
            prp.setInt(1,Integer.parseInt(TextSearch.getText()));
            rs = prp.executeQuery();
            if(rs.next()){
                int id =  rs.getInt("ID");
                String name = rs.getString("NAME");
               String classs= rs.getString("CLASS");
              
                String ll =   (String) jComboMonth.getSelectedItem();
                jMonth.setText(ll.toUpperCase());
               jID.setText(Integer.toString(id));
                jName.setText(name.toUpperCase());
                
                jClass.setText(classs.toUpperCase());
               DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String data = df.format(new Date());
                jDate.setText(data);
                
                if("JAN".equals(ll)){
                    String  am = rs.getString("AMOUNT_JAN");
                    jAmount1.setText(am);
                }
            
               else if("FEB".equals(ll)){
                    String  am = rs.getString("AMOUNT_FEB");
                    jAmount1.setText(am);
                }
            
               else   if("MAR".equals(ll)){
                    String  am = rs.getString("AMOUNT_MAR");
                    jAmount1.setText(am);
                }
            
               else   if("APR".equals(ll)){
                    String  am = rs.getString("AMOUNT_APR");
                    jAmount1.setText(am);
                }
            
               else   if("MAY".equals(ll)){
                    String  am = rs.getString("AMOUNT_MAY");
                    jAmount1.setText(am);
                }
            
               else   if("JUNE".equals(ll)){
                    String  am = rs.getString("AMOUNT_JUN");
                    jAmount1.setText(am);
                }
            
               else   if("JUL".equals(ll)){
                    String  am = rs.getString("AMOUNT_JUL");
                    jAmount1.setText(am);
                }
            
               else   if("AUG".equals(ll)){
                    String  am = rs.getString("AMOUNT_AUG");
                    jAmount1.setText(am);
                }
            
               else   if("SEP".equals(ll)){
                    String  am = rs.getString("AMOUNT_SEP");
                    jAmount1.setText(am);
                }
            
               else   if("OCT".equals(ll)){
                    String  am = rs.getString("AMOUNT_OCT");
                    jAmount1.setText(am);
                }
            
               else   if("NOV".equals(ll)){
                    String  am = rs.getString("AMOUNT_NOV");
                    jAmount1.setText(am);
                }
            
               else   if("DECEM".equals(ll)){
                    String  am = rs.getString("AMOUNT_DEC");
                    jAmount1.setText(am);
                }
            
            }
            
            
        } catch (SQLException | NumberFormatException ex) {
            
        }
    }//GEN-LAST:event_TextSearchKeyReleased

    private void TextSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextSearchKeyTyped
  char num=evt.getKeyChar();
        if(!(Character.isDigit(num)|| (num==KeyEvent.VK_BACKSPACE) || num==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TextSearchKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        


       
        try {
            this.selected();
        } catch (SQLException ex) {
            Logger.getLogger(fee.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        if(!"".equals(TextAmount.getText().trim()) ){
        try {   //insert value in database 
                String sqqq = "insert into MOIN.ADMIN (FEESINCOME) values(?)";
                prp = con.prepareStatement(sqqq);
                prp.setInt(1,Integer.parseInt(TextAmount.getText()));
                prp.execute();
                prp.close();
                rs.close();
                String ll =   (String) jComboMonth.getSelectedItem();
                if("JAN".equals(ll)){
                    String sq = "update MOIN.FEES set AMOUNT_JAN ='"+jAmount1.getText()+"',JAN ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();
                }
            
               else if("FEB".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_FEB ='"+jAmount1.getText()+"',FEB ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("MAR".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_MAR ='"+jAmount1.getText()+"',MAR ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("APR".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_APR ='"+jAmount1.getText()+"',APR ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("MAY".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_MAY ='"+jAmount1.getText()+"',MAY ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("JUNE".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_JUN ='"+jAmount1.getText()+"',JUNE ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("JUL".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_JUL ='"+jAmount1.getText()+"',JUL ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("AUG".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_AUG ='"+jAmount1.getText()+"',AUG ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("SEP".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_SEP ='"+jAmount1.getText()+"',SEP ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("OCT".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_OCT ='"+jAmount1.getText()+"',OCT ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("NOV".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_NOV ='"+jAmount1.getText()+"',NOV ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
            
               else   if("DEC".equals(ll)){
                  String sq = "update MOIN.FEES set AMOUNT_DEC ='"+jAmount1.getText()+"',DECEM ='Paid' where id ="+TextSearch.getText();
                    prp = con.prepareStatement(sq);
                    prp.execute();
                    prp.close();
                    rs.close();}
                
                
       
            
        } catch (SQLException ex) {
        
        javax.swing.JOptionPane.showMessageDialog(this,ex.getMessage());
            }finally{
        try{rs.close(); prp.close();}
        catch(Exception e){
           
         }
        }
        }
          
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAmountKeyReleased
        String tx = TextAmount.getText();
        jAmount1.setText("Rs. "+tx);
        
                String ll =   (String) jComboMonth.getSelectedItem();
                jMonth.setText(ll.toUpperCase());
    }//GEN-LAST:event_TextAmountKeyReleased

    private void TextAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextAmountKeyTyped
         char num=evt.getKeyChar();
        if(!(Character.isDigit(num)|| (num==KeyEvent.VK_BACKSPACE) || num==KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TextAmountKeyTyped

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
        // close jframe
        this.dispose();
    }//GEN-LAST:event_jcloseMouseClicked

    private void jcloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseEntered
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closehover.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseEntered

    private void jcloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseExited
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/close.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseExited

    private void jcloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMousePressed
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closeclick.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMousePressed

    private void jcloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseReleased
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/closehover.png"));
        jclose.setIcon(ii);
    }//GEN-LAST:event_jcloseMouseReleased

    private void jminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseClicked
        // this is use for minimize
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jminiMouseClicked

    private void jminiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseEntered
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/minihover.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseEntered

    private void jminiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseExited
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/mini.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseExited

    private void jminiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMousePressed
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/miniclick.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMousePressed

    private void jminiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseReleased
        //set image in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/minihover.png"));
        jmini.setIcon(ii);
    }//GEN-LAST:event_jminiMouseReleased

    private void framedragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMouseDragged
        //set screen
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
    }//GEN-LAST:event_framedragMouseDragged

    private void framedragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMousePressed
        //set mouse pressed screen
        xMouse  = evt.getX();
        yMouse  = evt.getY();
    }//GEN-LAST:event_framedragMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextAmount;
    private javax.swing.JTextField TextSearch;
    private javax.swing.JLabel framedrag;
    private javax.swing.JLabel jAmount1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jClass;
    private javax.swing.JComboBox<String> jComboMonth;
    private javax.swing.JLabel jDate;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jMonth;
    private javax.swing.JLabel jName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jmini;
    // End of variables declaration//GEN-END:variables
}
