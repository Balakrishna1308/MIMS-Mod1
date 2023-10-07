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
      <Calendar />
    </div>
  );
}

export default App;

