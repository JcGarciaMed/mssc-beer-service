package com.greymatter.msscbeerservice.bootstrap;

import com.greymatter.msscbeerservice.domain.Beer;
import com.greymatter.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        Beer b1 = Beer.builder()
                .beerName("Mango Bobs")
                .beerStyle("IPA")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(300000001L)
                .build();

        Beer b2 = Beer.builder()
                .beerName("Galaxy Cat")
                .beerStyle("IPA")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(300000002L)
                .build();

        Beer b3 = Beer.builder()
                .beerName("Pinball Porter")
                .beerStyle("pale ale")
                .minOnHand(12)
                .quantityToBrew(200)
                .price(new BigDecimal("12.95"))
                .upc(300000009L)
                .build();

        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);
        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
