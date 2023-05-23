
//not to be graphed
/**
 * @author Justin
 * @version 5/222/3
 * An object made to represent the camera, which is used when running the graph GUI 
 * to properly determine where everything should be translated
 */
public class camera extends graphable{
    private double angleW;
    private double angleL;
    private double FOV_W;
    private double FOV_L;

    /**
     * The main constructor for the camera object
     * @param tX The X value for the camera
     * @param tY The Y value for the camera
     * @param tZ The Z value for the camera
     * @param ang1 The angle value for width. 
     * @param ang2 The angle value for length. 
     * @param f The FOV value for width.
     * @param f2 The FOV value for length.
     */
    public camera (double tX, double tY, double tZ, double ang1, double ang2, double f, double f2){
        super(tX, tY, tZ);
        angleW = ang1;
        angleL = ang2;
        FOV_W = f;
        FOV_L = f2;
    }

    /**
     * Setter method for width angle.
     * @param newAng The new angle. 
     */
    public void setAngleW (double newAng){
        angleW = newAng;
    }

    /**
     * Setter method for length angle.
     * @param newAng The new angle.
     */
    public void setAngleL (double newAng){
        angleL = newAng;
    }


}
