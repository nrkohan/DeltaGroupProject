package vetclinic;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.KeyEvent;
import java.awt.*;

public class TabPanel extends JPanel implements ChangeListener {
    
    public TabPanel() {
        super(new GridLayout(1, 1));
        
        JTabbedPane tp = new JTabbedPane();
        
        JComponent searchPanel = SearchPanel();
        tp.addTab("Search", searchPanel);
        tp.setMnemonicAt(0, KeyEvent.VK_1);
        
        JComponent apptPanel = ApptPanel();
        tp.addTab("Schedule an Appointment", apptPanel);
        tp.setMnemonicAt(0, KeyEvent.VK_2);
        
        JComponent clientPanel = ClientPanel();
        tp.addTab("Client Card", clientPanel);
        tp.setMnemonicAt(0, KeyEvent.VK_3);
        
        add(tp);
        
        tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }
    
    protected JComponent SearchPanel() {
        JPanel p1 = new JPanel();
        p1.setLayout( null );
        
        JLabel petLabel = new JLabel( "Pet Name:" );
        petLabel.setBounds( 75, 150, 150, 25 );
        p1.add( petLabel );
        
        JTextField petField = new JTextField();
        petField.setBounds( 200, 150, 150, 25 );
        p1.add( petField );
        
        JLabel ownerLabel = new JLabel( "Owner Last Name:" );
        ownerLabel.setBounds( 75, 190, 150, 25 );
        p1.add( ownerLabel );
        
        JTextField ownerField = new JTextField();
        ownerField.setBounds( 200, 190, 150, 25 );
        p1.add( ownerField );
        
        JButton search = new JButton( "Search" );
        search.setBounds( 185, 240, 80, 30);
        p1.add( search );
        
        return p1;
    }
    
    protected JComponent ApptPanel() {
        JPanel p2 = new JPanel();
        p2.setLayout( null );
        
        JLabel petLabel = new JLabel( "Pet Name:" );
        petLabel.setBounds( 10, 15, 150, 25 );
        p2.add( petLabel );
        
        JTextField petField = new JTextField();
        petField.setBounds( 135, 15, 150, 25 );
        p2.add( petField );
        
        JLabel firstLabel = new JLabel( "Owner First Name:" );
        firstLabel.setBounds( 10, 50, 150, 25 );
        p2.add( firstLabel );
        
        JTextField firstField = new JTextField();
        firstField.setBounds( 135, 50, 150, 25 );
        p2.add( firstField );
        
        JLabel lastLabel = new JLabel( "Owner Last Name:" );
        lastLabel.setBounds( 10, 85, 150, 25 );
        p2.add( lastLabel );
        
        JTextField lastField = new JTextField();
        lastField.setBounds( 135, 85, 150, 25 );
        p2.add( lastField );
        
        JLabel doctorLabel = new JLabel( "Doctor:" );
        doctorLabel.setBounds( 10, 120, 150, 25 );
        p2.add( doctorLabel );
        
        JTextField doctorField = new JTextField();
        doctorField.setBounds( 135, 120, 150, 25 );
        p2.add( doctorField );
        
        JLabel dateLabel = new JLabel( "Date:" );
        dateLabel.setBounds( 10, 155, 150, 25 );
        p2.add( dateLabel );
        
        JTextField dateField = new JTextField();
        dateField.setBounds( 135, 155, 150, 25 );
        p2.add( dateField );
        
        JLabel timeLabel = new JLabel( "Time:" );
        timeLabel.setBounds( 10, 190, 150, 25 );
        p2.add( timeLabel );
        
        JTextField timeField = new JTextField();
        timeField.setBounds( 135, 190, 150, 25 );
        p2.add( timeField );
        
        JLabel durLabel = new JLabel( "Duration:" );
        durLabel.setBounds( 10, 225, 150, 25 );
        p2.add( durLabel );
        
        JTextField durField = new JTextField();
        durField.setBounds( 135, 225, 150, 25 );
        p2.add( durField );
        
        JButton search = new JButton( "Schedule" );
        search.setBounds( 185, 270, 150, 30);
        p2.add( search );
        
        return p2;
        
    }
    
