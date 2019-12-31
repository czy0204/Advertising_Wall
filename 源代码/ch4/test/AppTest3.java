package ch4.test;
import ch4.data.*;
public class AppTest3 {
   public static void main(String []args) {
      Login login = new Login();
      login.setID("gengxy");
      login.setPassword("123456");
      HandleLogin  handleLogin = new HandleLogin();
      login = handleLogin.handleLogin(login);
      if(login.getLoginSuccess()==false){
         System.out.println("登录失败");
         return;
      }
      else {
         System.out.println("登录成功，可以浏览某会员广告");
      }
      QueryOneUserAD  query = new QueryOneUserAD();
      query.setLogin(login);
      Advertisement [] ad = query.queryOneUser("王林");
      for(int i=0;i<ad.length;i++){
          System.out.println("广告内容:"+ad[i].getContent());
          System.out.println("广告图片:"+ad[i].getImage().toString());
      }
   }
}
