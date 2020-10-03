package com.example.Gemography.controller;

import static com.example.Gemography.util.RepositoriesParser.getBodyJsonNode;
import static com.example.Gemography.util.RepositoriesParser.getRepositoriesFromJsonNode;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Gemography.model.Language;
import com.example.Gemography.model.Repository;
import com.example.Gemography.service.GitLanguageService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/git/languages")
public class GitLanguageController {
    private static final String URL_REPOSITORIES = "https://api.github.com/search/repositories?q=created:>%s&sort=stars&order=desc";
    private static final DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    @Autowired
    GitLanguageService gitLanguageService;

    @GetMapping("/list")
    public ArrayList<Language> listTrendingRepositoriesLanguages() {
        RestTemplate restTemplate = new RestTemplate();
        LocalDate date = LocalDate.now().minusDays(30);
        ResponseEntity<String> result = restTemplate.getForEntity(String.format(URL_REPOSITORIES, date), String.class);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = getBodyJsonNode(result, mapper);
        Repository[] repos = getRepositoriesFromJsonNode(mapper, root);
        HashMap<String, Language> languages = gitLanguageService.listLanguages(repos);
        return new ArrayList<>(languages.values());
    }
}
