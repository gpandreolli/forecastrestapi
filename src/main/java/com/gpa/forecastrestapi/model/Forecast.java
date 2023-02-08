package com.gpa.forecastrestapi.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.util.Date;

@Entity
@Table
public class Forecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_CITY")
    private City city;

    @Column
    @Temporal( TemporalType.DATE)
    private Date dateForecast;

    @Column
    private Double maxTemperature;

    @Column
    private Double minTemperature;

    @Column
    private Double accPrecipitation;

    @Column
    private String relHumidity;

    @Column
    private Double windSpeed;

    @Column
    private Double gust;//rajada

    @Column
    private int ocurred;


    public Forecast() {
    }

    public Forecast(Long id, City city, Date dateForecast, Double maxTemperature, Double minTemperature, Double accPrecipitation, String relHumidity, Double windSpeed, int ocurred, Double gust) {
        this.id = id;
        this.city = city;
        this.dateForecast = dateForecast;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.accPrecipitation = accPrecipitation;
        this.relHumidity = relHumidity;
        this.windSpeed = windSpeed;
        this.ocurred = ocurred;
        this.gust = gust;
    }

    public int getOcurred() {
        return ocurred;
    }

    public void setOcurred(int ocurred) {
        this.ocurred = ocurred;
    }

    public Date getDateForecast() {
        return dateForecast;
    }

    public void setDateForecast(Date dateForecast) {
        this.dateForecast = dateForecast;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(Double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public Double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(Double minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Double getAccPrecipitation() {
        return accPrecipitation;
    }

    public void setAccPrecipitation(Double accPrecipitation) {
        accPrecipitation = accPrecipitation;
    }

    public String getRelHumidity() {
        return relHumidity;
    }

    public void setRelHumidity(String relHumidity) {
        relHumidity = relHumidity;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getGust() {
        return gust;
    }

    public void setGust(Double gust) {
        this.gust = gust;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
