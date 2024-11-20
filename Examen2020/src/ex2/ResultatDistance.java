package ex2;

public class ResultatDistance implements Resultat{
	private double distance;
	
	public ResultatDistance(int distance) {
		this.distance = distance;
	}
	public String toString() {
		return "Resultat Distance [distance=" + distance + "]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public int comparTo(Resultat r) {
		if(r instanceof ResultatDistance) {
			ResultatDistance res = (ResultatDistance) r;
			return Double.compare(this.distance, res.distance);
		}
		else 
			return 404;
		
	}
	
}
