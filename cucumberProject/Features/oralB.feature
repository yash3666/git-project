Feature: oralB Page testCases

Scenario: Veify Kids text in Kid's Brushes OralB
Given Navigate to Website
When Hover on More Products
And Click Kid's Brushes'
Then Verify Kids text in BrushList

Scenario Outline: Verify 3D White Battery ToothBrush
Given Navigate to Website
When Click on search icon
And Enter search text <text>
Then Verify the <verifyText>

Examples: 
 |text      | verifyText                  |
 |battery   | 3D White Battery Toothbrush |  
 
 
 Scenario: Verify "FLOSS PICKS" in in products page
 Given Navigate to Website
 When Click "Floss" under "Shop" Category in Footer
 Then Verify "FLOSS PICKS" in products page
  
