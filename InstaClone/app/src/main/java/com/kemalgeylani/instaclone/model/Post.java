package com.kemalgeylani.instaclone.model;

public class Post {

    public String usermail;
    public String comment;
    public String downloadurl;

    public Post(String usermail, String comment, String downloadurl) {
        this.usermail = usermail;
        this.comment = comment;
        this.downloadurl = downloadurl;
    }
}
