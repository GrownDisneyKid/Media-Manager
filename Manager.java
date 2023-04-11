import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*stores a list of Media objects
 has functionality to load Media objects from files
 creates/updates Media files
 has functionality to add new Media object to its Media list
 has functionality to find all media objects for a specific title and returns that list
 has functionality to rent Media based on id (updates rental status on media, updates
file, returns rental fee) */

public class Manager extends JFrame implements ActionListener{

    JButton loadB = new JButton("Load File");
    JButton createB = new JButton("Create File");
    JButton addB = new JButton("Add Media");
    JButton findB = new JButton("Find Media");
    JButton rentB = new JButton("Rent Media");
    JButton exitB = new JButton("Exit");

    Manager() {
        JFrame managerFrame = new JFrame();
        JPanel managerPanel = new JPanel();

        managerFrame.setVisible(true);
        managerFrame.setSize(600, 150);
        managerFrame.setTitle("Justin's Media Rental");
        managerFrame.setBackground(Color.LIGHT_GRAY);

        managerPanel.setLayout(new BoxLayout(managerPanel, BoxLayout.LINE_AXIS));
        managerPanel.setVisible(true);
    

        loadB.addActionListener(this);
        createB.addActionListener(this);
        findB.addActionListener(this);
        rentB.addActionListener(this);
        exitB.addActionListener(this);

        managerPanel.add(loadB);
        managerPanel.add(createB);
        managerPanel.add(addB);
        managerPanel.add(findB);
        managerPanel.add(rentB);
        managerPanel.add(exitB);

        managerFrame.add(managerPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadB) {
            loadFile();

        } else if (e.getSource() == createB) {
            // load default file

        } else if (e.getSource() == addB) {
            // add another recod to array
        } else if (e.getSource() == findB) {
            // search for media
        } else if (e.getSource() == rentB) {
            // change available and show price
        } else if (e.getSource() == exitB) {
            // close window or exit program
            windowClosing(dispose());
        }
    }

    private void windowClosing(Object dispose) {
    }

    public void loadFile() {
        JFileChooser fileChoose = new JFileChooser();
        
        int response = fileChoose.showOpenDialog(null);

        if (response == JFileChooser.APPROVE_OPTION) {
            System.out.println("File slected");
        }
    }

    public void createFile() {
        // FileReader reader = new FileReader("media.txt");
        // String file = reader.read();
        // System.out.print(file);
    }
    
}
