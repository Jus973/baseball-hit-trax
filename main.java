import java.util.ArrayList;

public class main {
    public static void main (String args[]){
        //run calculations off coord.txt
        //create calc object

        camera c = new camera (-3.8, 14.2, 5, 
                                14, -6.3);
        
        //create camera
        //create baseball
        
        //open parameters
        
        calc objs = new calc();
        ArrayList<graphable> baseballDots = objs.getGList(); //add values to graph here..
        

        //baseballDots.add(new graphable(5, 5, 5));
        
        //add all calc.getEquations into baseballDots, so it should just be a bunch of 3d points
        
        
        new runGraphGUI(c, baseballDots).setVisible(true);

        //arrows are shifted for angle / camera movement
    }
}
