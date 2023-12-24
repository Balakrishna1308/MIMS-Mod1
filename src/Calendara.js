// import React, { useState } from 'react';
// import './Calendara.css'; // Import the CSS file

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());

  
//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay(); 
    
//     const daysInMonth = [];

  
//     for (let i = 0; i < firstDayOfWeek; i++) {
//       daysInMonth.push(null);
//     }

    
//     for (let day = 1; day <= lastDay; day++) {
//       daysInMonth.push(day);
//     }

//     return daysInMonth;
//   };

//   const daysInMonth = getDaysInMonth();
//   const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

//   return (
//     <div className="calendar-container">
//       <header>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//           Previous Month
//         </button>
//         <h2>
//           {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//         </h2>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//           Next Month
//         </button>
//       </header>

//       <table>
//         <thead>
//           <tr>
//             {daysOfWeek.map(day => (
//               <th key={day}>{day}</th>
//             ))}
//           </tr>
//         </thead>
//         <tbody>
//           {daysInMonth.reduce((rows, day, index) => {
//             if (index % 7 === 0) rows.push([]);
//             rows[rows.length - 1].push(day);
//             return rows;
//           }, []).map((row, rowIndex) => (
//             <tr key={rowIndex}>
//               {row.map((day, cellIndex) => (
//                 <td key={cellIndex}>{day}</td>
//               ))}
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }

// export default Calendar;  




// Calendar.js

// import React, { useState, useEffect } from 'react';
// import './Calendar.css';

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());
//   const [events, setEvents] = useState([]);

//   useEffect(() => {
//     const fetchEvents = async () => {
//       const year = currentDate.getFullYear();
//       const month = currentDate.getMonth() + 1; 
      

//       try {
//         const response = await fetch(`http://localhost:8080/api/events/month?month=${year}-${month}-01`);
//         if (response.ok) {
//           const data = await response.json();
//           setEvents(data);
//         } else {
//           console.error('Failed to fetch events');
//         }
//       } catch (error) {
//         console.error('Error during event fetch:', error);
//       }
//     };

//     fetchEvents();
//   }, [currentDate]);





//   const getDaysInMonth = () => {
//         const year = currentDate.getFullYear();
//         const month = currentDate.getMonth();
//         const lastDay = new Date(year, month + 1, 0).getDate();
//         const firstDayOfWeek = new Date(year, month, 1).getDay(); 
        
//         const daysInMonth = [];
    
      
//         for (let i = 0; i < firstDayOfWeek; i++) {
//           daysInMonth.push(null);
//         }
    
        
//         for (let day = 1; day <= lastDay; day++) {
//           daysInMonth.push(day);
//         }
    
//         return daysInMonth;
//       };
    
//       const daysInMonth = getDaysInMonth();
//       const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
    
//       return (
//         <div className="calendar-container">
//           <header>
//             <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//               Previous Month
//             </button>
//             <h2>
//               {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//             </h2>
//             <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//               Next Month
//             </button>
//           </header>
    
//           <table>
//             <thead>
//               <tr>
//                 {daysOfWeek.map(day => (
//                   <th key={day}>{day}</th>
//                 ))}
//               </tr>
//             </thead>
//             <tbody>
//               {daysInMonth.reduce((rows, day, index) => {
//                 if (index % 7 === 0) rows.push([]);
//                 rows[rows.length - 1].push(day);
//                 return rows;
//               }, []).map((row, rowIndex) => (
//                 <tr key={rowIndex}>
//                   {row.map((day, cellIndex) => (
//                     <td key={cellIndex}>{day}</td>
//                   ))}
//                 </tr>
//               ))}
//             </tbody>
//           </table>
//         </div>
//       );
//     }
    
//     export default Calendar;  
    
    


// Calendar.js

// import React, { useState, useEffect } from 'react';
// import './Calendar.css';

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());
//   const [events, setEvents] = useState([]);

//   useEffect(() => {
//     const fetchEvents = async () => {
//       const year = currentDate.getFullYear();
//       const month = currentDate.getMonth() + 1; 
      

//       try {
//         const response = await fetch(`http://localhost:8080/api/events/month?month=${year}-${month}-01`);
//         if (response.ok) {
//           const data = await response.json();
//           setEvents(data);
//         } else {
//           console.error('Failed to fetch events');
//         }
//       } catch (error) {
//         console.error('Error during event fetch:', error);
//       }
//     };

