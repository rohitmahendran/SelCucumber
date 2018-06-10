Feature: CreateLead
Background: 
Given Invoke the LeafTapApp

@smoke
Scenario: CreateLead (with only mandatory values)
Given  Invoke the LeafTapApp
And Enter the Valid UserName as DemoSalesManager
And Enter the Valid Password as crmsfa
And Click on the Login button
And Click on CRM/SFA link
And Click on the Creat Lead tab
And Enter the Company Name as CTS
And Enter the First Name as Ramesh
And Enter the Last Name as S
When Click on Create Lead tab
Then Verify Create Lead done successfully

@sanity
Scenario Outline: CreateLead (with mandatory values - positive)
And Enter the Valid UserName as <userName>
And Enter the Valid Password as <passWord>
And Click on the Login button
And Click on CRM/SFA link
And Click on the Creat Lead tab
And Enter the Company Name as <companyName>
And Enter the First Name as <firstName>
And Enter the Last Name as <lastName>
When Click on Create Lead tab
Then Verify Create Lead done successfully
Examples:
|userName|passWord|companyName|firstName|lastName|
|DemosalesManager|crmsfa|CTS|Ramesh|S|
|DemoCSR|crmsfa|TechMahi|Rohit|M|

@smoke @sanity
Scenario: CreateLead (with only mandatory values - negative)
Given  Invoke the LeafTapApp
And Enter the Valid UserName as DemoSalesManager
And Enter the Valid Password as crm
And Click on the Login button
But Verify Login failed

