import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javastdapp.LoginForm;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Starting extends JFrame{
	
	public Starting() {
		// TODO Auto-generated constructor stub
		ImageIcon ic=new ImageIcon("..\\..\\iamg\\course.png");
		JPanel jp=new JPanel();
		jp.setLayout(new BorderLayout());
		JLabel lb=new JLabel("Welcome to The Course Mangement ");
                lb.setBounds(200, 200, 400 , 350);

		jp.add(lb);
		
		JProgressBar pb=new JProgressBar();
		pb.setStringPainted(true);
		pb.setMaximum(0);
		pb.setMaximum(100);
		jp.add(pb, BorderLayout.SOUTH);
		
		add(jp);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setContentPane(jp);
//	    this.setLocationRelativeTo(null);
            setLocation(250,250);
	    setVisible(true);
	    
		setSize(400,300);
		
		for(int i=0; i<=1000; i++){
			pb.setValue(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                        if(i ==74){
                            try {
                                Thread.sleep(1307);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Starting.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(i ==39){
                            try {
                                Thread.sleep(307);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Starting.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if(i ==59){
                            try {
                                Thread.sleep(2307);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Starting.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
			if (i == 100) {
                            
				setVisible(false);
                                this.dispose();
                                new LoginForm();
				//call the class here which you want to show
			}
                        
                   
		}
		
	}
	
	public static void main(String args[]) {
		new Starting();
	}
}
