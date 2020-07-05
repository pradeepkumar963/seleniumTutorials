package selenium;

public class XpathTutorial {
/*
 * ALL ABOUT XPATH
 * ----------------
 * 
 * PART 1 : What will we learn in this video?
1. Why do we need XPATH? Why not other locators?
2. Can we rely on browser plugins alone? 
3. What is XPATH?
4. How XML PATH and its functions handle HTML elements ?
5. Types of XPath.
6. Identification strategies:
   a) Locating Elements with Known Attribute
   syntax: //*[@attributeName='value']	Example: //*[@id='txtUsername'], //*[@name='txtUsername']
 
   b) Locating Elements with known Element and Attributes
   syntax: //elementName[@attributeName='value']	Example: //input[@id='txtUsername'], //input[@name='txtUsername']
  
   c) Locating Elements with Known Visible Text (exact match)
   syntax: //elementName[text()='exact text'] Example: //a[text()='OrangeHRM, Inc']-> the text is case sensitive 
   
   d) Locating Elements when part of the visible text (partial match)
   syntax: //elementName[contains(text(),'part of the text')] Example: 
   
   e) Locating Elements with Multiple Attributes
   syntax: //*[@attributeName='value'][@attributeName='value'][@attributeName='value'] 
   Example: //input[@class='button'][@type='submit'][@value='login'][@name='submit']
    
   f) Locating elements when starting visible text is known
   syntax: //elementName[starts-with(text(),'starting text')] Example:
   
   g) Locating Elements with Dynamic Attribute values
   syntax: //elementName[contains(@attributeName,'part of the text')], 
   		   //elementName[starts-with(@attributeName,'fixed prefix of the value')]
 * 
 * 
 * PART 2 : What will we learn in this video?
1.Locating a parent element
syntax: //<known Path>/parent::elementName
Example: //*[@id='divUsername']/parent::form

2.Locating a child element
syntax: //<XpathOfKnownElement>/child::elementName, //<XpathOfKnownElement>/<elementName>
Example: //div[@id='divUsername']/child::input, //div[@id='divUsername']/input

3.Locating ancestors of a known element
syntax: //<XpathOfKnownElement>/ancestor::<elementName>, //<XpathOfKnownElement>/ancestor::*
Example: //input[@id='txtUsername']/ancestor::form, //input[@id='txtUsername']/ancestor::*

4.Locating the following elements
syntax: //<XpathOfKnownElement>/following::<elementName>
Example: //input[@id='txtUsername']/following::input, //input[@id='txtUsername']/following::input[2]

5.Locating preceding element 
syntax: //<XpathOfKnownElement>/preceding::<elementName>
Example: //input[@id='txtUsername']/preceding::input, //input[@id='txtUsername']/preceding::input[2]

6.Locating the following sibling
syntax: //<XpathOfKnownElement>/following-sibling::<elementName> 
Example: //*[@id='txtUsername']/following-sibling::span

7.Locating preceding sibling
syntax: //<XpathOfKnownElement>/preceding-sibling::<elementName> 
Example: //*[@id='txtUsername']/preceding-sibling::span
 * 
 * 
 * */
}
