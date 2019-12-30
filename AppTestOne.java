package ch4.test;
import ch4.data.*;
public class AppTestOne { 
   public static void main(String []args) {
      Register user = new Register();
      user.setID("����");
      user.setPassword("ilovethisgame");
      HandleRegister handleRegister = new HandleRegister();
      boolean isOK = handleRegister.handleRegister(user);
      if(isOK){
         System.out.println("ע��ɹ�");
      }
      else {
         System.out.println("ע��ʧ�ܣ��뻻һ��ID");
      }
   }
}