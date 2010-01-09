package test;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.*;
//��������������Ƕ��ɫѡ����ʱҪ�õ���
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.colorchooser.ColorSelectionModel;

public class CorlorChooserTest extends JFrame
implements ActionListener,ChangeListener{

/**
* @param args
*/
public static void main(String[] args) {
   // TODO Auto-generated method stub
        new CorlorChooserTest();
}

public CorlorChooserTest(){
   biuldFrame();
}
private void biuldFrame(){
   JButton jbt_open=new JButton("������ɫѡ��");
   JButton jbt_save=new JButton("�ı���ɫ");
  
   JButton jbt_anotherUsing=new JButton("��ɫѡ������һ�÷�");
   //��Ӽ�����
   jbt_open.addActionListener(this);
   jbt_save.addActionListener(this);
   jbt_anotherUsing.addActionListener(this);
  
   //��������趨һ�������ֹ�����
   Container ctnr=this.getContentPane();
   ctnr.setLayout(new FlowLayout());
  
   ctnr.add(jbt_open);
   ctnr.add(jbt_save);
   ctnr.add(jbt_anotherUsing);
   this.pack();
  
   //�趨�����������Ļ������
   //��ȡ��Ļ�Ĵ�С��...
   Dimension scrnDim=Toolkit.getDefaultToolkit().getScreenSize();
   //���㱾�������ʼλ��
   //ע�ⲻҪʹ��this.width��this.height����ȡ������Ŀ�͸�
   //��Ȼ����λ�ò�����Ļ���룬ԭ���������Ϊpack������Ӱ��
   //getSize�����������¼�����pack��Ĵ����С
   int x=(scrnDim.width-this.getSize().width)/2;
   int y=(scrnDim.height-this.getSize().height)/2;
  
   this.setLocation(x,y);
   this.setVisible(true);
   //�����趨����Ĺرն���
   this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   
}
private Color chooseColor(Component comp){
   //��ɫѡ��Ի���Ĳ������� 
   //��һ��ʾ�丸�ؼ����Ƕ����ؼ��������ࣩ����һ�����ؼ�
   //��ʾʱ���Ը��ؼ���Ϊ������ʾ���ζ��ǶԻ���ı���
   //�����ǣ�ȡ��ѡ��ʱ���ص�Ĭ����ɫ����Ĭ����ɫȡ��
   //���������ı���ɫ��
   Color rsltColor =JColorChooser.showDialog(this,
     "��ɫѡ��",
     comp.getBackground());
   return rsltColor;
}
//*********<<��Ƕ��ɫѡ������ʾ��******************************************************* 

private JColorChooser jcc=new JColorChooser();
//����ɫѡ����ѡ���¼���Ӽ�����
private void anotherUsingDemo() {
   JDialog dlg=new javax.swing.JDialog();
   dlg.setTitle("��Ƕ��ɫѡ����");
  
   JLabel jlb_top=new JLabel("�������ɫѡ��������Ƕ��");
   jlb_top.setForeground(Color.MAGENTA);
   //��Ϊ��������ɫѡ���������Ը��乹����һ����ʼ��ɫ
   //����û����
  
   jcc.getSelectionModel().addChangeListener(this);
  
   Container c=dlg.getContentPane();
   c.add(jlb_top,BorderLayout.NORTH );
   c.add(jcc,BorderLayout.CENTER);
  
   dlg.pack();
   dlg.setVisible(true);
   dlg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
}
public void stateChanged(ChangeEvent arg0) {
   // TODO Auto-generated method stub
   //��������Ǵ�����ɫѡ����ѡ���¼���
    
   //ѡ�����ɫ
   Color selectedColor=jcc.getColor();
   //�趨�������������ť�ı���ɫ
  
   Component[] comps=this.getContentPane().getComponents();
   //����ʹ����һ�����������ӿؼ��ķ���
   for(int i=0;i<comps.length;i++){
    //�ж�ĳ�ؼ��������Ƿ�ΪJButton
    //����֪�����һ���ؼ�������λ��
    //���������ʹ�ã������û��
    //����Щ�ؼ�ŪΪʵ�������������鷳����
    if( (comps[i] instanceof JButton)&&
      (i==comps.length -1)){
     comps[i].setBackground(selectedColor);
    }
   }
}
//****************��Ƕ��ɫѡ������ʾ��>>************************************************  
public void actionPerformed(ActionEvent arg0) {
   // TODO Auto-generated method stub
   String evtCmd=arg0.getActionCommand();
  
   if(evtCmd.equals("������ɫѡ��")){
    //ע���¼�Դת�ͣ����������ȷ֪��
    //�¼�Դ�����ͣ���Ȼ����ת��ʧ�ܶ��׳��쳣��
    JButton jbt_bk=(JButton)arg0.getSource();
   
    jbt_bk.setBackground(this.chooseColor(this));
   }else if(evtCmd.equals("�ı���ɫ")){
            JButton jbt_bk=(JButton)arg0.getSource();
   
    jbt_bk.setForeground(this.chooseColor(this));
   }else if(evtCmd.equals("��ɫѡ������һ�÷�")){
    anotherUsingDemo();
   }
}
}
