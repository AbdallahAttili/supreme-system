package com.fxDeals.progresSoft.progresSoftApplication.controller;

import com.fxDeals.progresSoft.progresSoftApplication.dto.DealDTO;
import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import com.fxDeals.progresSoft.progresSoftApplication.mapper.DealMapper;
import com.fxDeals.progresSoft.progresSoftApplication.service.DealService;
import jakarta.validation.Valid;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/deals")
public class DealController {

    @Autowired
    private DealService dealService;

    @Autowired
    private DealMapper dealMapper;

    private static final DealMapper MAPPER = Mappers.getMapper(DealMapper.class);

    @PostMapping("/add-deal")
    public ResponseEntity addDeal(@Valid @RequestBody DealDTO newDeal) {
        Deal deal = MAPPER.fromDTO(newDeal);

        dealService.addDeal(deal);

        return ResponseEntity.ok().build();
    }
}
