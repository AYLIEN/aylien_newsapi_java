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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Category
 */

public class Category {
    @JsonProperty("id")
    private String id = null;
    @JsonProperty("taxonomy")
    private TaxonomyEnum taxonomy = null;
    @JsonProperty("level")
    private Integer level = null;
    @JsonProperty("score")
    private Double score = null;
    @JsonProperty("confident")
    private Boolean confident = null;
    @JsonProperty("links")
    private CategoryLinks links = null;

    public Category id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the category
     *
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "The ID of the category")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Category taxonomy(TaxonomyEnum taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    /**
     * The taxonomy of the category
     *
     * @return taxonomy
     **/
    @ApiModelProperty(example = "null", value = "The taxonomy of the category")
    public TaxonomyEnum getTaxonomy() {
        return taxonomy;
    }

    public void setTaxonomy(TaxonomyEnum taxonomy) {
        this.taxonomy = taxonomy;
    }

    public Category level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * The level of the category
     *
     * @return level
     **/
    @ApiModelProperty(example = "null", value = "The level of the category")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Category score(Double score) {
        this.score = score;
        return this;
    }

    /**
     * The score of the category
     *
     * @return score
     **/
    @ApiModelProperty(example = "null", value = "The score of the category")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Category confident(Boolean confident) {
        this.confident = confident;
        return this;
    }

    /**
     * It defines whether the extracted category is confident or not
     *
     * @return confident
     **/
    @ApiModelProperty(example = "null", value = "It defines whether the extracted category is confident or not")
    public Boolean getConfident() {
        return confident;
    }

    public void setConfident(Boolean confident) {
        this.confident = confident;
    }

    public Category links(CategoryLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Related links for the category
     *
     * @return links
     **/
    @ApiModelProperty(example = "null", value = "Related links for the category")
    public CategoryLinks getLinks() {
        return links;
    }

    public void setLinks(CategoryLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Category category = (Category) o;
        return Objects.equals(this.id, category.id) &&
                Objects.equals(this.taxonomy, category.taxonomy) &&
                Objects.equals(this.level, category.level) &&
                Objects.equals(this.score, category.score) &&
                Objects.equals(this.confident, category.confident) &&
                Objects.equals(this.links, category.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taxonomy, level, score, confident, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Category {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    taxonomy: ").append(toIndentedString(taxonomy)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    confident: ").append(toIndentedString(confident)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

    /**
     * The taxonomy of the category
     */
    public enum TaxonomyEnum {
        IAB_QAG("iab-qag"),

        IPTC_SUBJECTCODE("iptc-subjectcode");

        private String value;

        TaxonomyEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TaxonomyEnum fromValue(String text) {
            for (TaxonomyEnum b : TaxonomyEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

