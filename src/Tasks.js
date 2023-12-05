import React, { useState } from 'react';
import './Tasks.css'; // Import the CSS file

function Tasks() {
  const [tasks, setTasks] = useState([
    { id: 1, description: 'Task 1: Enrolment-form-success page', completed: false },
    { id: 2, description: 'Task 2: Enrolment-form page', completed: false },
    { id: 3, description: 'Task 3: Trainee-joining-details page', completed: false },
  ]);

  const handleTaskToggle = (taskId) => {
    setTasks((prevTasks) =>
      prevTasks.map((task) =>
        task.id === taskId ? { ...task, completed: !task.completed } : task
      )
    );
  };

  return (
    <div className="tasks-container">
      <h2>Task List</h2>
      <ul className="task-list">
        {tasks.map((task) => (
          <li key={task.id} className={task.completed ? 'completed' : ''}>
            {task.description}
            <button
              className="task-toggle"
              onClick={() => handleTaskToggle(task.id)}
            >
              {task.completed ? 'Mark Incomplete' : 'Mark Complete'}
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Tasks;
