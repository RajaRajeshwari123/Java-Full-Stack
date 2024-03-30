package CorejavaExercises.ass1;

public class Capsule {
	public static int nCapsules = 0;
    public double volume;
    public String screenText;

    public Capsule(double volume, String s) {
        this.volume = volume;
        screenText = s;
        nCapsules++;
    }

	
	public static void main(String[] args) {
		        int[] nInPack = {5, 10, 10};
		        Capsule[][] pack = new Capsule[3][];

		        for (int i = 0; i < pack.length; i++) {
		            pack[i] = new Capsule[nInPack[i]];
		            for (int j = 0; j < pack[i].length; j++) {
		                pack[i][j] = new Capsule(0.5, "Formular" + i + j);
		            }
		        }

		        System.out.println("Total number of capsules created: " + Capsule.nCapsules);
		    }
		}