//     fetchEvents();
//   }, [currentDate]);

//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay();

//     const daysInMonth = [];

//     for (let i = 0; i < firstDayOfWeek; i++) {
//       daysInMonth.push(null);
//     }

//     for (let day = 1; day <= lastDay; day++) {
//       daysInMonth.push(day);
//     }

//     return daysInMonth;
//   };

//   const daysInMonth = getDaysInMonth();
//   const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

//   return (
//     <div className="calendar-container">
//       <header>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//           Previous Month
//         </button>
//         <h2>
//           {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//         </h2>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//           Next Month
//         </button>
//       </header>

//       <table>
//         <thead>
//           <tr>
//             {daysOfWeek.map(day => (
//               <th key={day}>{day}</th>
//             ))}
//           </tr>
//         </thead>
//         <tbody>
//           {daysInMonth.reduce((rows, day, index) => {
//             if (index % 7 === 0) rows.push([]);
//             rows[rows.length - 1].push(day);
//             return rows;
//           }, []).map((row, rowIndex) => (
//             <tr key={rowIndex}>
//               {row.map((day, cellIndex) => (
//                 <td key={cellIndex}>
//                   {day && (
//                     <div>
//                       <span>{day}</span>
                     
//                       {events
//                         .filter(event => new Date(event.date).getDate() === day)
//                         .map(event => (
//                           <div key={event.id}>{event.description}</div>
//                         ))}
//                     </div>
//                   )}
//                 </td>
//               ))}
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }

// export default Calendar;





// Calendar.js

// import React, { useState, useEffect } from 'react';
// import './Calendar.css';

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());
//   const [events, setEvents] = useState([]);

//   useEffect(() => {
//     const fetchEvents = async () => {
//       const year = currentDate.getFullYear();
//       const month = currentDate.getMonth() + 1; // Month is 0-indexed in JavaScript

//       try {
//         const response = await fetch(`http://localhost:8080/api/events/month?month=${year}-${month}-01`);
//         if (response.ok) {
//           const data = await response.json();
//           setEvents(data);
//         } else {
//           console.error('Failed to fetch events');
//         }
//       } catch (error) {
//         console.error('Error during event fetch:', error);
//       }
//     };

//     fetchEvents();
//   }, [currentDate]);

//   const handleDateClick = async (day) => {
//     const selectedDate = new Date(currentDate.getFullYear(), currentDate.getMonth(), day);
    // Send a request to the backend to handle the date click event
    // try {
    //   const response = await fetch('http://localhost:8080/api/events/click', {
    //     method: 'POST',
    //     headers: {
    //       'Content-Type': 'application/json',
    //     },
    //     body: JSON.stringify({ date: selectedDate.toISOString() }),
    //   });

    //   if (response.ok) {
    //     console.log('Date click event handled successfully');
        // You may update the events or perform other actions based on the response
//       } else {
//         console.error('Failed to handle date click event');
//       }
//     } catch (error) {
//       console.error('Error during date click event:', error);
//     }
//   };






//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay();

//     const daysInMonth = [];

//     for (let i = 0; i < firstDayOfWeek; i++) {
//       daysInMonth.push(null);
//     }

//     for (let day = 1; day <= lastDay; day++) {
//       daysInMonth.push(day);
//     }

//     return daysInMonth;
//   };

//   const daysInMonth = getDaysInMonth();
//   const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

//   return (
//     <div className="calendar-container">
//       <header>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//           Previous Month
//         </button>
//         <h2>
//           {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//         </h2>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//           Next Month
//         </button>
//       </header>

//       <table>
//         <thead>
//           <tr>
//             {daysOfWeek.map(day => (
//               <th key={day}>{day}</th>
//             ))}
//           </tr>
//         </thead>






//       <tbody>
//         {daysInMonth.reduce((rows, day, index) => {
//           if (index % 7 === 0) rows.push([]);
//           rows[rows.length - 1].push(day);
//           return rows;
//         }, []).map((row, rowIndex) => (
//           <tr key={rowIndex}>
//             {row.map((day, cellIndex) => (
//               <td key={cellIndex}>
//                 {day && (
//                   <div>
//                     <span
//                       onClick={() => handleDateClick(day)}
//                       style={{ cursor: 'pointer', textDecoration: 'underline' }}
//                     >
//                       {day}
//                     </span>
//                     {/* Display events for the day */}
//                     {events
//                       .filter(event => new Date(event.date).getDate() === day)
//                       .map(event => (
//                         <div key={event.id}>{event.description}</div>
//                       ))}
//                   </div>
//                 )}
//               </td>
//             ))}
//           </tr>
//         ))}
//       </tbody>
//     </div>
//   );
// }

