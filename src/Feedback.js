import React, { useState } from 'react';
import './Feedback.css'; 

function Feedback() {
  const [feedback, setFeedback] = useState('');
  const [submitted, setSubmitted] = useState(false);

  const handleFeedbackChange = (e) => {
    setFeedback(e.target.value);
  };

  const handleSubmit = () => {
    // You can implement the logic to submit feedback here, e.g., sending it to a server.
    // For this example, we'll just set the "submitted" state to true.
    setSubmitted(true);
  };

  return (
    <div className="feedback-container">
      <h2>Feedback</h2>
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
