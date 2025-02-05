Feature: Credit Card Lifecycle Management

# 1. Credit Card Application
Scenario: Submit a valid credit card application
  Given a customer provides valid personal information, income details, and contact information
  When the customer submits the credit card application
  Then the application should be submitted successfully
  And a confirmation message should be displayed

Scenario Outline: Submit an invalid credit card application
  Given a customer provides '<personal_info>', '<income_details>', and '<contact_info>'
  When the customer submits the credit card application
  Then an error message should be displayed to provide valid information

  Examples:
    | personal_info | income_details | contact_info |
    | valid         | invalid        | valid        |
    | invalid       | valid          | valid        |
    | valid         | valid          | invalid      |
    | invalid       | invalid        | invalid      |

# 2. Waiving Off Charges  
Scenario: Waive off an unexpected fee as a one-time courtesy
  Given a customer requests to waive off an unexpected fee
  When the bank reviews the customer's history
  Then the bank should waive off the fee as a one-time courtesy
  And the customer's balance should reflect the waived fee

Scenario: Deny waiving off a valid fee
  Given a customer requests to waive off a valid fee
  When the bank reviews the request
  Then the bank should deny the request to waive off the valid fee

# 3. Redeeming Points
Scenario: Redeem accumulated reward points successfully
  Given a customer has accumulated reward points
  When the customer requests to redeem the points for a reward option
  Then the points should be redeemed successfully
  And the reward should be provided
  And the points balance should be updated

Scenario: Attempt to redeem more points than available balance
  Given a customer has fewer reward points than requested for redemption
  When the customer attempts to redeem more points than the available balance
  Then an error message should be displayed indicating insufficient points

# 4. Credit Limit Extension  
Scenario: Increase credit limit for a creditworthy customer
  Given the bank evaluates a customer's creditworthiness, payment history, and income stability
  When the bank decides to increase the credit limit
  Then the credit limit should be increased
  And the customer should be notified of the credit limit increase

Scenario: Deny an unreasonable credit limit increase request
  Given a customer requests an unreasonable credit limit increase
  When the bank evaluates the request
  Then the bank should deny the request
  And the current credit limit should be maintained

# 5. Credit Limit Reduction
Scenario: Reduce credit limit due to changes in customer's financial situation
  Given changes in a customer's financial situation or risk profile
  When the bank decides to reduce the credit limit
  Then the credit limit should be reduced
  And the customer should be notified of the credit limit reduction

Scenario: Maintain credit limit above customer's current balance
  Given a bank attempts to reduce a customer's credit limit below their current balance
  When the credit limit reduction is processed
  Then the credit limit should be maintained above the customer's current balance

# 6. Promotional Balance Transfers
Scenario: Transfer balance under promotional offer
  Given a customer requests a balance transfer under a promotional offer
  When the customer transfers the balance from a high-interest credit card
  Then the balance should be transferred successfully under the promotional terms

# Non-Functional Tests
Scenario: Verify credit card application submission under high load
  Given a high number of concurrent users
  When all users submit credit card applications simultaneously
  Then the application should be submitted successfully without performance issues

Scenario: Check application form for clear instructions
  Given a customer navigates to the credit card application form
  When the customer views the form
  Then the form should have clear instructions for filling out information

Scenario: Ensure customer data encryption
  Given a customer submits personal and financial data
  When the data is transmitted over the network
  Then the data should be encrypted for security

Scenario Outline: Test application compatibility across different browsers
  Given a customer uses the '<browser>' browser
  When the customer accesses the credit card application
  Then the application should function correctly

  Examples:
    | browser |
    | Chrome  |
    | Firefox |
    | Safari  |
    | Edge    |

Scenario: Verify 24/7 availability of online banking portal
  Given a customer attempts to access the online banking portal
  When the customer accesses the portal at any time of day
  Then the portal should be available and accessible

Scenario Outline: Check for proper error messages on invalid input
  Given a customer provides '<invalid_input>'
  When the customer submits the input
  Then an appropriate error message should be displayed

  Examples:
    | invalid_input            |
    | blank required field     |
    | invalid date format      |
    | alphanumeric in numeric field |
