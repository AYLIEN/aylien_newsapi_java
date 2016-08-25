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
 * StoryCluster
 */

public class StoryCluster {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("phrases")
    private List<String> phrases = new ArrayList<String>();

    @JsonProperty("size")
    private Integer size = null;

    @JsonProperty("stories")
    private List<Long> stories = new ArrayList<Long>();

    @JsonProperty("score")
    private Double score = null;

    public StoryCluster id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * A unique identification for the cluster
     *
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "A unique identification for the cluster")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StoryCluster phrases(List<String> phrases) {
        this.phrases = phrases;
        return this;
    }

    public StoryCluster addPhrasesItem(String phrasesItem) {
        this.phrases.add(phrasesItem);
        return this;
    }

    /**
     * Suggested labels for the cluster
     *
     * @return phrases
     **/
    @ApiModelProperty(example = "null", value = "Suggested labels for the cluster")
    public List<String> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<String> phrases) {
        this.phrases = phrases;
    }

    public StoryCluster size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Size of the cluster
     *
     * @return size
     **/
    @ApiModelProperty(example = "null", value = "Size of the cluster")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public StoryCluster stories(List<Long> stories) {
        this.stories = stories;
        return this;
    }

    public StoryCluster addStoriesItem(Long storiesItem) {
        this.stories.add(storiesItem);
        return this;
    }

    /**
     * Story ids which are in the cluster
     *
     * @return stories
     **/
    @ApiModelProperty(example = "null", value = "Story ids which are in the cluster")
    public List<Long> getStories() {
        return stories;
    }

    public void setStories(List<Long> stories) {
        this.stories = stories;
    }

    public StoryCluster score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * The cluster score
     *
     * @return score
     **/
    @ApiModelProperty(example = "null", value = "The cluster score")
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

