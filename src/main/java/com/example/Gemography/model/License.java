package com.example.Gemography.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class License {
    public String key;
    public String name;
    public String spdxId;
    public String url;
    public String nodeId;

    public License() {
        super();
    }
}