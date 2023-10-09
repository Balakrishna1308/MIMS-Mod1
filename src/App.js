// import React, { useState } from 'react';
// import './App.css';

// function App() {
//   // Define a state variable to hold a message
//   const [message, setMessage] = useState('Hello, React!');

//   return (
//     <div className="App">
//       <h1>Welcome to My React App</h1>
//       <p>{message}</p>
//       <button onClick={() => setMessage('Hello, World!')}>Click Me</button>
//     </div>
//   );
// }

// export default App;






// import React from 'react';
// import Header from './components/Header';
// // import Header from './components/Navigation';

// function App() {
//   return (
//     <div className="App">
//       <Header />
      
//     </div>
//   );
// }

// export default App;






// // App.js
// import React from 'react';
// import './App.css'; // You can import your CSS file here

// // Import your components
// import Header from './Header';
// import Navigation from './Navigation';

// function App() {
//   return (
//     <div className="App">
//       <Header />
//       <Navigation />
//       {/* Other components can go here */}
//     </div>
//   );
// }

// export default App;






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

      
      


    </div>
  );
}

export default App;

