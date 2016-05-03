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


public class Stories {

    private List<Story> stories = new ArrayList<Story>();
    private List<StoryCluster> clusters = new ArrayList<StoryCluster>();
    private String nextPageCursor = null;


    /**
     * An array of stories
     **/
    public Stories stories(List<Story> stories) {
        this.stories = stories;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of stories")
    @JsonProperty("stories")
    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }


    /**
     * An array of clusters
     **/
    public Stories clusters(List<StoryCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of clusters")
    @JsonProperty("clusters")
    public List<StoryCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<StoryCluster> clusters) {
        this.clusters = clusters;
    }


    /**
     * The next page cursor
     **/
    public Stories nextPageCursor(String nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The next page cursor")
    @JsonProperty("next_page_cursor")
    public String getNextPageCursor() {
        return nextPageCursor;
    }

    public void setNextPageCursor(String nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stories stories = (Stories) o;
        return Objects.equals(this.stories, stories.stories) &&
                Objects.equals(this.clusters, stories.clusters) &&
                Objects.equals(this.nextPageCursor, stories.nextPageCursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stories, clusters, nextPageCursor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Stories {\n");

        sb.append("    stories: ").append(toIndentedString(stories)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    nextPageCursor: ").append(toIndentedString(nextPageCursor)).append("\n");
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

