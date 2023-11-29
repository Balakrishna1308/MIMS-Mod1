import React, { useState } from 'react';
import './Tasks.css'; // Import the CSS file

function Tasks() {
  const [tasks, setTasks] = useState([
    { id: 1, description: 'Complete Module 1', completed: false },
    { id: 2, description: 'Review trainee project', completed: false },
    { id: 3, description: 'Prepare presentation', completed: false },
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
