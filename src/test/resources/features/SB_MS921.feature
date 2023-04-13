
Feature: Uploading an image

  Scenario: User should be able to upload an image successfully


  Given  I open the application
   And   I should see the Choose file button
   When  I choose my file and submit Upload
   Then  I should see Upload successful message
   And   I wait for 10 Seconds and close the window

  #acceptancecriteria: the uploading file must be in .png format#