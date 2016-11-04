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
 * Autocomplete
 */

public class Autocomplete {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("text")
    private String text = null;

    public Autocomplete id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the autocomplete
     *
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "ID of the autocomplete")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Autocomplete text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text of the autocomplete
     *
     * @return text
     **/
    @ApiModelProperty(example = "null", value = "Text of the autocomplete")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Autocomplete autocomplete = (Autocomplete) o;
        return Objects.equals(this.id, autocomplete.id) &&
                Objects.equals(this.text, autocomplete.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Autocomplete {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

