package com.example.Gemography.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.Gemography.model.Language;
import com.example.Gemography.model.Repository;

@Service
public class GitLanguageService {

    public HashMap<String, Language> listLanguages(Repository[] repos) {
        HashMap<String, Language> languages = new HashMap<>();
        Arrays.stream(repos).filter(r -> r.language != null).forEach(r -> {
            if (languages.containsKey(r.language)) {
                languages.get(r.language).addToRepos(r);
            } else {
                languages.put(r.language, new Language(r.language, new ArrayList<>(Collections.singletonList(r))));
            }
        });
        return languages;
    }
}
