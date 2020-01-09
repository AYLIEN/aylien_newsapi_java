# DefaultApi

All URIs are relative to *https://api.aylien.com/news*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listAutocompletes**](DefaultApi.md#listAutocompletes) | **GET** /autocompletes | List autocompletes
[**listClusters**](DefaultApi.md#listClusters) | **GET** /clusters | List Clusters
[**listCoverages**](DefaultApi.md#listCoverages) | **GET** /coverages | List coverages
[**listHistograms**](DefaultApi.md#listHistograms) | **GET** /histograms | List histograms
[**listRelatedStories**](DefaultApi.md#listRelatedStories) | **GET** /related_stories | List related stories
[**listStories**](DefaultApi.md#listStories) | **GET** /stories | List Stories
[**listTimeSeries**](DefaultApi.md#listTimeSeries) | **GET** /time_series | List time series
[**listTrends**](DefaultApi.md#listTrends) | **GET** /trends | List trends


<a name="listAutocompletes"></a>
# **listAutocompletes**
> Autocompletes listAutocompletes(type, term).language(language).perPage(perPage).execute();

List autocompletes

The autocompletes endpoint a string of characters provided to it, and then returns suggested terms that are the most likely full words or strings. The terms returned by the News API are based on parameters the type parameters you can see below. For example, if you provide the autocompletes endpoint with the term &#x60;New York C&#x60; and select the type &#x60;dbpedia_resources&#x60;, the API will return links to the DBpedia resources &#x60;New_York_City&#x60;, &#x60;New_York_City_Subway&#x60;, &#x60;New_York_City_Police_Department&#x60;, and so on. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String type = source_names; // String | This parameter is used for defining the type of autocompletes. 
    String term = News; // String | This parameter is used for finding autocomplete objects that contain the specified value. 
    String language = "en"; // String | This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    Integer perPage = 3; // Integer | This parameter is used for specifying number of items in each page. 
    try {
      Autocompletes result = apiInstance.listAutocompletes(type, term)
            .language(language)
            .perPage(perPage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listAutocompletes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| This parameter is used for defining the type of autocompletes.  | [enum: source_names, source_domains, entity_types, dbpedia_resources]
 **term** | **String**| This parameter is used for finding autocomplete objects that contain the specified value.  |
 **language** | **String**| This parameter is used for autocompletes whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [default to en] [enum: en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page.  | [optional] [default to 3]

### Return type

[**Autocompletes**](Autocompletes.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of autocompletes |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listClusters"></a>
# **listClusters**
> Clusters listClusters().id(id).notId(notId).storyCountMin(storyCountMin).storyCountMax(storyCountMax).timeStart(timeStart).timeEnd(timeEnd).earliestStoryStart(earliestStoryStart).earliestStoryEnd(earliestStoryEnd).latestStoryStart(latestStoryStart).latestStoryEnd(latestStoryEnd).locationCountry(locationCountry).notLocationCountry(notLocationCountry).execute();

List Clusters

The clusters endpoint is used to return clusters based on parameters you set in your query. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding clusters by cluster id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding clusters by cluster id. 
    Integer storyCountMin = 56; // Integer | This parameter is used for finding clusters with more than or equal to a specific amount of stories associated with them. 
    Integer storyCountMax = 56; // Integer | This parameter is used for finding clusters with less than or equal to a specific amount of stories associated with them. 
    String timeStart = "timeStart_example"; // String | This parameter is used for finding clusters whose creation time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String timeEnd = "timeEnd_example"; // String | This parameter is used for finding clusters whose creation time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String earliestStoryStart = "earliestStoryStart_example"; // String | This parameter is used for finding clusters whose publication date of its earliest story is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String earliestStoryEnd = "earliestStoryEnd_example"; // String | This parameter is used for finding clusters whose publication date of its earliest story is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String latestStoryStart = "latestStoryStart_example"; // String | This parameter is used for finding clusters whose publication date of its latest story is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String latestStoryEnd = "latestStoryEnd_example"; // String | This parameter is used for finding clusters whose publication date of its latest story is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    List<String> locationCountry = Arrays.asList(); // List<String> | This parameter is used for finding clusters belonging to a specific country. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notLocationCountry = Arrays.asList(); // List<String> | This parameter is used for excluding clusters belonging to a specific country. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    try {
      Clusters result = apiInstance.listClusters()
            .id(id)
            .notId(notId)
            .storyCountMin(storyCountMin)
            .storyCountMax(storyCountMax)
            .timeStart(timeStart)
            .timeEnd(timeEnd)
            .earliestStoryStart(earliestStoryStart)
            .earliestStoryEnd(earliestStoryEnd)
            .latestStoryStart(latestStoryStart)
            .latestStoryEnd(latestStoryEnd)
            .locationCountry(locationCountry)
            .notLocationCountry(notLocationCountry)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listClusters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding clusters by cluster id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding clusters by cluster id.  | [optional]
 **storyCountMin** | **Integer**| This parameter is used for finding clusters with more than or equal to a specific amount of stories associated with them.  | [optional]
 **storyCountMax** | **Integer**| This parameter is used for finding clusters with less than or equal to a specific amount of stories associated with them.  | [optional]
 **timeStart** | **String**| This parameter is used for finding clusters whose creation time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **timeEnd** | **String**| This parameter is used for finding clusters whose creation time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **earliestStoryStart** | **String**| This parameter is used for finding clusters whose publication date of its earliest story is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **earliestStoryEnd** | **String**| This parameter is used for finding clusters whose publication date of its earliest story is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **latestStoryStart** | **String**| This parameter is used for finding clusters whose publication date of its latest story is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **latestStoryEnd** | **String**| This parameter is used for finding clusters whose publication date of its latest story is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **locationCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding clusters belonging to a specific country. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notLocationCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding clusters belonging to a specific country. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]

### Return type

[**Clusters**](Clusters.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of clusters |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listCoverages"></a>
# **listCoverages**
> Coverages listCoverages().id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).linksPermalink(linksPermalink).notLinksPermalink(notLinksPermalink).language(language).notLanguage(notLanguage).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).clusters(clusters)._return(_return).storyId(storyId).storyUrl(storyUrl).storyTitle(storyTitle).storyBody(storyBody).storyPublishedAt(storyPublishedAt).storyLanguage(storyLanguage).perPage(perPage).execute();

List coverages

The coverages endpoint allows you to understand the reach a document has had. For example, you can track the coverage of a press release or a Tweet based on how many times it has been mentioned in stories. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> linksPermalink = Arrays.asList(); // List<String> | This parameter is used to find stories based on their url. 
    List<String> notLinksPermalink = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on their url. 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    List<String> clusters = Arrays.asList(); // List<String> | This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). 
    List<String> _return = Arrays.asList(); // List<String> | This parameter is used for specifying return fields.
    Long storyId = 56L; // Long | A story id
    String storyUrl = "storyUrl_example"; // String | An article or webpage
    String storyTitle = "storyTitle_example"; // String | Title of the article
    String storyBody = "storyBody_example"; // String | Body of the article
    OffsetDateTime storyPublishedAt = new OffsetDateTime(); // OffsetDateTime | Publish date of the article. If you use a url or title and body of an article for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime). 
    String storyLanguage = "auto"; // String | This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    Integer perPage = 3; // Integer | This parameter is used for specifying number of items in each page. 
    try {
      Coverages result = apiInstance.listCoverages()
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .linksPermalink(linksPermalink)
            .notLinksPermalink(notLinksPermalink)
            .language(language)
            .notLanguage(notLanguage)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .clusters(clusters)
            ._return(_return)
            .storyId(storyId)
            .storyUrl(storyUrl)
            .storyTitle(storyTitle)
            .storyBody(storyBody)
            .storyPublishedAt(storyPublishedAt)
            .storyLanguage(storyLanguage)
            .perPage(perPage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listCoverages");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **linksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on their url.  | [optional]
 **notLinksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on their url.  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]
 **clusters** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering).  | [optional]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **storyPublishedAt** | **OffsetDateTime**| Publish date of the article. If you use a url or title and body of an article for getting coverages, this parameter is required. The format used is a restricted form of the canonical representation of dateTime in the [XML Schema specification (ISO 8601)](https://www.w3.org/TR/xmlschema-2/#dateTime).  | [optional]
 **storyLanguage** | **String**| This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page.  | [optional] [default to 3]

### Return type

[**Coverages**](Coverages.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of coverages |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listHistograms"></a>
# **listHistograms**
> Histograms listHistograms().id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).linksPermalink(linksPermalink).notLinksPermalink(notLinksPermalink).language(language).notLanguage(notLanguage).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).intervalStart(intervalStart).intervalEnd(intervalEnd).intervalWidth(intervalWidth).field(field).execute();

List histograms

For the numerical metadata that the News API gathers (such as word counts or social shares for example), you can use the histograms endpoint to access and display this information. As this endpoint does not return actual stories, the results you are given will not count towards your story allowance provided by your subscription, so you can effectively query this endpoint free of charge. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> linksPermalink = Arrays.asList(); // List<String> | This parameter is used to find stories based on their url. 
    List<String> notLinksPermalink = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on their url. 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    Integer intervalStart = 56; // Integer | This parameter is used for setting the start data point of histogram intervals. 
    Integer intervalEnd = 56; // Integer | This parameter is used for setting the end data point of histogram intervals. 
    Integer intervalWidth = 56; // Integer | This parameter is used for setting the width of histogram intervals. 
    String field = "social_shares_count"; // String | This parameter is used for specifying the y-axis variable for the histogram. 
    try {
      Histograms result = apiInstance.listHistograms()
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .linksPermalink(linksPermalink)
            .notLinksPermalink(notLinksPermalink)
            .language(language)
            .notLanguage(notLanguage)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .intervalStart(intervalStart)
            .intervalEnd(intervalEnd)
            .intervalWidth(intervalWidth)
            .field(field)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listHistograms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **linksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on their url.  | [optional]
 **notLinksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on their url.  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]
 **intervalStart** | **Integer**| This parameter is used for setting the start data point of histogram intervals.  | [optional]
 **intervalEnd** | **Integer**| This parameter is used for setting the end data point of histogram intervals.  | [optional]
 **intervalWidth** | **Integer**| This parameter is used for setting the width of histogram intervals.  | [optional]
 **field** | **String**| This parameter is used for specifying the y-axis variable for the histogram.  | [optional] [default to social_shares_count] [enum: social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.reddit, social_shares_count.google_plus, characters_count, words_count, sentences_count, paragraphs_count, media.images.count, media.videos.count, source.links_in_count, source.rankings.alexa.rank, source.rankings.alexa.rank.AF, source.rankings.alexa.rank.AX, source.rankings.alexa.rank.AL, source.rankings.alexa.rank.DZ, source.rankings.alexa.rank.AS, source.rankings.alexa.rank.AD, source.rankings.alexa.rank.AO, source.rankings.alexa.rank.AI, source.rankings.alexa.rank.AQ, source.rankings.alexa.rank.AG, source.rankings.alexa.rank.AR, source.rankings.alexa.rank.AM, source.rankings.alexa.rank.AW, source.rankings.alexa.rank.AU, source.rankings.alexa.rank.AT, source.rankings.alexa.rank.AZ, source.rankings.alexa.rank.BS, source.rankings.alexa.rank.BH, source.rankings.alexa.rank.BD, source.rankings.alexa.rank.BB, source.rankings.alexa.rank.BY, source.rankings.alexa.rank.BE, source.rankings.alexa.rank.BZ, source.rankings.alexa.rank.BJ, source.rankings.alexa.rank.BM, source.rankings.alexa.rank.BT, source.rankings.alexa.rank.BO, source.rankings.alexa.rank.BQ, source.rankings.alexa.rank.BA, source.rankings.alexa.rank.BW, source.rankings.alexa.rank.BV, source.rankings.alexa.rank.BR, source.rankings.alexa.rank.IO, source.rankings.alexa.rank.BN, source.rankings.alexa.rank.BG, source.rankings.alexa.rank.BF, source.rankings.alexa.rank.BI, source.rankings.alexa.rank.KH, source.rankings.alexa.rank.CM, source.rankings.alexa.rank.CA, source.rankings.alexa.rank.CV, source.rankings.alexa.rank.KY, source.rankings.alexa.rank.CF, source.rankings.alexa.rank.TD, source.rankings.alexa.rank.CL, source.rankings.alexa.rank.CN, source.rankings.alexa.rank.CX, source.rankings.alexa.rank.CC, source.rankings.alexa.rank.CO, source.rankings.alexa.rank.KM, source.rankings.alexa.rank.CG, source.rankings.alexa.rank.CD, source.rankings.alexa.rank.CK, source.rankings.alexa.rank.CR, source.rankings.alexa.rank.CI, source.rankings.alexa.rank.HR, source.rankings.alexa.rank.CU, source.rankings.alexa.rank.CW, source.rankings.alexa.rank.CY, source.rankings.alexa.rank.CZ, source.rankings.alexa.rank.DK, source.rankings.alexa.rank.DJ, source.rankings.alexa.rank.DM, source.rankings.alexa.rank.DO, source.rankings.alexa.rank.EC, source.rankings.alexa.rank.EG, source.rankings.alexa.rank.SV, source.rankings.alexa.rank.GQ, source.rankings.alexa.rank.ER, source.rankings.alexa.rank.EE, source.rankings.alexa.rank.ET, source.rankings.alexa.rank.FK, source.rankings.alexa.rank.FO, source.rankings.alexa.rank.FJ, source.rankings.alexa.rank.FI, source.rankings.alexa.rank.FR, source.rankings.alexa.rank.GF, source.rankings.alexa.rank.PF, source.rankings.alexa.rank.TF, source.rankings.alexa.rank.GA, source.rankings.alexa.rank.GM, source.rankings.alexa.rank.GE, source.rankings.alexa.rank.DE, source.rankings.alexa.rank.GH, source.rankings.alexa.rank.GI, source.rankings.alexa.rank.GR, source.rankings.alexa.rank.GL, source.rankings.alexa.rank.GD, source.rankings.alexa.rank.GP, source.rankings.alexa.rank.GU, source.rankings.alexa.rank.GT, source.rankings.alexa.rank.GG, source.rankings.alexa.rank.GN, source.rankings.alexa.rank.GW, source.rankings.alexa.rank.GY, source.rankings.alexa.rank.HT, source.rankings.alexa.rank.HM, source.rankings.alexa.rank.VA, source.rankings.alexa.rank.HN, source.rankings.alexa.rank.HK, source.rankings.alexa.rank.HU, source.rankings.alexa.rank.IS, source.rankings.alexa.rank.IN, source.rankings.alexa.rank.ID, source.rankings.alexa.rank.IR, source.rankings.alexa.rank.IQ, source.rankings.alexa.rank.IE, source.rankings.alexa.rank.IM, source.rankings.alexa.rank.IL, source.rankings.alexa.rank.IT, source.rankings.alexa.rank.JM, source.rankings.alexa.rank.JP, source.rankings.alexa.rank.JE, source.rankings.alexa.rank.JO, source.rankings.alexa.rank.KZ, source.rankings.alexa.rank.KE, source.rankings.alexa.rank.KI, source.rankings.alexa.rank.KP, source.rankings.alexa.rank.KR, source.rankings.alexa.rank.KW, source.rankings.alexa.rank.KG, source.rankings.alexa.rank.LA, source.rankings.alexa.rank.LV, source.rankings.alexa.rank.LB, source.rankings.alexa.rank.LS, source.rankings.alexa.rank.LR, source.rankings.alexa.rank.LY, source.rankings.alexa.rank.LI, source.rankings.alexa.rank.LT, source.rankings.alexa.rank.LU, source.rankings.alexa.rank.MO, source.rankings.alexa.rank.MK, source.rankings.alexa.rank.MG, source.rankings.alexa.rank.MW, source.rankings.alexa.rank.MY, source.rankings.alexa.rank.MV, source.rankings.alexa.rank.ML, source.rankings.alexa.rank.MT, source.rankings.alexa.rank.MH, source.rankings.alexa.rank.MQ, source.rankings.alexa.rank.MR, source.rankings.alexa.rank.MU, source.rankings.alexa.rank.YT, source.rankings.alexa.rank.MX, source.rankings.alexa.rank.FM, source.rankings.alexa.rank.MD, source.rankings.alexa.rank.MC, source.rankings.alexa.rank.MN, source.rankings.alexa.rank.ME, source.rankings.alexa.rank.MS, source.rankings.alexa.rank.MA, source.rankings.alexa.rank.MZ, source.rankings.alexa.rank.MM, source.rankings.alexa.rank.NA, source.rankings.alexa.rank.NR, source.rankings.alexa.rank.NP, source.rankings.alexa.rank.NL, source.rankings.alexa.rank.NC, source.rankings.alexa.rank.NZ, source.rankings.alexa.rank.NI, source.rankings.alexa.rank.NE, source.rankings.alexa.rank.NG, source.rankings.alexa.rank.NU, source.rankings.alexa.rank.NF, source.rankings.alexa.rank.MP, source.rankings.alexa.rank.NO, source.rankings.alexa.rank.OM, source.rankings.alexa.rank.PK, source.rankings.alexa.rank.PW, source.rankings.alexa.rank.PS, source.rankings.alexa.rank.PA, source.rankings.alexa.rank.PG, source.rankings.alexa.rank.PY, source.rankings.alexa.rank.PE, source.rankings.alexa.rank.PH, source.rankings.alexa.rank.PN, source.rankings.alexa.rank.PL, source.rankings.alexa.rank.PT, source.rankings.alexa.rank.PR, source.rankings.alexa.rank.QA, source.rankings.alexa.rank.RE, source.rankings.alexa.rank.RO, source.rankings.alexa.rank.RU, source.rankings.alexa.rank.RW, source.rankings.alexa.rank.BL, source.rankings.alexa.rank.SH, source.rankings.alexa.rank.KN, source.rankings.alexa.rank.LC, source.rankings.alexa.rank.MF, source.rankings.alexa.rank.PM, source.rankings.alexa.rank.VC, source.rankings.alexa.rank.WS, source.rankings.alexa.rank.SM, source.rankings.alexa.rank.ST, source.rankings.alexa.rank.SA, source.rankings.alexa.rank.SN, source.rankings.alexa.rank.RS, source.rankings.alexa.rank.SC, source.rankings.alexa.rank.SL, source.rankings.alexa.rank.SG, source.rankings.alexa.rank.SX, source.rankings.alexa.rank.SK, source.rankings.alexa.rank.SI, source.rankings.alexa.rank.SB, source.rankings.alexa.rank.SO, source.rankings.alexa.rank.ZA, source.rankings.alexa.rank.GS, source.rankings.alexa.rank.SS, source.rankings.alexa.rank.ES, source.rankings.alexa.rank.LK, source.rankings.alexa.rank.SD, source.rankings.alexa.rank.SR, source.rankings.alexa.rank.SJ, source.rankings.alexa.rank.SZ, source.rankings.alexa.rank.SE, source.rankings.alexa.rank.CH, source.rankings.alexa.rank.SY, source.rankings.alexa.rank.TW, source.rankings.alexa.rank.TJ, source.rankings.alexa.rank.TZ, source.rankings.alexa.rank.TH, source.rankings.alexa.rank.TL, source.rankings.alexa.rank.TG, source.rankings.alexa.rank.TK, source.rankings.alexa.rank.TO, source.rankings.alexa.rank.TT, source.rankings.alexa.rank.TN, source.rankings.alexa.rank.TR, source.rankings.alexa.rank.TM, source.rankings.alexa.rank.TC, source.rankings.alexa.rank.TV, source.rankings.alexa.rank.UG, source.rankings.alexa.rank.UA, source.rankings.alexa.rank.AE, source.rankings.alexa.rank.GB, source.rankings.alexa.rank.US, source.rankings.alexa.rank.UM, source.rankings.alexa.rank.UY, source.rankings.alexa.rank.UZ, source.rankings.alexa.rank.VU, source.rankings.alexa.rank.VE, source.rankings.alexa.rank.VN, source.rankings.alexa.rank.VG, source.rankings.alexa.rank.VI, source.rankings.alexa.rank.WF, source.rankings.alexa.rank.EH, source.rankings.alexa.rank.YE, source.rankings.alexa.rank.ZM, source.rankings.alexa.rank.ZW]

### Return type

[**Histograms**](Histograms.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of the histogram intervals |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listRelatedStories"></a>
# **listRelatedStories**
> RelatedStories listRelatedStories().id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).linksPermalink(linksPermalink).notLinksPermalink(notLinksPermalink).language(language).notLanguage(notLanguage).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).clusters(clusters)._return(_return).storyId(storyId).storyUrl(storyUrl).storyTitle(storyTitle).storyBody(storyBody).boostBy(boostBy).storyLanguage(storyLanguage).perPage(perPage).execute();

List related stories

This endpoint is used for finding semantically similar stories based on the parameters you provide as inputs. For example, if you want to find stories similar to a Tweet or any text extract you input, the related stories endpoint will analyze the entities present and the meaning of the text, and find stories with a similar meaning. The maximum number of related stories returned is 100. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> linksPermalink = Arrays.asList(); // List<String> | This parameter is used to find stories based on their url. 
    List<String> notLinksPermalink = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on their url. 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    List<String> clusters = Arrays.asList(); // List<String> | This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). 
    List<String> _return = Arrays.asList(); // List<String> | This parameter is used for specifying return fields.
    Long storyId = 56L; // Long | A story id
    String storyUrl = "storyUrl_example"; // String | An article or webpage
    String storyTitle = "storyTitle_example"; // String | Title of the article
    String storyBody = "storyBody_example"; // String | Body of the article
    String boostBy = "boostBy_example"; // String | This parameter is used for boosting the result by the specified value. 
    String storyLanguage = "auto"; // String | This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    Integer perPage = 3; // Integer | This parameter is used for specifying number of items in each page. 
    try {
      RelatedStories result = apiInstance.listRelatedStories()
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .linksPermalink(linksPermalink)
            .notLinksPermalink(notLinksPermalink)
            .language(language)
            .notLanguage(notLanguage)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .clusters(clusters)
            ._return(_return)
            .storyId(storyId)
            .storyUrl(storyUrl)
            .storyTitle(storyTitle)
            .storyBody(storyBody)
            .boostBy(boostBy)
            .storyLanguage(storyLanguage)
            .perPage(perPage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listRelatedStories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **linksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on their url.  | [optional]
 **notLinksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on their url.  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]
 **clusters** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering).  | [optional]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **storyId** | **Long**| A story id | [optional]
 **storyUrl** | **String**| An article or webpage | [optional]
 **storyTitle** | **String**| Title of the article | [optional]
 **storyBody** | **String**| Body of the article | [optional]
 **boostBy** | **String**| This parameter is used for boosting the result by the specified value.  | [optional] [enum: recency, popularity]
 **storyLanguage** | **String**| This parameter is used for setting the language of the story. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [default to auto] [enum: auto, en, de, fr, it, es, pt]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page.  | [optional] [default to 3]

### Return type

[**RelatedStories**](RelatedStories.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of related stories |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listStories"></a>
# **listStories**
> Stories listStories().id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).language(language).notLanguage(notLanguage).linksPermalink(linksPermalink).notLinksPermalink(notLinksPermalink).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).clusters(clusters)._return(_return).sortBy(sortBy).sortDirection(sortDirection).cursor(cursor).perPage(perPage).execute();

List Stories

The stories endpoint is used to return stories based on parameters you set in your query. The News API crawler gathers articles in near real-time and stores information about them, or metadata. Below you can see all of the query parameters, which you can use to narrow down your query. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> linksPermalink = Arrays.asList(); // List<String> | This parameter is used to find stories based on their url. 
    List<String> notLinksPermalink = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on their url. 
    String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    List<String> clusters = Arrays.asList(); // List<String> | This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering). 
    List<String> _return = Arrays.asList(); // List<String> | This parameter is used for specifying return fields.
    String sortBy = "published_at"; // String | This parameter is used for changing the order column of the results. You can read about sorting results [here](https://newsapi.aylien.com/docs/sorting-results). 
    String sortDirection = "desc"; // String | This parameter is used for changing the order direction of the result. You can read about sorting results [here](https://newsapi.aylien.com/docs/sorting-results). 
    String cursor = "\"*\""; // String | This parameter is used for finding a specific page. You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results). 
    Integer perPage = 10; // Integer | This parameter is used for specifying number of items in each page You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results) 
    try {
      Stories result = apiInstance.listStories()
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .language(language)
            .notLanguage(notLanguage)
            .linksPermalink(linksPermalink)
            .notLinksPermalink(notLinksPermalink)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .clusters(clusters)
            ._return(_return)
            .sortBy(sortBy)
            .sortDirection(sortDirection)
            .cursor(cursor)
            .perPage(perPage)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listStories");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **linksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on their url.  | [optional]
 **notLinksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on their url.  | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]
 **clusters** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories with belonging to one of clusters in a specific set of clusters You can read more about working with clustering [here](https://newsapi.aylien.com/docs/working-with-clustering).  | [optional]
 **_return** | [**List&lt;String&gt;**](String.md)| This parameter is used for specifying return fields. | [optional] [enum: id, title, body, summary, source, author, entities, keywords, hashtags, characters_count, words_count, sentences_count, paragraphs_count, categories, social_shares_count, media, sentiment, language, published_at, links]
 **sortBy** | **String**| This parameter is used for changing the order column of the results. You can read about sorting results [here](https://newsapi.aylien.com/docs/sorting-results).  | [optional] [default to published_at] [enum: relevance, recency, hotness, published_at, social_shares_count, social_shares_count.facebook, social_shares_count.linkedin, social_shares_count.google_plus, social_shares_count.reddit, media.images.count, media.videos.count, source.links_in_count, source.rankings.alexa.rank, source.rankings.alexa.rank.AF, source.rankings.alexa.rank.AX, source.rankings.alexa.rank.AL, source.rankings.alexa.rank.DZ, source.rankings.alexa.rank.AS, source.rankings.alexa.rank.AD, source.rankings.alexa.rank.AO, source.rankings.alexa.rank.AI, source.rankings.alexa.rank.AQ, source.rankings.alexa.rank.AG, source.rankings.alexa.rank.AR, source.rankings.alexa.rank.AM, source.rankings.alexa.rank.AW, source.rankings.alexa.rank.AU, source.rankings.alexa.rank.AT, source.rankings.alexa.rank.AZ, source.rankings.alexa.rank.BS, source.rankings.alexa.rank.BH, source.rankings.alexa.rank.BD, source.rankings.alexa.rank.BB, source.rankings.alexa.rank.BY, source.rankings.alexa.rank.BE, source.rankings.alexa.rank.BZ, source.rankings.alexa.rank.BJ, source.rankings.alexa.rank.BM, source.rankings.alexa.rank.BT, source.rankings.alexa.rank.BO, source.rankings.alexa.rank.BQ, source.rankings.alexa.rank.BA, source.rankings.alexa.rank.BW, source.rankings.alexa.rank.BV, source.rankings.alexa.rank.BR, source.rankings.alexa.rank.IO, source.rankings.alexa.rank.BN, source.rankings.alexa.rank.BG, source.rankings.alexa.rank.BF, source.rankings.alexa.rank.BI, source.rankings.alexa.rank.KH, source.rankings.alexa.rank.CM, source.rankings.alexa.rank.CA, source.rankings.alexa.rank.CV, source.rankings.alexa.rank.KY, source.rankings.alexa.rank.CF, source.rankings.alexa.rank.TD, source.rankings.alexa.rank.CL, source.rankings.alexa.rank.CN, source.rankings.alexa.rank.CX, source.rankings.alexa.rank.CC, source.rankings.alexa.rank.CO, source.rankings.alexa.rank.KM, source.rankings.alexa.rank.CG, source.rankings.alexa.rank.CD, source.rankings.alexa.rank.CK, source.rankings.alexa.rank.CR, source.rankings.alexa.rank.CI, source.rankings.alexa.rank.HR, source.rankings.alexa.rank.CU, source.rankings.alexa.rank.CW, source.rankings.alexa.rank.CY, source.rankings.alexa.rank.CZ, source.rankings.alexa.rank.DK, source.rankings.alexa.rank.DJ, source.rankings.alexa.rank.DM, source.rankings.alexa.rank.DO, source.rankings.alexa.rank.EC, source.rankings.alexa.rank.EG, source.rankings.alexa.rank.SV, source.rankings.alexa.rank.GQ, source.rankings.alexa.rank.ER, source.rankings.alexa.rank.EE, source.rankings.alexa.rank.ET, source.rankings.alexa.rank.FK, source.rankings.alexa.rank.FO, source.rankings.alexa.rank.FJ, source.rankings.alexa.rank.FI, source.rankings.alexa.rank.FR, source.rankings.alexa.rank.GF, source.rankings.alexa.rank.PF, source.rankings.alexa.rank.TF, source.rankings.alexa.rank.GA, source.rankings.alexa.rank.GM, source.rankings.alexa.rank.GE, source.rankings.alexa.rank.DE, source.rankings.alexa.rank.GH, source.rankings.alexa.rank.GI, source.rankings.alexa.rank.GR, source.rankings.alexa.rank.GL, source.rankings.alexa.rank.GD, source.rankings.alexa.rank.GP, source.rankings.alexa.rank.GU, source.rankings.alexa.rank.GT, source.rankings.alexa.rank.GG, source.rankings.alexa.rank.GN, source.rankings.alexa.rank.GW, source.rankings.alexa.rank.GY, source.rankings.alexa.rank.HT, source.rankings.alexa.rank.HM, source.rankings.alexa.rank.VA, source.rankings.alexa.rank.HN, source.rankings.alexa.rank.HK, source.rankings.alexa.rank.HU, source.rankings.alexa.rank.IS, source.rankings.alexa.rank.IN, source.rankings.alexa.rank.ID, source.rankings.alexa.rank.IR, source.rankings.alexa.rank.IQ, source.rankings.alexa.rank.IE, source.rankings.alexa.rank.IM, source.rankings.alexa.rank.IL, source.rankings.alexa.rank.IT, source.rankings.alexa.rank.JM, source.rankings.alexa.rank.JP, source.rankings.alexa.rank.JE, source.rankings.alexa.rank.JO, source.rankings.alexa.rank.KZ, source.rankings.alexa.rank.KE, source.rankings.alexa.rank.KI, source.rankings.alexa.rank.KP, source.rankings.alexa.rank.KR, source.rankings.alexa.rank.KW, source.rankings.alexa.rank.KG, source.rankings.alexa.rank.LA, source.rankings.alexa.rank.LV, source.rankings.alexa.rank.LB, source.rankings.alexa.rank.LS, source.rankings.alexa.rank.LR, source.rankings.alexa.rank.LY, source.rankings.alexa.rank.LI, source.rankings.alexa.rank.LT, source.rankings.alexa.rank.LU, source.rankings.alexa.rank.MO, source.rankings.alexa.rank.MK, source.rankings.alexa.rank.MG, source.rankings.alexa.rank.MW, source.rankings.alexa.rank.MY, source.rankings.alexa.rank.MV, source.rankings.alexa.rank.ML, source.rankings.alexa.rank.MT, source.rankings.alexa.rank.MH, source.rankings.alexa.rank.MQ, source.rankings.alexa.rank.MR, source.rankings.alexa.rank.MU, source.rankings.alexa.rank.YT, source.rankings.alexa.rank.MX, source.rankings.alexa.rank.FM, source.rankings.alexa.rank.MD, source.rankings.alexa.rank.MC, source.rankings.alexa.rank.MN, source.rankings.alexa.rank.ME, source.rankings.alexa.rank.MS, source.rankings.alexa.rank.MA, source.rankings.alexa.rank.MZ, source.rankings.alexa.rank.MM, source.rankings.alexa.rank.NA, source.rankings.alexa.rank.NR, source.rankings.alexa.rank.NP, source.rankings.alexa.rank.NL, source.rankings.alexa.rank.NC, source.rankings.alexa.rank.NZ, source.rankings.alexa.rank.NI, source.rankings.alexa.rank.NE, source.rankings.alexa.rank.NG, source.rankings.alexa.rank.NU, source.rankings.alexa.rank.NF, source.rankings.alexa.rank.MP, source.rankings.alexa.rank.NO, source.rankings.alexa.rank.OM, source.rankings.alexa.rank.PK, source.rankings.alexa.rank.PW, source.rankings.alexa.rank.PS, source.rankings.alexa.rank.PA, source.rankings.alexa.rank.PG, source.rankings.alexa.rank.PY, source.rankings.alexa.rank.PE, source.rankings.alexa.rank.PH, source.rankings.alexa.rank.PN, source.rankings.alexa.rank.PL, source.rankings.alexa.rank.PT, source.rankings.alexa.rank.PR, source.rankings.alexa.rank.QA, source.rankings.alexa.rank.RE, source.rankings.alexa.rank.RO, source.rankings.alexa.rank.RU, source.rankings.alexa.rank.RW, source.rankings.alexa.rank.BL, source.rankings.alexa.rank.SH, source.rankings.alexa.rank.KN, source.rankings.alexa.rank.LC, source.rankings.alexa.rank.MF, source.rankings.alexa.rank.PM, source.rankings.alexa.rank.VC, source.rankings.alexa.rank.WS, source.rankings.alexa.rank.SM, source.rankings.alexa.rank.ST, source.rankings.alexa.rank.SA, source.rankings.alexa.rank.SN, source.rankings.alexa.rank.RS, source.rankings.alexa.rank.SC, source.rankings.alexa.rank.SL, source.rankings.alexa.rank.SG, source.rankings.alexa.rank.SX, source.rankings.alexa.rank.SK, source.rankings.alexa.rank.SI, source.rankings.alexa.rank.SB, source.rankings.alexa.rank.SO, source.rankings.alexa.rank.ZA, source.rankings.alexa.rank.GS, source.rankings.alexa.rank.SS, source.rankings.alexa.rank.ES, source.rankings.alexa.rank.LK, source.rankings.alexa.rank.SD, source.rankings.alexa.rank.SR, source.rankings.alexa.rank.SJ, source.rankings.alexa.rank.SZ, source.rankings.alexa.rank.SE, source.rankings.alexa.rank.CH, source.rankings.alexa.rank.SY, source.rankings.alexa.rank.TW, source.rankings.alexa.rank.TJ, source.rankings.alexa.rank.TZ, source.rankings.alexa.rank.TH, source.rankings.alexa.rank.TL, source.rankings.alexa.rank.TG, source.rankings.alexa.rank.TK, source.rankings.alexa.rank.TO, source.rankings.alexa.rank.TT, source.rankings.alexa.rank.TN, source.rankings.alexa.rank.TR, source.rankings.alexa.rank.TM, source.rankings.alexa.rank.TC, source.rankings.alexa.rank.TV, source.rankings.alexa.rank.UG, source.rankings.alexa.rank.UA, source.rankings.alexa.rank.AE, source.rankings.alexa.rank.GB, source.rankings.alexa.rank.US, source.rankings.alexa.rank.UM, source.rankings.alexa.rank.UY, source.rankings.alexa.rank.UZ, source.rankings.alexa.rank.VU, source.rankings.alexa.rank.VE, source.rankings.alexa.rank.VN, source.rankings.alexa.rank.VG, source.rankings.alexa.rank.VI, source.rankings.alexa.rank.WF, source.rankings.alexa.rank.EH, source.rankings.alexa.rank.YE, source.rankings.alexa.rank.ZM, source.rankings.alexa.rank.ZW]
 **sortDirection** | **String**| This parameter is used for changing the order direction of the result. You can read about sorting results [here](https://newsapi.aylien.com/docs/sorting-results).  | [optional] [default to desc] [enum: asc, desc]
 **cursor** | **String**| This parameter is used for finding a specific page. You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results).  | [optional] [default to &quot;*&quot;]
 **perPage** | **Integer**| This parameter is used for specifying number of items in each page You can read more about pagination of results [here](https://newsapi.aylien.com/docs/pagination-of-results)  | [optional] [default to 10]

### Return type

[**Stories**](Stories.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of stories |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listTimeSeries"></a>
# **listTimeSeries**
> TimeSeriesList listTimeSeries().id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).language(language).notLanguage(notLanguage).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).period(period).execute();

List time series

The time series endpoint allows you to track information contained in stories over time. This information can be anything from mentions of a topic or entities, sentiment about a topic, or the volume of stories published by a source, to name but a few. The full list of parameters is given below. Using the [Date Math Syntax](https://newsapi.aylien.com/docs/working-with-dates), you can easily set your query to return information from any time period, from the current point in time to when the News API started collecting stories. The returned information can be rounded to a time also specified by you, for example by setting the results into hourly, daily, or weekly data points. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    String publishedAtStart = "\"NOW-7DAYS/DAY\""; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "\"NOW/DAY\""; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String period = "\"+1DAY\""; // String | The size of each date range is expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are `+` following an integer number greater than 0 and one of the Date Math keywords. e.g. `+1DAY`, `+2MINUTES` and `+1MONTH`. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math). 
    try {
      TimeSeriesList result = apiInstance.listTimeSeries()
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .language(language)
            .notLanguage(notLanguage)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .period(period)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTimeSeries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional] [default to &quot;NOW-7DAYS/DAY&quot;]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional] [default to &quot;NOW/DAY&quot;]
 **period** | **String**| The size of each date range is expressed as an interval to be added to the lower bound. It supports Date Math Syntax. Valid options are &#x60;+&#x60; following an integer number greater than 0 and one of the Date Math keywords. e.g. &#x60;+1DAY&#x60;, &#x60;+2MINUTES&#x60; and &#x60;+1MONTH&#x60;. Here are [Supported keywords](https://newsapi.aylien.com/docs/working-with-dates#date-math).  | [optional] [default to &quot;+1DAY&quot;]

### Return type

[**TimeSeriesList**](TimeSeriesList.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of time series |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

<a name="listTrends"></a>
# **listTrends**
> Trends listTrends(field).id(id).notId(notId).title(title).body(body).text(text).translationsEnTitle(translationsEnTitle).translationsEnBody(translationsEnBody).translationsEnText(translationsEnText).linksPermalink(linksPermalink).notLinksPermalink(notLinksPermalink).language(language).notLanguage(notLanguage).publishedAtStart(publishedAtStart).publishedAtEnd(publishedAtEnd).categoriesTaxonomy(categoriesTaxonomy).categoriesConfident(categoriesConfident).categoriesId(categoriesId).notCategoriesId(notCategoriesId).categoriesLevel(categoriesLevel).notCategoriesLevel(notCategoriesLevel).entitiesTitleText(entitiesTitleText).notEntitiesTitleText(notEntitiesTitleText).entitiesTitleType(entitiesTitleType).notEntitiesTitleType(notEntitiesTitleType).entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia).notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia).entitiesBodyText(entitiesBodyText).notEntitiesBodyText(notEntitiesBodyText).entitiesBodyType(entitiesBodyType).notEntitiesBodyType(notEntitiesBodyType).entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia).notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia).sentimentTitlePolarity(sentimentTitlePolarity).notSentimentTitlePolarity(notSentimentTitlePolarity).sentimentBodyPolarity(sentimentBodyPolarity).notSentimentBodyPolarity(notSentimentBodyPolarity).mediaImagesCountMin(mediaImagesCountMin).mediaImagesCountMax(mediaImagesCountMax).mediaImagesWidthMin(mediaImagesWidthMin).mediaImagesWidthMax(mediaImagesWidthMax).mediaImagesHeightMin(mediaImagesHeightMin).mediaImagesHeightMax(mediaImagesHeightMax).mediaImagesContentLengthMin(mediaImagesContentLengthMin).mediaImagesContentLengthMax(mediaImagesContentLengthMax).mediaImagesFormat(mediaImagesFormat).notMediaImagesFormat(notMediaImagesFormat).mediaVideosCountMin(mediaVideosCountMin).mediaVideosCountMax(mediaVideosCountMax).authorId(authorId).notAuthorId(notAuthorId).authorName(authorName).notAuthorName(notAuthorName).sourceId(sourceId).notSourceId(notSourceId).sourceName(sourceName).notSourceName(notSourceName).sourceDomain(sourceDomain).notSourceDomain(notSourceDomain).sourceLocationsCountry(sourceLocationsCountry).notSourceLocationsCountry(notSourceLocationsCountry).sourceLocationsState(sourceLocationsState).notSourceLocationsState(notSourceLocationsState).sourceLocationsCity(sourceLocationsCity).notSourceLocationsCity(notSourceLocationsCity).sourceScopesCountry(sourceScopesCountry).notSourceScopesCountry(notSourceScopesCountry).sourceScopesState(sourceScopesState).notSourceScopesState(notSourceScopesState).sourceScopesCity(sourceScopesCity).notSourceScopesCity(notSourceScopesCity).sourceScopesLevel(sourceScopesLevel).notSourceScopesLevel(notSourceScopesLevel).sourceLinksInCountMin(sourceLinksInCountMin).sourceLinksInCountMax(sourceLinksInCountMax).sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin).sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax).sourceRankingsAlexaCountry(sourceRankingsAlexaCountry).socialSharesCountFacebookMin(socialSharesCountFacebookMin).socialSharesCountFacebookMax(socialSharesCountFacebookMax).socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin).socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax).socialSharesCountLinkedinMin(socialSharesCountLinkedinMin).socialSharesCountLinkedinMax(socialSharesCountLinkedinMax).socialSharesCountRedditMin(socialSharesCountRedditMin).socialSharesCountRedditMax(socialSharesCountRedditMax).execute();

List trends

The trends endpoint allows you to identify the most-mentioned entities, concepts and keywords relevant to your query. For example, this endpoint allows you to set parameters like a time period, a subject category, or an entity, and your request will return the most mentioned entities or keywords that are mentioned in relation to your query. 

### Example
```java
// Import classes:
import com.aylien.newsapi.ApiClient;
import com.aylien.newsapi.ApiException;
import com.aylien.newsapi.Configuration;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.aylien.com/news");
    
    // Configure API key authorization: app_id
    ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
    app_id.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_id.setApiKeyPrefix("Token");

    // Configure API key authorization: app_key
    ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
    app_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //app_key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String field = keywords; // String | This parameter is used to specify the trend field. 
    List<Long> id = Arrays.asList(); // List<Long> | This parameter is used for finding stories by story id. 
    List<Long> notId = Arrays.asList(); // List<Long> | This parameter is used for excluding stories by story id. 
    String title = "title_example"; // String | This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String body = "body_example"; // String | This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String text = "text_example"; // String | This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnTitle = "translationsEnTitle_example"; // String | This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnBody = "translationsEnBody_example"; // String | This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    String translationsEnText = "translationsEnText_example"; // String | This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators). 
    List<String> linksPermalink = Arrays.asList(); // List<String> | This parameter is used to find stories based on their url. 
    List<String> notLinksPermalink = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on their url. 
    List<String> language = Arrays.asList(); // List<String> | This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    List<String> notLanguage = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes. 
    String publishedAtStart = "publishedAtStart_example"; // String | This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String publishedAtEnd = "publishedAtEnd_example"; // String | This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates). 
    String categoriesTaxonomy = "categoriesTaxonomy_example"; // String | This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    Boolean categoriesConfident = true; // Boolean | This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> categoriesId = Arrays.asList(); // List<String> | This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> notCategoriesId = Arrays.asList(); // List<String> | This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> categoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<Integer> notCategoriesLevel = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories). 
    List<String> entitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesTitleLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyText = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `text` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyType = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities `type` in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> entitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    List<String> notEntitiesBodyLinksDbpedia = Arrays.asList(); // List<String> | This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities). 
    String sentimentTitlePolarity = "sentimentTitlePolarity_example"; // String | This parameter is used for finding stories whose title sentiment is the specified value. 
    String notSentimentTitlePolarity = "notSentimentTitlePolarity_example"; // String | This parameter is used for excluding stories whose title sentiment is the specified value. 
    String sentimentBodyPolarity = "sentimentBodyPolarity_example"; // String | This parameter is used for finding stories whose body sentiment is the specified value. 
    String notSentimentBodyPolarity = "notSentimentBodyPolarity_example"; // String | This parameter is used for excluding stories whose body sentiment is the specified value. 
    Integer mediaImagesCountMin = 56; // Integer | This parameter is used for finding stories whose number of images is greater than or equal to the specified value. 
    Integer mediaImagesCountMax = 56; // Integer | This parameter is used for finding stories whose number of images is less than or equal to the specified value. 
    Integer mediaImagesWidthMin = 56; // Integer | This parameter is used for finding stories whose width of images are greater than or equal to the specified value. 
    Integer mediaImagesWidthMax = 56; // Integer | This parameter is used for finding stories whose width of images are less than or equal to the specified value. 
    Integer mediaImagesHeightMin = 56; // Integer | This parameter is used for finding stories whose height of images are greater than or equal to the specified value. 
    Integer mediaImagesHeightMax = 56; // Integer | This parameter is used for finding stories whose height of images are less than or equal to the specified value. 
    Integer mediaImagesContentLengthMin = 56; // Integer | This parameter is used for finding stories whose images content length are greater than or equal to the specified value. 
    Integer mediaImagesContentLengthMax = 56; // Integer | This parameter is used for finding stories whose images content length are less than or equal to the specified value. 
    List<String> mediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for finding stories whose images format are the specified value. 
    List<String> notMediaImagesFormat = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose images format are the specified value. 
    Integer mediaVideosCountMin = 56; // Integer | This parameter is used for finding stories whose number of videos is greater than or equal to the specified value. 
    Integer mediaVideosCountMax = 56; // Integer | This parameter is used for finding stories whose number of videos is less than or equal to the specified value. 
    List<Integer> authorId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose author id is the specified value. 
    List<Integer> notAuthorId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose author id is the specified value. 
    String authorName = "authorName_example"; // String | This parameter is used for finding stories whose author full name contains the specified value. 
    String notAuthorName = "notAuthorName_example"; // String | This parameter is used for excluding stories whose author full name contains the specified value. 
    List<Integer> sourceId = Arrays.asList(); // List<Integer> | This parameter is used for finding stories whose source id is the specified value. 
    List<Integer> notSourceId = Arrays.asList(); // List<Integer> | This parameter is used for excluding stories whose source id is the specified value. 
    List<String> sourceName = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source name contains the specified value. 
    List<String> notSourceName = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source name contains the specified value. 
    List<String> sourceDomain = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source domain is the specified value. 
    List<String> notSourceDomain = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source domain is the specified value. 
    List<String> sourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceLocationsCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCountry = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesState = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesState = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesCity = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> sourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    List<String> notSourceScopesLevel = Arrays.asList(); // List<String> | This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations). 
    Integer sourceLinksInCountMin = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceLinksInCountMax = 56; // Integer | This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count). 
    Integer sourceRankingsAlexaRankMin = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer sourceRankingsAlexaRankMax = 56; // Integer | This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    List<String> sourceRankingsAlexaCountry = Arrays.asList(); // List<String> | This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks). 
    Integer socialSharesCountFacebookMin = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountFacebookMax = 56; // Integer | This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMin = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountGooglePlusMax = 56; // Integer | This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value. 
    Integer socialSharesCountLinkedinMin = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountLinkedinMax = 56; // Integer | This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value. 
    Integer socialSharesCountRedditMin = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value. 
    Integer socialSharesCountRedditMax = 56; // Integer | This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value. 
    try {
      Trends result = apiInstance.listTrends(field)
            .id(id)
            .notId(notId)
            .title(title)
            .body(body)
            .text(text)
            .translationsEnTitle(translationsEnTitle)
            .translationsEnBody(translationsEnBody)
            .translationsEnText(translationsEnText)
            .linksPermalink(linksPermalink)
            .notLinksPermalink(notLinksPermalink)
            .language(language)
            .notLanguage(notLanguage)
            .publishedAtStart(publishedAtStart)
            .publishedAtEnd(publishedAtEnd)
            .categoriesTaxonomy(categoriesTaxonomy)
            .categoriesConfident(categoriesConfident)
            .categoriesId(categoriesId)
            .notCategoriesId(notCategoriesId)
            .categoriesLevel(categoriesLevel)
            .notCategoriesLevel(notCategoriesLevel)
            .entitiesTitleText(entitiesTitleText)
            .notEntitiesTitleText(notEntitiesTitleText)
            .entitiesTitleType(entitiesTitleType)
            .notEntitiesTitleType(notEntitiesTitleType)
            .entitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia)
            .notEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia)
            .entitiesBodyText(entitiesBodyText)
            .notEntitiesBodyText(notEntitiesBodyText)
            .entitiesBodyType(entitiesBodyType)
            .notEntitiesBodyType(notEntitiesBodyType)
            .entitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia)
            .notEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia)
            .sentimentTitlePolarity(sentimentTitlePolarity)
            .notSentimentTitlePolarity(notSentimentTitlePolarity)
            .sentimentBodyPolarity(sentimentBodyPolarity)
            .notSentimentBodyPolarity(notSentimentBodyPolarity)
            .mediaImagesCountMin(mediaImagesCountMin)
            .mediaImagesCountMax(mediaImagesCountMax)
            .mediaImagesWidthMin(mediaImagesWidthMin)
            .mediaImagesWidthMax(mediaImagesWidthMax)
            .mediaImagesHeightMin(mediaImagesHeightMin)
            .mediaImagesHeightMax(mediaImagesHeightMax)
            .mediaImagesContentLengthMin(mediaImagesContentLengthMin)
            .mediaImagesContentLengthMax(mediaImagesContentLengthMax)
            .mediaImagesFormat(mediaImagesFormat)
            .notMediaImagesFormat(notMediaImagesFormat)
            .mediaVideosCountMin(mediaVideosCountMin)
            .mediaVideosCountMax(mediaVideosCountMax)
            .authorId(authorId)
            .notAuthorId(notAuthorId)
            .authorName(authorName)
            .notAuthorName(notAuthorName)
            .sourceId(sourceId)
            .notSourceId(notSourceId)
            .sourceName(sourceName)
            .notSourceName(notSourceName)
            .sourceDomain(sourceDomain)
            .notSourceDomain(notSourceDomain)
            .sourceLocationsCountry(sourceLocationsCountry)
            .notSourceLocationsCountry(notSourceLocationsCountry)
            .sourceLocationsState(sourceLocationsState)
            .notSourceLocationsState(notSourceLocationsState)
            .sourceLocationsCity(sourceLocationsCity)
            .notSourceLocationsCity(notSourceLocationsCity)
            .sourceScopesCountry(sourceScopesCountry)
            .notSourceScopesCountry(notSourceScopesCountry)
            .sourceScopesState(sourceScopesState)
            .notSourceScopesState(notSourceScopesState)
            .sourceScopesCity(sourceScopesCity)
            .notSourceScopesCity(notSourceScopesCity)
            .sourceScopesLevel(sourceScopesLevel)
            .notSourceScopesLevel(notSourceScopesLevel)
            .sourceLinksInCountMin(sourceLinksInCountMin)
            .sourceLinksInCountMax(sourceLinksInCountMax)
            .sourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin)
            .sourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax)
            .sourceRankingsAlexaCountry(sourceRankingsAlexaCountry)
            .socialSharesCountFacebookMin(socialSharesCountFacebookMin)
            .socialSharesCountFacebookMax(socialSharesCountFacebookMax)
            .socialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin)
            .socialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax)
            .socialSharesCountLinkedinMin(socialSharesCountLinkedinMin)
            .socialSharesCountLinkedinMax(socialSharesCountLinkedinMax)
            .socialSharesCountRedditMin(socialSharesCountRedditMin)
            .socialSharesCountRedditMax(socialSharesCountRedditMax)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#listTrends");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **field** | **String**| This parameter is used to specify the trend field.  | [enum: author.name, source.name, source.domain, keywords, entities.title.text, entities.title.type, entities.title.links.dbpedia, entities.body.text, entities.body.type, entities.body.links.dbpedia, hashtags, categories.id, sentiment.title.polarity, sentiment.body.polarity, clusters]
 **id** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for finding stories by story id.  | [optional]
 **notId** | [**List&lt;Long&gt;**](Long.md)| This parameter is used for excluding stories by story id.  | [optional]
 **title** | **String**| This parameter is used for finding stories whose title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **body** | **String**| This parameter is used for finding stories whose body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **text** | **String**| This parameter is used for finding stories whose title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnTitle** | **String**| This parameter is used for finding stories whose translation title contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnBody** | **String**| This parameter is used for finding stories whose translation body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **translationsEnText** | **String**| This parameter is used for finding stories whose translation title or body contains a specific keyword. It supports [boolean operators](https://newsapi.aylien.com/docs/boolean-operators).  | [optional]
 **linksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on their url.  | [optional]
 **notLinksPermalink** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on their url.  | [optional]
 **language** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **notLanguage** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose language is the specified value. It supports [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language codes.  | [optional] [enum: en, de, fr, it, es, pt]
 **publishedAtStart** | **String**| This parameter is used for finding stories whose published at time is greater than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **publishedAtEnd** | **String**| This parameter is used for finding stories whose published at time is less than the specified value. [Here](https://newsapi.aylien.com/docs/working-with-dates) you can find more information about how [to work with dates](https://newsapi.aylien.com/docs/working-with-dates).  | [optional]
 **categoriesTaxonomy** | **String**| This parameter is used for defining the type of the taxonomy for the rest of the categories queries. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [enum: iab-qag, iptc-subjectcode]
 **categoriesConfident** | **Boolean**| This parameter is used for finding stories whose categories are confident. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional] [default to true]
 **categoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesId** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories by categories id. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **categoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **notCategoriesLevel** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories by categories level. You can read more about working with categories [here](https://newsapi.aylien.com/docs/working-with-categories).  | [optional]
 **entitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesTitleLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in story titles. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyText** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;text&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyType** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities &#x60;type&#x60; in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **entitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to find stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **notEntitiesBodyLinksDbpedia** | [**List&lt;String&gt;**](String.md)| This parameter is used to exclude stories based on the specified entities dbpedia URL in the body of stories. You can read more about working with entities [here](https://newsapi.aylien.com/docs/working-with-entities).  | [optional]
 **sentimentTitlePolarity** | **String**| This parameter is used for finding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentTitlePolarity** | **String**| This parameter is used for excluding stories whose title sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **sentimentBodyPolarity** | **String**| This parameter is used for finding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **notSentimentBodyPolarity** | **String**| This parameter is used for excluding stories whose body sentiment is the specified value.  | [optional] [enum: positive, neutral, negative]
 **mediaImagesCountMin** | **Integer**| This parameter is used for finding stories whose number of images is greater than or equal to the specified value.  | [optional]
 **mediaImagesCountMax** | **Integer**| This parameter is used for finding stories whose number of images is less than or equal to the specified value.  | [optional]
 **mediaImagesWidthMin** | **Integer**| This parameter is used for finding stories whose width of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesWidthMax** | **Integer**| This parameter is used for finding stories whose width of images are less than or equal to the specified value.  | [optional]
 **mediaImagesHeightMin** | **Integer**| This parameter is used for finding stories whose height of images are greater than or equal to the specified value.  | [optional]
 **mediaImagesHeightMax** | **Integer**| This parameter is used for finding stories whose height of images are less than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMin** | **Integer**| This parameter is used for finding stories whose images content length are greater than or equal to the specified value.  | [optional]
 **mediaImagesContentLengthMax** | **Integer**| This parameter is used for finding stories whose images content length are less than or equal to the specified value.  | [optional]
 **mediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **notMediaImagesFormat** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose images format are the specified value.  | [optional] [enum: BMP, GIF, JPEG, PNG, TIFF, PSD, ICO, CUR, WEBP, SVG]
 **mediaVideosCountMin** | **Integer**| This parameter is used for finding stories whose number of videos is greater than or equal to the specified value.  | [optional]
 **mediaVideosCountMax** | **Integer**| This parameter is used for finding stories whose number of videos is less than or equal to the specified value.  | [optional]
 **authorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose author id is the specified value.  | [optional]
 **notAuthorId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose author id is the specified value.  | [optional]
 **authorName** | **String**| This parameter is used for finding stories whose author full name contains the specified value.  | [optional]
 **notAuthorName** | **String**| This parameter is used for excluding stories whose author full name contains the specified value.  | [optional]
 **sourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for finding stories whose source id is the specified value.  | [optional]
 **notSourceId** | [**List&lt;Integer&gt;**](Integer.md)| This parameter is used for excluding stories whose source id is the specified value.  | [optional]
 **sourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source name contains the specified value.  | [optional]
 **notSourceName** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source name contains the specified value.  | [optional]
 **sourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source domain is the specified value.  | [optional]
 **notSourceDomain** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source domain is the specified value.  | [optional]
 **sourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source country is the specified value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source state/province is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceLocationsCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source city is the specified value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesState** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified state/province value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **notSourceScopesCity** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified city value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional]
 **sourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **notSourceScopesLevel** | [**List&lt;String&gt;**](String.md)| This parameter is used for excluding stories whose source scopes is the specified level value. [Here](https://newsapi.aylien.com/docs/working-with-locations) you can find more information about how [to work with locations](https://newsapi.aylien.com/docs/working-with-locations).  | [optional] [enum: international, national, local]
 **sourceLinksInCountMin** | **Integer**| This parameter is used for finding stories from sources whose Links in count is greater than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceLinksInCountMax** | **Integer**| This parameter is used for finding stories from sources whose Links in count is less than or equal to the specified value. You can read more about working with Links in count [here](https://newsapi.aylien.com/docs/working-with-links-in-count).  | [optional]
 **sourceRankingsAlexaRankMin** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is greater than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaRankMax** | **Integer**| This parameter is used for finding stories from sources whose Alexa rank is less than or equal to the specified value. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **sourceRankingsAlexaCountry** | [**List&lt;String&gt;**](String.md)| This parameter is used for finding stories from sources whose Alexa rank is in the specified country value. It supports [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country codes. You can read more about working with Alexa ranks [here](https://newsapi.aylien.com/docs/working-with-alexa-ranks).  | [optional]
 **socialSharesCountFacebookMin** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountFacebookMax** | **Integer**| This parameter is used for finding stories whose Facebook social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMin** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountGooglePlusMax** | **Integer**| This parameter is used for finding stories whose Google+ social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMin** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountLinkedinMax** | **Integer**| This parameter is used for finding stories whose LinkedIn social shares count is less than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMin** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is greater than or equal to the specified value.  | [optional]
 **socialSharesCountRedditMax** | **Integer**| This parameter is used for finding stories whose Reddit social shares count is less than or equal to the specified value.  | [optional]

### Return type

[**Trends**](Trends.md)

### Authorization

[app_id](../README.md#app_id), [app_key](../README.md#app_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An object including an array of trends |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**401** | Unauthorized |  -  |
**404** | Not Found |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  * X-RateLimit-Limit - The number of allowed requests in the current period. <br>  * X-RateLimit-Remaining - The number of remaining requests in the current period. <br>  * X-RateLimit-Reset - The remaining window before the rate limit resets in UTC [epoch seconds](https://en.wikipedia.org/wiki/Unix_time).  <br>  |
**500** | Internal Server Error |  -  |

