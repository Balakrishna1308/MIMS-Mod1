import React from 'react';

function TaskList({ tasks }) {
  return (
    <div className="task-list">
      <h2>Tasks</h2>
      <ul>
        {tasks.map((task, index) => (
          <li key={index} className={task.completed ? 'completed' : ''}>
            {task.title}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TaskList;
