




import React from 'react';
import './App.css'; // You can include your CSS styles here

// import Header from './Header';
// import Navigation from './Navigation';
// import TaskList from './TaskList'; // Import the TaskList component

import Calendar from './Calendar'; 





import Search from './Search';




import Notification from './Notification';


// import Search from './Notification';



import FileUpload from './FileUpload';




import './Flashcard.css';



import Progress from './Progress';




import FileUploadFlashcard from './FileUploadFlashcard';






// const tasks = [
//   { title: 'Task 1', completed: false },
//   { title: 'Task 2', completed: true },
//   { title: 'Task 3', completed: false },
//   // Add more tasks here
// ];



function App() {
  return (
    <div className="App">
      {/* <Header /> */}
      {/* <Navigation /> */}
      {/* Include the TaskList component and pass the tasks prop */}
      {/* <TaskList tasks={tasks} /> */}

      <div className="top-right">
        <Search />
      </div>

      {/* <Search /> */}


      
        <Notification />



        
      


      <div className={`left-aligned`}>
        <Calendar />
      </div>




       {/* Add the flashcard here */}
       <div className="flashcard">
        <div className="flashcard-content">
          <h3>Calendar</h3>
          <p>It is where you can schedule your tasks, appointments, and events efficiently, making it a crucial part of any productivity application.</p>
        </div>
      </div>




      <div className="right-aligned">
        <FileUpload />
        <FileUploadFlashcard />
      </div>




      <Progress status="In Progress" percentage={75} />
      
      


    </div>
  );
}

export default App;

