package ch4.test;
import ch4.data.*;
import java.io.File;
public class AppTestTwo {
   public static void main(String []args) {
      Login login = new Login();
      login.setID("王林");
      login.setPassword("ilovethisgame");
      HandleLogin  handleLogin = new HandleLogin();
      login = handleLogin.handleLogin(login);
      if(login.getLoginSuccess()==false){
         System.out.println("登陆失败");
         return;
      }
      else {
         System.out.println("登陆成功，可以发布广告");
      }
      AddAdvertisement  add = new AddAdvertisement();
      add.setLogin(login);
      Advertisement ad = new Advertisement();
      ad.setContent("美丽的花都");
      File f = new File("flow.jpg");
      ad.setPictureFile(f);
      ad.setSerialNumber("AR008");
      add.addAdvertisement(ad);
      ad.setContent("美丽旅游");
      f = new File("water.jpg");  
      ad.setPictureFile(f);
      ad.setSerialNumber("YA007");
      add.addAdvertisement(ad);
   }
}
