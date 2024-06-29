package com.example.jaz_zaliczenie_s29099.controller;
import com.example.jaz_zaliczenie_s29099.service.CurrencyService;

import com.example.jaz_zaliczenie_s29099.model.Waluty_s29099;
import com.example.jaz_zaliczenie_s29099.service.CurrencyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag(name = "Rental Controller", description = "Rental service API ")
@Controller
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @Operation(summary = "Get a movie by id", description = "Returns a movie as per the id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "error 200"),

            @ApiResponse(responseCode = "404", description = "error 404", content = @Content)

    })
    @GetMapping("/{getCurrency}")
    private ResponseEntity<Waluty_s29099> getMovie(@PathVariable Long id) {
        return ResponseEntity.ok().body(currencyService.getMovie(id));
    }


}
