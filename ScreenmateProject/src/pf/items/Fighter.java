package pf.items;

public class Fighter {

	private String name = "";
	private Position position;
	private Posture posture = new Guard();

	public Posture getImage() {
		return posture;
	}

	public void setImage(Posture posture) {
		this.posture = posture;
	}

	public Posture getPosture() {
		return posture;
	}

	public void setPosture(Posture posture) {
		this.posture = posture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public void attack() {

	}

	public void block() {

	}
}