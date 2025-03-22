**Entities**:

Created three entities: Student, Teacher, and StudentTeacher (junction table for the many-to-many relationship).
Database Setup:
I have entered postgres connection in the application.properties file. 
I have created model files for student,Teacher,TeacherStudent
many to many relationship for student and Teacher and many to one relationship for student_teacher

create a repositories for all the services, each service has a logic to save the details of the students/teachers to the Database

Define the many-to-many relationship using a junction table (student_teacher) with student_id and teacher_id.
**API Endpoints**:
Student Endpoints:
Create, retrieve all, and retrieve a student by ID.
Teacher Endpoints:
Create, retrieve all, and retrieve a teacher by ID.
Junction Table Endpoints:
Assign teachers to students and list teachers for a student, or students for a teacher.

I have tested the endpoints using Postman
