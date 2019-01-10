package com.vietdung.recyclerview;

public class Hero {
    private String nameHero;
    private int urlImage;

    public Hero(String nameHero, int urlImage) {
        this.nameHero = nameHero;
        this.urlImage = urlImage;
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }
}
