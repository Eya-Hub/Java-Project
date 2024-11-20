package ex2;

public class Epreuve {
	private int nbMax,nbEff;
	private String denomination;
	private boolean etat;
	private Athlete[] Participants;
	
	
	public Epreuve(String denomination,int nbMax) {
		this.denomination = denomination;
		this.nbMax = nbMax;
		this.Participants = new Athlete[nbMax];
		this.nbEff = 0;
		this.etat = false;
	}
	
	public void ajoutAthlete(Athlete a) {
		if(nbEff<nbMax) {
			Participants[nbEff] = a;
			nbEff++;
		}
		else 
			System.out.println("L'epreuve est au complet !");
	}
	
	public String toString() {
	    String status;
	    if (terminee) {
	        status = "Terminée";
	    } else {
	        status = "Non terminée";
	    }
	}
	
	
}
	
