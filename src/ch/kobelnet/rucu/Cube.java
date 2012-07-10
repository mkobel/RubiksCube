package ch.kobelnet.rucu;

import java.util.HashMap;
import java.util.Map;



/**
 * Ein Würfelteil
 * @author moritz
 *
 */
public class Cube {

	/**
	 * Die aktuelle, relative Position
	 */
	RelativeCubePosition position;
	
	/**
	 * Map mit den Farben der Wände
	 */
	Map<Wall,WallColor> wallColors = new HashMap<Wall,WallColor>();
	
	/**
	 * Verschiebe den Würfel von der aktuellen Position zur neuen Position
	 * @param newPos neue Position
	 */
	public void moveTo( RelativeCubePosition newPos )
	{
		//TODO: die Einzelnen WallColor's neu Rechnen (verschieben)
	}

	/**
	 * Gib die Farbe einer Wand zurück
	 * @param wall die gewünschte Wand
	 * @return die passende Farbe
	 */
	public WallColor getWallColor(Wall wall)
	{
		return wallColors.get(wall);
	}
	
}
