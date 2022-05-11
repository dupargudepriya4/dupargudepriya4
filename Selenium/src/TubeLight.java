
public class TubeLight {

	public static void main(String[] args) {
		Light l = new Light() {

			public String giveLight() {
				return "give Tubelight";

			}

		};
		String res = l.giveLight();
		System.out.println(res);

	}

}
