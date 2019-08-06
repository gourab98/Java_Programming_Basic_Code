
package balloon_shooter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;


   public class LaserBeam
   {
   	//-----------------------------------------------------------------------
   	//- Shoots the laser beam.
   	//-----------------------------------------------------------------------
       public void shoot (Graphics page, Point start, Point end)
      {
      	page.setColor (Color.red);
      
      	page.drawLine (start.x, start.y, end.x, end.y);
      }
   }
