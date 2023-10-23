
import React from 'react';
import './App.css'; 
// import Calendar from './Calendar'; 
import Search from './Search';
import Notification from './Notification';
import Tasks from './Tasks';
import FileUpload from './FileUpload';




// import './Flashcard.css';




import Progress from './Progress';
// import FileUploadFlashcard from './FileUploadFlashcard';
import Feedback from './Feedback';
import Certificate from './Certificate';



import Calendara from './Calendara';



function App() {
  return (
    <div className="container">
     
      
      

      
      
      <div className="flashcard">
        <div className="flashcard-content">
          <h3>Calendar</h3>
          <p>It is where you can schedule your tasks, appointments, and events efficiently, making it a crucial part of any productivity application.</p>
        </div>
      </div>



      {/* <Calendar /> */}
     

    <FileUpload />
    {/* <FileUploadFlashcard /> */}
    <Search />
    <Progress status="In Progress" percentage={75} />
    
    <Tasks/>
    <Notification />
    
    <Certificate />

    <Feedback/>




    <Calendara />



    
    </div>
  );
}

export default App;