// export default Calendar;





// Calendar.js

// import React, { useState, useEffect } from 'react';
// import './Calendar.css';

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());
//   const [events, setEvents] = useState([]);

//   useEffect(() => {
//     const fetchEvents = async () => {
//       const year = currentDate.getFullYear();
//       const month = currentDate.getMonth() + 1; 
      

//       try {
//         const response = await fetch(`http://localhost:8080/api/events/month?month=${year}-${month}-01`);
//         if (response.ok) {
//           const data = await response.json();
//           setEvents(data);
//         } else {
//           console.error('Failed to fetch events');
//         }
//       } catch (error) {
//         console.error('Error during event fetch:', error);
//       }
//     };

//     fetchEvents();
//   }, [currentDate]);

//   const handleDateClick = async (day) => {
//     const selectedDate = new Date(currentDate.getFullYear(), currentDate.getMonth(), day);
    
//     try {
//       const response = await fetch('http://localhost:8080/api/events/click', {
//         method: 'POST',
//         headers: {
//           'Content-Type': 'application/json',
//         },
//         body: JSON.stringify({ date: selectedDate.toISOString() }),
//       });

//       if (response.ok) {
//         console.log('Date click event handled successfully');
        
//       } else {
//         console.error('Failed to handle date click event');
//       }
//     } catch (error) {
//       console.error('Error during date click event:', error);
//     }
//   };

//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay();

//     const daysInMonth = [];

//     for (let i = 0; i < firstDayOfWeek; i++) {
//       daysInMonth.push(null);
//     }

//     for (let day = 1; day <= lastDay; day++) {
//       daysInMonth.push(day);
//     }

//     return daysInMonth;
//   };

//   const daysInMonth = getDaysInMonth();
//   const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

//   return (
//     <div className="calendar-container">
//       <header>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//           Previous Month
//         </button>
//         <h2>
//           {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//         </h2>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//           Next Month
//         </button>
//       </header>

//       <table>
//         <thead>
//           <tr>
//             {daysOfWeek.map(day => (
//               <th key={day}>{day}</th>
//             ))}
//           </tr>
//         </thead>
//         <tbody>
//           {daysInMonth.reduce((rows, day, index) => {
//             if (index % 7 === 0) rows.push([]);
//             rows[rows.length - 1].push(day);
//             return rows;
//           }, []).map((row, rowIndex) => (
//             <tr key={rowIndex}>
//               {row.map((day, cellIndex) => (
//                 <td key={cellIndex}>
//                   {day && (
//                     <div>
//                       <span
//                         onClick={() => handleDateClick(day)}
//                         style={{ cursor: 'pointer', textDecoration: 'underline' }}
//                       >
//                         {day}
//                       </span>
//                       {events
//                         .filter(event => new Date(event.date).getDate() === day)
//                         .map(event => (
//                           <div key={event.id}>{event.description}</div>
//                         ))}
//                     </div>
//                   )}
//                 </td>
//               ))}
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }

// export default Calendar;




// Calendar.js

// import React, { useState, useEffect } from 'react';
// import './Calendar.css';

// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());
//   const [events, setEvents] = useState([]);

//   useEffect(() => {
//     const fetchEvents = async () => {
//       const year = currentDate.getFullYear();
//       const month = currentDate.getMonth() + 1; // Month is 0-indexed in JavaScript
  
//       try {
//         const response = await fetch(`http://localhost:8080/api/events/month?month=${year}-${month}-01`);
//         if (response.ok) {
//           const data = await response.json();
//           setEvents(data);
//         } else {
//           console.error('Failed to fetch events. Server returned:', response.status, response.statusText);
//         }
//       } catch (error) {
//         console.error('Error during event fetch:', error);
//       }
//     };
  
//     fetchEvents();
//   }, [currentDate]);
  
//   const handleDateClick = async (day) => {
//     const selectedDate = new Date(currentDate.getFullYear(), currentDate.getMonth(), day);
    
