
package balloon_shooter;

 import java.awt.*;

    public class SpaceShip
   {
   	// Holds x and y coordinates for the ship
      private int currentX, currentY;
      private Color shipColor;
   
      private final int FLAME_WIDTH = 30, FLAME_HEIGHT = 50;
      private final int SHIP_WIDTH = 130, SHIP_HEIGHT = 50;
      private final int MOUSE_SPACE = 50;
   
   	// Starting coordinates for the spaceship
      private int[] shipX = { 30, 60, 70, 140, 160, 140, 70, 60, 30, 30 };
      private int[] shipY = { 0, 0, 10, 10, 25, 40, 40, 50, 50, 0 };
      private int[] flameX = { 10, 30, 30, 0, 20, 10, 20, 0, 20, 10 };
      private int[] flameY = { 0, 0, 50, 40, 40, 30, 30, 20, 10, 0 };
      private int[] doorX = { 80, 100, 100, 80, 80 };
      private int[] doorY = { 20, 20, 30, 30, 20 };
      private int[] window1X = { 110, 120, 120, 110, 110 };
      private int[] window1Y = { 20, 20, 30, 30, 20 };
      private int[] window2X = { 130, 140, 140, 130, 130 };
      private int[] window2Y = { 20, 20, 30, 30, 20 };
      private Polygon ship = new Polygon (shipX, shipY, shipX.length);
      private Polygon flame = new Polygon (flameX, flameY, flameX.length);
      private Polygon door = new Polygon (doorX, doorY, doorX.length);
      private Polygon window1 = new Polygon (window1X, window1Y, window1X.length);
      private Polygon window2 = new Polygon (window2X, window2Y, window2X.length);
   
   	// Set up ships weapons
      private LaserBeam laser = new LaserBeam ();
   
   	//-----------------------------------------------------------------------
   	//- Sets up the SpaceShip object.
   	//-----------------------------------------------------------------------
       public SpaceShip (int x, int y, Color color)
      {
         currentX = x;
         currentY = y;
         shipColor = color;
      }

    SpaceShip(int i, int i0, Color blue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   	//-----------------------------------------------------------------------
   	//- Draws the SpaceShip.
   	//-----------------------------------------------------------------------
       public void draw (Graphics page)
      {
         page.setColor (shipColor);
         page.fillPolygon (ship);
         page.setColor (Color.orange);
         page.fillPolygon (flame);
         page.setColor (Color.black);
         page.fillPolygon (door);
      	page.fillPolygon (window1);
      	page.fillPolygon (window2);
      }
   
   	//-----------------------------------------------------------------------
   	//- Move the spaceship to a given location.
   	//-----------------------------------------------------------------------
       public void move (Point point)
      {
         ship = new Polygon (shipX, shipY, shipX.length);
         flame = new Polygon (flameX, flameY, flameX.length);
         door = new Polygon (doorX, doorY, doorX.length);
      	window1 = new Polygon (window1X, window1Y, window1X.length);
      	window2 = new Polygon (window2X, window2Y, window2X.length);
      
         flame.translate (point.x - (SHIP_WIDTH + FLAME_WIDTH + MOUSE_SPACE),
            point.y - (SHIP_HEIGHT / 2));
         ship.translate (point.x - (SHIP_WIDTH + FLAME_WIDTH + MOUSE_SPACE),
            point.y - (SHIP_HEIGHT / 2));
         door.translate (point.x - (SHIP_WIDTH + FLAME_WIDTH + MOUSE_SPACE),
            point.y - (SHIP_HEIGHT / 2));
      	window1.translate (point.x - (SHIP_WIDTH + FLAME_WIDTH + MOUSE_SPACE),
            point.y - (SHIP_HEIGHT / 2));
      	window2.translate (point.x - (SHIP_WIDTH + FLAME_WIDTH + MOUSE_SPACE),
            point.y - (SHIP_HEIGHT / 2));
      }
   
   	//-----------------------------------------------------------------------
   	//- Returns the point for the tip of the spaceship.
   	//-----------------------------------------------------------------------
       public Point getTip (int x, int y)
      {
         Point tip = new Point (x - MOUSE_SPACE, y);
         return tip;
      }
   
   	//-----------------------------------------------------------------------
   	//- Shoots the ships laserbeam.
   	//-----------------------------------------------------------------------
       public void shoot (Graphics page, Point start, Point end)
      {
         laser.shoot (page, start, end);
      }
   }