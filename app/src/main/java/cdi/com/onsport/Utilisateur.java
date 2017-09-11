package cdi.com.onsport;

import java.io.Serializable;
import java.util.Date;

public class Utilisateur {

	public class utilisateur implements Serializable {
		
		private static final long serialVersionUID = 1L;


		private int id;
		
		private String pseudo;
		private String mail;
		

		private String motdepasse;
		
		private Date datedenaissance;
		
		private String ville;
		
		private String cp;
		
		private String commentaire;
		
		public int getId_utilisateur() {
			return id;
		}
		
		public void setId_Utilisateur(int id_Utilisateur) {
			this.id = id_Utilisateur;
		}
		public String getPseudo() {
			return pseudo;
		}
		
		public void setpseudo(String pseudo) {
			this.pseudo = pseudo;
		}
		
		public String getMail() {
			return mail;
		}
		public void setmail(String mail) {
			this.mail = mail;
		}
		public String getMotdepasse() {
			return motdepasse;
		}
		
		public void setmotdepasse(String motdepasse) {
			this.motdepasse = motdepasse;
		}
		public Date getDatedenaissance() {
			return datedenaissance;
		}
		public void Datedenaissance(Date datedenaissance) {
			this.datedenaissance = datedenaissance;
		}
		public String getVille() {
			return ville;
		}
		
		public void Ville( String ville) {
			this.ville = ville;
		}
		
		public String getCp() {
			return cp;
		}
		
		public void Cp( String cp) {
			this.cp = cp;
		}
		
		public String getCommentaire() {
			return commentaire;
		}
		public void Commentaire( String commentaire) {
			this.commentaire = commentaire;
		}
		

	}
}

		
		
		
		
		
		
		
		
		

		


		
		
		

