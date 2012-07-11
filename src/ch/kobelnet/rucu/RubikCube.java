package ch.kobelnet.rucu;

/**
 * Wände : Wird z.B. zum Rotieren verwendet
 * @author moritz
 *
 */
enum Wall {
	LEVEL_GROUND,LEVEL_TOP,
	ROW_BACK,ROW_FRONT,
	COLUMN_LEFT,COLUMN_RIGHT
}
/**
 * Die Farben
 * @author moritz
 *
 */
enum WallColor {
	NONE,BLUE,RED,YELLOW,GREEN,WHITE,ORANGE
}


public class RubikCube {

	/**
	 * Die Würfelteile
	 */
	Cube[][][] cubes;
	
	
	
	public RubikCube()
	{
		//TODO: Würfel initialisieren
		
		cubes = new Cube[3][3][3];
		
		for ( int l = 0 ; l < 3 ; l++ )
		{
			for ( int r = 0 ; r < 3 ; r++ )
			{
				for ( int c = 0 ; c < 3 ; c++ )
				{
					RelativeCubePosition pos = new RelativeCubePosition(l,r,c);
					Cube nc = new Cube(pos);
					
					// Boden
					if ( l == 0 )
						nc.wallColors.put(Wall.LEVEL_GROUND, WallColor.BLUE);
					// Deckel
					if ( l == 2 )
						nc.wallColors.put(Wall.LEVEL_TOP, WallColor.RED);
					// Vorne
					if ( r == 0 )
						nc.wallColors.put(Wall.ROW_FRONT, WallColor.GREEN);
					// Hinten
					if ( r == 2 )
						nc.wallColors.put(Wall.ROW_BACK, WallColor.YELLOW);
					// Links
					if ( c == 0 )
						nc.wallColors.put(Wall.COLUMN_LEFT, WallColor.ORANGE);
					// Links
					if ( c == 2)
						nc.wallColors.put(Wall.COLUMN_RIGHT, WallColor.WHITE);
					
					cubes[l][r][c] = nc;
				}
			}

		}
		
		
	}
	
	
	/**
	 * Rotiere eine Wand
	 * @param wall welche Wand
	 * @param clockwise im UZS oder Gegen-UZS
	 */
	public void rotate( Wall wall,  boolean clockwise )
	{
		//TODO: verschiebe hier die einzelnen Würfelteile		
	}
	
	/**
	 * Die Wände zufällig drehen...
	 */
	public void randomRotate()
	{
		//TODO: Zufällige Drehbewegungen durchführen
	}
	
}
