// import React, { useState } from 'react';
// import './Calendar.css'; 


// function Calendar() {
//   const [currentDate, setCurrentDate] = useState(new Date());

  
//   const getDaysInMonth = () => {
//     const year = currentDate.getFullYear();
//     const month = currentDate.getMonth();
//     const lastDay = new Date(year, month + 1, 0).getDate();
//     const firstDayOfWeek = new Date(year, month, 1).getDay(); // 0 = Sunday, 1 = Monday, ...

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

// <tbody>
//   {daysInMonth.reduce((rows, day, index) => {
//     if (index % 7 === 0) rows.push([]);
//     rows[rows.length - 1].push(day);
//     return rows;
//   }, []).map((row, rowIndex) => (
//     <tr key={rowIndex}>
//       {row.map((day, cellIndex) => (
//         <td key={cellIndex}>{day}</td>
//       ))}
//     </tr>
//   ))}
// </tbody>
//       </table>
//     </div>
//   );
// }

// export default Calendar;
