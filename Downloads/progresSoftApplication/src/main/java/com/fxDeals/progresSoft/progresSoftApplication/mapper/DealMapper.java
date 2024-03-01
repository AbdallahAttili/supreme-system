package com.fxDeals.progresSoft.progresSoftApplication.mapper;

import com.fxDeals.progresSoft.progresSoftApplication.dto.DealDTO;
import com.fxDeals.progresSoft.progresSoftApplication.entity.Deal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DealMapper {

    Deal fromDTO(DealDTO dealDTO);
}
