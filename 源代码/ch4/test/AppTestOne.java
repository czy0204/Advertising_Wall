package ch4.test;
import ch4.data.*;
public class AppTestOne { 
   public static void main(String []args) {
      Register user = new Register();
      user.setID("王林");
      user.setPassword("ilovethisgame");
      HandleRegister handleRegister = new HandleRegister();
      boolean isOK = handleRegister.handleRegister(user);
      if(isOK){
         System.out.println("注册成功");
      }
      else {
         System.out.println("注册失败，请换一个ID");
      }
   }
}