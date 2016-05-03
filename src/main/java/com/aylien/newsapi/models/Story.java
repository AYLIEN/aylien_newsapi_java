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
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Story {

    private Long id = null;
    private String title = null;
    private String body = null;
    private Summary summary = null;
    private Source source = null;
    private Author author = null;
    private Entities entities = null;
    private List<String> keywords = new ArrayList<String>();
    private List<String> hashtags = new ArrayList<String>();
    private Integer charactersCount = null;
    private Integer wordsCount = null;
    private Integer sentencesCount = null;
    private Integer paragraphsCount = null;
    private List<Category> categories = new ArrayList<Category>();
    private ShareCounts socialSharesCount = null;
    private List<Media> media = new ArrayList<Media>();
    private Sentiments sentiment = null;
    private String language = null;
    private DateTime publishedAt = null;
    private StoryLinks links = null;


    /**
     * ID of the story which is unique identification
     **/
    public Story id(Long id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(example = "null", value = "ID of the story which is unique identification")
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * Title of the story
     **/
    public Story title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Title of the story")
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Body of the story
     **/
    public Story body(String body) {
        this.body = body;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Body of the story")
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    /**
     * The suggested story summary
     **/
    public Story summary(Summary summary) {
        this.summary = summary;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The suggested story summary")
    @JsonProperty("summary")
    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }


    /**
     * The story source
     **/
    public Story source(Source source) {
        this.source = source;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The story source")
    @JsonProperty("source")
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }


    /**
     * The story author
     **/
    public Story author(Author author) {
        this.author = author;
        return this;
    }

    @ApiModelProperty(example = "null", value = "The story author")
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    /**
     * Extracted entities from the story title or body
     **/
    public Story entities(Entities entities) {
        this.entities = entities;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Extracted entities from the story title or body")
    @JsonProperty("entities")
    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }


    /**
     * Extracted keywords mentioned in the story title or body
     **/
    public Story keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Extracted keywords mentioned in the story title or body")
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }


    /**
     * An array of suggested Story hashtags
     **/
    public Story hashtags(List<String> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of suggested Story hashtags")
    @JsonProperty("hashtags")
    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }


    /**
     * Characters count of the story body
     **/
    public Story charactersCount(Integer charactersCount) {
        this.charactersCount = charactersCount;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Characters count of the story body")
    @JsonProperty("characters_count")
    public Integer getCharactersCount() {
        return charactersCount;
    }

    public void setCharactersCount(Integer charactersCount) {
        this.charactersCount = charactersCount;
    }


    /**
     * Words count of the story body
     **/
    public Story wordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Words count of the story body")
    @JsonProperty("words_count")
    public Integer getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }


    /**
     * Sentences count of the story body
     **/
    public Story sentencesCount(Integer sentencesCount) {
        this.sentencesCount = sentencesCount;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Sentences count of the story body")
    @JsonProperty("sentences_count")
    public Integer getSentencesCount() {
        return sentencesCount;
    }

    public void setSentencesCount(Integer sentencesCount) {
        this.sentencesCount = sentencesCount;
    }


    /**
     * Paragraphs count of the story body
     **/
    public Story paragraphsCount(Integer paragraphsCount) {
        this.paragraphsCount = paragraphsCount;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Paragraphs count of the story body")
    @JsonProperty("paragraphs_count")
    public Integer getParagraphsCount() {
        return paragraphsCount;
    }

    public void setParagraphsCount(Integer paragraphsCount) {
        this.paragraphsCount = paragraphsCount;
    }


    /**
     * Suggested categories for the story
     **/
    public Story categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Suggested categories for the story")
    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    /**
     * Social shares count for the story
     **/
    public Story socialSharesCount(ShareCounts socialSharesCount) {
        this.socialSharesCount = socialSharesCount;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Social shares count for the story")
    @JsonProperty("social_shares_count")
    public ShareCounts getSocialSharesCount() {
        return socialSharesCount;
    }

    public void setSocialSharesCount(ShareCounts socialSharesCount) {
        this.socialSharesCount = socialSharesCount;
    }


    /**
     * An array of extracted media such as images and videos
     **/
    public Story media(List<Media> media) {
        this.media = media;
        return this;
    }

    @ApiModelProperty(example = "null", value = "An array of extracted media such as images and videos")
    @JsonProperty("media")
    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }


    /**
     * Suggested sentiments for the story title or body
     **/
    public Story sentiment(Sentiments sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Suggested sentiments for the story title or body")
    @JsonProperty("sentiment")
    public Sentiments getSentiment() {
        return sentiment;
    }

    public void setSentiment(Sentiments sentiment) {
        this.sentiment = sentiment;
    }


    /**
     * Language of the story
     **/
    public Story language(String language) {
        this.language = language;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Language of the story")
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    /**
     * Published date of the story
     **/
    public Story publishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Published date of the story")
    @JsonProperty("published_at")
    public DateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
    }


    /**
     * Links which is related to the story
     **/
    public Story links(StoryLinks links) {
        this.links = links;
        return this;
    }

    @ApiModelProperty(example = "null", value = "Links which is related to the story")
    @JsonProperty("links")
    public StoryLinks getLinks() {
        return links;
    }

    public void setLinks(StoryLinks links) {
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
        Story story = (Story) o;
        return Objects.equals(this.id, story.id) &&
                Objects.equals(this.title, story.title) &&
                Objects.equals(this.body, story.body) &&
                Objects.equals(this.summary, story.summary) &&
                Objects.equals(this.source, story.source) &&
                Objects.equals(this.author, story.author) &&
                Objects.equals(this.entities, story.entities) &&
                Objects.equals(this.keywords, story.keywords) &&
                Objects.equals(this.hashtags, story.hashtags) &&
                Objects.equals(this.charactersCount, story.charactersCount) &&
                Objects.equals(this.wordsCount, story.wordsCount) &&
                Objects.equals(this.sentencesCount, story.sentencesCount) &&
                Objects.equals(this.paragraphsCount, story.paragraphsCount) &&
                Objects.equals(this.categories, story.categories) &&
                Objects.equals(this.socialSharesCount, story.socialSharesCount) &&
                Objects.equals(this.media, story.media) &&
                Objects.equals(this.sentiment, story.sentiment) &&
                Objects.equals(this.language, story.language) &&
                Objects.equals(this.publishedAt, story.publishedAt) &&
                Objects.equals(this.links, story.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body, summary, source, author, entities, keywords, hashtags, charactersCount, wordsCount, sentencesCount, paragraphsCount, categories, socialSharesCount, media, sentiment, language, publishedAt, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Story {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
        sb.append("    charactersCount: ").append(toIndentedString(charactersCount)).append("\n");
        sb.append("    wordsCount: ").append(toIndentedString(wordsCount)).append("\n");
        sb.append("    sentencesCount: ").append(toIndentedString(sentencesCount)).append("\n");
        sb.append("    paragraphsCount: ").append(toIndentedString(paragraphsCount)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    socialSharesCount: ").append(toIndentedString(socialSharesCount)).append("\n");
        sb.append("    media: ").append(toIndentedString(media)).append("\n");
        sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
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
}

