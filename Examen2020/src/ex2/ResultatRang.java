package ex2;

public class ResultatRang {
	private int rang;

	public ResultatRang(int rang) {
		this.rang = rang;
	}
	
	@Override
	public String toString() {
		return "Resultat Rang [rang=" + rang + "]";
	}
	public void affiche() {
		System.out.println(toString());
	}
	
	public int comparTo(Resultat r) {
		if(r instanceof ResultatRang) {
			ResultatRang res = (ResultatRang) r;
			return Integer.compare(res.rang, this.rang);
		}
		else 
			return 404;
		
	}
}
