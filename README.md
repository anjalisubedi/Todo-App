# Todo Application

This is an application where a user can add, delete, and update any task. The aim of this app is to learn about the fragments, room database, 
and MVVM pattern. As a result three java classes that are VIEW, VIEWMODEL and MODLE were created for the MMVM pattern. Simiallary, for the fragmanet 
section two layout resource are inflated. Finally the room database is used to store, update and delete the taks data. 

# Design of Todo App


Here a simple design of the application is shown where in the bottom right corner a flaoting button is implemented

<img width="366" alt="1" src="https://user-images.githubusercontent.com/50906104/170838076-53be39bd-9200-4b23-928e-7f11eaebd905.png">


While clicking the float button another resource file is inflated to the main activity that slides form the bottom of the screen 


<img width="435" alt="2" src="https://user-images.githubusercontent.com/50906104/170838179-b2b978df-fe78-44e5-b0b2-925dd3793bd1.png">


In the EditText section the user can write about their task and task description

<img width="435" alt="3" src="https://user-images.githubusercontent.com/50906104/170838193-0f5be3e7-a57f-4f99-84ef-3b083abc5544.png">


Also for picking the date the PICK DATE button can be clicked and the inflated screen futher extends more to show a calender

<img width="435" alt="4" src="https://user-images.githubusercontent.com/50906104/170838254-288f5eb2-b890-4b0c-86ad-77676c25d8f8.png">


After picking the date the ADD button will add the data to the databse which is then displayed in recycler view that is inflated with 
another layout resource file 


<img width="435" alt="5" src="https://user-images.githubusercontent.com/50906104/170838333-13408315-e2cf-4723-bd60-c412000735dc.png">


# Database

Here Room database is used as shown in the inspection below


<img width="1400" alt="Screen Shot 2022-05-29 at 12 15 46 AM" src="https://user-images.githubusercontent.com/50906104/170838440-8392565d-87d1-4147-b680-dd59b4c57e34.png">


# CURD Operations

Since the database is created the CURD operation becomes very easy as shown in the screenshot below the user can edit, update and delete the 
task.


<img width="435" alt="6" src="https://user-images.githubusercontent.com/50906104/170838509-4a1bbcf4-ec0a-4bf9-99b2-3cb2c254f1e0.png">


Deleting Task

<img width="435" alt="7" src="https://user-images.githubusercontent.com/50906104/170838516-e47a8de7-4795-44b4-b8a6-9bed6f90e791.png">

# Activity LifeCycle

  
  Multiple Lifecycle are used such as :
  
  onStart()
  
  
  onCreat()
  
  
  onPause()
  
  
  onStop()
  
  
  onDestroy()
  
  
# Fragments 

Fragments are used here by inflating two resource files as shown in the scrrenshot below:



<img width="542" alt="fragment1" src="https://user-images.githubusercontent.com/50906104/170838883-b73e8e18-6f70-4157-be60-769f2e912f51.png">




<img width="522" alt="fragment2" src="https://user-images.githubusercontent.com/50906104/170838895-63808aeb-3c4b-4ca7-b9f8-b09a68832e43.png">



# Recycler View 

Recycler View has been used to show multiple cardviews that represents the tasks added

<img width="735" alt="useage of recycler view" src="https://user-images.githubusercontent.com/50906104/170838972-c9f145d9-7f95-4bfd-a6a4-89a3db61730a.png">

  
  
# Libraries

Room Database 

def room_version = "2.4.0-alpha03"
    implementation "androidx.room:room-runtime:$room_version"
    annotationProcessor "androidx.room:room-compiler:$room_version"
    
    
Lifecycle Components


implementation "androidx.lifecycle:lifecycle-viewmodel:$rootProject.lifecycleVersion"
    implementation "androidx.lifecycle:lifecycle-livedata:$rootProject.lifecycleVersion"
    implementation "androidx.lifecycle:lifecycle-common-java8:$rootProject.lifecycleVersion"



# MVVM Pattern 

MVVM patter means an architectural pattern that facilitates the separation of the development of the graphical user interface. Here the 
following figure shows how the MVVM pattern can be used.


![image](https://user-images.githubusercontent.com/50906104/170838568-98608a46-282c-4222-a8b8-3786d73c1916.png)


  

  
    
  



