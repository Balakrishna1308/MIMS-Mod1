// Search.js
import React, { useState } from 'react';

import './Search.css'; // Import the CSS file for the Search component

function Search(props) {
  const [searchTerm, setSearchTerm] = useState('');

  const handleSearch = () => {
    // Implement your search logic here
    // You can use the 'searchTerm' state to perform the search
    // Update the 'searchResults' state to display search results
  };

  return (
    <div className="search">
      <input
        type="text"
        placeholder="Search..."
        value={searchTerm}
        onChange={(e) => setSearchTerm(e.target.value)}
      />
      
      <button onClick={handleSearch}>Search</button>
    </div>
  );
}

export default Search;
