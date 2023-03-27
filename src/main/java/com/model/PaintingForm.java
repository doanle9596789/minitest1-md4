package com.model;

import org.springframework.web.multipart.MultipartFile;

public class PaintingForm {
    private Long id;
    private String codePainting;
    private Double price;
    private MultipartFile img;

    public PaintingForm() {
    }

    public PaintingForm(Long id, String codePainting, Double price, MultipartFile img) {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }
}