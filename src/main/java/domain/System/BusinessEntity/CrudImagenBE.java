package domain.System.BusinessEntity;


import domain.System.BusinessEntity.Base.*;


public class CrudImagenBE {
	   public Clothing getClothing() {
		return Clothing;
	}
	public void setClothing(Clothing clothing) {
		Clothing = clothing;
	}
	public Color getColor() {
		return Color;
	}
	public void setColor(Color color) {
		Color = color;
	}

public Test Test;

	public Test getTest() {
	return Test;
}
public void setTest(Test test) {
	Test = test;
}
	public Clothingline getClothingline() {
		return Clothingline;
	}
	public void setClothingline(Clothingline clothingline) {
		Clothingline = clothingline;
	}
	public Imagen getImagen() {
		return Imagen;
	}
	public void setImagen(Imagen imagen) {
		Imagen = imagen;
	}
	private  Clothing  Clothing;
	   private Color Color;
	 
	   private Clothingline Clothingline;
	   private  Imagen Imagen;

}
