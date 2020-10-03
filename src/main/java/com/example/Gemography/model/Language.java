package com.example.Gemography.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Language implements Serializable {
    private String language;

    public Language(String language, List<Repository> repositories) {
        this.language = language;
        this.repositories = repositories;
        this.numberOfRepositories = repositories.size();
    }

    public void addToRepos(Repository repository) {
        repositories.add(repository);
        numberOfRepositories++;
    }

    public int getNumberOfRepositories() {
        return numberOfRepositories;
    }
    public void setNumberOfRepositories(int numberOfRepositories) {
        this.numberOfRepositories = numberOfRepositories;
    }

    private int numberOfRepositories;

    private List<Repository> repositories;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }
}
