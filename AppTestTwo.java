package ch4.test;
import ch4.data.*;
import java.io.File;
public class AppTestTwo {
   public static void main(String []args) {
      Login login = new Login();
      login.setID("����");
      login.setPassword("ilovethisgame");
      HandleLogin  handleLogin = new HandleLogin();
      login = handleLogin.handleLogin(login);
      if(login.getLoginSuccess()==false){
         System.out.println("��¼ʧ��");
         return;
      }
      else {
         System.out.println("��¼�ɹ������Է������");
      }
      AddAdvertisement  add = new AddAdvertisement();
      add.setLogin(login);
      Advertisement ad = new Advertisement();
      ad.setContent("�����Ļ���");
      File f = new File("flow.jpg");
      ad.setPictureFile(f);
      ad.setSerialNumber("AR008");
      add.addAdvertisement(ad);
      ad.setContent("��������");
      f = new File("water.jpg");  
      ad.setPictureFile(f);
      ad.setSerialNumber("YA007");
      add.addAdvertisement(ad);
   }
}
