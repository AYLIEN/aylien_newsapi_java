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

import com.aylien.newsapi.models.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Story
 */

public class Story {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("body")
    private String body = null;

    @JsonProperty("summary")
    private Summary summary = null;

    @JsonProperty("source")
    private Source source = null;

    @JsonProperty("author")
    private Author author = null;

    @JsonProperty("entities")
    private Entities entities = null;

    @JsonProperty("keywords")
    private List<String> keywords = new ArrayList<String>();

    @JsonProperty("hashtags")
    private List<String> hashtags = new ArrayList<String>();

    @JsonProperty("characters_count")
    private Integer charactersCount = null;

    @JsonProperty("words_count")
    private Integer wordsCount = null;

    @JsonProperty("sentences_count")
    private Integer sentencesCount = null;

    @JsonProperty("paragraphs_count")
    private Integer paragraphsCount = null;

    @JsonProperty("categories")
    private List<Category> categories = new ArrayList<Category>();

    @JsonProperty("social_shares_count")
    private ShareCounts socialSharesCount = null;

    @JsonProperty("media")
    private List<Media> media = new ArrayList<Media>();

    @JsonProperty("sentiment")
    private Sentiments sentiment = null;

    @JsonProperty("language")
    private String language = null;

    @JsonProperty("published_at")
    private DateTime publishedAt = null;

    @JsonProperty("links")
    private StoryLinks links = null;

    public Story id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the story which is a unique identification
     *
     * @return id
     **/
    @ApiModelProperty(example = "null", value = "ID of the story which is a unique identification")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Story title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Title of the story
     *
     * @return title
     **/
    @ApiModelProperty(example = "null", value = "Title of the story")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Story body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Body of the story
     *
     * @return body
     **/
    @ApiModelProperty(example = "null", value = "Body of the story")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Story summary(Summary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * The suggested story summary
     *
     * @return summary
     **/
    @ApiModelProperty(example = "null", value = "The suggested story summary")
    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Story source(Source source) {
        this.source = source;
        return this;
    }

    /**
     * The story source
     *
     * @return source
     **/
    @ApiModelProperty(example = "null", value = "The story source")
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Story author(Author author) {
        this.author = author;
        return this;
    }

    /**
     * The story author
     *
     * @return author
     **/
    @ApiModelProperty(example = "null", value = "The story author")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Story entities(Entities entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Extracted entities from the story title or body
     *
     * @return entities
     **/
    @ApiModelProperty(example = "null", value = "Extracted entities from the story title or body")
    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Story keywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public Story addKeywordsItem(String keywordsItem) {
        this.keywords.add(keywordsItem);
        return this;
    }

    /**
     * Extracted keywords mentioned in the story title or body
     *
     * @return keywords
     **/
    @ApiModelProperty(example = "null", value = "Extracted keywords mentioned in the story title or body")
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public Story hashtags(List<String> hashtags) {
        this.hashtags = hashtags;
        return this;
    }

    public Story addHashtagsItem(String hashtagsItem) {
        this.hashtags.add(hashtagsItem);
        return this;
    }

    /**
     * An array of suggested Story hashtags
     *
     * @return hashtags
     **/
    @ApiModelProperty(example = "null", value = "An array of suggested Story hashtags")
    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public Story charactersCount(Integer charactersCount) {
        this.charactersCount = charactersCount;
        return this;
    }

    /**
     * Character count of the story body
     *
     * @return charactersCount
     **/
    @ApiModelProperty(example = "null", value = "Character count of the story body")
    public Integer getCharactersCount() {
        return charactersCount;
    }

    public void setCharactersCount(Integer charactersCount) {
        this.charactersCount = charactersCount;
    }

    public Story wordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
        return this;
    }

    /**
     * Word count of the story body
     *
     * @return wordsCount
     **/
    @ApiModelProperty(example = "null", value = "Word count of the story body")
    public Integer getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }

    public Story sentencesCount(Integer sentencesCount) {
        this.sentencesCount = sentencesCount;
        return this;
    }

    /**
     * Sentence count of the story body
     *
     * @return sentencesCount
     **/
    @ApiModelProperty(example = "null", value = "Sentence count of the story body")
    public Integer getSentencesCount() {
        return sentencesCount;
    }

    public void setSentencesCount(Integer sentencesCount) {
        this.sentencesCount = sentencesCount;
    }

    public Story paragraphsCount(Integer paragraphsCount) {
        this.paragraphsCount = paragraphsCount;
        return this;
    }

    /**
     * Paragraph count of the story body
     *
     * @return paragraphsCount
     **/
    @ApiModelProperty(example = "null", value = "Paragraph count of the story body")
    public Integer getParagraphsCount() {
        return paragraphsCount;
    }

    public void setParagraphsCount(Integer paragraphsCount) {
        this.paragraphsCount = paragraphsCount;
    }

    public Story categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public Story addCategoriesItem(Category categoriesItem) {
        this.categories.add(categoriesItem);
        return this;
    }

    /**
     * Suggested categories for the story
     *
     * @return categories
     **/
    @ApiModelProperty(example = "null", value = "Suggested categories for the story")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Story socialSharesCount(ShareCounts socialSharesCount) {
        this.socialSharesCount = socialSharesCount;
        return this;
    }

    /**
     * Social shares count for the story
     *
     * @return socialSharesCount
     **/
    @ApiModelProperty(example = "null", value = "Social shares count for the story")
    public ShareCounts getSocialSharesCount() {
        return socialSharesCount;
    }

    public void setSocialSharesCount(ShareCounts socialSharesCount) {
        this.socialSharesCount = socialSharesCount;
    }

    public Story media(List<Media> media) {
        this.media = media;
        return this;
    }

    public Story addMediaItem(Media mediaItem) {
        this.media.add(mediaItem);
        return this;
    }

    /**
     * An array of extracted media such as images and videos
     *
     * @return media
     **/
    @ApiModelProperty(example = "null", value = "An array of extracted media such as images and videos")
    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
    }

    public Story sentiment(Sentiments sentiment) {
        this.sentiment = sentiment;
        return this;
    }

    /**
     * Suggested sentiments for the story title or body
     *
     * @return sentiment
     **/
    @ApiModelProperty(example = "null", value = "Suggested sentiments for the story title or body")
    public Sentiments getSentiment() {
        return sentiment;
    }

    public void setSentiment(Sentiments sentiment) {
        this.sentiment = sentiment;
    }

    public Story language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Language of the story
     *
     * @return language
     **/
    @ApiModelProperty(example = "null", value = "Language of the story")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Story publishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * Published date of the story
     *
     * @return publishedAt
     **/
    @ApiModelProperty(example = "null", value = "Published date of the story")
    public DateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(DateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Story links(StoryLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Links which is related to the story
     *
     * @return links
     **/
    @ApiModelProperty(example = "null", value = "Links which is related to the story")
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

