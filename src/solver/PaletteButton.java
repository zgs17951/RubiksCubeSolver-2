package solver;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class PaletteButton extends Button{
	
	private int color;
	private ColorPalette mColorPalette;
	private int x, y;

	public PaletteButton(Context context, ColorPalette cp, int clr) {
		super(context);
		color = clr;
		mColorPalette = cp;
		
		
	}
	
	public int getColor(){
		return color;
	}
	
}