package org.example._02_duplicated_code._06_pull_up_method;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

public class ReviewerDashboard extends Dashboard {

    public void printReviewers() throws IOException {
        super.printUsernames(30);
    }


}