//     // Prompt the user for a description
//     const eventDescription = prompt('Enter event description:');
//     if (!eventDescription) {
//       return; // If the user cancels or enters an empty description, do nothing
//     }

//     // Send a request to the backend to handle the date click event
//     try {
//       const response = await fetch('http://localhost:8080/api/events/click', {
//         method: 'POST',
//         headers: {
//           'Content-Type': 'application/json',
//         },
//         body: JSON.stringify({ 
//           date: selectedDate.toISOString(),
//           description: eventDescription,
//         }),
//       });

//       if (response.ok) {
//         console.log('Date click event handled successfully');
//         // You may update the events or perform other actions based on the response
//       } else {
//         console.error('Failed to handle date click event');
//       }
//     } catch (error) {
//       console.error('Error during date click event:', error);
//     }
//   };

//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay();

//     const daysInMonth = [];

//     for (let i = 0; i < firstDayOfWeek; i++) {
//       daysInMonth.push(null);
//     }

//     for (let day = 1; day <= lastDay; day++) {
//       daysInMonth.push(day);
//     }

//     return daysInMonth;
//   };

//   const daysInMonth = getDaysInMonth();
//   const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

//   return (
//     <div className="calendar-container">
//       <header>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
//           Previous Month
//         </button>
//         <h2>
//           {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
//         </h2>
//         <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
//           Next Month
//         </button>
//       </header>

//       <table>
//         <thead>
//           <tr>
//             {daysOfWeek.map(day => (
//               <th key={day}>{day}</th>
//             ))}
//           </tr>
//         </thead>
//         <tbody>
//           {daysInMonth.reduce((rows, day, index) => {
//             if (index % 7 === 0) rows.push([]);
//             rows[rows.length - 1].push(day);
//             return rows;
//           }, []).map((row, rowIndex) => (
//             <tr key={rowIndex}>
//               {row.map((day, cellIndex) => (
//                 <td key={cellIndex}>
//                   {day && (
//                     <div>
//                       <span
//                         onClick={() => handleDateClick(day)}
//                         style={{ cursor: 'pointer', textDecoration: 'underline' }}
//                       >
//                         {day}
//                       </span>
//                       {events
//                         .filter(event => new Date(event.date).getDate() === day)
//                         .map(event => (
//                           <div key={event.id}>{event.description}</div>
//                         ))}
//                     </div>
//                   )}
//                 </td>
//               ))}
//             </tr>
//           ))}
//         </tbody>
//       </table>
//     </div>
//   );
// }

// export default Calendar;




import React, { useState } from 'react';
import './Calendara.css'; // Import the CSS file

function Calendar() {
  const [currentDate, setCurrentDate] = useState(new Date());

  // Function to get the days in a month for the current date
  const getDaysInMonth = () => {
    const year = currentDate.getFullYear();
    const month = currentDate.getMonth();
    const lastDay = new Date(year, month + 1, 0).getDate();
    const firstDayOfWeek = new Date(year, month, 1).getDay(); // 0 = Sunday, 1 = Monday, ...

    const daysInMonth = [];

    // Fill in the days before the first day of the month with empty slots
    for (let i = 0; i < firstDayOfWeek; i++) {
      daysInMonth.push(null);
    }

    // Fill in the days of the month
    for (let day = 1; day <= lastDay; day++) {
      daysInMonth.push(day);
    }

    return daysInMonth;
  };

  const daysInMonth = getDaysInMonth();
  const daysOfWeek = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];

  return (
    <div className="calendar-container">
      <header>
        <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() - 1, 1))}>
          Previous Month
        </button>
        <h2>
          {currentDate.toLocaleDateString('en-US', { month: 'long', year: 'numeric' })}
        </h2>
        <button onClick={() => setCurrentDate(new Date(currentDate.getFullYear(), currentDate.getMonth() + 1, 1))}>
          Next Month
        </button>
      </header>

      <table>
        <thead>
          <tr>
            {daysOfWeek.map(day => (
              <th key={day}>{day}</th>
            ))}
          </tr>
        </thead>
        <tbody>
          {daysInMonth.reduce((rows, day, index) => {
            if (index % 7 === 0) rows.push([]);
            rows[rows.length - 1].push(day);
            return rows;
          }, []).map((row, rowIndex) => (
            <tr key={rowIndex}>
              {row.map((day, cellIndex) => (
                <td key={cellIndex}>{day}</td>
              ))}
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default Calendar;  