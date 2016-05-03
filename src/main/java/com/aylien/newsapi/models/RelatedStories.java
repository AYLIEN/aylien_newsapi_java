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


public class RelatedStories {

    private String storyTitle = null;
    private String storyBody = null;
    private String storyLanguage = null;
    private List<Story> relatedStories = new ArrayList<Story>();


    /**
     * The input story title
     **/
    public RelatedStories storyTitle(String storyTitle) {
        this.storyTitle = storyTitle;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The input story title")
    @JsonProperty("story_title")
    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }


    /**
     * The input story body
     **/
    public RelatedStories storyBody(String storyBody) {
        this.storyBody = storyBody;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The input story body")
    @JsonProperty("story_body")
    public String getStoryBody() {
        return storyBody;
    }

    public void setStoryBody(String storyBody) {
        this.storyBody = storyBody;
    }


    /**
     * The input story language
     **/
    public RelatedStories storyLanguage(String storyLanguage) {
        this.storyLanguage = storyLanguage;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The input story language")
    @JsonProperty("story_language")
    public String getStoryLanguage() {
        return storyLanguage;
    }

    public void setStoryLanguage(String storyLanguage) {
        this.storyLanguage = storyLanguage;
    }


    /**
     * An array of related stories for the input story
     **/
    public RelatedStories relatedStories(List<Story> relatedStories) {
        this.relatedStories = relatedStories;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of related stories for the input story")
    @JsonProperty("related_stories")
    public List<Story> getRelatedStories() {
        return relatedStories;
    }

    public void setRelatedStories(List<Story> relatedStories) {
        this.relatedStories = relatedStories;
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
                Objects.equals(this.relatedStories, relatedStories.relatedStories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storyTitle, storyBody, storyLanguage, relatedStories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelatedStories {\n");

        sb.append("    storyTitle: ").append(toIndentedString(storyTitle)).append("\n");
        sb.append("    storyBody: ").append(toIndentedString(storyBody)).append("\n");
        sb.append("    storyLanguage: ").append(toIndentedString(storyLanguage)).append("\n");
        sb.append("    relatedStories: ").append(toIndentedString(relatedStories)).append("\n");
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

