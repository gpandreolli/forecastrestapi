package com.gpa.forecastrestapi.service;

import com.gpa.forecastrestapi.util.Util;
import com.gpa.forecastrestapi.model.Forecast;
import com.gpa.forecastrestapi.repository.IForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class ForecastService {

    @Autowired
    private IForecastRepository repository;

    public ForecastService(IForecastRepository repository) {
        this.repository = repository;
    }

    public List<Forecast> findForeCastByCityLastThirtyDays(Long id_city, int ocurred) throws ParseException {
        Date initialDate = Util.findInicialDateLastThirtyDays();
        Date finalDate = Util.currentDate();
        return repository.findForeCastByCityAndDate(id_city,initialDate, finalDate,ocurred);
    }
}
