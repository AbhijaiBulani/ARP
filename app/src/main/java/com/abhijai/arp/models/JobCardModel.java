package com.abhijai.arp.models;

public class JobCardModel {
    private String jobDescription;
    private String jobId;
    private String clientName;

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public JobCardModel(String jobDescription, String jobId, String clientName) {
        this.jobDescription = jobDescription;
        this.jobId = jobId;
        this.clientName = clientName;
    }
}
