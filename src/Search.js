// Search.js
// import React, { useState } from 'react';
// import './Search.css'; 

// function Search(props) {
//   const [searchTerm, setSearchTerm] = useState('');

//   const handleSearch = () => {
   
//   };

//   return (
//     <div className="search-container">
//       <input
//         type="text"
//         placeholder="Search..."
//         value={searchTerm}
//         onChange={(e) => setSearchTerm(e.target.value)}
//       />

//       <button onClick={handleSearch}>Search</button>
//     </div>
//   );
// }

// export default Search;





// Search.js
// import React, { useState } from 'react';
// import './Search.css';

// function Search(props) {
//   const [searchTerm, setSearchTerm] = useState('');
//   const [searchResults, setSearchResults] = useState([]); 

//   const handleSearch = () => {
    
//     fetch(`https://api.example.com/search?query=${searchTerm}`)
//       .then((response) => response.json())
//       .then((data) => {
    
//         setSearchResults(data.results);
//       })
//       .catch((error) => {
//         console.error('Error fetching search results:', error);
//       });
//   };

//   return (
//     <div className="search-container">
//       <input
//         type="text"
//         placeholder="Search..."
//         value={searchTerm}
//         onChange={(e) => setSearchTerm(e.target.value)}
//       />

//       <button onClick={handleSearch}>Search</button>

      
//       <div>
//        {searchResults.map((result) => (
//           <div key={result.id}>{result.title}</div>
//         ))}
//       </div>
//     </div>
//   );
// }

// export default Search;








// Search.js
// import React, { useState } from 'react';
// import './Search.css';


// function Search(props) {
//   const [searchTerm, setSearchTerm] = useState('');

//   const handleSearch = () => {
  
//     fetch('http://localhost:8080/api/search', {
//       method: 'POST',
//       headers: {
//         'Content-Type': 'application/json',
//       },
//       body: JSON.stringify({ searchTerm }),
//     })
//       .then(response => response.json())
//       .then(data => {
        
//         console.log('Search results:', data);
        
//       })
//       .catch(error => {
//         console.error('Error searching:', error);
//       });
//   };

//   return (
//     <div className="search-container">
//       <input
//         type="text"
//         placeholder="Search..."
//         value={searchTerm}
//         onChange={(e) => setSearchTerm(e.target.value)}
//       />

//       <button onClick={handleSearch}>Search</button>
//     </div>
//   );
// }

// export default Search;







// Search.js
// import React, { useState } from 'react';
// import './Search.css';

// function Search(props) {
//   const [searchTerm, setSearchTerm] = useState('');
//   const [searchResults, setSearchResults] = useState([]);

//   const handleSearch = () => {
   
//     fetch('http://localhost:8080/api/search', {
//       method: 'POST',
//       headers: {
//         'Content-Type': 'application/json',
//       },
//       body: JSON.stringify({ searchTerm }),
//     })
//       .then(response => response.json())
//       .then(data => {
      
//         setSearchResults(data);
//       })
//       .catch(error => {
//         console.error('Error searching items:', error);
//       });
//   };

//   return (
//     <div className="search-container">
//       <input
//         type="text"
//         placeholder="Search..."
//         value={searchTerm}
//         onChange={(e) => setSearchTerm(e.target.value)}
//       />

//       <button onClick={handleSearch}>Search</button>

//        {
        /* Display the search results */
      //  }
      /* <div className="search-results">
       {searchResults.map(item => (
          <div key={item.id}>{item.title}</div>
        ))}
      </div>
    </div>
  );
}

export default Search; */






// import React, { useState, useEffect } from 'react';
// import './Search.css';

// function FeedbackComponent() {
//     const [feedbackList, setFeedbackList] = useState([]);

//     useEffect(() => {
        
//         fetch('http://localhost:8080/api/feedback/getAll')
//             .then(response => response.json())
//             .then(data => setFeedbackList(data))
//             .catch(error => console.error('Error fetching feedback:', error));
//     }, []); 
//     return (
//         <div>   
//             <h2>Feedback List</h2>
//             <ul>
//                 {feedbackList.map(feedback => (
//                     <li key={feedback.id}>{feedback.content}</li>
//                 ))}
//             </ul>
//         </div>
//     );
// }

// export default FeedbackComponent;





// Search.js
import React, { useState } from 'react';
import './Search.css';

function Search(props) {
    const [searchTerm, setSearchTerm] = useState('');
    const [searchResults, setSearchResults] = useState([]);

    const handleSearch = () => {
        // Make an HTTP request to the search endpoint
        fetch('http://localhost:8080/api/search', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(searchTerm),
        })
            .then(response => response.json())
            .then(data => {
                // Set the search results in the component state
                setSearchResults(data);
            })
            .catch(error => {
                console.error('Error searching items:', error);
            });
    };

    return (
        <div className="search-container">
            <input
                type="text"
                placeholder="Search..."
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
            />

            <button onClick={handleSearch}>Search</button>

            {/* Display the search results */}
            {/* Display the search results */}
            

            <div className="search-results">
                {searchResults.map(item => (
                    <div key={item.id}>{item.title}</div>
                ))}
            </div>
        </div>
    );
}

export default Search;
