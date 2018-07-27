package com.company.puodeliai;

public class KavosPuodelis extends com.company.puodeliai.Puodelis {
    private com.company.puodeliai.Produktai produktai;
    private String name;
    private boolean isReady;


    public KavosPuodelis (com.company.puodeliai.Produktai products, String name, float volume){
        super(volume);
        this.name=name;
        this.produktai=products;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public String getName() {
        return name;
    }

    public com.company.puodeliai.Produktai getProduktai() {
        return produktai;
    }
}
