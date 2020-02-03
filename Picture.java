/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square planet;
    private Square monolith;
    private Triangle mountain1;
    private Triangle mountain2;
    private Triangle mountain3;
    private Triangle mountain4;
    private Circle sun;
    private Circle sun2;
    private boolean drawn;
    private Square sky;
    private Person martian1;
    private Person martian2;
    private Person martian3;
    private Person martian4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        planet = new Square();
        monolith = new Square();
        mountain1 = new Triangle(); 
        mountain2 = new Triangle();
        mountain3 = new Triangle();
        mountain4 = new Triangle();
        sun = new Circle();
        sun2 = new Circle();
        sky = new Square();
        martian1 = new Person();
        martian2 = new Person();
        martian3 = new Person();
        martian4 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            planet.moveHorizontal(-310);
            planet.moveVertical(20);
            planet.changeSize(500);
            planet.changeColor("red");
            planet.makeVisible();
            
            sky.moveHorizontal(-310);
            sky.moveVertical(-480);
            sky.changeSize(500);
            sky.changeColor("black");
            sky.makeVisible();
            
            monolith.changeColor("black");
            monolith.moveHorizontal(-125);
            monolith.moveVertical(40);
            monolith.changeSize(40);
            monolith.makeVisible();
    
            mountain1.changeSize(60, 180);
            mountain1.moveHorizontal(-120);
            mountain1.moveVertical(-60);
            mountain1.makeVisible();
            
            mountain2.changeSize(50, 170);
            mountain2.moveHorizontal(-60);
            mountain2.moveVertical(-50);
            mountain2.makeVisible();
            
            mountain3.changeSize(40, 160);
            mountain3.moveHorizontal(-5);
            mountain3.moveVertical(-40);
            mountain3.makeVisible();
            
            mountain4.changeSize(30, 150);
            mountain4.moveHorizontal(50);
            mountain4.moveVertical(-30);
            mountain4.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            sun2.changeColor("yellow");
            sun2.moveHorizontal(-100);
            sun2.moveVertical(-50);
            sun2.changeSize(40);
            sun2.makeVisible();
            
            martian1.changeColor("green");
            martian1.moveHorizontal(-125);
            martian1.moveVertical(40);
            martian1.changeSize(50, 25);
            martian1.makeVisible();
            
            martian2.changeColor("green");
            martian2.moveHorizontal(-100);
            martian2.moveVertical(35);
            martian2.changeSize(50, 25);
            martian2.makeVisible();
            
            martian3.changeColor("green");
            martian3.moveHorizontal(-80);
            martian3.moveVertical(30);
            martian3.changeSize(50, 25);
            martian3.makeVisible();
            
            martian4.changeColor("green");
            martian4.moveHorizontal(-60);
            martian4.moveVertical(20);
            martian4.changeSize(50, 25);
            martian4.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        planet.changeColor("black");
        monolith.changeColor("white");
        mountain1.changeColor("black");
        sun.changeColor("black");
        sky.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        planet.changeColor("red");
        monolith.changeColor("black");
        mountain1.changeColor("green");
        sun.changeColor("yellow");
    }
}
