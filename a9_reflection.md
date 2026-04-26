# a9_reflection.md – Domain Modeling and Class Diagram Reflection

## Rural Hospital Digital System — Assignment 9

---

## Introduction

Designing the domain model and class diagram for the Rural Hospital Digital System was one of the most intellectually demanding stages of the project. Unlike earlier assignments that focused on identifying requirements and modelling system behaviour, this assignment required me to define the **core structure of the system** — the objects, their relationships, and how they collaborate to deliver functionality.

This process forced me to move from thinking about *features* (what the system does) to thinking about *entities and interactions* (how the system is built internally). It required careful alignment with previous work, particularly the functional requirements (Assignment 4), use cases (Assignment 5), Agile backlog (Assignment 6), and behavioural models (Assignment 8).

---

## Challenge 1: Identifying the Right Level of Abstraction

One of the biggest challenges was deciding **what qualifies as a domain entity** and what should remain part of system logic rather than a class. Initially, I identified too many entities, including technical components like authentication handlers and database services. However, I realised that a domain model should focus only on **real-world concepts relevant to the problem domain**.

For example, entities such as **Patient, Doctor, Appointment, MedicalRecord, Bed, MedicationSchedule, and Notification** clearly represent real hospital operations. In contrast, something like "EmailService" is an implementation detail and does not belong in the domain model.

Refining the model to focus only on meaningful domain entities improved clarity and ensured that the diagram reflects the **business perspective of the system**, not just its technical implementation.

---

## Challenge 2: Defining Relationships Correctly

Another major challenge was correctly defining **relationships between classes**, particularly distinguishing between association, aggregation, and composition.

The most difficult decision involved the relationship between **Patient and MedicalRecord**. At first, I modeled this as a simple association, but after reviewing the system requirements and state diagrams, I realised that a medical record cannot exist independently of a patient. This led to the use of **composition**, indicating a strong lifecycle dependency.

Similarly, defining the relationship between **Appointment and MedicalRecord** required careful thought. While not every appointment creates a new record, most consultations generate or update one. Representing this as a **0..1 relationship** ensured flexibility while still capturing the system's behaviour.

The **Bed–Patient relationship** also required correction. Initially, it was unclear whether beds should own patients or vice versa. After reflecting on real-world hospital operations, I modelled this as a **bidirectional association**, where:
- A patient can be assigned to one bed at a time
- A bed can only be occupied by one patient at a time

These decisions improved the realism and correctness of the model.

---

## Challenge 3: Designing Meaningful Attributes and Methods

Defining attributes was relatively straightforward, as they are directly derived from requirements and use cases. However, defining **methods (behaviours)** was more complex.

Initially, I included very generic methods such as `update()` or `process()`, but these lacked meaning and did not reflect actual system actions. I then revisited the activity diagrams from Assignment 8 and extracted methods that directly correspond to real workflows.

For example:
- `book()` and `reschedule()` in Appointment align with booking workflows
- `markTaken()` in MedicationSchedule reflects patient interaction with reminders
- `writeMedicalRecord()` in Doctor aligns with the consultation workflow

This ensured that methods are not arbitrary but are grounded in **actual system behaviour**.

---

## Alignment with Previous Assignments

The class diagram is strongly aligned with earlier work:

- **Assignment 4 (Requirements):**
  - Entities like Appointment, Notification, and MedicalRecord directly support functional requirements such as booking, reminders, and digital records.
  
- **Assignment 5 (Use Cases):**
  - Each major use case (e.g., booking an appointment, updating records) is represented through class methods and relationships.

- **Assignment 6 (Agile Planning):**
  - User stories such as appointment booking and medication reminders are reflected in class responsibilities.

- **Assignment 8 (State & Activity Diagrams):**
  - State transitions (e.g., Appointment lifecycle) are supported by class attributes and methods.
  - Activity workflows map directly to method interactions across classes.

This alignment ensured consistency across all stages of the project and validated that the design is implementable.

---

## Trade-offs and Design Decisions

Several trade-offs were made during the design process:

### 1. Simplicity vs. Completeness
I chose to keep the diagram focused on **7 core entities**, even though additional entities (e.g., Receptionist, Admin, Payment) could have been included. This decision prioritised clarity and readability over completeness.

### 2. Inheritance vs. Separate Classes
I considered using inheritance (e.g., a base "User" class for Patient and Doctor), but decided against it to keep the model simpler and more explicit for this stage of the assignment.

### 3. Flexibility vs. Strict Constraints
Relationships such as Appointment → MedicalRecord were designed with flexible multiplicity (0..1) to accommodate different scenarios rather than enforcing rigid rules.

These trade-offs ensured that the model remains both **practical and understandable**.

---

## Lessons Learned About Object-Oriented Design

This assignment significantly improved my understanding of object-oriented design principles:

- **Encapsulation:** Each class is responsible for its own data and behaviour.
- **Separation of concerns:** Each entity has a clearly defined role.
- **Real-world mapping:** Good design mirrors real-world systems, making it easier to understand and maintain.
- **Traceability:** Every class and method should map back to a requirement or use case.

Most importantly, I learned that **a well-designed class diagram acts as a blueprint for implementation**, reducing ambiguity and guiding development decisions.

---

## Conclusion

The process of developing the domain model and class diagram transformed my understanding of system design. It required me to connect all previous assignments into a single, coherent structure. While challenging, it provided a clear view of how the system will function internally and prepared me for the next phase of implementation.

The final design reflects a balance between accuracy, simplicity, and alignment with stakeholder needs, making it a strong foundation for building the Rural Hospital Digital System.

---

*Word count: ~700 words*

*Document prepared by: [Your Full Name] | [Your Student Number] | CPUT | April 2026*
