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


public class Entity {

    private String text = null;
    private Double score = null;
    private List<String> types = new ArrayList<String>();
    private EntityLinks links = null;
    private List<List<Integer>> indices = new ArrayList<List<Integer>>();


    /**
     * The entity text
     **/
    public Entity text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The entity text")
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    /**
     * The entity score
     * minimum: 0.0
     * maximum: 1.0
     **/
    public Entity score(Double score) {
        this.score = score;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The entity score")
    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }


    /**
     * An array of the dbpedia types
     **/
    public Entity types(List<String> types) {
        this.types = types;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of the dbpedia types")
    @JsonProperty("types")
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }


    /**
     * Related links to the entity
     **/
    public Entity links(EntityLinks links) {
        this.links = links;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Related links to the entity")
    @JsonProperty("links")
    public EntityLinks getLinks() {
        return links;
    }

    public void setLinks(EntityLinks links) {
        this.links = links;
    }


    /**
     * The indices of the entity text
     **/
    public Entity indices(List<List<Integer>> indices) {
        this.indices = indices;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The indices of the entity text")
    @JsonProperty("indices")
    public List<List<Integer>> getIndices() {
        return indices;
    }

    public void setIndices(List<List<Integer>> indices) {
        this.indices = indices;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entity entity = (Entity) o;
        return Objects.equals(this.text, entity.text) &&
                Objects.equals(this.score, entity.score) &&
                Objects.equals(this.types, entity.types) &&
                Objects.equals(this.links, entity.links) &&
                Objects.equals(this.indices, entity.indices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, score, types, links, indices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entity {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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

