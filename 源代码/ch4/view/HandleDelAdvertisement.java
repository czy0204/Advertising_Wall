package ch4.view;
import java.awt.event.*;
import javax.swing.JOptionPane;
import ch4.data.*;
public class HandleDelAdvertisement implements ActionListener {
   DelAdvertisementView view ;          
   DelAdvertisement  delAdvertisement;  
   public HandleDelAdvertisement(){
      delAdvertisement = new DelAdvertisement();
   }
   public void actionPerformed(ActionEvent e) {
      delAdvertisement.setLogin(view.login);
      if(view.login.getLoginSuccess() == false){
        JOptionPane.showMessageDialog
        (null,"请先登录","消息对话框", JOptionPane.WARNING_MESSAGE);
         return;
      }
      String number = view.inputSerialNumber.getText().trim();
      boolean boo = delAdvertisement.delAdvertisement(number);
      if(boo)
         view.hintMess.setText("删除成功");
      else
         view.hintMess.setText("删除失败，没有该广告");
   }
   public void setView(DelAdvertisementView view) {
      this.view = view;
   }
}