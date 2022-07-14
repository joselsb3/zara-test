package com.zara.interview.test.infraestructure.adapters.input.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ErrorMessage {

    private String message;

    private int code;



}
