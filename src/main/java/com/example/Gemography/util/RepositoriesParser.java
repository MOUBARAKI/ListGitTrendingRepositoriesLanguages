package com.example.Gemography.util;

import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.http.ResponseEntity;

import com.example.Gemography.model.Repository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RepositoriesParser {
    private static final Repository[] NO_REPOSITORY = {};

    public static Repository[] getRepositoriesFromJsonNode(ObjectMapper mapper, JsonNode root) {
        try {
            return mapper.treeToValue(root.path("items"), Repository[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return NO_REPOSITORY;
    }

    public static JsonNode getBodyJsonNode(ResponseEntity<String> result, ObjectMapper mapper) {
        try {
            return mapper.readTree(result.getBody());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return mapper.createObjectNode();
    }
}
