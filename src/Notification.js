import React, { useState } from 'react';
import './Notification.css';

function Notification() {
  const [showNotification, setShowNotification] = useState(false);

  const handleShowNotification = () => {
    setShowNotification(true);

    // Automatically hide the notification after a few seconds (e.g., 3 seconds)
    setTimeout(() => {
      setShowNotification(false);
    }, 3000); // 3000 milliseconds (3 seconds)
  };

  return (
    <div className={`notification ${showNotification ? 'show' : ''} top-left`}>
      
      
      <button className="close-button" onClick={() => setShowNotification(false)}>
        &#x2716;
      </button>

      <p>Notification.</p>
      
    </div>
  );
}

export default Notification;
