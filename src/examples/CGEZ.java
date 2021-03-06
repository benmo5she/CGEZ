//test
package examples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CGEZ extends javax.swing.JFrame {
    
    public CGEZ() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        createTerm = new javax.swing.JCheckBox();
        MPI = new javax.swing.JCheckBox();
        createUser = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        nuser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        npass = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nadId = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        apiUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apiPass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        terminalNumber = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        server = new javax.swing.JTextField();
        xmcUser = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        xmcPass = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        xmcId = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESP v1.0");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Additional Functions"));
        jPanel3.setName("test"); // NOI18N

        createTerm.setSelected(true);
        createTerm.setText("Create Terminal");
        createTerm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                createTermItemStateChanged(evt);
            }
        });

        MPI.setSelected(true);
        MPI.setText("Create MID");
        MPI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MPIItemStateChanged(evt);
            }
        });

        createUser.setSelected(true);
        createUser.setText("Create User");
        createUser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                createUserItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(createTerm)
                    .add(MPI)
                    .add(createUser))
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(createTerm)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(MPI)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(createUser))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("New User Details"));

        jLabel9.setText("Username:");

        jLabel8.setText("Password");

        jLabel12.setText("Additional ID:");

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jLabel9)
                        .add(71, 71, 71)
                        .add(nuser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(jLabel12)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(nadId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(109, 109, 109)
                .add(jLabel8)
                .add(18, 18, 18)
                .add(npass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 107, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel8)
                        .add(npass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(nuser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jLabel9))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel12)
                    .add(nadId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Merchant details"));
        jPanel5.setName("test"); // NOI18N

        jLabel5.setText("Username:");

        jLabel7.setText("Password:");

        jLabel2.setText("Terminal Number:");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel5))
                .add(18, 18, 18)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(terminalNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(187, 187, 187))
                    .add(jPanel5Layout.createSequentialGroup()
                        .add(apiUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel7)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                .add(apiPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(apiUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(apiPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(terminalNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Operator details"));
        jPanel6.setName("test"); // NOI18N

        jLabel6.setText("Username:");

        jLabel10.setText("Server's XMC:");

        server.setText("https://one1t.creditguard.co.il:8016");
        server.setName("server"); // NOI18N

        jLabel11.setText("Password:");

        jLabel13.setText("Additional ID:");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel10)
                    .add(jLabel6)
                    .add(jLabel13))
                .add(50, 50, 50)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xmcId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jPanel6Layout.createSequentialGroup()
                            .add(xmcUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(100, 100, 100)
                            .add(jLabel11)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                            .add(xmcPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(server)))
                .add(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(server, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xmcUser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11)
                    .add(xmcPass, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(xmcId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reset");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .add(155, 155, 155)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton4)
                .add(130, 130, 130))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton4)
                    .add(jButton3))
                .add(39, 39, 39))
        );

        jTabbedPane1.addTab("Add Merchant", jPanel1);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 661, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Command X", jPanel4);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 641, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MPIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MPIItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_MPIItemStateChanged

    private void createTermItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_createTermItemStateChanged
        if(createTerm.isSelected())
        {
            terminalNumber.setEnabled(true);
            terminalNumber.setText("");
        }
        else
        {
            terminalNumber.setEnabled(false);
            terminalNumber.setText("Disabled");
        }
        validate();
        repaint();
    }//GEN-LAST:event_createTermItemStateChanged
    private void createConfig()
    {
      String oldFileName = System.getProperty("user.dir") + "/scripts/config.csv";
      String tmpFileName = System.getProperty("user.dir") + "/scripts/config" + System.currentTimeMillis() + ".csv";

      BufferedReader br = null;
      BufferedWriter bw = null;
      try {
         br = new BufferedReader(new FileReader(oldFileName));
         bw = new BufferedWriter(new FileWriter(tmpFileName));
         String line=br.readLine();
         bw.write(line+System.getProperty("line.separator"));
         line=server.getText() + "," + ","  + "," + terminalNumber.getText() + "," + xmcUser.getText() + "," + xmcPass.getText() + "," + xmcId.getText() + ","
                 + "," + "," + "," + apiUser.getText() + "," + apiPass.getText() + "," + nuser.getText() + "," + npass.getText() + "," + nadId.getText();
         bw.write(line);
//xmcUrl,gatewayIp,port,terminalNumber,loginName,password,additionalId,merchantId,terminalNumber2,terminalNumber3,MerchantName,MerchantPassword
               } catch (Exception e) {
         return;
      } finally {
         try {
            if(br != null)
               br.close();
         } catch (IOException e) {
            //
         }
         try {
            if(bw != null)
               bw.close();
         } catch (IOException e) {
            //
         }
      }
            // Once everything is complete, delete old file..
      File oldFile = new File(oldFileName);
      oldFile.delete();

      // And rename tmp file's name to old file name
      File newFile = new File(tmpFileName);
      newFile.renameTo(oldFile);
    }
    private String addMerchant()
    {
      String oldFileName = System.getProperty("user.dir") + "/addFullMerchant.jmx";
      String tmpFileName = System.getProperty("user.dir") + "/addFullMerchant" + System.currentTimeMillis() + ".jmx";

            BufferedReader br = null;
      BufferedWriter bw = null;
      try {
         br = new BufferedReader(new FileReader(oldFileName));
         bw = new BufferedWriter(new FileWriter(tmpFileName));
         String line;
         while ((line = br.readLine()) != null) {
            if (line.contains("testname=\"addTerminals\"")){
                if(createTerm.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\"");
            }else if (line.contains("testname=\"transmitTerminals\"")){
                if(createTerm.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\"");   
            }else if (line.contains("testname=\"addMerchantMPI\"")){
                if(MPI.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\"");            
            }else if (line.contains("testname=\"getMerchantMPIs\"")){
                if(MPI.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\""); 
            }else if (line.contains("testname=\"addMPITerminal\"")){
                if(MPI.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\"");
            }else if (line.contains("testname=\"addUser\"")){
                if(createUser.isSelected())
                    line=line.replace("enabled=\"false\"","enabled=\"true\""); 
            }else if (line.contains("<stringProp name=\"filename\">C:\\Users\\Ben\\Desktop\\Jmeter\\scripts\\config.csv</stringProp>"))
                    line=line.replace("C:\\Users\\Ben\\Desktop\\Jmeter\\scripts\\config.csv",System.getProperty("user.dir") + "/scripts/config.csv");             
            //<stringProp name="filename">C:\Users\Ben\Desktop\Jmeter\scripts\config.csv</stringProp>
            //System.getProperty("user.dir") + "/scripts/config.csv"
            bw.write(line+"\n");
         }
      } catch (Exception e) {
         return "";
      } finally {
         try {
            if(br != null)
               br.close();
         } catch (IOException e) {
            //
         }
         try {
            if(bw != null)
               bw.close();
         } catch (IOException e) {
            //
         }
      }
      // Once everything is complete, delete old file..
      /*File oldFile = new File(oldFileName);
      oldFile.delete();

      // And rename tmp file's name to old file name
      File newFile = new File(tmpFileName);
      newFile.renameTo(oldFile);*/
return tmpFileName;
   }
    private String createTest(String jmx)
    {
            //jmeter -n -t D:\TestScripts\script.jmx -l D:\TestScripts\scriptresults.jtl
        BufferedWriter bw = null;
        String tmpFileName = System.getProperty("user.dir") + "/apache-jmeter-3.1/bin/tmpTst.bat";
        try
        {
                 bw = new BufferedWriter(new FileWriter(tmpFileName));
         bw.write("@echo off"+System.getProperty("line.separator"));
         bw.write("cd " + System.getProperty("user.dir") + "\\apache-jmeter-3.1\\bin\\" + System.getProperty("line.separator"));
         bw.write("jmeter -n -t " + jmx + " -l " + System.getProperty("user.dir") + "\\scriptresults.jtl");
         bw.write(System.getProperty("line.separator") + "taskkill /im cmd.exe");
//xmcUrl,gatewayIp,port,terminalNumber,loginName,password,additionalId,merchantId,terminalNumber2,terminalNumber3,MerchantName,MerchantPassword
               } catch (Exception e) {
         return "";
      } finally {
         try {
            if(bw != null)
               bw.close();
         } catch (IOException e) {
            //
         }
      }    
       /* try
        {
         Runtime.getRuntime().exec("cmd.exe /c start " + tmpFileName);
        } catch (Exception e) {
             return "";
        }*/   
       return "cmd /c start /wait " + tmpFileName;
    }
    private void checkRslt()
    {
        String csvFile=System.getProperty("user.dir") + "\\scriptresults.jtl";
                BufferedReader br = null;
        String line = "";
        //Path p1=Paths.get(csvFile);
        String cvsSplitBy = ",";
        String rslt="";
                try {

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine();
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] tests = line.split(cvsSplitBy);
                rslt+="Test: " + tests[2] + " Status: " + tests[7] + System.getProperty("line.separator");
                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            }
            JOptionPane.showMessageDialog(null, rslt,"Results",JOptionPane.INFORMATION_MESSAGE);
            //p1 = Paths.get(csvFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                     boolean success = (new File(csvFile)).delete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        createConfig();
        String tmp=addMerchant();
        String rn=createTest(tmp);        
        try{
                 Process p=Runtime.getRuntime().exec(rn);   
                 JOptionPane.showMessageDialog(null, "Proccessing","Results",JOptionPane.INFORMATION_MESSAGE);
                 p.waitFor();
         } catch (IOException e) {
            //
         } catch (InterruptedException ex) {
            Logger.getLogger(CGEZ.class.getName()).log(Level.SEVERE, null, ex);
        }
        checkRslt();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void createUserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_createUserItemStateChanged
            if(createUser.isSelected())
            {                
                nuser.setEnabled(true);
                npass.setEnabled(true);
                nadId.setEnabled(true);
            }
            else
            {
                nuser.setEnabled(false);
                npass.setEnabled(false);
                nadId.setEnabled(false);                
            }
            nuser.setText("");
            npass.setText("");
            nadId.setText("");
            validate();
            repaint();
    }//GEN-LAST:event_createUserItemStateChanged
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CGEZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CGEZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CGEZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CGEZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CGEZ().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox MPI;
    private javax.swing.JTextField apiPass;
    private javax.swing.JTextField apiUser;
    private javax.swing.JCheckBox createTerm;
    private javax.swing.JCheckBox createUser;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nadId;
    private javax.swing.JTextField npass;
    private javax.swing.JTextField nuser;
    private javax.swing.JTextField server;
    private javax.swing.JTextField terminalNumber;
    private javax.swing.JTextField xmcId;
    private javax.swing.JTextField xmcPass;
    private javax.swing.JTextField xmcUser;
    // End of variables declaration//GEN-END:variables
    
}
