
package tn.esprit.tgt.myapp.entities;

import java.util.ArrayList;
import java.util.Date;



public class Publication {
    
    private int id;
    private String contenu;
    private User u;
    private ArrayList<Commentaire> commentaires= new ArrayList<>();
    private String photo;
    private ArrayList<Like> likes= new ArrayList<>();
    private Date date = new Date();
    //private java.sql.Date date = new java.sql.Date(d.getTime());

    

    public Publication() {
    }

    public Publication(String contenu, User u, Date date,String photo) {
        this.contenu = contenu;
        this.u= u;
        this.date = date;
        this.photo = photo;

    }
    
    public Publication(int id,String contenu, String photo) {
        this.id=id;
        this.contenu = contenu;
        this.photo = photo;
    }
    public Publication(int id, String contenu, User u, Date date, String photo) {
        this.id = id;
        this.contenu = contenu;
        this.u = u;
        this.date = date;
        this.photo = photo;
    }

    public Publication(int id,String contenu,Date date, String photo) {
        this.id=id;
        this.contenu = contenu;
        this.date = date;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public ArrayList<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(ArrayList<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public ArrayList<Like> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<Like> likes) {
        this.likes = likes;
    }

    public Date getD() {
        return date;
    }

    public void setD(Date d) {
        this.date = d;
    }



    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "publication{" + "id=" + id + ", contenu=" + contenu + ", u=" + u  + ", photo=" + photo + ",likes=" + likes + ", date=" + date + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publication other = (Publication) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
