# AYLIEN News API

AYLIEN News API is the most powerful way of sourcing, searching and syndicating analyzed and enriched news content. If you haven't already done so, you will need to [sign up](https://newsapi.aylien.com/signup).

Visit our [interactive documentation](https://newsapi.aylien.com/docs/interactive_doc) to familiarize yourself with the API.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aylien.newsapi</groupId>
    <artifactId>client</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aylien.newsapi:client:0.1.0"
```

### sbt users

Add this dependency to your `libraryDependencies`:

```groovy
"com.aylien.newsapi" % "client" % "0.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-0.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package com.aylien.newsapisample;

import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: app_id
        ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
        app_id.setApiKey("YOUR APP ID");

        // Configure API key authorization: app_key
        ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
        app_key.setApiKey("YOUR APP KEY");

        DefaultApi apiInstance = new DefaultApi();

        StoriesParams.Builder storiesBuilder = StoriesParams.newBuilder();

        String title = "trump";
        String sortBy = "social_shares_count.facebook";
        List<String> language = new ArrayList<String>() {{
            add("en");
        }};
        String since = "NOW-7DAYS";
        String until = "NOW";
        List<String> entities = new ArrayList<String>() {{
            add("http://dbpedia.org/resource/Donald_Trump");
            add("http://dbpedia.org/resource/Hillary_Rodham_Clinton");
        }};

        storiesBuilder.setTitle(title);
        storiesBuilder.setSortBy(sortBy);
        storiesBuilder.setLanguage(language);
        storiesBuilder.setPublishedAtStart(since);
        storiesBuilder.setPublishedAtEnd(until);
        storiesBuilder.setEntitiesBodyLinksDbpedia(entities);

        try {
            Stories result = apiInstance.listStories(storiesBuilder.build());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listStories");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.newsapi.aylien.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**listAutocompletes**](docs/DefaultApi.md#listAutocompletes) | **GET** /autocompletes | List autocompletes
*DefaultApi* | [**listCoverages**](docs/DefaultApi.md#listCoverages) | **POST** /coverages | List coverages
*DefaultApi* | [**listHistograms**](docs/DefaultApi.md#listHistograms) | **GET** /histograms | List histograms
*DefaultApi* | [**listRelatedStories**](docs/DefaultApi.md#listRelatedStories) | **POST** /related_stories | List related stories
*DefaultApi* | [**listStories**](docs/DefaultApi.md#listStories) | **GET** /stories | List Stories
*DefaultApi* | [**listTimeSeries**](docs/DefaultApi.md#listTimeSeries) | **GET** /time_series | List time series
*DefaultApi* | [**listTrends**](docs/DefaultApi.md#listTrends) | **GET** /trends | List trends


## Documentation for Models

 - [Author](docs/Author.md)
 - [Autocomplete](docs/Autocomplete.md)
 - [Autocompletes](docs/Autocompletes.md)
 - [Category](docs/Category.md)
 - [CategoryLinks](docs/CategoryLinks.md)
 - [Coverages](docs/Coverages.md)
 - [Entities](docs/Entities.md)
 - [Entity](docs/Entity.md)
 - [EntityLinks](docs/EntityLinks.md)
 - [Error](docs/Error.md)
 - [ErrorLinks](docs/ErrorLinks.md)
 - [Errors](docs/Errors.md)
 - [HistogramInterval](docs/HistogramInterval.md)
 - [Histograms](docs/Histograms.md)
 - [Location](docs/Location.md)
 - [Media](docs/Media.md)
 - [RelatedStories](docs/RelatedStories.md)
 - [Scope](docs/Scope.md)
 - [Sentiment](docs/Sentiment.md)
 - [Sentiments](docs/Sentiments.md)
 - [ShareCount](docs/ShareCount.md)
 - [ShareCounts](docs/ShareCounts.md)
 - [Source](docs/Source.md)
 - [Stories](docs/Stories.md)
 - [Story](docs/Story.md)
 - [StoryCluster](docs/StoryCluster.md)
 - [StoryLinks](docs/StoryLinks.md)
 - [Summary](docs/Summary.md)
 - [TimeSeries](docs/TimeSeries.md)
 - [TimeSeriesList](docs/TimeSeriesList.md)
 - [Trend](docs/Trend.md)
 - [Trends](docs/Trends.md)


## Documentation for Authorization

Authentication schemes defined for the API:

### app_id

- **Type**: API key
- **API key parameter name**: X-AYLIEN-NewsAPI-Application-ID
- **Location**: HTTP header

### app_key

- **Type**: API key
- **API key parameter name**: X-AYLIEN-NewsAPI-Application-Key
- **Location**: HTTP header



## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.
