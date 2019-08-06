
package balloon_shooter;

import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;

    public class SpaceWorld extends JPanel
   {
      private Point mousePoint = null, shootPoint = null;
      private SpaceShip ship = new SpaceShip (0, 0, Color.blue);
   
   	//-----------------------------------------------------------------------
   	//- Sets up the space environment and initialize listeners.
   	//-----------------------------------------------------------------------
       public SpaceWorld (Color bg)
      {
         SpaceListener listener = new SpaceListener ();
         addMouseMotionListener (listener);
         addMouseListener (listener);
      
         setBackground (bg);
      }
   
   	//-----------------------------------------------------------------------
   	//- Draws the space ship at desired position.
   	//-----------------------------------------------------------------------
       public void paintComponent (Graphics page)
      {
         super.paintComponent (page);
      
         if (mousePoint != null)
         {
            ship.move (mousePoint);
            ship.draw (page);
         }
      
         if (shootPoint != null)
            ship.shoot (page, shootPoint, ship.getTip (mousePoint.x, mousePoint.y));
      }
   
   	//***********************************************************************
   	//* Represents the listener for all mouse events.
   	//***********************************************************************
       private class SpaceListener implements MouseMotionListener, MouseListener
      {
      	//--------------------------------------------------------------------
      	//- Set new coordinates for the spaceship when the mose is moved.
      	//--------------------------------------------------------------------
          public void mouseMoved (MouseEvent event)
         {
            mousePoint = event.getPoint ();
            repaint ();
         }
      
      	//--------------------------------------------------------------------
      	//- Shoot the laser while the mouse button is pressed.
      	//--------------------------------------------------------------------
          public void mousePressed (MouseEvent event)
         {
            shootPoint = event.getPoint ();
            repaint ();
         }
      
      	//--------------------------------------------------------------------
      	//- Stop shooting the laser when the mouse button is released.
      	//--------------------------------------------------------------------
          public void mouseReleased (MouseEvent event)
         {
            shootPoint = null;
            repaint ();	
         }
      
      	//--------------------------------------------------------------------
      	//- Get the current position of the laser beam when the mouse is
      	//- dragged.
      	//--------------------------------------------------------------------
          public void mouseDragged (MouseEvent event)
         {
         	shootPoint = event.getPoint ();
         	repaint ();
         }
      
      	//--------------------------------------------------------------------
      	//- Declare unused MouseListener methods.
      	//--------------------------------------------------------------------
          public void mouseEntered (MouseEvent event) {}
          public void mouseExited (MouseEvent event) {}
          public void mouseClicked (MouseEvent event) {}
      }
   }