    protected JComponent ClientPanel() {
        JPanel p3 = new JPanel();
        p3.setLayout( null );
        
        JLabel petLabel = new JLabel( "Pet Name:" );
        petLabel.setBounds( 10, 15, 150, 25 );
        p3.add( petLabel );
        
        JLabel petData = new JLabel();
        petData.setBounds( 80, 15, 150, 25 );
        petData.setOpaque(true);
        petData.setBackground(Color.LIGHT_GRAY);
        p3.add( petData );
        
        JLabel genderLabel = new JLabel( "Gender:" );
        genderLabel.setBounds( 10, 50, 50, 25 );
        p3.add( genderLabel );
        
        JLabel genderData = new JLabel();
        genderData.setBounds( 60, 50, 50, 25 );
        genderData.setOpaque(true);
        genderData.setBackground(Color.LIGHT_GRAY);
        p3.add( genderData );
        
        JLabel weightLabel = new JLabel( "Weight:" );
        weightLabel.setBounds( 120, 50, 50, 25 );
        p3.add( weightLabel );
        
        JLabel weightData = new JLabel();
        weightData.setBounds( 180, 50, 50, 25 );
        weightData.setOpaque(true);
        weightData.setBackground(Color.LIGHT_GRAY);
        p3.add( weightData );
        
        JLabel lastLabel = new JLabel( "Owner's Last Name:" );
        lastLabel.setBounds( 270, 15, 150, 25 );
        p3.add( lastLabel );
        
        JLabel lastData = new JLabel();
        lastData.setBounds( 400, 15, 150, 25 );
        lastData.setOpaque(true);
        lastData.setBackground(Color.LIGHT_GRAY);
        p3.add( lastData );
        
        JLabel firstLabel = new JLabel( "Owner's First Name:" );
        firstLabel.setBounds( 270, 50, 150, 25 );
        p3.add( firstLabel );
        
        JLabel firstData = new JLabel();
        firstData.setBounds( 400, 50, 150, 25 );
        firstData.setOpaque(true);
        firstData.setBackground(Color.LIGHT_GRAY);
        p3.add( firstData );
        
        JLabel medLabel = new JLabel( "Medication List:" );
        medLabel.setBounds( 10, 90, 150, 25 );
        p3.add( medLabel );
        
        JList medList = new JList();
        medList.setVisibleRowCount(5);
        medList.setBounds( 10, 115, 250, 100 );
        medList.setBackground(Color.LIGHT_GRAY);
        p3.add( medList );
        
        JLabel shotLabel = new JLabel( "Shot List:" );
        shotLabel.setBounds( 10, 225, 150, 25 );
        p3.add( shotLabel );
        
        JList shotList = new JList();
        shotList.setVisibleRowCount(5);
        shotList.setBounds( 10, 250, 250, 100 );
        shotList.setBackground(Color.LIGHT_GRAY);
        p3.add( shotList );
        
        JLabel apptLabel = new JLabel( "Appointments:" );
        apptLabel.setBounds( 300, 90, 150, 25 );
        p3.add( apptLabel );
        
        JScrollPane sp = new JScrollPane();
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sp.setBounds( 300, 115, 250, 240 );
        p3.add( sp );
        
        //DATA TO BE REPLACED with Query
        String[][] data = { 
            { "9-3-19", "9:30am", "30" },
            { "9-12-19", "10:00am", "15" }
        }; 
        String[] colNames = { "Date", "Time", "Duration" };
        
        JTable apptTable = new JTable(data, colNames);
        apptTable.setBackground(Color.LIGHT_GRAY);
        sp.setViewportView( apptTable );
        p3.setVisible(true);
            
        return p3;
    }
    
    private static void showFrame() {
        JFrame frame = new JFrame( "Veterinary Clinic Management System" );
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        frame.setSize(600, 500);
        frame.add(new TabPanel(), BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
    
    public static void main(String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showFrame();
            }
        });
    }
    
    public void stateChanged(ChangeEvent e) {
        JTabbedPane tp = (JTabbedPane) e.getSource();
        int selectedIndex = tp.getSelectedIndex();
        JOptionPane.showMessageDialog(null, "Selected Index: " + selectedIndex);
    }
    
}

