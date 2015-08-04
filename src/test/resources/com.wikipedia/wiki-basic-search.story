Meta:



Scenario: basic search on wikipedia page
Given user is on wiki home page
When user enters "automation" in search box
And user clicks on search button
Then wiki search page is displayed
