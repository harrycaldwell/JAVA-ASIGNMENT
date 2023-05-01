// An object in the game, represented as a rectangle, with a position,
// a size, a colour and a direction of movement.

// Watch out for the different spellings of Color/colour - the class uses American
// spelling, but we have chosen to use British spelling for the instance variable!

// import Athe JavaFX Color class
import javafx.scene.paint.Color;
import java.lang.Math.*;

public class GameObj
{
    // state variables for a game object
    public boolean visible  = true;     // Can be seen on the screen (change to false when the brick gets hit)
    public int topX   = 0;              // Position - top left corner X
    public int topY   = 0;              // position - top left corner Y
    public int width  = 0;              // Width of object
    public int height = 0;              // Height of object
    public Color colour;                // Colour of object
    public int   dirX   = 1;            // Direction X (1, 0 or -1)
    public int   dirY   = 1;            // Direction Y (1, 0 or -1)


    public GameObj( int x, int y, int w, int h, Color c )
    {
        topX   = x;       
        topY = y;
        width  = w; 
        height = h; 
        colour = c;
    }

    // move in x axis
    public void moveX( int units )
    {
        topX += units * dirX;
    }

    // move in y axis
    public void moveY( int units )
    {
        topY += units * dirY;
    }

    // change direction of movement in x axis (-1, 0 or +1)
    public void changeDirectionX()
    {
        dirX = -dirX;
    }

    // change direction of movement in y axis (-1, 0 or +1)
    public void changeDirectionY()
    {
        dirY = -dirY;
    }
    
    // Returns the Value of X
    public int getX(){
        return topX;
    }
    
    //Returns the Value of Y
    public int getY(){
        return topY;
    }
    
    // Detect collision between this object and the argument object
    // It's easiest to work out if they do NOT overlap, and then
    // return the opposite
    public boolean hitBy( GameObj obj )
    {
        boolean separate =  
            topX >= obj.topX+obj.width     ||    // '||' means 'or'
            topX+width <= obj.topX         ||
            topY >= obj.topY+obj.height    ||
            topY+height <= obj.topY ;
            
        // use ! to return the opposite result - hitBy is 'not separate')
        
        return( ! separate);  
          
    }
    
    public boolean hitByX( GameObj obj){
        int newTopX = topX;
        int newObjTopX = obj.topX;
        boolean separate =  
            newTopX >= newObjTopX+obj.width     ||    // '||' means 'or'
            newTopX+width <= newObjTopX        ||
            topY >= obj.topY+obj.height    ||
            topY+height <= obj.topY ;
            
            if(!separate){
                if (topY == 727){
                    
                }
                else if (Math.abs(topY - obj.topY) <= 29){
                    return true;
                }
            }
        // use ! to return the opposite result - hitBy is 'not separate')
        return false;
        }
    }
