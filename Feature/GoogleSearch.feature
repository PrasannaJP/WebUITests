Feature: Google Search

@Search
Scenario: Google Search
Given As user viewing Google Search page
Then Google Search Page should be displayed
When Enter google search string "Google"
Then Google Search Page should be displayed with Google as search parameter