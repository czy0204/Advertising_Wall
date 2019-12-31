package ch4.view;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import ch4.data.Login;
public class IntegrationView extends JFrame{
    JTabbedPane tabbedPane;
    RegisterView  regisView;
    LoginView loginView;
    AddAdvertisementView addAdvertisementView;
    DelAdvertisementView delAdvertisementView;
    QueryAllUserADView  queryAllUserADView;
    QueryOneUserADView queryOneUserADView;
    Login login;
    public IntegrationView(){
        regisView = new RegisterView();
        login = new Login();
        loginView = new LoginView();
        addAdvertisementView = new AddAdvertisementView();
        delAdvertisementView = new DelAdvertisementView();
        queryAllUserADView = new QueryAllUserADView();
        queryOneUserADView = new QueryOneUserADView();
        loginView.setLogin(login);
        addAdvertisementView.setLogin(login);
        delAdvertisementView.setLogin(login);
        queryAllUserADView.setLogin(login);
        queryOneUserADView.setLogin(login);
        tabbedPane=
        new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.add("登录",loginView); 
        tabbedPane.add("注册",regisView);  
        tabbedPane.add("添加广告",addAdvertisementView);
        tabbedPane.add("删除广告",delAdvertisementView); 
        tabbedPane.add("浏览全部用户广告",queryAllUserADView);
        tabbedPane.add("浏览某个用户广告",queryOneUserADView);
        tabbedPane.validate();
        add(tabbedPane,BorderLayout.CENTER); 
        setBounds(100,100,1200,560);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}