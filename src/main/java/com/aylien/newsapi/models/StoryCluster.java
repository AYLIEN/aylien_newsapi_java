/**
 * Copyright 2016 Aylien, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
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


public class StoryCluster {

    private Integer id = null;
    private List<String> phrases = new ArrayList<String>();
    private Integer size = null;
    private List<Long> stories = new ArrayList<Long>();
    private Double score = null;


    /**
     * A unique identification for the cluster
     **/
    public StoryCluster id(Integer id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(example = "null", value = "A unique identification for the cluster")
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * Suggested labels for the cluster
     **/
    public StoryCluster phrases(List<String> phrases) {
        this.phrases = phrases;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Suggested labels for the cluster")
    @JsonProperty("phrases")
    public List<String> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<String> phrases) {
        this.phrases = phrases;
    }


    /**
     * Size of the cluster
     **/
    public StoryCluster size(Integer size) {
        this.size = size;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Size of the cluster")
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * Story ids which are in the cluster
     **/
    public StoryCluster stories(List<Long> stories) {
        this.stories = stories;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Story ids which are in the cluster")
    @JsonProperty("stories")
    public List<Long> getStories() {
        return stories;
    }

    public void setStories(List<Long> stories) {
        this.stories = stories;
    }


    /**
     * The cluster score
     **/
    public StoryCluster score(Double score) {
        this.score = score;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The cluster score")
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoryCluster storyCluster = (StoryCluster) o;
        return Objects.equals(this.id, storyCluster.id) &&
                Objects.equals(this.phrases, storyCluster.phrases) &&
                Objects.equals(this.size, storyCluster.size) &&
                Objects.equals(this.stories, storyCluster.stories) &&
                Objects.equals(this.score, storyCluster.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phrases, size, stories, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoryCluster {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

