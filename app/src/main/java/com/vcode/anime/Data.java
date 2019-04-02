package com.vcode.anime;

public class Data {

    private String nama ;
    private String rating ;
    private String image_url;
    private String kategori;
    private String studio;


    public Data() {
    }

    public Data(String nama, String rating, String image_url, String kategori, String studio) {
        this.nama = nama;
        this.rating = rating;
        this.image_url = image_url;
        this.kategori = kategori;
        this.studio = studio;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }


}
