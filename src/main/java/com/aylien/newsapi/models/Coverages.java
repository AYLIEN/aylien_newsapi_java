/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.aylien.newsapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Coverages
 */

public class Coverages {
    @JsonProperty("story_title")
    private String storyTitle = null;

    @JsonProperty("story_body")
    private String storyBody = null;

    @JsonProperty("story_published_at")
    private DateTime storyPublishedAt = null;

    @JsonProperty("story_language")
    private String storyLanguage = null;

    @JsonProperty("coverages")
    private List<Story> coverages = new ArrayList<Story>();

    @JsonProperty("clusters")
    private List<StoryCluster> clusters = new ArrayList<StoryCluster>();

    public Coverages storyTitle(String storyTitle) {
        this.storyTitle = storyTitle;
        return this;
    }

    /**
     * The input story title
     *
     * @return storyTitle
     **/
    @ApiModelProperty(example = "null", value = "The input story title")
    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public Coverages storyBody(String storyBody) {
        this.storyBody = storyBody;
        return this;
    }

    /**
     * The input story body
     *
     * @return storyBody
     **/
    @ApiModelProperty(example = "null", value = "The input story body")
    public String getStoryBody() {
        return storyBody;
    }

    public void setStoryBody(String storyBody) {
        this.storyBody = storyBody;
    }

    public Coverages storyPublishedAt(DateTime storyPublishedAt) {
        this.storyPublishedAt = storyPublishedAt;
        return this;
    }

    /**
     * The input story published date
     *
     * @return storyPublishedAt
     **/
    @ApiModelProperty(example = "null", value = "The input story published date")
    public DateTime getStoryPublishedAt() {
        return storyPublishedAt;
    }

    public void setStoryPublishedAt(DateTime storyPublishedAt) {
        this.storyPublishedAt = storyPublishedAt;
    }

    public Coverages storyLanguage(String storyLanguage) {
        this.storyLanguage = storyLanguage;
        return this;
    }

    /**
     * The input story language
     *
     * @return storyLanguage
     **/
    @ApiModelProperty(example = "null", value = "The input story language")
    public String getStoryLanguage() {
        return storyLanguage;
    }

    public void setStoryLanguage(String storyLanguage) {
        this.storyLanguage = storyLanguage;
    }

    public Coverages coverages(List<Story> coverages) {
        this.coverages = coverages;
        return this;
    }

    /**
     * An array of coverages for the input story
     *
     * @return coverages
     **/
    @ApiModelProperty(example = "null", value = "An array of coverages for the input story")
    public List<Story> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Story> coverages) {
        this.coverages = coverages;
    }

    public Coverages clusters(List<StoryCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    /**
     * An array of clusters
     *
     * @return clusters
     **/
    @ApiModelProperty(example = "null", value = "An array of clusters")
    public List<StoryCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<StoryCluster> clusters) {
        this.clusters = clusters;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coverages coverages = (Coverages) o;
        return Objects.equals(this.storyTitle, coverages.storyTitle) &&
                Objects.equals(this.storyBody, coverages.storyBody) &&
                Objects.equals(this.storyPublishedAt, coverages.storyPublishedAt) &&
                Objects.equals(this.storyLanguage, coverages.storyLanguage) &&
                Objects.equals(this.coverages, coverages.coverages) &&
                Objects.equals(this.clusters, coverages.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyTitle, storyBody, storyPublishedAt, storyLanguage, coverages, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Coverages {\n");

        sb.append("    storyTitle: ").append(toIndentedString(storyTitle)).append("\n");
        sb.append("    storyBody: ").append(toIndentedString(storyBody)).append("\n");
        sb.append("    storyPublishedAt: ").append(toIndentedString(storyPublishedAt)).append("\n");
        sb.append("    storyLanguage: ").append(toIndentedString(storyLanguage)).append("\n");
        sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

