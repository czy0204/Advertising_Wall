package ch4.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ch4.data.*;
public class AdvertisingBoardView extends JPanel {
   AdvertisingBoard advertisingBoard;   
   public JTextArea showContent;       
   public ImageJPanel showImage;       
   public JButton next,previous;     
   public JLabel showID   ;                
   public JLabel showNumber ;               
   HandleAdvertisingBoard handleAdvertisingBoard; 
   public AdvertisingBoardView() {
      initView();
      registerListener();
   } 
   public void initView() {
      setLayout(new BorderLayout()); 
      showImage = new ImageJPanel();
      showContent = new JTextArea(12,12);
      showContent.setToolTipText("在图上单击鼠标可调整观看");
      showContent.setForeground(Color.blue);
      showContent.setWrapStyleWord(true);
      showContent.setLineWrap(true); 
      showContent.setFont(new Font("宋体",Font.BOLD,18));
      next = new JButton("下一广告");
      previous = new JButton("上一广告");
      JPanel pNorth = new JPanel();
      pNorth.setBackground(Color.cyan) ;
      showID = new JLabel();
      showNumber = new JLabel();
      pNorth.add(new JLabel("发布者的ID:"));
      pNorth.add(showID);
      pNorth.add(new JLabel("广告的序列号:"));
      pNorth.add(showNumber);
      add(pNorth,BorderLayout.NORTH);
      JPanel pCenter = new JPanel();
      pCenter.setLayout(new GridLayout(1,2));
      pCenter.add(new JScrollPane(showContent));
      pCenter.add(showImage);
      add(pCenter,BorderLayout.CENTER);
      JPanel pSouth = new JPanel();
      pSouth.add(next);
      pSouth.add(previous);
      add(pSouth,BorderLayout.SOUTH);
      validate();
   }
   public void registerListener(){
      handleAdvertisingBoard = new HandleAdvertisingBoard();
      next.addActionListener(handleAdvertisingBoard);
      previous.addActionListener(handleAdvertisingBoard);
      handleAdvertisingBoard.setView(this);
   }
   public void setAdvertisingBoard(AdvertisingBoard advertisingBoard) {
      this.advertisingBoard = advertisingBoard;
   }
}
