package com.appgrouplab.code.java.onboarding.component;

public class OnBoardingItem {
    private String title;
    private String description;
    private Integer imagen; //Id image drawable

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getImagen() {
        return imagen;
    }

    OnBoardingItem(String title, String description, Integer imagen) {
        this.title = title;
        this.description = description;
        this.imagen = imagen;
    }


}
