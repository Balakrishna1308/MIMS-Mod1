import React from 'react';
import './Certificate.css'; // Import the CSS file

function Certificate() {
  return (
    <div className="certificate-container">
      <h2>Certificates</h2>
      {/* Add your certificate content here */}
      <p>Congratulations! You've earned a certificate for completing a project.</p>

      <div className="certificate-actions">
        <a href="/certificate-view.html" className="certificate-link">
          View Certificate      
        </a>


        <span className="certificate-space"></span>


        
        <a href="/certificate-download.html" className="/certificate-download.html">
          Download Certificate
        </a>
      </div>
    </div>
  );
}

export default Certificate;
