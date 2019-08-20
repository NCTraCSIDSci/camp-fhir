package utils;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;


public class DemoJFileChooser extends JPanel
   implements ActionListener {
   JButton go;
   
   JFileChooser chooser;
   String choosertitle;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   
  public DemoJFileChooser() {
    go = new JButton("Browse");
    go.setBounds(554, 255, 78, 23);
    go.addActionListener(this);
    setLayout(null);
    
    textField = new JTextField();
    textField.setBounds(198, 256, 346, 20);
    add(textField);
    textField.setColumns(10);
    add(go);
    
    JLabel lblDestinationFolder = new JLabel("User:");
    lblDestinationFolder.setBounds(54, 150, 96, 14);
    add(lblDestinationFolder);
    
    textField_1 = new JTextField();
    textField_1.setBounds(198, 144, 346, 20);
    add(textField_1);
    textField_1.setColumns(10);
    
    JLabel label = new JLabel("Destination Folder:");
    label.setBounds(54, 259, 96, 14);
    add(label);
    
    textField_2 = new JTextField();
    textField_2.setBounds(198, 175, 346, 20);
    textField_2.setColumns(10);
    add(textField_2);
    
    JLabel lblPassword = new JLabel("Password:");
    lblPassword.setBounds(54, 181, 129, 14);
    add(lblPassword);
    
    JLabel lblDatabase = new JLabel("Database:");
    lblDatabase.setBounds(54, 212, 129, 14);
    add(lblDatabase);
    
    textField_3 = new JTextField();
    textField_3.setBounds(198, 206, 346, 20);
    textField_3.setColumns(10);
    add(textField_3);
    
    JTextArea textArea = new JTextArea();
    textArea.setBounds(10, 325, 635, 187);
    add(textArea);
    

    
    JComboBox<String> cb = new JComboBox<String>();
    cb.setModel(new DefaultComboBoxModel(new String[] {"Oracle", "MySql", "PostgreSQL"}));
    cb.setBounds(198, 100, 254, 20);
    add(cb);
    
    JLabel lblDatabaseSource = new JLabel("Database Source:");
    lblDatabaseSource.setBounds(54, 103, 96, 14);
    add(lblDatabaseSource);
    

   }

  public void actionPerformed(ActionEvent e) {
    int result;
        
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      System.out.println("getCurrentDirectory(): " 
         +  chooser.getCurrentDirectory());
      System.out.println("getSelectedFile() : " 
         +  chooser.getSelectedFile());
      this.textField.setText(chooser.getCurrentDirectory().toString());
      }
    else {
      System.out.println("No Selection ");
      }
     }
   
  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
    }
    
  public static void main(String s[]) {
    JFrame frame = new JFrame("");
    DemoJFileChooser panel = new DemoJFileChooser();
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        }
      );
    frame.getContentPane().add(panel,"Center");
    frame.setSize(panel.getPreferredSize());
    frame.setVisible(true);
    }
}