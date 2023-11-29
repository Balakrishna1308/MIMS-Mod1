// import React, { useState } from 'react';
// import './FileUpload.css';

// function FileUpload() {
//   const [selectedFile, setSelectedFile] = useState(null);

//   const handleFileChange = (e) => {
//     setSelectedFile(e.target.files[0]);
//   };

//   const handleUpload = () => {

//     if (selectedFile) {
//       console.log('Uploading file:', selectedFile);
      
//     } else {
//       alert('Please select a file to upload.');
//     }
//   };

//   return (
//     <div className="file-upload-container">
//       <input type="file" onChange={handleFileChange} />
//       <button onClick={handleUpload}>Upload</button>
//     </div>
//   );
// }

// export default FileUpload;






// FileUpload.js
import React, { useState } from 'react';
import './FileUpload.css';

function FileUpload() {
  const [selectedFile, setSelectedFile] = useState(null);

  const handleFileChange = (e) => {
    setSelectedFile(e.target.files[0]);
  };

  const handleUpload = () => {
    if (selectedFile) {
      const formData = new FormData();
      formData.append('file', selectedFile);

      fetch('http://localhost:8080/api/upload', {
        method: 'POST',
        body: formData,
      })
        .then(response => response.json())
        .then(data => {
          console.log('File uploaded successfully:', data);
        })
        .catch(error => {
          console.error('Error uploading file:', error);
        });
    } else {
      alert('Please select a file to upload.');
    }
  };

  return (
    <div className="file-upload-container">
      <input type="file" onChange={handleFileChange} />
      <button onClick={handleUpload}>Upload</button>
    </div>
  );
}

export default FileUpload;




// function uploadFile(file) {
//   const formData = new FormData();
//   formData.append('file', file);

//   return fetch('http://localhost:8080/api/files/upload', {
//       method: 'POST',
//       body: formData,
//   })
//   .then(response => response.json())
//   .then(data => console.log(data))
//   .catch(error => console.error('Error uploading file:', error));
// }

// function downloadFile(fileId) {
//   fetch(`http://localhost:8080/api/files/download/${fileId}`)
//       .then(response => {
//           const disposition = response.headers.get('Content-Disposition');
//           const filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
//           const matches = filenameRegex.exec(disposition);
//           const filename = matches && matches.length > 1 ? matches[1] : 'download';

//           response.blob().then(blob => {
//               const url = window.URL.createObjectURL(new Blob([blob]));
//               const link = document.createElement('a');
//               link.href = url;
//               link.setAttribute('download', filename);
//               document.body.appendChild(link);
//               link.click();
//               document.body.removeChild(link);
//           });
//       })
//       .catch(error => console.error('Error downloading file:', error));
// }



