import javax.swing.*;
import java.awt.*;
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
    static JRadioButton toyCar,dresser,safe,door,paintings;

    static JLabel introductionLabel,showDresserDialogue;
    static JTextField userInput;
    static ButtonGroup radios = new ButtonGroup();


    public static void main(String[] args) {

     EscapeRoomGUI();




    }
    public static void EscapeRoomGUI(){
        JFrame frame;




        frame= new JFrame("Escape Room");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel= new JPanel();

        toyCar = new JRadioButton("Toy Car");
        dresser = new JRadioButton("Dresser");
        safe = new JRadioButton("Safe");
        paintings = new JRadioButton("Paintings");
        door = new JRadioButton("Door");
        introductionLabel= new JLabel("WE are stuck try to find a way out!!");


        panel.setLayout(null);
        introductionLabel.setBounds(100,25,200,25);
        toyCar.setBounds(100, 50, 200,25);
        dresser.setBounds(100,75,200,25);
        safe.setBounds(100,100,200,25);
        paintings.setBounds(100,125,200,25);
        door.setBounds(100,150,200,25);


        door.setSelected(true);

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










        frame.add(panel);
        frame.setVisible(true);

}
    public static void choiceInDresser(){




    }
    public static void choiceInToyCar(){





    }
    public static void choiceInSafe(){



    }
    public static void choiceInPaintings(){




    }
    private class newObjectButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {




        }
    }







}
