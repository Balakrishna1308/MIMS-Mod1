import React, { useState } from 'react';
import './Feedback.css'; 

function Feedback() {
  const [feedback, setFeedback] = useState('');
  const [submitted, setSubmitted] = useState(false);

  const handleFeedbackChange = (e) => {
    setFeedback(e.target.value);
  };

  const handleSubmit = () => {
        setSubmitted(true);
  };

  return (
    <div className="feedback-container">
      <h2   className="feedback-heading" >Feedback</h2>
      {submitted ? (
        <div className="feedback-submitted">
          <p>Thank you for your feedback!</p>
        </div>
      ) : (
        <div className="feedback-form">
          <textarea
            placeholder="Provide your feedback here..."
            value={feedback}
            onChange={handleFeedbackChange}
          />
          <button onClick={handleSubmit}>Submit</button>
        </div>
      )}
    </div>
  );
}

export default Feedback;




// import React, { useState } from 'react';
// import './Feedback.css';

// function Feedback() {
//   const [feedback, setFeedback] = useState('');
//   const [submitted, setSubmitted] = useState(false);

//   const handleFeedbackChange = (e) => {
//     setFeedback(e.target.value);
//   };

//   const handleSubmit = async () => {
//     try {
//       const response = await fetch('http://localhost:8080/api/feedback', {
//         method: 'POST',
//         headers: {
//           'Content-Type': 'application/json',
//         },
//         body: JSON.stringify({ feedback }),
//       });

//       if (response.ok) {
//         setSubmitted(true);
//       } else {
//         console.error('Error submitting feedback:', response.statusText);
//       }
//     } catch (error) {
//       console.error('Error:', error);
//     }
//   };

//   return (
//     <div className="feedback-container">
//       <h2 className="feedback-heading">Feedback</h2>
//       {submitted ? (
//         <div className="feedback-submitted">
//           <p>Thank you for your feedback!</p>
//         </div>
//       ) : (
//         <div className="feedback-form">
//           <textarea
//             placeholder="Provide your feedback here..."
//             value={feedback}
//             onChange={handleFeedbackChange}
//           />
//           <button onClick={handleSubmit}>Submit</button>
//         </div>
//       )}
//     </div>
//   );
// }

// export default Feedback;

