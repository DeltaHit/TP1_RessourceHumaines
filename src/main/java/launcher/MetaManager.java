package launcher;

import crud.CertificationController;
import crud.CompetenceController;
import model.DBCreator;
import model.RHModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class MetaManager {
    
    private static final String TITLE        = "Head Hunter - Competence Matching";
    private static final int    MIN_WIDTH    = 400;
    private static final int    MIN_HEIGHT   = 100;
    private static final String DEFAULT_TEXT = "Choose one option in the menu";
    private static       JFrame f;
    private static       JLabel label;
    private static       int    count;
    
    private static JPanel leftPanel;
    private static JPanel rightPanel;
    
    private static JButton bCertificat;
    private static JButton bCompetence;
    private static JButton bCandidat;
    private static JButton bEmploi;
    private static JButton bApplication;
    
    /** Main */
    public static void main(String[] arguments) throws ClassNotFoundException{ MetaManager.run();}
    
    private static void run() throws ClassNotFoundException{
    
        initFrame();
        RHModel.init();
        DBCreator.generateData();
        enableButtons();
    }
    
    private static void initFrame() {
        
        f = new JFrame(TITLE);
        initFrameElements();
        initFrameProperties();
    }
    
    private static void initFrameProperties() {
        
        JFrame.setDefaultLookAndFeelDecorated(true);
        
        f.setMinimumSize(new Dimension(MIN_WIDTH, MIN_HEIGHT));
        f.pack();
        f.setLocationRelativeTo(null);  // Center window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    private static void initFrameElements() {
        
        // Label
        label = new JLabel(DEFAULT_TEXT);
        
        // Panel
        leftPanel = new JPanel(new GridBagLayout());
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); // Vertical
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        rightPanel = new JPanel();
        rightPanel.add(label);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        // Button
        bCertificat = newButton("Certification" );
        bCertificat.addActionListener(e -> handleCertificatButtonClicked());
        
        bCompetence = newButton("Competence");
        bCompetence.addActionListener(e -> handleCompetenceButtonClicked());
        
        bCandidat = newButton("Candidat      ");
        bCandidat.addActionListener(e -> handleButtonClicked());
        
        bEmploi = newButton("Emploi          ");
        bEmploi.addActionListener(e -> handleButtonClicked());
        
        bApplication = newButton("Application  ");
        bApplication.addActionListener(e -> handleButtonClicked());
        
        // Layout
        f.getContentPane().add(leftPanel, BorderLayout.WEST);
        f.getContentPane().add(rightPanel, BorderLayout.CENTER);
        
    }
    
    private static JButton newButton(String text){
        
        JButton button = new JButton(text);
        button.setEnabled(false);
        leftPanel.add(button);
        return button;
    }
    
    private static void enableButtons(){
        
        bCertificat.setEnabled(true);
        bCompetence.setEnabled(true);
        //bCandidat.setEnabled(true);
        //bEmploi.setEnabled(true);
        //bApplication.setEnabled(true);
    }
    
    private static void handleButtonClicked() {
        
        count++;
        label.setText("Clicked " + count + " times");
        System.out.println("Not implemented");
    }
    
    private static void handleCertificatButtonClicked() {
        
        try {
            new CertificationController().run();
        } catch (ClassNotFoundException e) { e.printStackTrace(); }
    }
    
    private static void handleCompetenceButtonClicked() {
        
        try {
            new CompetenceController().run();
        } catch (ClassNotFoundException e) { e.printStackTrace(); }
    }
}
