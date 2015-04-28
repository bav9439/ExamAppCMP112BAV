
package edu.saintjoe.cs.brianc.examtwo;

//// Import directives tell Eclipse which components you intend to use
import com.google.devtools.simple.runtime.components.Component;
import com.google.devtools.simple.runtime.components.HandlesEventDispatching;
import com.google.devtools.simple.runtime.components.android.Form;

import com.google.devtools.simple.runtime.components.android.Button;
import com.google.devtools.simple.runtime.components.android.Label;
import com.google.devtools.simple.runtime.components.android.HorizontalArrangement;
import com.google.devtools.simple.runtime.components.android.TextBox;
import com.google.devtools.simple.runtime.components.android.AccelerometerSensor;

import com.google.devtools.simple.runtime.events.EventDispatcher;

//
//This is the only class file for our app
public class ExamActivity extends Form implements HandlesEventDispatching {
	
	//The name of the project is Exam Activity which cannot be changed
}

	//These objects are like "components" of App Inventor
	private HorizontalArrangement line1, line2, line3, line4, line5;
	private Button incButton;
	private Label resultLabel;
	private Label promptLabel;
	private TextBox inputBox;
	int temp;
	
	// // Java Bridger apps use $define() in place of main()
 void $define() {
	 
	 //"This" is an activity object
     this.BackgroundColor(COLOR_WHITE);
     
     //Create containers for widgets
     line1 = new HorizontalArrangement(this);
     line2 = new HorizontalArrangement(this);
     line3 = new HorizontalArrangement(this);

     //Instructions on what to do to reach resultlabel; user interface
     promptLabel = new Label(line1, "Enter a number:");
     inputBox = new TextBox(line1);
   
     //Instructions on what to do with the value placed into the prompt label
     incButton = new Button(line2,"Double it:"); 
     
     resultLabel = new Label(line3,"");
 
     (this, "ButtonClick", "Click");
    
 } //end define() 
 @Override
 
 //This method is called when an event happens
 public boolean (Component component, String id, String eventName,
         Object[] args) {
 	
	 	// The "Blocks" part of APP Inventor
	    if (component.equals(incButton) && eventName.equals("Click")){
	    	temp = Integer.parseInt(inputBox.Text());
	    	temp *= 2;
	    	resultLabel.Text(String.valueOf(temp));
	        return true;
	     } 
	    
	    //parameter
	    if (component.equals(resultLabel) eventName.equals("Click")) {
	    	outputLabel.Text("You pushed me!!");
	    	
	    	//This line is required to end the event
	    	return true;
	    	
	    } //end event
	    
 }	    //End activity class
