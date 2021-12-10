import javax.naming.MalformedLinkException;
import javax.swing.*;
import javax.xml.ws.handler.MessageContext;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// contain 3 nodes (locations in the gui to click on )(door,small car with a battery pocket, dresser, safe,)
//(1.go to dresser get skrewdriver but also dressor has a key 2. skrew driver is used to open car which has a code
//radio buttons
// methods
//if statements
// variablesd



public class EscapeRoom {


    static JPanel panel;
    static JRadioButton toyCar,dresser,flashLight,screwDriver,safe,door,paintings,backButton;
    static JButton chooseButton;
    static JLabel introductionLabel,dresserDialogueLabel,UVDialogueLabel,screwDriverDialogueLabel;
    static JTextField userInput;
    static ButtonGroup radios = new ButtonGroup();
    static int fL= 0, sD =0;


    public static void main(String[] args) {

        EscapeRoomGUI();

    }
    public static void EscapeRoomGUI(){



        JFrame frame = new JFrame("Escape Room");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel= new JPanel();

        backButton = new JRadioButton("Go Back to Main Menu");

        introductionLabel= new JLabel("WE are stuck try to find a way out!! Lets find a way out.");
        dresserDialogueLabel = new JLabel("lets open the dresser wow there seems to be a UV light and screwDriver should we investigate them? ");
        UVDialogueLabel = new JLabel("Hmm isn't this used to see invisible ink?");
        screwDriverDialogueLabel = new JLabel("huh can we use this to open soemthing ")

        toyCar = new JRadioButton("Toy Car");

        dresser = new JRadioButton("Dresser");
        flashLight= new JRadioButton("UV Light");
        screwDriver = new JRadioButton("Screw Driver");

        safe = new JRadioButton("Safe");
        paintings = new JRadioButton("Paintings");
        door = new JRadioButton("Door");
        chooseButton = new JButton("choose");


        panel.setLayout(null);
        introductionLabel.setBounds(100,15,400,25);
        toyCar.setBounds(100, 50, 200,25);
        dresser.setBounds(100,75,200,25);
        safe.setBounds(100,100,200,25);
        paintings.setBounds(100,125,200,25);
        door.setBounds(100,150,200,25);
        chooseButton.setBounds(100,175,200,25);


        door.setSelected(true);

        chooseButton.addActionListener(new newChoiceButton());

        radios.add(toyCar);
        radios.add(dresser);
        radios.add(safe);
        radios.add(paintings);
        radios.add(door);


        panel.add(introductionLabel);
        panel.add(toyCar);
        panel.add(dresser);
        panel.add(safe);
        panel.add(paintings);
        panel.add(door);
        panel.add(chooseButton);



        frame.add(panel);
        frame.setVisible(true);
     ;

}
    private static class  newChoiceButton implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            if (dresser.isSelected()){
                dresserLayout();
            }
            if (flashLight.isSelected()) {
               contentInsideItems();
            }
            if (screwDriver.isSelected()){
                contentInsideItems();
            }
            if(backButton.isSelected()){
                contentInBackButton();
            }




        }
    }

    public static void addMainPanel(){

        panel.add(introductionLabel);
        panel.add(toyCar);
        panel.add(dresser);
        panel.add(safe);
        panel.add(paintings);
        panel.add(door);

        panel.add(chooseButton);


    }
    public static void removeMainPanel(){

        panel.remove(introductionLabel);
        panel.remove(toyCar);
        panel.remove(dresser);
        panel.remove(safe);
        panel.remove(paintings);
        panel.remove(door);


    }
    public static void contentInBackButton(){
        panel.removeAll();
        addMainPanel();
        panel.updateUI();


    }


    public static void dresserLayout(){

        radios.add(flashLight);
        radios.add(screwDriver);
        radios.add(backButton);

        panel.add(dresserDialogueLabel);
        panel.add(flashLight);
        panel.add(screwDriver);
        panel.add(backButton);

        dresserDialogueLabel.setBounds(100,15,500,25);
        flashLight.setBounds(100,50,200,25);
        screwDriver.setBounds(100,75,200,25);
        backButton.setBounds(100,100,200,25);

        removeMainPanel();

        panel.updateUI();


    }
    public static void contentInsideItems(){
       if(flashLight.isSelected()){
            fL =1;
           System.out.println(fL);
        }
       if(screwDriver.isSelected()){
           sD = 2;
           System.out.println(sD);
       }
    }
    public static void toyCarLayout(){





    }
    public static void safeLayout(){



    }
    public static void paintingsLayout(){




    }





}
