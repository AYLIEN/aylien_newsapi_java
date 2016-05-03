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

package com.aylien.newsapi.parameters;

public class AutocompletesParams {
    private String type;
    private String term;
    private String language;
    private Integer perPage;

    public String getType() {
        return type;
    }

    public String getTerm() {
        return term;
    }

    public String getLanguage() {
        return language;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * @param type     This parameter is used for defining the type of autocompletes. (required)
     * @param term     This parameter is used for finding autocomplete objects whose contains the specified value. (required)
     * @param language This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. (optional, default to en)
     * @param perPage  This parameter is used for specifying number of the items in each page. (optional, default to 3)
     */
    public AutocompletesParams(String type, String term, String language, Integer perPage) {
        this.type = type;
        this.term = term;
        this.language = language;
        this.perPage = perPage;
    }

    public static class Builder {
        private String type;
        private String term;
        private String language;
        private Integer perPage;

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setTerm(String term) {
            this.term = term;
            return this;
        }

        public Builder setLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder setPerPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        public AutocompletesParams build() {
            return new AutocompletesParams(type, term, language, perPage);
        }
    }
}
