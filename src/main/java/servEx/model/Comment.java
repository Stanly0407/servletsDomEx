package servEx.model;

import java.time.LocalDate;

public class Comment {

    long id;
    LocalDate commentDate;
    String content;
    int likes;
    long idUser;
    long idPhoto;
    long idRecords;

    public Comment(long id, LocalDate commentDate, String content, int likes, long idUser, long idPhoto, long idRecords) {
        this.id = id;
        this.commentDate = commentDate;
        this.content = content;
        this.likes = likes;
        this.idUser = idUser;
        this.idPhoto = idPhoto;
        this.idRecords = idRecords;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDate commentDate) {
        this.commentDate = commentDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public long getIdRecords() {
        return idRecords;
    }

    public void setIdRecords(long idRecords) {
        this.idRecords = idRecords;
    }
}
