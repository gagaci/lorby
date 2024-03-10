package com.lorby.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.List;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResult<E> {

    private final boolean success;

    private E data;

    private List<ErrorData> errors;

    private ApiResult(E data) {
        this.success = true;
        this.data = data;
    }
}
