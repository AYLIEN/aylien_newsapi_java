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

import com.aylien.newsapi.models.Sentiment;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * Sentiments
 */

public class Sentiments {
    @JsonProperty("title")
    private Sentiment title = null;

    @JsonProperty("body")
    private Sentiment body = null;

    public Sentiments title(Sentiment title) {
        this.title = title;
        return this;
    }

    /**
     * The sentiment for the story title
     *
     * @return title
     **/
    @ApiModelProperty(example = "null", value = "The sentiment for the story title")
    public Sentiment getTitle() {
        return title;
    }

    public void setTitle(Sentiment title) {
        this.title = title;
    }

    public Sentiments body(Sentiment body) {
        this.body = body;
        return this;
    }

    /**
     * The sentiment for the story body
     *
     * @return body
     **/
    @ApiModelProperty(example = "null", value = "The sentiment for the story body")
    public Sentiment getBody() {
        return body;
    }

    public void setBody(Sentiment body) {
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
        Sentiments sentiments = (Sentiments) o;
        return Objects.equals(this.title, sentiments.title) &&
                Objects.equals(this.body, sentiments.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sentiments {\n");

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

