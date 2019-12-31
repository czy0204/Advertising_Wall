package ch4.view;
import javax.swing.*;
import java.awt.*;
import ch4.data.*;
public class DelAdvertisementView extends JPanel {
   Login login; 
   JTextField inputSerialNumber;  
   JButton submit;              
   JTextField hintMess; 
   HandleDelAdvertisement handleDelAdvertisement;
   DelAdvertisementView() {
      initView();
      registerListener() ;
   }
   public void setLogin(Login login){
      this.login = login;
   }
   private void initView() {
      hintMess = new JTextField(20);
      hintMess.setEditable(false);
      inputSerialNumber = new JTextField(20);
      submit = new JButton("删除广告");
      add(new JLabel("输入广告的序列号"));
      add(inputSerialNumber);
      add(submit);
      add(hintMess);
   }
   private void registerListener() {
      handleDelAdvertisement = new HandleDelAdvertisement();
      handleDelAdvertisement.setView(this);
      submit.addActionListener(handleDelAdvertisement);
   }
}