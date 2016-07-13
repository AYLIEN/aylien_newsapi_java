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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * RelatedStories
 */

public class RelatedStories {
    @JsonProperty("story_title")
    private String storyTitle = null;

    @JsonProperty("story_body")
    private String storyBody = null;

    @JsonProperty("story_language")
    private String storyLanguage = null;

    @JsonProperty("related_stories")
    private List<Story> relatedStories = new ArrayList<Story>();

    @JsonProperty("clusters")
    private List<StoryCluster> clusters = new ArrayList<StoryCluster>();

    public RelatedStories storyTitle(String storyTitle) {
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

    public RelatedStories storyBody(String storyBody) {
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

    public RelatedStories storyLanguage(String storyLanguage) {
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

    public RelatedStories relatedStories(List<Story> relatedStories) {
        this.relatedStories = relatedStories;
        return this;
    }

    /**
     * An array of related stories for the input story
     *
     * @return relatedStories
     **/
    @ApiModelProperty(example = "null", value = "An array of related stories for the input story")
    public List<Story> getRelatedStories() {
        return relatedStories;
    }

    public void setRelatedStories(List<Story> relatedStories) {
        this.relatedStories = relatedStories;
    }

    public RelatedStories clusters(List<StoryCluster> clusters) {
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
        RelatedStories relatedStories = (RelatedStories) o;
        return Objects.equals(this.storyTitle, relatedStories.storyTitle) &&
                Objects.equals(this.storyBody, relatedStories.storyBody) &&
                Objects.equals(this.storyLanguage, relatedStories.storyLanguage) &&
                Objects.equals(this.relatedStories, relatedStories.relatedStories) &&
                Objects.equals(this.clusters, relatedStories.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyTitle, storyBody, storyLanguage, relatedStories, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedStories {\n");

        sb.append("    storyTitle: ").append(toIndentedString(storyTitle)).append("\n");
        sb.append("    storyBody: ").append(toIndentedString(storyBody)).append("\n");
        sb.append("    storyLanguage: ").append(toIndentedString(storyLanguage)).append("\n");
        sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
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

