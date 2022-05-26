package com.greymatter.msscbeerservice.web.mapper;

import com.greymatter.msscbeerservice.domain.Beer;
import com.greymatter.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
