
# Story

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | ID of the story which is a unique identification |  [optional]
**title** | **String** | Title of the story |  [optional]
**body** | **String** | Body of the story |  [optional]
**summary** | [**Summary**](Summary.md) | The suggested story summary |  [optional]
**source** | [**Source**](Source.md) | The story source |  [optional]
**author** | [**Author**](Author.md) | The story author |  [optional]
**entities** | [**Entities**](Entities.md) | Extracted entities from the story title or body |  [optional]
**keywords** | **List&lt;String&gt;** | Extracted keywords mentioned in the story title or body |  [optional]
**hashtags** | **List&lt;String&gt;** | An array of suggested Story hashtags |  [optional]
**charactersCount** | **Integer** | Character count of the story body |  [optional]
**wordsCount** | **Integer** | Word count of the story body |  [optional]
**sentencesCount** | **Integer** | Sentence count of the story body |  [optional]
**paragraphsCount** | **Integer** | Paragraph count of the story body |  [optional]
**categories** | [**List&lt;Category&gt;**](Category.md) | Suggested categories for the story |  [optional]
**socialSharesCount** | [**ShareCounts**](ShareCounts.md) | Social shares count for the story |  [optional]
**media** | [**List&lt;Media&gt;**](Media.md) | An array of extracted media such as images and videos |  [optional]
**sentiment** | [**Sentiments**](Sentiments.md) | Suggested sentiments for the story title or body |  [optional]
**language** | **String** | Language of the story |  [optional]
**publishedAt** | [**DateTime**](DateTime.md) | Published date of the story |  [optional]
**links** | [**StoryLinks**](StoryLinks.md) | Links which is related to the story |  [optional]



