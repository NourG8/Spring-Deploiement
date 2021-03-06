package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Long idUser;
	private String Nom;
	private String Prenom;
	private String Email;
	private String Pwd;
	private String Adress;
	private int Cin;
	private Date DateEmbauche;
	private int tel;
	private String photo;
	private String Competance;
	public User(Long idUser, String nom, String prenom, String email, String pwd, String adress, int cin,
			Date dateEmbauche, int tel, String photo, String competance) {
		super();
		this.idUser = idUser;
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Pwd = pwd;
		Adress = adress;
		Cin = cin;
		DateEmbauche = dateEmbauche;
		this.tel = tel;
		this.photo = photo;
		Competance = competance;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		Pwd = pwd;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getCin() {
		return Cin;
	}
	public void setCin(int cin) {
		Cin = cin;
	}
	public Date getDateEmbauche() {
		return DateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		DateEmbauche = dateEmbauche;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCompetance() {
		return Competance;
	}
	public void setCompetance(String competance) {
		Competance = competance;
	}
	
	
}
