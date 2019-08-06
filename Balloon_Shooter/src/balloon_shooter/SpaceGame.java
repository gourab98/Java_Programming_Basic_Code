
package balloon_shooter;

   import javax.swing.*;
   import java.awt.*;

    public class SpaceGame extends JApplet
   {
      private final int WIDTH = 800, HEIGHT = 500;
   
   	//-----------------------------------------------------------------------
   	//- Initialize the applet.
   	//-----------------------------------------------------------------------
       public void init ()
      {
         getContentPane ().add (new SpaceWorld (Color.black));
      
         setSize (new Dimension(WIDTH, HEIGHT));
      }
   }