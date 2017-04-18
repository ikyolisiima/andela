/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Addmission.Admission;
import Addmission.All_Admission_Detail;
import Addmission.SearchAdmission;
import Admin.Available_Faculty;
import Admin.Update_Salary;
import Faculty.All_Faculty_Detail;
import Faculty.NewFaculty;
import Faculty.Resignation_Letter;
import Faculty.SearchFaculty;
import Fee.JanFees;
import Fee.SearchByID;
import Fee.fee;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static java.lang.Thread.sleep;
import login.School_Management;
import message.MessagePane;

/**
 *
 * @author Engr.Awais
 */
public class Main1 extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;

    /**
     * Creates new form gui
     */
    
    //instance variable
    boolean open_colse;
    
    //constructor
    public Main1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/login/img/icon.png")));
        jmenuitem.setVisible(false);
       jmenuitem1.setVisible(false);
       admin.setEnabled(false);
       admission();
        connect();
        CurrentTime_Date();
        getusername();
    }
    
     
    //create instance variable for connectivity from database
     Connection con;
     Statement stmt;
     ResultSet rs;
     PreparedStatement pr;
     
     
    //make an function to get username and connect to database
    public void getusername(){
          String uHost="jdbc:derby://localhost:1527/School Management";
        String uName="moin";
        String uPass="akhtar";
        
         try {
             con = DriverManager.getConnection(uHost, uName, uPass);
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             String sql = "Select NAME from MOIN.LOGIN_DETAIL";
             rs = stmt.executeQuery(sql);
             rs.last();
             String name = rs.getString("Name");
             jLabel7.setText(name.toUpperCase());
             
         } catch (SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
         }finally{
        try{rs.close(); pr.close();}
        catch(Exception e){
           
         }
        }
    }

     //get current time and date by using calender
      public void CurrentTime_Date(){
       Thread clock = new Thread(){
       public void run(){
       while(true){
       Calendar cal =new  GregorianCalendar();
       int month=cal.get(Calendar.MONTH);
       int year=cal.get(Calendar.YEAR);
       int day=cal.get(Calendar.DAY_OF_MONTH);
       int hrs = cal.get(Calendar.HOUR_OF_DAY);
       int min = cal.get(Calendar.MINUTE);
       int sec = cal.get(Calendar.SECOND);
       jtime.setText( hrs+ ":"  + min+ ":"  + sec);
       String time = (hrs)+":"+(min)+":"+(sec);
           try {
               sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(SearchAdmission.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       }
       };
       clock.start();
     }
     
     
      //make connection from database
     public void connect(){
        String uHost="jdbc:derby://localhost:1527/School Management";
        String uName="moin";
        String uPass="akhtar";
         try {
             //get connection from database
             con = DriverManager.getConnection(uHost, uName, uPass);
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
             String sql = "Select * from MOIN.ADMIN";
             rs = stmt.executeQuery(sql);
             
         } catch (SQLException ex) {
             javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage());
         }finally{
        try{rs.close(); pr.close();}
        catch(Exception e){
           
         }
        }
    
    }
    
    
    
    
    
    
    //method for Admission menu
    public void admission(){
      New_Admission.setVisible(true);
      New_Admission.setEnabled(true);
      Search_Admission.setVisible(true);
      Search_Admission.setEnabled(true);
      Admission_Detail.setVisible(true);
      Admission_Detail.setEnabled(true);
      admissio_dublicate.setVisible(true);
      admissio_dublicate.setEnabled(true);
      clean.setVisible(false);
      clean.setEnabled(false);
      createaccount.setVisible(false);
      createaccount.setEnabled(false);
      
      
      updatesalary.setVisible(false);
      updatesalary.setEnabled(false);
      availablefaculty.setVisible(false);
      availablefaculty.setEnabled(false);
      feesincome.setVisible(false);
      feesincome.setEnabled(false);
      totalincome.setVisible(false);
      totalincome.setEnabled(false);
      
      New_Admission1.setVisible(false);
      New_Admission1.setEnabled(false);
      Search_Admission1.setVisible(false);
      Search_Admission1.setEnabled(false);
      Admission_Detail1.setVisible(false);
      Admission_Detail1.setEnabled(false);
      admissio_dublicate1.setVisible(false);
      admissio_dublicate1.setEnabled(false);
      
      newfaculty.setVisible(false);
      newfaculty.setEnabled(false);
      Search_Admission2.setVisible(false);
      Search_Admission2.setEnabled(false);
      Admission_Detail2.setVisible(false);
      Admission_Detail2.setEnabled(false);
      admissio_dublicate2.setVisible(false);
      admissio_dublicate2.setEnabled(false);
      
      //set image 
      ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/bcadd.png"));
      jitem.setIcon(ii);
       
    }
    
    //method for Fees menu
    public void fees(){
      New_Admission.setVisible(false);
      New_Admission.setEnabled(false);
      Search_Admission.setVisible(false);
      Search_Admission.setEnabled(false);
      Admission_Detail.setVisible(false);
      Admission_Detail.setEnabled(false);
      admissio_dublicate.setVisible(false);
      admissio_dublicate.setEnabled(false);
      clean.setVisible(false);
      clean.setEnabled(false);
      createaccount.setVisible(false);
      createaccount.setEnabled(false);
      
      
      updatesalary.setVisible(false);
      updatesalary.setEnabled(false);
      availablefaculty.setVisible(false);
      availablefaculty.setEnabled(false);
      feesincome.setVisible(false);
      feesincome.setEnabled(false);
      totalincome.setVisible(false);
      totalincome.setEnabled(false);
      
      
      New_Admission1.setVisible(true);
      New_Admission1.setEnabled(true);
      Search_Admission1.setVisible(true);
      Search_Admission1.setEnabled(true);
      Admission_Detail1.setVisible(true);
      Admission_Detail1.setEnabled(true);
      admissio_dublicate1.setVisible(true);
      admissio_dublicate1.setEnabled(true);
      
      
      
      newfaculty.setVisible(false);
      newfaculty.setEnabled(false);
      Search_Admission2.setVisible(false);
      Search_Admission2.setEnabled(false);
      Admission_Detail2.setVisible(false);
      Admission_Detail2.setEnabled(false);
      admissio_dublicate2.setVisible(false);
      admissio_dublicate2.setEnabled(false);
      
      
      //set image 
      ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/bcfee.png"));
      jitem.setIcon(ii);
       
    }
    //method for admin menu
    public void admin(){
      New_Admission.setVisible(false);
      New_Admission.setEnabled(false);
      Search_Admission.setVisible(false);
      Search_Admission.setEnabled(false);
      Admission_Detail.setVisible(false);
      Admission_Detail.setEnabled(false);
      admissio_dublicate.setVisible(false);
      admissio_dublicate.setEnabled(false);
      clean.setVisible(true);
      clean.setEnabled(true);
      createaccount.setVisible(true);
      createaccount.setEnabled(true);
      
      updatesalary.setVisible(true);
      updatesalary.setEnabled(true);
      availablefaculty.setVisible(true);
      availablefaculty.setEnabled(true);
      feesincome.setVisible(true);
      feesincome.setEnabled(true);
      totalincome.setVisible(true);
      totalincome.setEnabled(true);
      
      
      New_Admission1.setVisible(false);
      New_Admission1.setEnabled(false);
      Search_Admission1.setVisible(false);
      Search_Admission1.setEnabled(false);
      Admission_Detail1.setVisible(false);
      Admission_Detail1.setEnabled(false);
      admissio_dublicate1.setVisible(false);
      admissio_dublicate1.setEnabled(false);
      
      newfaculty.setVisible(false);
      newfaculty.setEnabled(false);
      Search_Admission2.setVisible(false);
      Search_Admission2.setEnabled(false);
      Admission_Detail2.setVisible(false);
      Admission_Detail2.setEnabled(false);
      admissio_dublicate2.setVisible(false);
      admissio_dublicate2.setEnabled(false);
      
      
      //set image 
      ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/bcadmin.png"));
      jitem.setIcon(ii);
       
    }
    
    //method for Fees menu
    public void faculty(){
      New_Admission.setVisible(false);
      New_Admission.setEnabled(false);
      Search_Admission.setVisible(false);
      Search_Admission.setEnabled(false);
      Admission_Detail.setVisible(false);
      Admission_Detail.setEnabled(false);
      admissio_dublicate.setVisible(false);
      admissio_dublicate.setEnabled(false);
      clean.setVisible(false);
      clean.setEnabled(false);
      createaccount.setVisible(false);
      createaccount.setEnabled(false);
      
      updatesalary.setVisible(false);
      updatesalary.setEnabled(false);
      availablefaculty.setVisible(false);
      availablefaculty.setEnabled(false);
      feesincome.setVisible(false);
      feesincome.setEnabled(false);
      totalincome.setVisible(false);
      totalincome.setEnabled(false);
      
      
      New_Admission1.setVisible(false);
      New_Admission1.setEnabled(false);
      Search_Admission1.setVisible(false);
      Search_Admission1.setEnabled(false);
      Admission_Detail1.setVisible(false);
      Admission_Detail1.setEnabled(false);
      admissio_dublicate1.setVisible(false);
      admissio_dublicate1.setEnabled(false);
      
      newfaculty.setVisible(true);
      newfaculty.setEnabled(true);
      Search_Admission2.setVisible(true);
      Search_Admission2.setEnabled(true);
      Admission_Detail2.setVisible(true);
      Admission_Detail2.setEnabled(true);
      admissio_dublicate2.setVisible(true);
      admissio_dublicate2.setEnabled(true);
       
      
      //set image 
      ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/bcf.png"));
      jitem.setIcon(ii);
    }
    
    //method for disable menuitem
    public void disable_menu_item(){
     vadmission_In();
       vadmission_In1();
       vadmission_In2();
       
        //label set invisible and disable
       jmenuitem.setVisible(false);
       jmenuitem.setEnabled(false);
        jmenuitem1.setVisible(false);
       jmenuitem1.setEnabled(false);
        jmenuitem2.setVisible(false);
       jmenuitem2.setEnabled(false);
       
    }
    
    //method for set admissin lable visible and enable
    public void vadmission(){
    
        jAdmissionDetails1.setVisible(true);
        jNewAdmission1.setVisible(true);
        jSearchAdmission1.setVisible(true);
        jDublicateAdmission.setVisible(true);
        jAdmissionDetails1.setEnabled(true);
        jNewAdmission1.setEnabled(true);
        jSearchAdmission1.setEnabled(true);
        jDublicateAdmission.setEnabled(true);
    }
    
    //method for set admissin lable invisible and disable
    public void vadmission_In(){
    
        jAdmissionDetails1.setVisible(false);
        jNewAdmission1.setVisible(false);
        jSearchAdmission1.setVisible(false);
        jDublicateAdmission.setVisible(false);
        jAdmissionDetails1.setEnabled(false);
        jNewAdmission1.setEnabled(false);
        jSearchAdmission1.setEnabled(false);
        jDublicateAdmission.setEnabled(false);
    }

    
    //method for set admissin lable visible and enable
    public void vadmission1(){
    
        jAdmissionDetails2.setVisible(true);
        jNewAdmission2.setVisible(true);
        jSearchAdmission2.setVisible(true);
        jDublicateAdmission1.setVisible(true);
        jAdmissionDetails2.setEnabled(true);
        jNewAdmission2.setEnabled(true);
        jSearchAdmission2.setEnabled(true);
        jDublicateAdmission1.setEnabled(true);
    }
    
    //method for set admissin lable invisible and disable
    public void vadmission_In1(){
    
        jAdmissionDetails2.setVisible(false);
        jNewAdmission2.setVisible(false);
        jSearchAdmission2.setVisible(false);
        jDublicateAdmission1.setVisible(false);
        jAdmissionDetails2.setEnabled(false);
        jNewAdmission2.setEnabled(false);
        jSearchAdmission2.setEnabled(false);
        jDublicateAdmission1.setEnabled(false);
    }

    //method for set admissin lable visible and enable
    public void vadmission2(){
    
        jAdmissionDetails3.setVisible(true);
        jNewAdmission3.setVisible(true);
        jSearchAdmission3.setVisible(true);
        jDublicateAdmission2.setVisible(true);
        jAdmissionDetails3.setEnabled(true);
        jNewAdmission3.setEnabled(true);
        jSearchAdmission3.setEnabled(true);
        jDublicateAdmission2.setEnabled(true);
    }
    
    //method for set admissin lable invisible and disable
    public void vadmission_In2(){
    
        jAdmissionDetails3.setVisible(false);
        jNewAdmission3.setVisible(false);
        jSearchAdmission3.setVisible(false);
        jDublicateAdmission2.setVisible(false);
        jAdmissionDetails3.setEnabled(false);
        jNewAdmission3.setEnabled(false);
        jSearchAdmission3.setEnabled(false);
        jDublicateAdmission2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jclose = new javax.swing.JLabel();
        jmini = new javax.swing.JLabel();
        framedrag = new javax.swing.JLabel();
        jDublicateAdmission = new javax.swing.JLabel();
        jNewAdmission1 = new javax.swing.JLabel();
        jAdmissionDetails1 = new javax.swing.JLabel();
        jSearchAdmission1 = new javax.swing.JLabel();
        jmenuitem = new javax.swing.JLabel();
        jFaculty = new javax.swing.JLabel();
        jAdmission1 = new javax.swing.JLabel();
        jFees1 = new javax.swing.JLabel();
        jNewAdmission2 = new javax.swing.JLabel();
        jDublicateAdmission1 = new javax.swing.JLabel();
        jSearchAdmission2 = new javax.swing.JLabel();
        jAdmissionDetails2 = new javax.swing.JLabel();
        jmenuitem1 = new javax.swing.JLabel();
        jAdmissionDetails3 = new javax.swing.JLabel();
        jNewAdmission3 = new javax.swing.JLabel();
        jSearchAdmission3 = new javax.swing.JLabel();
        jDublicateAdmission2 = new javax.swing.JLabel();
        jmenuitem2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Faculty = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        Fees = new javax.swing.JLabel();
        Admission = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        New_Admission = new javax.swing.JLabel();
        Search_Admission = new javax.swing.JLabel();
        Admission_Detail = new javax.swing.JLabel();
        admissio_dublicate = new javax.swing.JLabel();
        Admission_Detail1 = new javax.swing.JLabel();
        Search_Admission1 = new javax.swing.JLabel();
        admissio_dublicate1 = new javax.swing.JLabel();
        New_Admission1 = new javax.swing.JLabel();
        Admission_Detail2 = new javax.swing.JLabel();
        Search_Admission2 = new javax.swing.JLabel();
        admissio_dublicate2 = new javax.swing.JLabel();
        newfaculty = new javax.swing.JLabel();
        updatesalary = new javax.swing.JLabel();
        feesincome = new javax.swing.JLabel();
        availablefaculty = new javax.swing.JLabel();
        totalincome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtime = new javax.swing.JLabel();
        clean = new javax.swing.JLabel();
        createaccount = new javax.swing.JLabel();
        jitem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karachi Secondary School");
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/log.png"))); // NOI18N
        jLabel10.setText("Log Out");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 25, -1, -1));

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
        getContentPane().add(jclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(859, 10, 26, 26));

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
        getContentPane().add(jmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 10, 24, 26));

        framedrag.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        framedrag.setForeground(new java.awt.Color(255, 255, 255));
        framedrag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        framedrag.setText("<html>\n<span style=\"text-shadow: 0 1px 0 #ccc,\n               0 2px 0 #c9c9c9,\n               0 3px 0 #bbb,\n               0 4px 0 #b9b9b9,\n               0 5px 0 #aaa,\n               0 6px 1px rgba(0,0,0,.1),\n               0 0 5px rgba(0,0,0,.1),\n               0 1px 3px rgba(0,0,0,.3),\n               0 3px 5px rgba(0,0,0,.2),\n               0 5px 10px rgba(0,0,0,.25),\n               0 10px 10px rgba(0,0,0,.2),\n               0 20px 20px rgba(0,0,0,.15); box-shadow:red 2px 2px \">\nKarachi Secondary School\n</span>\n<html>");
        framedrag.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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
        getContentPane().add(framedrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 23));

        jDublicateAdmission.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDublicateAdmission.setEnabled(false);
        jDublicateAdmission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDublicateAdmissionMousePressed(evt);
            }
        });
        getContentPane().add(jDublicateAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 25));

        jNewAdmission1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNewAdmission1.setEnabled(false);
        jNewAdmission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jNewAdmission1MousePressed(evt);
            }
        });
        jNewAdmission1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewAdmission1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jNewAdmission1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNewAdmission1KeyTyped(evt);
            }
        });
        getContentPane().add(jNewAdmission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 24));

        jAdmissionDetails1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdmissionDetails1.setEnabled(false);
        jAdmissionDetails1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAdmissionDetails1MousePressed(evt);
            }
        });
        getContentPane().add(jAdmissionDetails1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 24));

        jSearchAdmission1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSearchAdmission1.setEnabled(false);
        jSearchAdmission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSearchAdmission1MousePressed(evt);
            }
        });
        getContentPane().add(jSearchAdmission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 21));

        jmenuitem.setEnabled(false);
        getContentPane().add(jmenuitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 163, 139));

        jFaculty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFaculty.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jFacultyMouseDragged(evt);
            }
        });
        jFaculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFacultyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jFacultyMouseReleased(evt);
            }
        });
        getContentPane().add(jFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 50, 20));

        jAdmission1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdmission1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jAdmission1MouseDragged(evt);
            }
        });
        jAdmission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAdmission1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAdmission1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jAdmission1MouseReleased(evt);
            }
        });
        getContentPane().add(jAdmission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 90, 20));

        jFees1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFees1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jFees1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFees1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFees1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jFees1MouseReleased(evt);
            }
        });
        getContentPane().add(jFees1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 40, 20));

        jNewAdmission2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNewAdmission2.setEnabled(false);
        jNewAdmission2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jNewAdmission2MousePressed(evt);
            }
        });
        jNewAdmission2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewAdmission2KeyPressed(evt);
            }
        });
        getContentPane().add(jNewAdmission2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 140, 24));

        jDublicateAdmission1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDublicateAdmission1.setEnabled(false);
        jDublicateAdmission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDublicateAdmission1MousePressed(evt);
            }
        });
        getContentPane().add(jDublicateAdmission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 140, 25));

        jSearchAdmission2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSearchAdmission2.setEnabled(false);
        jSearchAdmission2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSearchAdmission2MousePressed(evt);
            }
        });
        getContentPane().add(jSearchAdmission2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 140, 21));

        jAdmissionDetails2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdmissionDetails2.setEnabled(false);
        jAdmissionDetails2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAdmissionDetails2MousePressed(evt);
            }
        });
        getContentPane().add(jAdmissionDetails2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 140, 24));

        jmenuitem1.setEnabled(false);
        jmenuitem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmenuitem1MouseExited(evt);
            }
        });
        getContentPane().add(jmenuitem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 163, 139));

        jAdmissionDetails3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jAdmissionDetails3.setEnabled(false);
        jAdmissionDetails3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jAdmissionDetails3MousePressed(evt);
            }
        });
        getContentPane().add(jAdmissionDetails3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 140, 24));

        jNewAdmission3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNewAdmission3.setEnabled(false);
        jNewAdmission3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jNewAdmission3MousePressed(evt);
            }
        });
        getContentPane().add(jNewAdmission3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, 24));

        jSearchAdmission3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSearchAdmission3.setEnabled(false);
        jSearchAdmission3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSearchAdmission3MousePressed(evt);
            }
        });
        getContentPane().add(jSearchAdmission3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 21));

        jDublicateAdmission2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDublicateAdmission2.setEnabled(false);
        jDublicateAdmission2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDublicateAdmission2MousePressed(evt);
            }
        });
        getContentPane().add(jDublicateAdmission2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 140, 25));

        jmenuitem2.setEnabled(false);
        getContentPane().add(jmenuitem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 163, 139));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/school3.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 51));
        jLabel15.setText("Karachi Secondary School");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("O/A LEVEL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        Faculty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Faculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/faculty.png"))); // NOI18N
        Faculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FacultyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FacultyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FacultyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FacultyMouseReleased(evt);
            }
        });
        getContentPane().add(Faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Admin.png"))); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                adminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                adminMouseReleased(evt);
            }
        });
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        Fees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/fees.png"))); // NOI18N
        Fees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FeesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FeesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FeesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FeesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FeesMouseReleased(evt);
            }
        });
        getContentPane().add(Fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        Admission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/admission.png"))); // NOI18N
        Admission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdmissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdmissionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdmissionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AdmissionMouseReleased(evt);
            }
        });
        getContentPane().add(Admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/side.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 450));

        New_Admission.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Admission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/newadd.png"))); // NOI18N
        New_Admission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                New_AdmissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                New_AdmissionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                New_AdmissionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                New_AdmissionMouseReleased(evt);
            }
        });
        getContentPane().add(New_Admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        Search_Admission.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/search.png"))); // NOI18N
        Search_Admission.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_AdmissionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_AdmissionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_AdmissionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Search_AdmissionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Search_AdmissionMouseReleased(evt);
            }
        });
        getContentPane().add(Search_Admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        Admission_Detail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admission_Detail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/detail.png"))); // NOI18N
        Admission_Detail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Admission_DetailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Admission_DetailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Admission_DetailMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Admission_DetailMouseReleased(evt);
            }
        });
        getContentPane().add(Admission_Detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        admissio_dublicate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admissio_dublicate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/duplicate.png"))); // NOI18N
        admissio_dublicate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissio_dublicateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissio_dublicateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admissio_dublicateMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admissio_dublicateMouseReleased(evt);
            }
        });
        getContentPane().add(admissio_dublicate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        Admission_Detail1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admission_Detail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/detail1.png"))); // NOI18N
        Admission_Detail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Admission_Detail1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Admission_Detail1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Admission_Detail1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Admission_Detail1MouseReleased(evt);
            }
        });
        getContentPane().add(Admission_Detail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        Search_Admission1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/search1.png"))); // NOI18N
        Search_Admission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_Admission1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_Admission1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_Admission1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Search_Admission1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Search_Admission1MouseReleased(evt);
            }
        });
        getContentPane().add(Search_Admission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        admissio_dublicate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admissio_dublicate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/duplicate.png"))); // NOI18N
        admissio_dublicate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissio_dublicate1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissio_dublicate1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admissio_dublicate1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admissio_dublicate1MouseReleased(evt);
            }
        });
        getContentPane().add(admissio_dublicate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        New_Admission1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        New_Admission1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/nfees.png"))); // NOI18N
        New_Admission1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                New_Admission1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                New_Admission1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                New_Admission1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                New_Admission1MouseReleased(evt);
            }
        });
        getContentPane().add(New_Admission1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        Admission_Detail2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Admission_Detail2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/detail2.png"))); // NOI18N
        Admission_Detail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Admission_Detail2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Admission_Detail2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Admission_Detail2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Admission_Detail2MouseReleased(evt);
            }
        });
        getContentPane().add(Admission_Detail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        Search_Admission2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/search2.png"))); // NOI18N
        Search_Admission2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_Admission2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Search_Admission2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Search_Admission2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Search_Admission2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Search_Admission2MouseReleased(evt);
            }
        });
        getContentPane().add(Search_Admission2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        admissio_dublicate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admissio_dublicate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/resign.png"))); // NOI18N
        admissio_dublicate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admissio_dublicate2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admissio_dublicate2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                admissio_dublicate2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                admissio_dublicate2MouseReleased(evt);
            }
        });
        getContentPane().add(admissio_dublicate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        newfaculty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newfaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/newf.png"))); // NOI18N
        newfaculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newfacultyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newfacultyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newfacultyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                newfacultyMouseReleased(evt);
            }
        });
        getContentPane().add(newfaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        updatesalary.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updatesalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/update.png"))); // NOI18N
        updatesalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatesalaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatesalaryMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                updatesalaryMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                updatesalaryMouseReleased(evt);
            }
        });
        getContentPane().add(updatesalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        feesincome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feesincome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/income.png"))); // NOI18N
        feesincome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feesincomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feesincomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                feesincomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                feesincomeMouseReleased(evt);
            }
        });
        getContentPane().add(feesincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        availablefaculty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/available.png"))); // NOI18N
        availablefaculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availablefacultyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                availablefacultyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                availablefacultyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                availablefacultyMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                availablefacultyMouseReleased(evt);
            }
        });
        getContentPane().add(availablefaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        totalincome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalincome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/tincome.png"))); // NOI18N
        totalincome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                totalincomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                totalincomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                totalincomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                totalincomeMouseReleased(evt);
            }
        });
        getContentPane().add(totalincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, -1, -1));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CoreTechTechnologies");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Develop By");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 704, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Time: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, 30));

        jtime.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jtime.setForeground(new java.awt.Color(255, 0, 0));
        jtime.setText("34122816");
        getContentPane().add(jtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, 30));

        clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/clean.png"))); // NOI18N
        clean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cleanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cleanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cleanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cleanMouseReleased(evt);
            }
        });
        getContentPane().add(clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 100, -1));

        createaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/newaccount.png"))); // NOI18N
        createaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createaccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createaccountMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createaccountMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createaccountMouseReleased(evt);
            }
        });
        getContentPane().add(createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 100, -1));

        jitem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/bcadmin.png"))); // NOI18N
        jitem.setBorder(new javax.swing.border.LineBorder(java.awt.Color.white, 2, true));
        getContentPane().add(jitem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 630, 500));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome:  ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, -1, -1));

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("User");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 55, -1, -1));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/img/Jframe.png"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.setPreferredSize(new java.awt.Dimension(900, 750));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backgroundMouseClicked(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseClicked
       
    }//GEN-LAST:event_backgroundMouseClicked

    private void jcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcloseMouseClicked
       // close jframe
        System.exit(0);
        
    }//GEN-LAST:event_jcloseMouseClicked

    private void framedragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMousePressed
      //set mouse pressed screen
      xMouse  = evt.getX();
      yMouse  = evt.getY();
    }//GEN-LAST:event_framedragMousePressed

    private void framedragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_framedragMouseDragged
        //set screen
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
        
    }//GEN-LAST:event_framedragMouseDragged

    private void jminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jminiMouseClicked
         // this is use for minimize
        this.setState(Main1.ICONIFIED);
        
    }//GEN-LAST:event_jminiMouseClicked

    private void jAdmission1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmission1MouseDragged
      
    }//GEN-LAST:event_jAdmission1MouseDragged

    private void jAdmission1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmission1MouseReleased
      
    }//GEN-LAST:event_jAdmission1MouseReleased

    private void jAdmission1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmission1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jAdmission1MouseClicked

    private void jFees1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFees1MouseReleased
       
    }//GEN-LAST:event_jFees1MouseReleased

    private void jFees1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFees1MouseEntered
         
    }//GEN-LAST:event_jFees1MouseEntered

    private void jFees1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFees1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jFees1MouseExited

    private void jFacultyMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFacultyMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jFacultyMouseDragged

    private void jFacultyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFacultyMouseReleased
        
    }//GEN-LAST:event_jFacultyMouseReleased

    private void jFacultyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFacultyMousePressed
        //if statement create
        if(open_colse  == false){
      
        //label set visible and enable
       jmenuitem2.setVisible(true);
       jmenuitem2.setEnabled(true);
       vadmission2();
       vadmission_In();
       vadmission_In1();
       
        //label set invisible and disable
       jmenuitem.setVisible(false);
       jmenuitem.setEnabled(false);
        jmenuitem1.setVisible(false);
       jmenuitem1.setEnabled(false);
       
        
        //set image in label  
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/menufaculty.png"));
        jmenuitem2.setIcon(ii);
        
        open_colse = true;
        }
        else if (open_colse  == true){
        
        //label set visible and enable
       jmenuitem2.setVisible(false);
       jmenuitem2.setEnabled(false);
       vadmission_In2();
        //set image in label  
        jmenuitem2.setIcon(null);
        
        open_colse =false;
        } 
      
    }//GEN-LAST:event_jFacultyMousePressed

    private void jFees1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFees1MousePressed
        //if statement create
        if(open_colse  == false){
      
        //label set visible and enable
       jmenuitem1.setVisible(true);
       jmenuitem1.setEnabled(true);
       vadmission1();
       vadmission_In();
       vadmission_In2();
       
        //label set invisible and disable
       jmenuitem.setVisible(false);
       jmenuitem.setEnabled(false);
        jmenuitem2.setVisible(false);
       jmenuitem2.setEnabled(false);
       
        
        //set image in label  
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/menufees.png"));
        jmenuitem1.setIcon(ii);
        
        open_colse = true;
        }
        else if (open_colse  == true){
        
        //label set visible and enable
       jmenuitem1.setVisible(false);
       jmenuitem1.setEnabled(false);
       vadmission_In1();
        //set image in label  
        jmenuitem1.setIcon(null);
        
        open_colse =false;
        } 
      
    }//GEN-LAST:event_jFees1MousePressed

    private void jAdmission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmission1MousePressed
              
        //if statement create
        if(open_colse  == false){
      
        //label set visible and enable
       jmenuitem.setVisible(true);
       jmenuitem.setEnabled(true);
       vadmission();
       vadmission_In2();
       vadmission_In1();
        //label set invisible and disable
       jmenuitem2.setVisible(false);
       jmenuitem2.setEnabled(false);
        jmenuitem1.setVisible(false);
       jmenuitem1.setEnabled(false);
       
        //set image in label  
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/menuadd.png"));
        jmenuitem.setIcon(ii);
        
        open_colse = true;
        }
        else if (open_colse  == true){
        
        //label set visible and enable
       jmenuitem.setVisible(false);
       jmenuitem.setEnabled(false);
       vadmission_In();
        //set image in label  
        jmenuitem.setIcon(null);
        
        open_colse =false;
        }

    }//GEN-LAST:event_jAdmission1MousePressed

    private void jNewAdmission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewAdmission1MousePressed
        new Admission().setVisible(true);
        
    }//GEN-LAST:event_jNewAdmission1MousePressed

    private void jNewAdmission1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewAdmission1KeyPressed
       
    }//GEN-LAST:event_jNewAdmission1KeyPressed

    private void jNewAdmission1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewAdmission1KeyReleased
       
    }//GEN-LAST:event_jNewAdmission1KeyReleased

    private void jNewAdmission1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewAdmission1KeyTyped
        
    }//GEN-LAST:event_jNewAdmission1KeyTyped

    private void jAdmissionDetails1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmissionDetails1MousePressed
        new All_Admission_Detail().setVisible(true);
        disable_menu_item();
    }//GEN-LAST:event_jAdmissionDetails1MousePressed

    private void jSearchAdmission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchAdmission1MousePressed
        new SearchAdmission().setVisible(true);
        disable_menu_item();
    }//GEN-LAST:event_jSearchAdmission1MousePressed

    private void jDublicateAdmissionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDublicateAdmissionMousePressed
      new SearchAdmission().setVisible(true);
        disable_menu_item();
    }//GEN-LAST:event_jDublicateAdmissionMousePressed

    private void AdmissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmissionMouseEntered
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/admissionhover.png"));
       Admission.setIcon(ii);
               
    }//GEN-LAST:event_AdmissionMouseEntered

    private void AdmissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmissionMouseExited
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/admission.png"));
       Admission.setIcon(ii);
    }//GEN-LAST:event_AdmissionMouseExited

    private void AdmissionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmissionMousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/admissionclick.png"));
       Admission.setIcon(ii);
        admission();
    }//GEN-LAST:event_AdmissionMousePressed

    private void AdmissionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdmissionMouseReleased
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/admissionhover.png"));
       Admission.setIcon(ii);
    }//GEN-LAST:event_AdmissionMouseReleased

    private void FeesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeesMouseEntered
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/feeshover.png"));
       Fees.setIcon(ii);
    }//GEN-LAST:event_FeesMouseEntered

    private void FeesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeesMouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/fees.png"));
       Fees.setIcon(ii);
    }//GEN-LAST:event_FeesMouseExited

    private void FeesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeesMousePressed
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/feesclick.png"));
       Fees.setIcon(ii);
        fees();
    }//GEN-LAST:event_FeesMousePressed

    private void FeesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeesMouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/feeshover.png"));
       Fees.setIcon(ii);
    }//GEN-LAST:event_FeesMouseReleased

    private void FeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FeesMouseClicked
        
    }//GEN-LAST:event_FeesMouseClicked

    private void FacultyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyMouseEntered
            //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/facultyhover.png"));
       Faculty.setIcon(ii);
    
    }//GEN-LAST:event_FacultyMouseEntered

    private void FacultyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyMouseExited
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/faculty.png"));
       Faculty.setIcon(ii);
    }//GEN-LAST:event_FacultyMouseExited

    private void FacultyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyMousePressed
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/facultyclick.png"));
       Faculty.setIcon(ii);
       faculty();
    }//GEN-LAST:event_FacultyMousePressed

    private void FacultyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FacultyMouseReleased
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/facultyhover.png"));
       Faculty.setIcon(ii);
    }//GEN-LAST:event_FacultyMouseReleased

    private void adminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseEntered
           //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/adminhover.png"));
       admin.setIcon(ii);
    }//GEN-LAST:event_adminMouseEntered

    private void adminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseExited
     //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/Admin.png"));
       admin.setIcon(ii);
    }//GEN-LAST:event_adminMouseExited

    private void adminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/adminclick.png"));
       admin.setIcon(ii);
      
    }//GEN-LAST:event_adminMousePressed

    private void adminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseReleased
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/adminhover.png"));
       admin.setIcon(ii);
        error.Error er = new error.Error();
        er.displayPane("You don't Have Access");
        admission();
    }//GEN-LAST:event_adminMouseReleased

    private void jNewAdmission2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewAdmission2KeyPressed
        
    }//GEN-LAST:event_jNewAdmission2KeyPressed

    private void jNewAdmission2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewAdmission2MousePressed
        //set visible frame
        new fee().setVisible(true);
    }//GEN-LAST:event_jNewAdmission2MousePressed

    private void jAdmissionDetails2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmissionDetails2MousePressed
         //set visible frame
        new JanFees().setVisible(true);
    }//GEN-LAST:event_jAdmissionDetails2MousePressed

    private void jSearchAdmission2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchAdmission2MousePressed
         //set visible frame
        new SearchByID().setVisible(true);
    }//GEN-LAST:event_jSearchAdmission2MousePressed

    private void jDublicateAdmission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDublicateAdmission1MousePressed
         //set visible frame
        new fee().setVisible(true);
    }//GEN-LAST:event_jDublicateAdmission1MousePressed

    private void jNewAdmission3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewAdmission3MousePressed
        //set visible frame
        new NewFaculty().setVisible(true);
    }//GEN-LAST:event_jNewAdmission3MousePressed

    private void jAdmissionDetails3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAdmissionDetails3MousePressed
        //set visible frame
        new All_Faculty_Detail().setVisible(true);
    }//GEN-LAST:event_jAdmissionDetails3MousePressed

    private void jSearchAdmission3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchAdmission3MousePressed
         //set visible frame
        new SearchFaculty().setVisible(true);
    }//GEN-LAST:event_jSearchAdmission3MousePressed

    private void jDublicateAdmission2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDublicateAdmission2MousePressed
        //set visible frame
        new Resignation_Letter().setVisible(true);
    }//GEN-LAST:event_jDublicateAdmission2MousePressed

    private void New_AdmissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_AdmissionMouseEntered
               //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newaddhover.png"));
       New_Admission.setIcon(ii);
       

    }//GEN-LAST:event_New_AdmissionMouseEntered

    private void New_AdmissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_AdmissionMouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newadd.png"));
       New_Admission.setIcon(ii);
    }//GEN-LAST:event_New_AdmissionMouseExited

    private void New_AdmissionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_AdmissionMousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newaddclick.png"));
       New_Admission.setIcon(ii);
      
    }//GEN-LAST:event_New_AdmissionMousePressed

    private void New_AdmissionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_AdmissionMouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newaddhover.png"));
       New_Admission.setIcon(ii);
        new Admission().setVisible(true);
    }//GEN-LAST:event_New_AdmissionMouseReleased

    private void Search_AdmissionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_AdmissionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_AdmissionMouseClicked

    private void Search_AdmissionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_AdmissionMouseEntered
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover.png"));
       Search_Admission.setIcon(ii);
    }//GEN-LAST:event_Search_AdmissionMouseEntered

    private void Search_AdmissionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_AdmissionMouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/search.png"));
       Search_Admission.setIcon(ii);
    }//GEN-LAST:event_Search_AdmissionMouseExited

    private void Search_AdmissionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_AdmissionMousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchclick.png"));
       Search_Admission.setIcon(ii);
    }//GEN-LAST:event_Search_AdmissionMousePressed

    private void Search_AdmissionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_AdmissionMouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover.png"));
       Search_Admission.setIcon(ii);
       new SearchAdmission().setVisible(true);
       
    }//GEN-LAST:event_Search_AdmissionMouseReleased

    private void Admission_DetailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_DetailMouseEntered
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover.png"));
       Admission_Detail.setIcon(ii);
    }//GEN-LAST:event_Admission_DetailMouseEntered

    private void Admission_DetailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_DetailMouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detail.png"));
       Admission_Detail.setIcon(ii);
    }//GEN-LAST:event_Admission_DetailMouseExited

    private void Admission_DetailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_DetailMousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailclick.png"));
       Admission_Detail.setIcon(ii);
      
    }//GEN-LAST:event_Admission_DetailMousePressed

    private void Admission_DetailMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_DetailMouseReleased
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover.png"));
       Admission_Detail.setIcon(ii);
        new All_Admission_Detail().setVisible(true);
    }//GEN-LAST:event_Admission_DetailMouseReleased

    private void admissio_dublicateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicateMouseEntered
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicatehover.png"));
       admissio_dublicate.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicateMouseEntered

    private void admissio_dublicateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicateMouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicate.png"));
       admissio_dublicate.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicateMouseExited

    private void admissio_dublicateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicateMousePressed
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicateclick.png"));
       admissio_dublicate.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicateMousePressed

    private void admissio_dublicateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicateMouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicatehover.png"));
       admissio_dublicate.setIcon(ii);
       new SearchAdmission().setVisible(true);
    }//GEN-LAST:event_admissio_dublicateMouseReleased

    private void Admission_Detail1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail1MouseEntered
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover1.png"));
       Admission_Detail1.setIcon(ii);
    }//GEN-LAST:event_Admission_Detail1MouseEntered

    private void Admission_Detail1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail1MouseExited
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detail1.png"));
       Admission_Detail1.setIcon(ii);
    }//GEN-LAST:event_Admission_Detail1MouseExited

    private void Admission_Detail1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail1MousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailclick1.png"));
       Admission_Detail1.setIcon(ii);
       
    }//GEN-LAST:event_Admission_Detail1MousePressed

    private void Admission_Detail1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail1MouseReleased
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover1.png"));
       Admission_Detail1.setIcon(ii);
       new JanFees().setVisible(true);
    }//GEN-LAST:event_Admission_Detail1MouseReleased

    private void Search_Admission1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Admission1MouseClicked

    private void Search_Admission1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission1MouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover1.png"));
       Search_Admission1.setIcon(ii);
    }//GEN-LAST:event_Search_Admission1MouseEntered

    private void Search_Admission1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission1MouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/search1.png"));
       Search_Admission1.setIcon(ii);
    }//GEN-LAST:event_Search_Admission1MouseExited

    private void Search_Admission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission1MousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchclick1.png"));
       Search_Admission1.setIcon(ii);
      
    }//GEN-LAST:event_Search_Admission1MousePressed

    private void Search_Admission1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission1MouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover1.png"));
       Search_Admission1.setIcon(ii);
        new SearchByID().setVisible(true);
    }//GEN-LAST:event_Search_Admission1MouseReleased

    private void admissio_dublicate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate1MouseEntered
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicatehover.png"));
       admissio_dublicate1.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicate1MouseEntered

    private void admissio_dublicate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate1MouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicate.png"));
       admissio_dublicate1.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicate1MouseExited

    private void admissio_dublicate1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate1MousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicateclick.png"));
       admissio_dublicate1.setIcon(ii);
       
    }//GEN-LAST:event_admissio_dublicate1MousePressed

    private void admissio_dublicate1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate1MouseReleased
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/duplicatehover.png"));
       admissio_dublicate1.setIcon(ii);
       new fee().setVisible(true);
    }//GEN-LAST:event_admissio_dublicate1MouseReleased

    private void New_Admission1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_Admission1MouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/nfeeshover.png"));
       New_Admission1.setIcon(ii);
    }//GEN-LAST:event_New_Admission1MouseEntered

    private void New_Admission1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_Admission1MouseExited
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/nfees.png"));
       New_Admission1.setIcon(ii);
    }//GEN-LAST:event_New_Admission1MouseExited

    private void New_Admission1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_Admission1MousePressed
           //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/nfeesclick.png"));
       New_Admission1.setIcon(ii);
     
    }//GEN-LAST:event_New_Admission1MousePressed

    private void New_Admission1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_Admission1MouseReleased
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/nfeeshover.png"));
       New_Admission1.setIcon(ii);
         new fee().setVisible(true);
    }//GEN-LAST:event_New_Admission1MouseReleased

    private void Admission_Detail2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail2MouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover2.png"));
       Admission_Detail2.setIcon(ii);
    }//GEN-LAST:event_Admission_Detail2MouseEntered

    private void Admission_Detail2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail2MouseExited
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detail2.png"));
       Admission_Detail2.setIcon(ii);
    }//GEN-LAST:event_Admission_Detail2MouseExited

    private void Admission_Detail2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail2MousePressed
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailclick2.png"));
       Admission_Detail2.setIcon(ii);
       
    }//GEN-LAST:event_Admission_Detail2MousePressed

    private void Admission_Detail2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Admission_Detail2MouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/detailhover2.png"));
       Admission_Detail2.setIcon(ii);
       new All_Faculty_Detail().setVisible(true);
    }//GEN-LAST:event_Admission_Detail2MouseReleased

    private void Search_Admission2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_Admission2MouseClicked

    private void Search_Admission2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission2MouseEntered
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover2.png"));
       Search_Admission2.setIcon(ii);
    }//GEN-LAST:event_Search_Admission2MouseEntered

    private void Search_Admission2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission2MouseExited
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/search2.png"));
       Search_Admission2.setIcon(ii);
    }//GEN-LAST:event_Search_Admission2MouseExited

    private void Search_Admission2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission2MousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchclick2.png"));
       Search_Admission2.setIcon(ii);
       
    }//GEN-LAST:event_Search_Admission2MousePressed

    private void Search_Admission2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_Admission2MouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/searchhover2.png"));
       Search_Admission2.setIcon(ii);
       new SearchFaculty().setVisible(true);
    }//GEN-LAST:event_Search_Admission2MouseReleased

    private void admissio_dublicate2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate2MouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/resignhover.png"));
       admissio_dublicate2.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicate2MouseEntered

    private void admissio_dublicate2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate2MouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/resign.png"));
       admissio_dublicate2.setIcon(ii);
    }//GEN-LAST:event_admissio_dublicate2MouseExited

    private void admissio_dublicate2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate2MousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/resignclick.png"));
       admissio_dublicate2.setIcon(ii);
        
    }//GEN-LAST:event_admissio_dublicate2MousePressed

    private void admissio_dublicate2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admissio_dublicate2MouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/resignhover.png"));
       admissio_dublicate2.setIcon(ii);
       new Resignation_Letter().setVisible(true);
    }//GEN-LAST:event_admissio_dublicate2MouseReleased

    private void newfacultyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newfacultyMouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newfhover.png"));
       newfaculty.setIcon(ii);
    }//GEN-LAST:event_newfacultyMouseEntered

    private void newfacultyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newfacultyMouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newf.png"));
       newfaculty.setIcon(ii);
    }//GEN-LAST:event_newfacultyMouseExited

    private void newfacultyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newfacultyMousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newfclick.png"));
       newfaculty.setIcon(ii);
       
    }//GEN-LAST:event_newfacultyMousePressed

    private void newfacultyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newfacultyMouseReleased
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/newfhover.png"));
       newfaculty.setIcon(ii);
       new NewFaculty().setVisible(true);
    }//GEN-LAST:event_newfacultyMouseReleased

    private void feesincomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesincomeMouseEntered
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/incomehover.png"));
       feesincome.setIcon(ii);
    }//GEN-LAST:event_feesincomeMouseEntered

    private void feesincomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesincomeMouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/income.png"));
       feesincome.setIcon(ii);
    }//GEN-LAST:event_feesincomeMouseExited

    private void feesincomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesincomeMousePressed
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/incomeclick.png"));
       feesincome.setIcon(ii);
       
        
        //get sum all column value from database as Total_Income
        String sql = "SELECT SUM(FEESINCOME) AS TOTAL_INCOME FROM MOIN.ADMIN";
        try{
        rs = stmt.executeQuery(sql);
        rs.next();
        String income = rs.getString("TOTAL_INCOME");
        rs.close();
        javax.swing.JOptionPane.showMessageDialog(this, "Your Monthly Fees Income is: Rs. "+income);
        }
        catch(SQLException | HeadlessException e){
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
        try{rs.close(); pr.close();}
        catch(Exception e){
           
         }
        }
    }//GEN-LAST:event_feesincomeMousePressed

    private void feesincomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feesincomeMouseReleased
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/incomehover.png"));
       feesincome.setIcon(ii);
    }//GEN-LAST:event_feesincomeMouseReleased

    private void availablefacultyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablefacultyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_availablefacultyMouseClicked

    private void availablefacultyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablefacultyMouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/availablehover.png"));
       availablefaculty.setIcon(ii);
    }//GEN-LAST:event_availablefacultyMouseEntered

    private void availablefacultyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablefacultyMouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/available.png"));
       availablefaculty.setIcon(ii);
    }//GEN-LAST:event_availablefacultyMouseExited

    private void availablefacultyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablefacultyMousePressed
         //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/availableclick.png"));
       availablefaculty.setIcon(ii);
      
    }//GEN-LAST:event_availablefacultyMousePressed

    private void availablefacultyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availablefacultyMouseReleased
          //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/availablehover.png"));
       availablefaculty.setIcon(ii);
        new Available_Faculty().setVisible(true);
    }//GEN-LAST:event_availablefacultyMouseReleased

    private void totalincomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalincomeMouseEntered
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/tincomehover.png"));
       totalincome.setIcon(ii);
    }//GEN-LAST:event_totalincomeMouseEntered

    private void totalincomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalincomeMouseExited
        //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/tincome.png"));
       totalincome.setIcon(ii);
    }//GEN-LAST:event_totalincomeMouseExited

    private void totalincomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalincomeMousePressed
      //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/tincomeclick.png"));
       totalincome.setIcon(ii);
        //get sum of column value fromd database
        String sql = "SELECT SUM(FEESINCOME) AS TOTAL_INCOME FROM MOIN.ADMIN";
        try{
        rs = stmt.executeQuery(sql);
        rs.next();
        int fees = rs.getInt("TOTAL_INCOME");
        rs.close();
        //get salary from faculty database
        String sql2 = "SELECT *  FROM MOIN.FACULTY";
        rs = stmt.executeQuery(sql2);
        rs.next();
        int salary = rs.getInt("SALARY");
        rs.close();
        //get sum total salary
        String sql1 = "SELECT SUM("+salary+") AS TOTAL_SALARY FROM MOIN.FACULTY";
        rs = stmt.executeQuery(sql1);
        rs.next();
        int Salary = rs.getInt("TOTAL_SALARY");
        rs.close();
        //subruct fees from salary
        int total =  fees - Salary ;
        
        javax.swing.JOptionPane.showMessageDialog(this, "After Teachers Salary Your Income is: Rs. "+total);
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        }finally{
        try{rs.close(); pr.close();}
        catch(Exception e){
           
         }
        }
    }//GEN-LAST:event_totalincomeMousePressed

    private void totalincomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalincomeMouseReleased
       //get image and set image
       ImageIcon ii = new ImageIcon(getIconImage().getClass().getResource("/login/img/tincomehover.png"));
       totalincome.setIcon(ii);
    }//GEN-LAST:event_totalincomeMouseReleased

    private void updatesalaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesalaryMouseEntered
        //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/updatehover.png"));
         updatesalary.setIcon(ii);
    }//GEN-LAST:event_updatesalaryMouseEntered

    private void updatesalaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesalaryMouseExited
         //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/update.png"));
         updatesalary.setIcon(ii);
    }//GEN-LAST:event_updatesalaryMouseExited

    private void updatesalaryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesalaryMousePressed
        //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/updateclick.png"));
         updatesalary.setIcon(ii);
         
    }//GEN-LAST:event_updatesalaryMousePressed

    private void updatesalaryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatesalaryMouseReleased
         //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/updatehover.png"));
         updatesalary.setIcon(ii);
         new Update_Salary().setVisible(true);
    }//GEN-LAST:event_updatesalaryMouseReleased

    private void cleanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseEntered
       //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/cleanhover.png"));
         clean.setIcon(ii);
    }//GEN-LAST:event_cleanMouseEntered

    private void cleanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseExited
        //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/clean.png"));
         clean.setIcon(ii);
    }//GEN-LAST:event_cleanMouseExited

    private void cleanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMousePressed
        //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/cleanclick.png"));
         clean.setIcon(ii);
    }//GEN-LAST:event_cleanMousePressed

    private void cleanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanMouseReleased
         //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/cleanhover.png"));
         clean.setIcon(ii);
          //delete all income
        String sql = "DELETE FROM MOIN.ADMIN";
        try{
        pr = con.prepareStatement(sql);
        pr.execute();
        MessagePane ms = new MessagePane();
         ms.displayPane("Successfully Cleared");
        }catch(Exception e ){}finally{
        try{rs.close(); pr.close();}
        catch(Exception e){
           
         }
        }
    }//GEN-LAST:event_cleanMouseReleased

    private void createaccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseEntered
       //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/newaccounthover.png"));
         createaccount.setIcon(ii);
    }//GEN-LAST:event_createaccountMouseEntered

    private void createaccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseExited
       //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/newaccount.png"));
         createaccount.setIcon(ii);
    }//GEN-LAST:event_createaccountMouseExited

    private void createaccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMousePressed
        //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/newaccountclick.png"));
         createaccount.setIcon(ii);
        
    }//GEN-LAST:event_createaccountMousePressed

    private void createaccountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createaccountMouseReleased
       //set image in label 
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/newaccounthover.png"));
         createaccount.setIcon(ii);
         new Sign_Up.sing_Up().setVisible(true);
    }//GEN-LAST:event_createaccountMouseReleased

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

    private void jmenuitem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenuitem1MouseExited
      
    }//GEN-LAST:event_jmenuitem1MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        //set img in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/loghover.png"));
        jLabel10.setIcon(ii);
        jLabel10.setForeground(Color.red);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        //set img in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/log.png"));
        jLabel10.setIcon(ii);
        jLabel10.setForeground(Color.black);
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        //set img in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/logclick.png"));
        jLabel10.setIcon(ii);
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12));
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        //set img in label
        ImageIcon ii = new ImageIcon(getClass().getResource("/login/img/loghover.png"));
        jLabel10.setIcon(ii);
        jLabel10.setForeground(Color.red);
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14));
        new School_Management().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseReleased

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
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Admission;
    private javax.swing.JLabel Admission_Detail;
    private javax.swing.JLabel Admission_Detail1;
    private javax.swing.JLabel Admission_Detail2;
    private javax.swing.JLabel Faculty;
    private javax.swing.JLabel Fees;
    private javax.swing.JLabel New_Admission;
    private javax.swing.JLabel New_Admission1;
    private javax.swing.JLabel Search_Admission;
    private javax.swing.JLabel Search_Admission1;
    private javax.swing.JLabel Search_Admission2;
    private javax.swing.JLabel admin;
    private javax.swing.JLabel admissio_dublicate;
    private javax.swing.JLabel admissio_dublicate1;
    private javax.swing.JLabel admissio_dublicate2;
    private javax.swing.JLabel availablefaculty;
    private javax.swing.JLabel background;
    private javax.swing.JLabel clean;
    private javax.swing.JLabel createaccount;
    private javax.swing.JLabel feesincome;
    private javax.swing.JLabel framedrag;
    private javax.swing.JLabel jAdmission1;
    private javax.swing.JLabel jAdmissionDetails1;
    private javax.swing.JLabel jAdmissionDetails2;
    private javax.swing.JLabel jAdmissionDetails3;
    private javax.swing.JLabel jDublicateAdmission;
    private javax.swing.JLabel jDublicateAdmission1;
    private javax.swing.JLabel jDublicateAdmission2;
    private javax.swing.JLabel jFaculty;
    private javax.swing.JLabel jFees1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNewAdmission1;
    private javax.swing.JLabel jNewAdmission2;
    private javax.swing.JLabel jNewAdmission3;
    private javax.swing.JLabel jSearchAdmission1;
    private javax.swing.JLabel jSearchAdmission2;
    private javax.swing.JLabel jSearchAdmission3;
    private javax.swing.JLabel jclose;
    private javax.swing.JLabel jitem;
    private javax.swing.JLabel jmenuitem;
    private javax.swing.JLabel jmenuitem1;
    private javax.swing.JLabel jmenuitem2;
    private javax.swing.JLabel jmini;
    private javax.swing.JLabel jtime;
    private javax.swing.JLabel newfaculty;
    private javax.swing.JLabel totalincome;
    private javax.swing.JLabel updatesalary;
    // End of variables declaration//GEN-END:variables
}
