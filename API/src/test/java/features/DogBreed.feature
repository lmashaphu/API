Feature: Dog Breed API

  @smoke
  Scenario Outline: Perform an API Requests on Dog breeds api
    Given i perform an api request to produce a list of all dogs
    Then using code, verify retriever breed is within the list
    Then perform an api request to produce a list of sub-breeds for retriever
    Then perform an api request to produce a random image/link for sub-breed <sub-breed>

    Examples: 
      | sub-breed |
      | golden    |
