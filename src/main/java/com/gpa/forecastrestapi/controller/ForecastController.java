package com.gpa.forecastrestapi.controller;

import com.gpa.forecastrestapi.dto.ForecastDTO;
import com.gpa.forecastrestapi.model.Forecast;
import com.gpa.forecastrestapi.service.ForecastService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/v1/forecast/")
public class ForecastController {

    @Autowired
    private ForecastService service;

    @Autowired
    private ModelMapper modelMapper;

    public ForecastController() {
    }

    @ApiOperation(value = "Retorna uma lista de pessoas")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "A previsão do clima de uma cidade, realizada nos ultimos 30 dias"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),})
    @RequestMapping(value = "{id_city}",method = RequestMethod.GET , produces="application/json")
    public List<ForecastDTO> findForecastByCityLastThirtyDays(@PathVariable("id_city") Long id_city) throws ParseException {
        List<Forecast> forecasts = new ArrayList<>();
        forecasts = service.findForeCastByCityLastThirtyDays(id_city,0);
        return forecasts.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private ForecastDTO convertToDTO(Forecast forecast){
        ForecastDTO forecastDTO = modelMapper.map(forecast,ForecastDTO.class);
        forecastDTO.setId_city(forecast.getCity().getId());
        return forecastDTO;
    }
}
