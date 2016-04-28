package Print;

/**
 * Created by zzyy3_000 on 4/24/2016.
 */

import javax.swing.*;

public class FramePrint {
    public static void main(String[] args) {
        //System.out.println("A quote by Abraham Lincoln:");
        //System.out.println("Whatever you are, be a good one.");

        Double number = Double.parseDouble(JOptionPane.showInputDialog("what is 3/2?")); // display a textbox

        if ((number - 1.5) < 0.0001) // does not make sense
        {
            JOptionPane.showMessageDialog(null, "Correct");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect");
        }
    }
}
