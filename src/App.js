
import React from 'react';
import './App.css'; 
import Calendar from './Calendar'; 
import Search from './Search';
import Notification from './Notification';
import FileUpload from './FileUpload';
import './Flashcard.css';
import Progress from './Progress';
import FileUploadFlashcard from './FileUploadFlashcard';
import Feedback from './Feedback';


function App() {
  return (
    <div className="container">
      <Calendar />
      <div className="flashcard">
        <div className="flashcard-content">
          <h3>Calendar</h3>
          <p>It is where you can schedule your tasks, appointments, and events efficiently, making it a crucial part of any productivity application.</p>
        </div>
      </div>
    <FileUpload />
    <FileUploadFlashcard />
    <Progress status="In Progress" percentage={75} />
    <Search />
    <Notification />
    <Feedback/>
   </div>
  );
}

export default App;

