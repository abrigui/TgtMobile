/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.tgt.myapp.entities;

/**
 *
 * @author ADMIN
 */
public class User {
    
    private int id;
    private String username;
    private String email;
    private String password;
    private String roles;
    private String nom;
    private String prenom;
    private String adresse;
    private int telephone;
    private String genre;
    private int blocked;
    private String image;
    private String code;

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBlocked() {
        return blocked;
    }
        public User(String nom, String prenom, String email, String adresse, int telephone) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public User(int id, String username, String email, String password, String roles, String nom, String prenom, String adresse, int telephone, String genre, int blocked, String image, String code) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.genre = genre;
        this.blocked = blocked;
        this.image = image;
        this.code = code;
    }

   
    

    public User(int id, String username, String email, String password, String roles, String nom, String prenom, String adresse, int telephone, String genre, int blocked, String image) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.genre = genre;
        this.blocked = blocked;
        this.image = image;
    }

    public void setBlocked(int blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", roles=" + roles + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + ", genre=" + genre + ", blocked=" + blocked + '}';
    }

 
  
    
    
//      @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", roles=" + roles + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone=" + telephone + ", genre=" + genre + '}';
//    }

    
    
    
    public User(int id, String username, String email, String password, String roles, String nom, String prenom, String adresse, int telephone, String genre) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.genre = genre;
        
    }

    public User(int id, String username, String email, String password, String roles, String nom, String prenom, String adresse, int telephone, String genre, int blocked) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.genre = genre;
        this.blocked = blocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
//        if(roles.equals("a:1:{i:0;s:10:\"ROLE_USERT\";}"))
//        {
//            return "Talents";
//        }
//        else if(roles.equals("a:1:{i:0;s:10:\"ROLE_USERP\";}"))
//        {
//            return "Professionel";
//        }
//        else{
//            return "Administrateur";
//        }
        return roles;
    }
            
        
    

    public User(String username, String email, String password, String roles, String nom, String prenom, String adresse, int telephone, String genre) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.genre = genre;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public User() {
    }

    
      public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(int id) {
        this.id = id;
    }
    
    
}


