package com.abhijai.arp.models;

public class CandidateModel {
    private String candidateName;
    private String candidateMatchingPercentage;

    public CandidateModel(String candidateName, String candidateMatchingPercentage) {
        this.candidateName = candidateName;
        this.candidateMatchingPercentage = candidateMatchingPercentage;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateMatchingPercentage() {
        return candidateMatchingPercentage;
    }

    public void setCandidateMatchingPercentage(String candidateMatchingPercentage) {
        this.candidateMatchingPercentage = candidateMatchingPercentage;
    }
}
