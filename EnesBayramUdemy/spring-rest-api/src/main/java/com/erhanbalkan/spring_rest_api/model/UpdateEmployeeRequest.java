package com.erhanbalkan.spring_rest_api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateEmployeeRequest {
    private String firstName;
    private String lastName;
}
