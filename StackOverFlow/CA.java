//package StackOverFlow;
//
//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//
//import javax.swing.BoxLayout;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class CA extends JFrame {
//public CA() {
//	setSize(300,200);
//    setLayout(new BorderLayout());
//
//    JPanel topPanel = new JPanel();  
//    add(topPanel, BorderLayout.NORTH);                
//
//    BoxLayout layout = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
//
//topPanel.setLayout(layout);
//
//    JPanel panelNome = new JPanel(new FlowLayout(FlowLayout.LEADING));
//
//panelNome.add(lbNome);
//
//panelNome.add(txtNome);
//    topPanel.add(panelNome);
//
//    JPanel panelMatricula = new JPanel(new FlowLayout(FlowLayout.LEADING));
//
//panelMatricula.add(lbMatricula);
//
//panelMatricula.add(tfMatricula);
//    topPanel.add(panelMatricula);
//
//
//topPanel.add(btCadastrar);
//
//setVisible(true);
//
//
//}
//}
