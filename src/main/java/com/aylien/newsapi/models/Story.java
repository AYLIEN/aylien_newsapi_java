/*
 * AYLIEN News API
 * The AYLIEN News API is the most powerful way of sourcing, searching and syndicating analyzed and enriched news content. It is accessed by sending HTTP requests to our server, which returns information to your client. 
 *
 * The version of the OpenAPI document: 3.0
 * Contact: support@aylien.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.aylien.newsapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.aylien.newsapi.models.Author;
import com.aylien.newsapi.models.Category;
import com.aylien.newsapi.models.Entities;
import com.aylien.newsapi.models.Media;
import com.aylien.newsapi.models.Sentiments;
import com.aylien.newsapi.models.ShareCounts;
import com.aylien.newsapi.models.Source;
import com.aylien.newsapi.models.StoryLinks;
import com.aylien.newsapi.models.StoryTranslations;
import com.aylien.newsapi.models.Summary;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Story
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T08:35:56.141Z[Europe/Dublin]")
public class Story {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private Author author;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<Category> categories = null;

  public static final String SERIALIZED_NAME_CHARACTERS_COUNT = "characters_count";
  @SerializedName(SERIALIZED_NAME_CHARACTERS_COUNT)
  private Integer charactersCount;

  public static final String SERIALIZED_NAME_CLUSTERS = "clusters";
  @SerializedName(SERIALIZED_NAME_CLUSTERS)
  private List<Long> clusters = null;

  public static final String SERIALIZED_NAME_ENTITIES = "entities";
  @SerializedName(SERIALIZED_NAME_ENTITIES)
  private Entities entities;

  public static final String SERIALIZED_NAME_HASHTAGS = "hashtags";
  @SerializedName(SERIALIZED_NAME_HASHTAGS)
  private List<String> hashtags = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private List<String> keywords = null;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private StoryLinks links;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private List<Media> media = null;

  public static final String SERIALIZED_NAME_PARAGRAPHS_COUNT = "paragraphs_count";
  @SerializedName(SERIALIZED_NAME_PARAGRAPHS_COUNT)
  private Integer paragraphsCount;

  public static final String SERIALIZED_NAME_PUBLISHED_AT = "published_at";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_AT)
  private OffsetDateTime publishedAt;

  public static final String SERIALIZED_NAME_SENTENCES_COUNT = "sentences_count";
  @SerializedName(SERIALIZED_NAME_SENTENCES_COUNT)
  private Integer sentencesCount;

  public static final String SERIALIZED_NAME_SENTIMENT = "sentiment";
  @SerializedName(SERIALIZED_NAME_SENTIMENT)
  private Sentiments sentiment;

  public static final String SERIALIZED_NAME_SOCIAL_SHARES_COUNT = "social_shares_count";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SHARES_COUNT)
  private ShareCounts socialSharesCount;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private Source source;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private Summary summary;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TRANSLATIONS = "translations";
  @SerializedName(SERIALIZED_NAME_TRANSLATIONS)
  private StoryTranslations translations;

  public static final String SERIALIZED_NAME_WORDS_COUNT = "words_count";
  @SerializedName(SERIALIZED_NAME_WORDS_COUNT)
  private Integer wordsCount;


  public Story author(Author author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Author getAuthor() {
    return author;
  }


  public void setAuthor(Author author) {
    this.author = author;
  }


  public Story body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * Body of the story
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body of the story")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public Story categories(List<Category> categories) {
    
    this.categories = categories;
    return this;
  }

  public Story addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<Category>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Suggested categories for the story
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Suggested categories for the story")

  public List<Category> getCategories() {
    return categories;
  }


  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }


  public Story charactersCount(Integer charactersCount) {
    
    this.charactersCount = charactersCount;
    return this;
  }

   /**
   * Character count of the story body
   * @return charactersCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Character count of the story body")

  public Integer getCharactersCount() {
    return charactersCount;
  }


  public void setCharactersCount(Integer charactersCount) {
    this.charactersCount = charactersCount;
  }


  public Story clusters(List<Long> clusters) {
    
    this.clusters = clusters;
    return this;
  }

  public Story addClustersItem(Long clustersItem) {
    if (this.clusters == null) {
      this.clusters = new ArrayList<Long>();
    }
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * An array of clusters the story is associated with
   * @return clusters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of clusters the story is associated with")

  public List<Long> getClusters() {
    return clusters;
  }


  public void setClusters(List<Long> clusters) {
    this.clusters = clusters;
  }


  public Story entities(Entities entities) {
    
    this.entities = entities;
    return this;
  }

   /**
   * Get entities
   * @return entities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Entities getEntities() {
    return entities;
  }


  public void setEntities(Entities entities) {
    this.entities = entities;
  }


  public Story hashtags(List<String> hashtags) {
    
    this.hashtags = hashtags;
    return this;
  }

  public Story addHashtagsItem(String hashtagsItem) {
    if (this.hashtags == null) {
      this.hashtags = new ArrayList<String>();
    }
    this.hashtags.add(hashtagsItem);
    return this;
  }

   /**
   * An array of suggested Story hashtags
   * @return hashtags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of suggested Story hashtags")

  public List<String> getHashtags() {
    return hashtags;
  }


  public void setHashtags(List<String> hashtags) {
    this.hashtags = hashtags;
  }


  public Story id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the story which is a unique identification
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the story which is a unique identification")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public Story keywords(List<String> keywords) {
    
    this.keywords = keywords;
    return this;
  }

  public Story addKeywordsItem(String keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<String>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Extracted keywords mentioned in the story title or body
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extracted keywords mentioned in the story title or body")

  public List<String> getKeywords() {
    return keywords;
  }


  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }


  public Story language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Language of the story
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Language of the story")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public Story links(StoryLinks links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StoryLinks getLinks() {
    return links;
  }


  public void setLinks(StoryLinks links) {
    this.links = links;
  }


  public Story media(List<Media> media) {
    
    this.media = media;
    return this;
  }

  public Story addMediaItem(Media mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<Media>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * An array of extracted media such as images and videos
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of extracted media such as images and videos")

  public List<Media> getMedia() {
    return media;
  }


  public void setMedia(List<Media> media) {
    this.media = media;
  }


  public Story paragraphsCount(Integer paragraphsCount) {
    
    this.paragraphsCount = paragraphsCount;
    return this;
  }

   /**
   * Paragraph count of the story body
   * @return paragraphsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paragraph count of the story body")

  public Integer getParagraphsCount() {
    return paragraphsCount;
  }


  public void setParagraphsCount(Integer paragraphsCount) {
    this.paragraphsCount = paragraphsCount;
  }


  public Story publishedAt(OffsetDateTime publishedAt) {
    
    this.publishedAt = publishedAt;
    return this;
  }

   /**
   * Published date of the story
   * @return publishedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Published date of the story")

  public OffsetDateTime getPublishedAt() {
    return publishedAt;
  }


  public void setPublishedAt(OffsetDateTime publishedAt) {
    this.publishedAt = publishedAt;
  }


  public Story sentencesCount(Integer sentencesCount) {
    
    this.sentencesCount = sentencesCount;
    return this;
  }

   /**
   * Sentence count of the story body
   * @return sentencesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sentence count of the story body")

  public Integer getSentencesCount() {
    return sentencesCount;
  }


  public void setSentencesCount(Integer sentencesCount) {
    this.sentencesCount = sentencesCount;
  }


  public Story sentiment(Sentiments sentiment) {
    
    this.sentiment = sentiment;
    return this;
  }

   /**
   * Get sentiment
   * @return sentiment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sentiments getSentiment() {
    return sentiment;
  }


  public void setSentiment(Sentiments sentiment) {
    this.sentiment = sentiment;
  }


  public Story socialSharesCount(ShareCounts socialSharesCount) {
    
    this.socialSharesCount = socialSharesCount;
    return this;
  }

   /**
   * Get socialSharesCount
   * @return socialSharesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShareCounts getSocialSharesCount() {
    return socialSharesCount;
  }


  public void setSocialSharesCount(ShareCounts socialSharesCount) {
    this.socialSharesCount = socialSharesCount;
  }


  public Story source(Source source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Source getSource() {
    return source;
  }


  public void setSource(Source source) {
    this.source = source;
  }


  public Story summary(Summary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Summary getSummary() {
    return summary;
  }


  public void setSummary(Summary summary) {
    this.summary = summary;
  }


  public Story title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the story
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the story")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Story translations(StoryTranslations translations) {
    
    this.translations = translations;
    return this;
  }

   /**
   * Get translations
   * @return translations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StoryTranslations getTranslations() {
    return translations;
  }


  public void setTranslations(StoryTranslations translations) {
    this.translations = translations;
  }


  public Story wordsCount(Integer wordsCount) {
    
    this.wordsCount = wordsCount;
    return this;
  }

   /**
   * Word count of the story body
   * @return wordsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Word count of the story body")

  public Integer getWordsCount() {
    return wordsCount;
  }


  public void setWordsCount(Integer wordsCount) {
    this.wordsCount = wordsCount;
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
    return Objects.equals(this.author, story.author) &&
        Objects.equals(this.body, story.body) &&
        Objects.equals(this.categories, story.categories) &&
        Objects.equals(this.charactersCount, story.charactersCount) &&
        Objects.equals(this.clusters, story.clusters) &&
        Objects.equals(this.entities, story.entities) &&
        Objects.equals(this.hashtags, story.hashtags) &&
        Objects.equals(this.id, story.id) &&
        Objects.equals(this.keywords, story.keywords) &&
        Objects.equals(this.language, story.language) &&
        Objects.equals(this.links, story.links) &&
        Objects.equals(this.media, story.media) &&
        Objects.equals(this.paragraphsCount, story.paragraphsCount) &&
        Objects.equals(this.publishedAt, story.publishedAt) &&
        Objects.equals(this.sentencesCount, story.sentencesCount) &&
        Objects.equals(this.sentiment, story.sentiment) &&
        Objects.equals(this.socialSharesCount, story.socialSharesCount) &&
        Objects.equals(this.source, story.source) &&
        Objects.equals(this.summary, story.summary) &&
        Objects.equals(this.title, story.title) &&
        Objects.equals(this.translations, story.translations) &&
        Objects.equals(this.wordsCount, story.wordsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, body, categories, charactersCount, clusters, entities, hashtags, id, keywords, language, links, media, paragraphsCount, publishedAt, sentencesCount, sentiment, socialSharesCount, source, summary, title, translations, wordsCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Story {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    charactersCount: ").append(toIndentedString(charactersCount)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    hashtags: ").append(toIndentedString(hashtags)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    paragraphsCount: ").append(toIndentedString(paragraphsCount)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    sentencesCount: ").append(toIndentedString(sentencesCount)).append("\n");
    sb.append("    sentiment: ").append(toIndentedString(sentiment)).append("\n");
    sb.append("    socialSharesCount: ").append(toIndentedString(socialSharesCount)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    wordsCount: ").append(toIndentedString(wordsCount)).append("\n");
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

