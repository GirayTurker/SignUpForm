Giray Turker

MainActivity class: 
Refactored (rename) with FormActivity.

AndroidManifest.xml: 
Code line  activity:name checked for called FormActivity instead of MainActivity.

activity_main.xml: 
5 LinearLayout component created. First 4 component created for name, email, password and confirm password layouts. The 4th component is contains Button to save user entries. In first 4 component, each layout contains 3 components which is respectively; TextView, EditText and TextView. 

Example Layout (Repeated for first 4 component): 
- Name (TextView & visible)   
- Enter Name (EditText & visible) 
- Error Message (EditText & invisible)
EditText components colorized and open visibility when user start to type in it.
Component hints are initialized in string.xml file. 

strings.xml: All created layout components initialized in this file with their string values.

colors/xml: Red color added to show error messages(got color code from internet).

class FormActivity: 
Private var variables created for TextView and EditText design in LinearLayout components.
Private function takeIn created to initialize private variables with their design components. Also, this function added in override fun onCreate, since it should trigger when activity start run.
Funtion save created with View. All private variables with their components are checking user inputs for their corrections and decide sing up is successful or not (based on assignment requirements). When user push the Buttom, this function us triggering.  


 
 
