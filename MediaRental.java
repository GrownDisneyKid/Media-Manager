import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*Add an attribute to Media class to store indication when media object is rented versus available. 
Add code to constructor and create get and set methods as appropriate.
 Add any additional constructors and methods needed to support the below functionality */

public class MediaRental extends JFrame implements ActionListener {

    Object choice = null;

    JMenuItem loadMenu;
    JMenuItem findMenu;
    JMenuItem rentMenu;
    JMenuItem exitMenu;

    public MediaRental() {
        JFrame mainFrame = new JFrame();
        JMenuBar mainBar = new JMenuBar();
        
        JMenu main = new JMenu("Main");

        loadMenu = new JMenuItem("Load");
        findMenu = new JMenuItem("Find");
        rentMenu = new JMenuItem("Rent");
        exitMenu = new JMenuItem("Exit");

        loadMenu.addActionListener(this);
        findMenu.addActionListener(this);
        rentMenu.addActionListener(this);
        exitMenu.addActionListener(this);


        main.add(loadMenu);
        main.add(findMenu);
        main.add(rentMenu);
        main.add(exitMenu);

        mainBar.add(main);
        
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(300, 300);
        mainFrame.setTitle("Justin's Media Rental");

        mainFrame.setJMenuBar(mainBar);;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadMenu) {
            Manager manager = new Manager();

            
        } else if (e.getSource() == findMenu) {
            findMedia();
        } else if (e.getSource() == rentMenu) {
            rentMedia();
        } else if (e.getSource() == exitMenu) {
            System.exit(0);
        }
         
    }

    public void findMedia() {

    }

    public void rentMedia() {

    }
}


