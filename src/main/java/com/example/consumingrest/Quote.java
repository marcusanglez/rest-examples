package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//from the Jackson JSON processing library to indicate that any properties not bound in this type should be ignored.
@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote(String type, Value value) {
}
