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

import java.util.Objects;

/**
 * StoryLinks
 */

public class StoryLinks {
    @JsonProperty("permalink")
    private String permalink = null;

    @JsonProperty("related_stories")
    private String relatedStories = null;

    @JsonProperty("coverages")
    private String coverages = null;

    @JsonProperty("canonical")
    private String canonical = null;

    public StoryLinks permalink(String permalink) {
        this.permalink = permalink;
        return this;
    }

    /**
     * The story permalink URL
     *
     * @return permalink
     **/
    @ApiModelProperty(example = "null", value = "The story permalink URL")
    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public StoryLinks relatedStories(String relatedStories) {
        this.relatedStories = relatedStories;
        return this;
    }

    /**
     * The related stories URL
     *
     * @return relatedStories
     **/
    @ApiModelProperty(example = "null", value = "The related stories URL")
    public String getRelatedStories() {
        return relatedStories;
    }

    public void setRelatedStories(String relatedStories) {
        this.relatedStories = relatedStories;
    }

    public StoryLinks coverages(String coverages) {
        this.coverages = coverages;
        return this;
    }

    /**
     * The coverages URL
     *
     * @return coverages
     **/
    @ApiModelProperty(example = "null", value = "The coverages URL")
    public String getCoverages() {
        return coverages;
    }

    public void setCoverages(String coverages) {
        this.coverages = coverages;
    }

    public StoryLinks canonical(String canonical) {
        this.canonical = canonical;
        return this;
    }

    /**
     * The story canonical URL
     *
     * @return canonical
     **/
    @ApiModelProperty(example = "null", value = "The story canonical URL")
    public String getCanonical() {
        return canonical;
    }

    public void setCanonical(String canonical) {
        this.canonical = canonical;
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
                Objects.equals(this.coverages, storyLinks.coverages) &&
                Objects.equals(this.canonical, storyLinks.canonical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permalink, relatedStories, coverages, canonical);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StoryLinks {\n");

        sb.append("    permalink: ").append(toIndentedString(permalink)).append("\n");
        sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
        sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
        sb.append("    canonical: ").append(toIndentedString(canonical)).append("\n");
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

