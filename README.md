# Assignment-3-Inheritance-Lab
Part 1 :
Java program that creates and prints information about several employees working at a hospital, including a HospitalEmployee, Doctor, Surgeon, and Nurse.

The main method creates instances of each of these classes using their constructors, passing in parameters such as name, employee number, and specialty. It then prints out information about each employee using the toString method, and calls the work method on each employee, which simply prints out a message indicating that the employee is working for the hospital.

The HospitalEmployee class is a superclass that provides basic information about an employee, including their name and employee number, as well as getName, getNumber, setName, setNumber, toString, and work methods.

The Doctor class is a subclass of HospitalEmployee that includes additional information about the doctor's medical specialty. It includes a getSpecialty, setSpecialty, toString, and work method.

The Surgeon class is a subclass of Doctor that includes a boolean value indicating whether the surgeon is currently operating, as well as isOperating, setOperating, toString, and work methods.

The Nurse class is a subclass of HospitalEmployee that includes the number of patients the nurse is currently responsible for, as well as getNumOfPatients, setNumOfPatients, toString, and work methods.
