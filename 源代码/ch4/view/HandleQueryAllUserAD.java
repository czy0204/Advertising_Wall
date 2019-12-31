package ch4.view;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import ch4.data.*;
public class HandleQueryAllUserAD implements ActionListener {
   QueryAllUserAD  queryAll;
   QueryAllUserADView view ;
   public HandleQueryAllUserAD(){
      queryAll = new QueryAllUserAD();
   }
   public void actionPerformed(ActionEvent e) {
      queryAll.setLogin(view.login);
      if(view.login.getLoginSuccess() == false){
        JOptionPane.showMessageDialog
        (null,"���ȵ�¼","��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
         return;
      }
      Advertisement [] ad = queryAll.queryAllUser();
      if(ad == null ) return;
      AdvertisingBoard board = new AdvertisingBoard(); 
      board.setAdvertisement(ad);                     
      view.pCenter.setAdvertisingBoard(board);        
      view.pCenter.next.doClick();
   }
   public void setView(QueryAllUserADView view) {
      this.view = view;
   }
}