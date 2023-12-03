// Login.js
// import React, { useState } from 'react';

// function Login({ setAuthenticated }) {
//     const [username, setUsername] = useState('');
//     const [password, setPassword] = useState('');

//     const handleLogin = async () => {
//         try {

//             const response = await fetch('http://localhost:8080/login', {
//               method: 'POST',
//               headers: {
//               'Content-Type': 'application/json',
//              },
//               body: JSON.stringify({ username, password }),
//             });


//             if (response.ok) {
//                                 const { token } = await response.json();


//                 localStorage.setItem('authToken', token);


//                 setAuthenticated(true);
//             } else {

//                 console.error('Login failed');
//             }
//         } catch (error) {
//             console.error('Error during login:', error);
//         }
//     };

//     return (
//         <div>
//             <label>Username:</label>
//             <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />

//             <label>Password:</label>
//             <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />

//             <button onClick={handleLogin}>Login</button>
//         </div>
//     );
// }

// export default Login;



                // Set the authenticated state to true



// Login.js
import React, { useState } from 'react';

function Login({ setAuthenticated }) {
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');

    const handleLogin = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/auth/login', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ username, password }),
            });

            if (response.ok) {
                const { token } = await response.json();
                localStorage.setItem('authToken', token);
                setAuthenticated(true);
            } else {
                console.error('Login failed');
            }
        } catch (error) {
            console.error('Error during login:', error);
        }
    };

    const handleRegister = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/auth/register', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify({ username, password }),
            });

            if (response.ok) {
                console.log('Registration successful');
                // Optionally, you can auto-login after successful registration
                handleLogin();
            } else {
                console.error('Registration failed');
            }
        } catch (error) {
            console.error('Error during registration:', error);
        }
    };






    return (
        <div>
            <label>Username:</label>
            <input type="text" value={username} onChange={(e) => setUsername(e.target.value)} />

            <label>Password:</label>
            <input type="password" value={password} onChange={(e) => setPassword(e.target.value)} />

            <button onClick={handleLogin}>Login</button>
            <button onClick={handleRegister}>Register</button>
        </div>
    );
}

export default Login;

 