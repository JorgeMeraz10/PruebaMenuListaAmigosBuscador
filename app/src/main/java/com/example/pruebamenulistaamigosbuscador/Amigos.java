package com.example.pruebamenulistaamigosbuscador;

public class Amigos {

    private int ImageResourceId;
    private String NameA;
    private String CareerA;
    private int IconResourceId;

    public Amigos(int imageResourceId, String name, String career, int iconResourceId) {
        ImageResourceId = imageResourceId;
        NameA = name;
        CareerA = career;
        IconResourceId = iconResourceId;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public String getName() {
        return NameA;
    }

    public String getCareer() {
        return CareerA;
    }

    public int getIconResourceId() {
        return IconResourceId;
    }

    public void clear() {
    }


}
