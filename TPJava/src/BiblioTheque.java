import java.util.ArrayList;
import java.util.List;

  	public class BiblioTheque  {

  		private List<Livre> listeLivres = new ArrayList<>();
		
  		public void ajouterLivre(Livre L) {
		listeLivres.add(L);	
  		}
  		public void afficherLivres() {
		for(Livre L : listeLivres) {
			L.afficherDetails();
		}
	}
	
	public static void main(String[] args) {
    
        BiblioTheque mybiblio = new BiblioTheque();

        Livre livre1 = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 1954);
        Livre livre2 = new Livre("Harry Potter à l'école des sorciers", "J.K. Rowling", 1997);

        mybiblio.ajouterLivre(livre1);
        mybiblio.ajouterLivre(livre2);

        mybiblio.afficherLivres();
    }
	
}
