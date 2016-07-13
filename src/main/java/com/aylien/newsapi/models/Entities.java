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
 * Entities
 */

public class Entities {
    @JsonProperty("title")
    private List<Entity> title = new ArrayList<Entity>();

    @JsonProperty("body")
    private List<Entity> body = new ArrayList<Entity>();

    public Entities title(List<Entity> title) {
        this.title = title;
        return this;
    }

    /**
     * An array of extracted entities from the story title
     *
     * @return title
     **/
    @ApiModelProperty(example = "null", value = "An array of extracted entities from the story title")
    public List<Entity> getTitle() {
        return title;
    }

    public void setTitle(List<Entity> title) {
        this.title = title;
    }

    public Entities body(List<Entity> body) {
        this.body = body;
        return this;
    }

    /**
     * An array of extracted entities from the story body
     *
     * @return body
     **/
    @ApiModelProperty(example = "null", value = "An array of extracted entities from the story body")
    public List<Entity> getBody() {
        return body;
    }

    public void setBody(List<Entity> body) {
        this.body = body;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Entities entities = (Entities) o;
        return Objects.equals(this.title, entities.title) &&
                Objects.equals(this.body, entities.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entities {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

