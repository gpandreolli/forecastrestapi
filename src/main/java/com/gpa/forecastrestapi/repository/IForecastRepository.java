package com.gpa.forecastrestapi.repository;

import com.gpa.forecastrestapi.model.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IForecastRepository extends JpaRepository<Forecast,Long> {

    @Query(value = "from Forecast f where f.city.id = :id_city AND f.ocurred = :ocurred AND f.dateForecast" +
            " BETWEEN :initialDate AND :finalDate")
    public List<Forecast> findForeCastByCityAndDate
            (@Param("id_city")Long id_city,
             @Param("initialDate") Date initialDate,
             @Param("finalDate") Date finalDate,
             @Param("ocurred") int ocurred);
}
