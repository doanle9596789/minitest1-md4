package com.model;

public class Painting {
    private Long id;
    private String codePainting;
    private double price;
    private String img;

    public Painting() {
    }

    public Painting(Long id, String codePainting, double price, String img) {
        this.id = id;
        this.codePainting = codePainting;
        this.price = price;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodePainting() {
        return codePainting;
    }

    public void setCodePainting(String codePainting) {
        this.codePainting = codePainting;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}