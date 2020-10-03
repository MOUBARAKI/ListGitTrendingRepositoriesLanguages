package com.example.Gemography.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)

public class Repository implements Serializable {

    public int id;
    public String nodeId;
    public String name;
    @JsonProperty("private")
    public boolean isPrivate;
    public String fullName;
    public Owner owner;
    public String htmlUrl;
    public String description;
    public boolean fork;
    public String url;
    public String forksUrl;
    public String keysUrl;
    public String collaboratorsUrl;
    public String teamsUrl;
    public String hooksUrl;
    public String issueEventsUrl;
    public String eventsUrl;
    public String assigneesUrl;
    public String branchesUrl;
    public String tagsUrl;
    public String blobsUrl;
    public String gitTagsUrl;
    public String gitRefsUrl;
    public String treesUrl;
    public String statusesUrl;
    public String languagesUrl;
    public String stargazersUrl;
    public String contributorsUrl;
    public String subscribersUrl;
    public String subscriptionUrl;
    public String commitsUrl;
    public String gitCommitsUrl;
    public String commentsUrl;
    public String issueCommentUrl;
    public String contentsUrl;
    public String compareUrl;
    public String mergesUrl;
    public String archiveUrl;
    public String downloadsUrl;
    public String issuesUrl;
    public String pullsUrl;
    public String milestonesUrl;
    public String notificationsUrl;
    public String labelsUrl;
    public String releasesUrl;
    public String deploymentsUrl;
    public Date createdAt;
    public Date updatedAt;
    public Date pushedAt;
    public String gitUrl;
    public String sshUrl;
    public String cloneUrl;
    public String svnUrl;
    public Object homepage;
    public int size;
    public int stargazersCount;
    public int watchersCount;
    public String language;
    public boolean hasIssues;
    public boolean hasProjects;
    public boolean hasDownloads;
    public boolean hasWiki;
    public boolean hasPages;
    public int forksCount;
    public Object mirrorUrl;
    public boolean archived;
    public boolean disabled;
    public int openIssuesCount;
    public License license;
    public int forks;
    public int openIssues;
    public int watchers;
    public String defaultBranch;
    public double score;

    public Repository() {
        super();
    }
}
