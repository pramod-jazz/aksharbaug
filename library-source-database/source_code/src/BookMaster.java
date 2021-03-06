
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 * BookMaster.java
 *
 * Created on July 14, 2012, 9:54 AM
 */
import javax.swing.JOptionPane;



/**
 *
 * @author  Administrator
 */
public class BookMaster extends javax.swing.JFrame {
    MainClass mc=new MainClass();
    ResultSet rsbook;
    int rspos=0;
    int rscount=0;
    boolean chadd=false;
    /** Creates new form BookMaster */
    public BookMaster() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBookID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtBookTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtAuthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtYear = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtKeywords = new javax.swing.JTextField();
        CmdNew = new javax.swing.JButton();
        CmdSave = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TxtRack = new javax.swing.JTextField();
        CmdBookDetails = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        TxtBookID1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aksharbag Library : Book Master");
        setBackground(new java.awt.Color(255, 51, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Aksharbag Library - Books");

        jLabel2.setText("* Book ID:");

        TxtBookID.setEditable(false);
        TxtBookID.setText("jTextField1");

        jLabel3.setText("* Book Title:");

        TxtBookTitle.setText("jTextField1");

        jLabel4.setText("* Author:");

        TxtAuthor.setText("jTextField1");

        jLabel5.setText("Publisher:");

        TxtPublisher.setText("jTextField1");

        jLabel6.setText("Year Publish:");

        TxtYear.setText("jTextField1");

        jLabel7.setText("Search Keyword:");

        TxtKeywords.setText("jTextField1");

        CmdNew.setText("New");
        CmdNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNewActionPerformed(evt);
            }
        });

        CmdSave.setText("Save Or Update");
        CmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSaveActionPerformed(evt);
            }
        });

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        jLabel9.setText("Rack & Catalog:");

        TxtRack.setText("jTextField1");

        CmdBookDetails.setText("Details");
        CmdBookDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdBookDetailsActionPerformed(evt);
            }
        });

        jLabel11.setText("Book ID :");

        TxtBookID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBookID1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtYear)
                                        .addComponent(TxtPublisher)
                                        .addComponent(TxtAuthor)
                                        .addComponent(TxtBookTitle)
                                        .addComponent(TxtBookID, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtRack, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtKeywords, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtBookID1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CmdBookDetails))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(CmdNew)
                        .addGap(36, 36, 36)
                        .addComponent(CmdSave)
                        .addGap(33, 33, 33)
                        .addComponent(CmdClose)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtBookID1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdBookDetails))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TxtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtRack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdNew)
                    .addComponent(CmdSave)
                    .addComponent(CmdClose))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        try
        {
            
            this.setLocationRelativeTo(null);
            
            ClearText();
           
        
            Connection connection;          
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            ResultSet rs;
            
            //fill book category
            PreparedStatement stmt=connection.prepareStatement("select * from lib_book_category order by book_category");
            rs = stmt.executeQuery();
            while (rs.next()){
                
            }
            rs.close();
            
            
            //get book count
            stmt=connection.prepareStatement("select count(*) from lib_book_master");
            rs = stmt.executeQuery();
            rs.first();
            rscount=rs.getInt(1);

            //get book details
            Statement stmt1 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select * from lib_book_master order by book_id";
            rsbook = stmt1.executeQuery(sqlQuery);
            
            //display first record
            rsbook.first();
                 
            Display();         

        }
        catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_formWindowOpened

    private void CmdNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNewActionPerformed
        
        chadd=true;
        ClearText();
    }//GEN-LAST:event_CmdNewActionPerformed

    public static boolean isNumeric(String str)
    {
      return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    private void CmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSaveActionPerformed

        //validate entry and save record
        try
        {

        if (TxtBookTitle.getText().trim().length()==0 )
        {
                JOptionPane.showMessageDialog(null,"Enter book title.");
                return;  
        }
        
        if (TxtAuthor.getText().trim().length()==0 )
        {
                JOptionPane.showMessageDialog(null,"Enter author.");
                return;  
        }  
        
        if(TxtYear.getText() != null && TxtYear.getText().trim().length()!=0){
                if(!isNumeric(TxtYear.getText())){
                   JOptionPane.showMessageDialog(null,"Please insert valid  Number.");
                   return;
                }
            }
            
       

            
        
            //String strqr="";
            Connection connection;          
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);

            if (TxtBookID.getText().trim().length()==0 )
            {
                //strqr="insert into lib_book_master (book_title, book_author, book_publisher, book_publish_year, book_category, book_keyword) values ('" + TxtBookTitle.getText() + "','" + TxtAuthor.getText() +"','"+ TxtPublisher.getText() +"','" + TxtYear.getText() + "','" + CmbCategory.getSelectedItem().toString() +"','" + TxtKeywords.getText() +"')";
                rsbook.moveToInsertRow();
                
                rsbook.updateString("book_title",TxtBookTitle.getText());
                rsbook.updateString("book_author",TxtAuthor.getText());
                rsbook.updateString("book_publisher",TxtPublisher.getText());
                rsbook.updateString("book_publish_year",TxtYear.getText());
               
                rsbook.updateString("book_keyword",TxtKeywords.getText());
                rsbook.updateString("rack_catalogue",TxtRack.getText());
                

                rsbook.insertRow();
                
                rsbook.last();
                Display();
            }
            else
            {
                
                
                ResultSet rsmem2;
                Statement stmt2 = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sqlQuery = "select * from lib_book_master where book_id =  "+ TxtBookID.getText() + " order by book_id";
            rsmem2 = stmt2.executeQuery(sqlQuery);
            
            //display first record
            rsmem2.first();
                
                
                rsmem2.updateString("book_title",TxtBookTitle.getText());
                rsmem2.updateString("book_author",TxtAuthor.getText());
                rsmem2.updateString("book_publisher",TxtPublisher.getText());
                rsmem2.updateString("book_publish_year",TxtYear.getText());
                
                rsmem2.updateString("book_keyword",TxtKeywords.getText());
                rsmem2.updateString("rack_catalogue",TxtRack.getText());

                rsmem2.updateRow();
                rsmem2.refreshRow();
            }
            
            
            JOptionPane.showMessageDialog(null,"Record updated.");
        }
        catch (Exception e)
        {
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"Unable to save record.");
            return; 
        }
    }//GEN-LAST:event_CmdSaveActionPerformed

    private void CmdBookDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdBookDetailsActionPerformed
        //get member deatils
        try
        {
            //get database connection details
            MainClass mc=new MainClass();

            //open connection
            Connection connection;
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            String str="";
            str="select * from lib_book_master where book_id =? ";
            PreparedStatement pst=connection.prepareStatement(str);
            pst.setString(1, TxtBookID1.getText());

            ResultSet rs;
            rs=pst.executeQuery();
            
            if(rs != null){
            
            if (rs.next())
            {
                TxtBookTitle.setText(rs.getString("book_title"));
                TxtAuthor.setText(rs.getString("book_author"));
                TxtBookID.setText(rs.getString("book_id"));
                TxtRack.setText(rs.getString("rack_catalogue"));
                TxtKeywords.setText(rs.getString("book_keyword"));
                TxtPublisher.setText(rs.getString("book_publisher"));
                
               
                

               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid book id.");
                TxtBookID.setText("");
                TxtBookTitle.setText("");
             
                return;
            }
            }

        }
        catch (Exception e)
        {
            System.err.println(e);
            System.exit(1);
        }
    }//GEN-LAST:event_CmdBookDetailsActionPerformed

    private void TxtBookID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBookID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBookID1ActionPerformed
    
    private void Display()
    {
        try
        {
            //clear text of fields for entry/display old data
            TxtBookID.setText(rsbook.getString("book_id"));
            TxtBookTitle.setText(rsbook.getString("book_title"));
            TxtAuthor.setText(rsbook.getString("book_author"));
            TxtPublisher.setText(rsbook.getString("book_publisher"));
            TxtYear.setText(rsbook.getString("book_publish_year"));
            
            TxtKeywords.setText(rsbook.getString("book_keyword"));
            TxtRack.setText(rsbook.getString("rack_catalogue"));
            
            
        }
        catch (Exception e)
        {
            System.err.println(e);
            
        }
    }
    
    private void ClearText()
    {
        //clear text of fields for entry/display old data
        TxtBookID.setText("");
        TxtBookTitle.setText("");
        TxtAuthor.setText("");
        TxtPublisher.setText("");
        TxtYear.setText("");
        
        TxtKeywords.setText("");
        TxtRack.setText("");
        
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookMaster().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdBookDetails;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdNew;
    private javax.swing.JButton CmdSave;
    private javax.swing.JTextField TxtAuthor;
    private javax.swing.JTextField TxtBookID;
    private javax.swing.JTextField TxtBookID1;
    private javax.swing.JTextField TxtBookTitle;
    private javax.swing.JTextField TxtKeywords;
    private javax.swing.JTextField TxtPublisher;
    private javax.swing.JTextField TxtRack;
    private javax.swing.JTextField TxtYear;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
}
