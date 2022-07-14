package com.zara.interview.test.infraestructure.adapters.input.api;

import com.zara.interview.test.domain.exception.PriceNotFound;
import com.zara.interview.test.domain.model.Price;
import com.zara.interview.test.domain.service.PriceService;
import com.zara.interview.test.infraestructure.adapters.input.api.mapper.PriceRestMapper;
import com.zara.interview.test.infraestructure.adapters.input.api.response.ErrorMessage;
import com.zara.interview.test.infraestructure.adapters.input.api.response.PriceQueryResponse;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
public class RestPriceController {

    private static final Logger logger = LoggerFactory.getLogger(RestPriceController.class);

    private PriceService priceService;
    private PriceRestMapper priceRestMapper;

    @GetMapping(
            value = "/brands/{brand_id}/products/{product_id}/prices")
    public ResponseEntity<PriceQueryResponse> getPrices(@PathVariable Long brand_id,
                                                       @PathVariable Long product_id,
                                                       @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd-HH.mm.ss") LocalDateTime date) {

        logger.info(String.format("RestPriceController: METHOD = {GET}, PARAMS = {brand_id = %d}, {product_id = %d}, {date = %s}",
                brand_id, product_id, date));

        Price price = priceService.getPriceBy(brand_id, product_id, date);
        return new ResponseEntity<>(priceRestMapper.toPriceQueryResponse(price), HttpStatus.OK);
    }


}
