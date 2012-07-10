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
