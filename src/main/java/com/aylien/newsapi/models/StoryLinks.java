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

import java.util.Objects;


public class StoryLinks {

    private String permalink = null;
    private String relatedStories = null;
    private String coverages = null;


    /**
     * The story permalink URL
     **/
    public StoryLinks permalink(String permalink) {
        this.permalink = permalink;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The story permalink URL")
    @JsonProperty("permalink")
    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }


    /**
     * The related stories URL
     **/
    public StoryLinks relatedStories(String relatedStories) {
        this.relatedStories = relatedStories;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The related stories URL")
    @JsonProperty("related_stories")
    public String getRelatedStories() {
        return relatedStories;
    }

    public void setRelatedStories(String relatedStories) {
        this.relatedStories = relatedStories;
    }


    /**
     * The coverages URL
     **/
    public StoryLinks coverages(String coverages) {
        this.coverages = coverages;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The coverages URL")
    @JsonProperty("coverages")
    public String getCoverages() {
        return coverages;
    }

    public void setCoverages(String coverages) {
        this.coverages = coverages;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StoryLinks storyLinks = (StoryLinks) o;
        return Objects.equals(this.permalink, storyLinks.permalink) &&
                Objects.equals(this.relatedStories, storyLinks.relatedStories) &&
                Objects.equals(this.coverages, storyLinks.coverages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permalink, relatedStories, coverages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoryLinks {\n");

        sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
        sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
        sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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

