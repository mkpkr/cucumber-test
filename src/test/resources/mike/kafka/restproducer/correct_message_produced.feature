Feature: Correct message produced to Kafka
   The message that is POSTed to the application is written to Kafka
   
   Scenario: Correct message produced
      Given a message with topic abc
      And with key def
      And with data ghi
      When I post the message to /send
      Then the message should be published