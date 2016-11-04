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
 * CategoryLinks
 */

public class CategoryLinks {
    @JsonProperty("self")
    private String self = null;

    @JsonProperty("parent")
    private String parent = null;

    public CategoryLinks self(String self) {
        this.self = self;
        return this;
    }

    /**
     * A URL pointing to the category
     *
     * @return self
     **/
    @ApiModelProperty(example = "null", value = "A URL pointing to the category")
    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public CategoryLinks parent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * A URL pointing to the parent category
     *
     * @return parent
     **/
    @ApiModelProperty(example = "null", value = "A URL pointing to the parent category")
    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CategoryLinks categoryLinks = (CategoryLinks) o;
        return Objects.equals(this.self, categoryLinks.self) &&
                Objects.equals(this.parent, categoryLinks.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, parent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CategoryLinks {\n");

        sb.append("    self: ").append(toIndentedString(self)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

