Feature: Credit Card Management System

# 1. Credit Card Application

Scenario: Submit a valid credit card application
  Given a new user wants to apply for a credit card
  When the user provides valid personal information, income details and contact information
  And submits the credit card application
  Then the application should be submitted successfully

Scenario: Submit an application with missing or invalid data
  Given a new user wants to apply for a credit card 
  When the user provides incomplete or invalid personal information, income details or contact information
  And submits the credit card application
  Then an error message should be displayed prompting the user to correct the information

Scenario: Existing credit card holder applies for a new credit card  
  Given an existing credit card holder
  When the user submits a new credit card application
  Then the application should be rejected with an appropriate message

# 2. Waiving Off Charges

Scenario: Waive off an eligible fee
  Given a credit card holder has an eligible fee to be waived off
  When the bank reviews the customer's history
  And the customer requests to waive off the fee
  Then the fee should be waived off as a one-time courtesy
  And the customer's balance should be updated accordingly

Scenario: Waive off an ineligible fee  
  Given a credit card holder has an ineligible fee
  When the customer requests to waive off the fee
  And the bank reviews the request
  Then the request should be rejected with a justification

# 3. Redeeming Points  

Scenario: Successful points redemption
  Given a credit card holder has accumulated enough points
  When the customer requests to redeem points for a reward
  Then the redemption should be successful
  And the remaining points balance should be updated

Scenario: Insufficient points for redemption
  Given a credit card holder does not have enough points
  When the customer attempts to redeem points for a reward
  Then an error should be displayed
  And the redemption should be prevented

# 4. Credit Limit Extension

Scenario: Increase credit limit
  Given the bank evaluates a customer's creditworthiness, payment history and income stability
  When the bank decides to increase the credit limit
  Then the credit limit should be increased
  And the customer should be notified

# 5. Credit Limit Reduction

Scenario: Reduce credit limit
  Given changes in a customer's financial situation or risk profile
  When the bank decides to reduce the credit limit
  Then the credit limit should be reduced
  And the customer should be notified

Scenario: Attempt to reduce limit below existing balance
  Given a customer's existing balance is higher than the proposed new limit
  When the bank attempts to reduce the credit limit below the existing balance
  Then the limit reduction should be rejected
  And the credit limit should remain unchanged

# 6. Promotional Balance Transfers  

Scenario: Initiate a promotional balance transfer
  Given a credit card holder has an existing balance on another card
  And there is a promotional balance transfer offer
  When the customer requests a balance transfer with the promotional terms
  Then the balance should be transferred successfully under the promotional offer

# Non-Functional Tests

Scenario: Verify secure data transmission
  Given a user is applying for a credit card online
  When the user submits the application form
  Then the data should be transmitted securely using SSL

Scenario: Application workflow during internet disconnection
  Given a user is filling out a credit card application
  When the internet connection is lost
  Then the application data should be saved locally
  And the user should be able to resume the application upon reconnection

Scenario: Volume testing of applications
  Given a high traffic of concurrent credit card applications
  When multiple users submit applications simultaneously
  Then all applications should be processed successfully
  And the system should handle the load without performance degradation

Scenario: Usability testing across devices and browsers
  Given a credit card application form
  When accessed from different devices and browsers
  Then the form should be rendered correctly
  And all functionality should work as expected

Scenario: Verify PCI-DSS compliance for payment processing
  Given a credit card payment processing system
  When processing payments
  Then the system should comply with PCI-DSS standards

Scenario: Security testing for web application
  Given a credit card management web application
  When tested for security vulnerabilities like SQL injection, XSS, and CSRF
  Then no vulnerabilities should be found

Scenario: Performance testing under load
  Given a credit card management system
  When subjected to high load and stress testing
  Then the system should maintain acceptable response times

Scenario: Accessibility standards compliance
  Given a credit card management application
  When evaluated against accessibility standards like WCAG 2.1
  Then the application should comply with the standards
