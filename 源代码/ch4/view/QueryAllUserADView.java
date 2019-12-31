package ch4.view;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import ch4.data.*;
public class QueryAllUserADView extends JPanel {
   public Login login; 
   JButton submit;                             
   public AdvertisingBoardView  pCenter ;      
   HandleQueryAllUserAD  handleQueryAllUserAD;  
   QueryAllUserADView() {
      initView();
      registerListener() ;
   }
   public void setLogin(Login login){
      this.login = login;
   }
   private void initView() {
      setLayout(new BorderLayout());
      JPanel pNorth = new JPanel(); 
      pCenter = new AdvertisingBoardView();
      submit = new JButton("浏览全部广告");
      pNorth.add(submit);
      add(pNorth,BorderLayout.NORTH);
      add(pCenter,BorderLayout.CENTER);
   }
   private void registerListener() {
      handleQueryAllUserAD = new HandleQueryAllUserAD();
      handleQueryAllUserAD.setView(this);
      submit.addActionListener(handleQueryAllUserAD);
   }
}