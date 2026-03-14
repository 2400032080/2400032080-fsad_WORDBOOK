import { useState } from "react";

function StudentManager() {

  const [students, setStudents] = useState([
    { id: 11, name: "Aravind", course: "Python" },
    { id: 12, name: "Deepika", course: "Machine Learning" },
    { id: 13, name: "Suresh", course: "Cyber Security" },
    { id: 14, name: "Pooja", course: "Cloud Computing" },
    { id: 15, name: "Ramesh", course: "Data Science" }
  ]);

  const [newStudent, setNewStudent] = useState({
    id: "",
    name: "",
    course: ""
  });

  const handleChange = (e) => {
    setNewStudent({
      ...newStudent,
      [e.target.name]: e.target.value
    });
  };

  const addStudent = () => {
    setStudents([...students, newStudent]);

    setNewStudent({
      id: "",
      name: "",
      course: ""
    });
  };

  const deleteStudent = (id) => {
    setStudents(students.filter(student => student.id !== id));
  };

  return (
    <div style={{padding:"20px"}}>
      <h2>Student Records</h2>

      <input type="text" name="id" placeholder="Enter ID" value={newStudent.id} onChange={handleChange}/>
      <input type="text" name="name" placeholder="Enter Name" value={newStudent.name} onChange={handleChange}/>
      <input type="text" name="course" placeholder="Enter Course" value={newStudent.course} onChange={handleChange}/>

      <button onClick={addStudent}>Add Record</button>

      <h3>Students</h3>

      {students.length === 0 ? (
        <p>No records found</p>
      ) : (
        <table border="1" cellPadding="10">
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>
              <th>Course</th>
              <th>Action</th>
            </tr>
          </thead>

          <tbody>
            {students.map((student) => (
              <tr key={student.id}>
                <td>{student.id}</td>
                <td>{student.name}</td>
                <td>{student.course}</td>
                <td>
                  <button onClick={() => deleteStudent(student.id)}>Remove</button>
                </td>
              </tr>
            ))}
          </tbody>

        </table>
      )}
    </div>
  );
}

export default StudentManager;