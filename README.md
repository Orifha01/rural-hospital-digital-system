# 🏥 Rural Hospital Digital Decision Support System

## Project Overview

The **Rural Hospital Digital Decision Support System (RHDSS)** is a web-based healthcare system designed to improve patient care and operational efficiency in rural hospitals. The system provides digital tools for managing patient information, assisting clinical decisions, scheduling appointments, and improving communication between healthcare staff and patients.

This system aims to replace manual processes commonly used in rural healthcare facilities with a reliable, accessible, and scalable digital solution.

---

## 🌍 Problem Statement

Many rural hospitals face challenges such as:

- Paper-based patient records that are easily lost or damaged  
- Long waiting times due to manual scheduling  
- Limited access to patient history for informed decision-making  
- Poor communication regarding follow-up care and medication  
- Inefficient tracking of patient treatments and outcomes  

The Rural Hospital Digital Decision Support System addresses these issues by providing a centralized digital platform for managing healthcare services.

---

## ✅ Key Features

### 📂 Digital Patient Records
Stores patient medical history, diagnosis, prescriptions, and test results digitally for quick access by healthcare professionals.

### 🧠 Decision Support
Assists doctors with clinical decision-making by providing patient history, alerts, and relevant recommendations.

### 📅 Appointment Management
Allows scheduling, rescheduling, and tracking of patient appointments to reduce waiting times.

### 🔔 Notifications & Alerts
Sends reminders for:
- Appointments  
- Medication schedules  
- Follow-up visits  

### 👨‍⚕️ Staff Dashboard
Enables doctors and administrators to:
- View patient records  
- Manage schedules  
- Monitor patient progress  

---

## 📂 Project Documentation

### Assignment 3 — System Specification & Architecture
- `SPECIFICATION.md` – System description, domain, and scope  
- `ARCHITECTURE.md` – C4 diagrams and system structure  

### Assignment 4 — Requirements Engineering
- `STAKEHOLDERS.md` – Stakeholder analysis  
- `SRD.md` – Functional and non-functional requirements  
- `REFLECTION.md` – Requirements challenges  

### Assignment 5 — Use Case Modelling
- `USE_CASE_DIAGRAM.md` – UML use case diagram  
- `USE_CASE_SPECS.md` – Detailed use case specifications  
- `TEST_CASES.md` – Functional and non-functional test cases  

### Assignment 6 — Agile Planning
- `AGILE_PLANNING.md` – User stories, backlog, and sprint plan  
- `REFLECTION_A6.md` – Agile planning challenges  

### Assignment 7 — Kanban Board Implementation
- `template_analysis.md` – Template comparison and justification  
- `kanban_explanation.md` – Kanban board explanation  
- `reflection.md` – Lessons learned  

---
📊 Assignment 8 — State & Activity Modeling

This assignment focuses on modeling the dynamic behaviour of the Rural Hospital Digital System using UML diagrams. It builds on the system requirements (Assignment 4), use cases (Assignment 5), and Agile planning (Assignment 6) to show how the system behaves internally and across workflows.

📂 Documents
Document	Description
STATE_DIAGRAMS.md
	7 UML state transition diagrams showing object lifecycles (Appointment, Patient Record, Doctor Availability, Bed Allocation, Medication Schedule, Lab Test, Notification)
ACTIVITY_DIAGRAMS.md
	8 UML activity diagrams showing workflows (Registration, Booking, Admission, Consultation, Medication, Lab Tests, Discharge, Emergency Handling)
a8_reflection.md
	Reflection on challenges in modeling system behaviour, granularity, and alignment with Agile
🔁 State Modeling (Object Behaviour)

State diagrams define how key system objects change over time.

Key Objects Modeled:
Appointment — Request → Confirmed → Completed / Cancelled / NoShow
Patient Record — Created → Active → Archived → Deleted
Doctor Availability — Available → Busy → On Leave
Bed Allocation — Free → Reserved → Occupied → Cleaning
Medication Schedule — Scheduled → Due → Administered / Missed
Lab Test — Requested → In Progress → Completed → Reviewed
Notification — Queued → Sending → Delivered / Failed

📌 These diagrams ensure:

Accurate tracking of hospital operations
Clear lifecycle management of critical resources
Alignment with functional requirements (FR-03, FR-08, FR-10, etc.)
🔄 Activity Modeling (Workflow Behaviour)

Activity diagrams represent end-to-end system workflows involving multiple actors.

Key Workflows Modeled:
Patient Registration
Appointment Booking
Patient Admission
Doctor Consultation
Medication Administration
Lab Test Processing
Patient Discharge
Emergency Handling

📌 These workflows demonstrate:

Step-by-step process flow
Decision-making logic (e.g., availability checks)
Parallel operations (e.g., notifications + updates)
Actor responsibilities (Patient, Doctor, System, Admin)
🔗 Traceability

All diagrams are linked to previous assignments:

Artifact	Source
Functional Requirements	Assignment 4 (SRD.md)
Use Cases	Assignment 5 (USE_CASE_SPECS.md)
User Stories	Assignment 6 (AGILE_PLANNING.md)

This ensures full traceability from:

Requirement → Use Case → User Story → System Behaviour

⚙️ Why This Matters

Modeling system behaviour is critical because it:

Prevents logical errors before implementation
Identifies missing requirements (e.g., NoShow, Reserved states)
Improves system reliability in a healthcare environment
Prepares the system for development and testing

In a rural hospital context, where resources are limited and efficiency is critical, these models help ensure that the system behaves predictably and supports real-world healthcare workflows.

## 📊 Kanban Board

This project uses a customized GitHub Project board based on the **Team Planning template** to manage Agile workflows.

### Column Structure

| Column | Purpose |
|---|---|
| Backlog | All identified tasks not yet scheduled |
| Ready | Tasks prepared for development |
| In Progress | Tasks currently being worked on |
| Blocked | Tasks delayed due to dependencies |
| Testing | Tasks being validated |
| Done | Completed and verified tasks |

---

### ⚙️ Customisation Decisions

| Customisation | Reason |
|---|---|
| Added **Testing** column | Ensures all tasks are validated before completion |
| Added **Blocked** column | Tracks dependencies and delays |
| Added **Story Points field** | Supports effort estimation |
| Added **Sprint field** | Tracks sprint progress |

---

### 📌 Work-In-Progress (WIP) Limits

| Column | Limit |
|---|---|
| In Progress | 3 |
| Testing | 3 |
| Blocked | 3 |

WIP limits prevent task overload and improve workflow efficiency.

---

### 🏷️ Labels Used

| Label | Meaning |
|---|---|
| `must-have` | Core system functionality |
| `should-have` | Important features |
| `could-have` | Optional features |
| `bug` | System defects |
| `feature` | Functional requirements |

---

### 🔗 Traceability

Each task is linked to:
- Requirements (Assignment 4)
- Use cases (Assignment 5)
- User stories (Assignment 6)

This ensures full traceability from stakeholder needs to implementation.

---

## 🛠️ Technology Stack (Planned)

- **Frontend:** React.js  
- **Backend:** Node.js + Express  
- **Database:** PostgreSQL  
- **Authentication:** JWT  
- **Notifications:** Email (SMTP)  
- **Hosting:** Render / Railway  

---

## 📌 Accessing the Kanban Board

👉 Navigate to the **Projects** tab in this repository to view the live Kanban board.

---

## 👤 Author

**ORIFHA MAUNGEDZO**  
Student Number: 219333289  
Cape Peninsula University of Technology  
Module: Software Engineering  
Date: 2026
