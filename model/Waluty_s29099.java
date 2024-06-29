package com.example.jaz_zaliczenie_s29099.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Waluty_s29099 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String waluta;
    private Date dataPoczatkuPrzedzialu;
    private Date dataKoncaPrzedzialu;
    private double kurs;

    private LocalDateTime czasZapytania;

    public Waluty_s29099(Integer id, String waluta, Date dataPoczatkuPrzedzialu, Date dataKoncaPrzedzialu, double kurs, LocalDateTime czasZapytania) {
        this.id = id;
        this.waluta = waluta;
        this.dataPoczatkuPrzedzialu = dataPoczatkuPrzedzialu;
        this.dataKoncaPrzedzialu = dataKoncaPrzedzialu;
        this.kurs = kurs;
        this.czasZapytania = czasZapytania;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWaluta() {
        return waluta;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
    }

    public Date getDataPoczatkuPrzedzialu() {
        return dataPoczatkuPrzedzialu;
    }

    public void setDataPoczatkuPrzedzialu(Date dataPoczatkuPrzedzialu) {
        this.dataPoczatkuPrzedzialu = dataPoczatkuPrzedzialu;
    }

    public Date getDataKoncaPrzedzialu() {
        return dataKoncaPrzedzialu;
    }

    public void setDataKoncaPrzedzialu(Date dataKoncaPrzedzialu) {
        this.dataKoncaPrzedzialu = dataKoncaPrzedzialu;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public LocalDateTime getCzasZapytania() {
        return czasZapytania;
    }

    public void setCzasZapytania(LocalDateTime czasZapytania) {
        this.czasZapytania = czasZapytania;
    }
}
