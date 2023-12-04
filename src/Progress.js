/* Progress.js */

import React from 'react';

import './Progress.css'; // Import the CSS file

function Progress(props) {
  return (
    <div className="progress-container">
      {/* <h2 class = "progress-heading">Project Progress Information</h2> */}
      <h2 className = "progress-heading">Project Progress Information</h2>
      <p>Status: <span className="status">{props.status}</span></p>
      <p>Percentage Complete: <span className="percentage">{props.percentage}%</span></p>
    </div>
  );
}

export default Progress;
