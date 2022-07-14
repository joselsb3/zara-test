package com.zara.interview.test.cucumber.steps;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.zara.interview.test.infraestructure.adapters.input.api.response.PriceQueryResponse;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import static org.junit.Assert.*;


public class PriceSteps {

    private static final String BASE_URL = "http://localhost:8888/brands/%d/products/%d/prices";
    private static ObjectMapper objectMapper = new ObjectMapper();
    private final RestTemplate restTemplate = new RestTemplate();
    private String dateTime;
    private Long brandId;
    private Long productId;
    private ResponseEntity<PriceQueryResponse> response;

    @BeforeAll
    public static void setUp() {
        objectMapper.registerModule(new JavaTimeModule());
    }

    @Given("a date {string}")
    public void givenADate(String string) {
        this.dateTime = string;
    }

    @And("a brand")
    public void givenABrand(Long brandId) {
        this.brandId = brandId;
    }

    @And("a product")
    public void givenAProduct(Long productId) {
        this.productId = productId;
    }

    @When("call prices api rest")
    public void callApiRest() {
        String url = String.format(BASE_URL, brandId, productId);
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
                .queryParam("date", dateTime);
        String uriBuilder = builder.build().encode().toUriString();
        response = restTemplate.getForEntity(uriBuilder, PriceQueryResponse.class);
    }

    @Then("the response has the following attributes {string}")
    public void theResponseHasTheFollowingAttributesBody(String string) throws JsonProcessingException {
        PriceQueryResponse expected = objectMapper.readValue(string, PriceQueryResponse.class);
        assertEquals(expected, response.getBody());
    }

}
