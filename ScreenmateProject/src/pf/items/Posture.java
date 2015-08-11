package pf.items;

public abstract class Posture {

	private String imagePath = new String("");

	public Posture() {
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
