package ch.kobelnet.rucu;

import ch.kobelnet.rucu.gui.CubePainter;

public class RubikCubeApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RubikCube rcube = new RubikCube();
		
		CubePainter painter = new CubePainter(rcube);
		
		// ein erstes mal Zeichnen
		painter.update();
		
		// mischen...
		rcube.randomRotate();
		
		// wieder zeichnen
		painter.update();
		
		
	}

}
