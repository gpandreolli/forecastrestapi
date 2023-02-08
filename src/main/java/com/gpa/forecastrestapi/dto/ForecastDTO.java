package com.gpa.forecastrestapi.dto;

import java.util.Date;

public class ForecastDTO {
    private Long id;
    private Long id_city;
    private Date dateForecast;
    private Double maxTemperature;
    private Double minTemperature;
    private Double accPrecipitation;
    private String relHumidity;
    private Double windSpeed;
    private Double gust;

    public ForecastDTO(Long id, Long id_city, Date dateForecast, Double maxTemperature, Double minTemperature, Double accPrecipitation, String relHumidity, Double windSpeed, Double gust) {
        this.id = id;
        this.id_city = id_city;
        this.dateForecast = dateForecast;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
        this.accPrecipitation = accPrecipitation;
        this.relHumidity = relHumidity;
        this.windSpeed = windSpeed;
        this.gust = gust;
    }

    public ForecastDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_city() {
        return id_city;
    }

    public void setId_city(Long id_city) {
        this.id_city = id_city;
    }

    public Date getDateForecast() {
        return dateForecast;
    }

    public void setDateForecast(Date dateForecast) {
        this.dateForecast = dateForecast;
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
        this.accPrecipitation = accPrecipitation;
    }

    public String getRelHumidity() {
        return relHumidity;
    }

    public void setRelHumidity(String relHumidity) {
        this.relHumidity = relHumidity;
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
}

