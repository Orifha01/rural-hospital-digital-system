# Agile Planning Document

## 1. User Stories

| Story ID | User Story | Acceptance Criteria | Priority |
|----------|------------|--------------------|----------|
| US-001 | As a doctor, I want to view patient records so that I can make informed decisions | Records load within 2 seconds | High |
| US-002 | As a nurse, I want to record patient vital signs so that patient data is updated | All fields must be completed before saving | High |
| US-003 | As a doctor, I want treatment recommendations so that I can improve diagnosis accuracy | Recommendations must be based on stored guidelines | High |
| US-004 | As an admin, I want to generate reports so that I can monitor hospital performance | Reports generated within 5 seconds | Medium |
| US-005 | As an IT staff member, I want to manage users so that system access is controlled | Role-based access enforced | High |
| US-006 | As a researcher, I want to export anonymized data so that I can conduct research | No personal identifiers included | Medium |
| US-007 | As a user, I want to log in securely so that unauthorized access is prevented | Login fails after 5 incorrect attempts | High |
| US-008 | As a patient, I want my records stored securely so that my data is protected | Data encrypted using AES-256 | High |
| US-009 | As a doctor, I want to update diagnosis so that patient treatment is accurate | Updates saved successfully | Medium |


## 2. Product Backlog

| Story ID | User Story | Priority (MoSCoW) | Effort (Story Points) | Dependencies |
|----------|------------|-------------------|----------------------|--------------|
| US-001 | View patient records | Must-have | 5 | Database |
| US-002 | Record vital signs | Must-have | 3 | Login |
| US-003 | Treatment recommendations | Must-have | 5 | Patient data |
| US-007 | Secure login | Must-have | 3 | None |
| US-005 | Manage users | Should-have | 4 | Login |
| US-004 | Generate reports | Should-have | 3 | Database |
| US-006 | Export data | Could-have | 2 | Reports |
| US-009 | Update diagnosis | Could-have | 2 | Patient records |
| US-008 | Data encryption | Must-have | 5 | System security |


### Backlog Prioritization Justification

Must-have features are critical to system functionality, such as viewing patient records, login, and treatment recommendations. 
These directly address stakeholder needs for usability, security, and decision-making.

Should-have features improve system management and reporting but are not required for the initial MVP.

Could-have features enhance the system but can be implemented later without affecting core functionality.


## 3. Sprint Planning

### Sprint Goal
Implement core patient management features including login, viewing patient records, and recording vital signs to deliver a functional MVP.

---

### Selected User Stories for Sprint
- US-001: View patient records
- US-002: Record vital signs
- US-007: Secure login
- US-003: Treatment recommendations

---

### Sprint Backlog

| Task ID | Task Description | Assigned To | Estimated Hours | Status |
|--------|----------------|-------------|----------------|--------|
| T-001 | Develop login authentication | Dev | 8 | To Do |
| T-002 | Design login UI | Dev | 6 | To Do |
| T-003 | Create patient database | Dev | 10 | To Do |
| T-004 | Develop patient record API | Dev | 8 | To Do |
| T-005 | Build vital signs input form | Dev | 6 | To Do |
| T-006 | Implement decision support logic | Dev | 10 | To Do |


## 4. Reflection

One of the most challenging aspects of this assignment was translating structured system requirements into Agile user stories. 
While the requirements from previous assignments were detailed and technical, Agile requires breaking them into smaller, 
user-focused increments that deliver value.

A major difficulty was ensuring that each user story followed the INVEST principles. Some requirements were too broad, 
which made them difficult to convert into small, testable stories. This required breaking them down further while still 
maintaining their original intent.

Prioritization was another challenge. As the only stakeholder in this project, I had to critically evaluate which features 
were essential for the minimum viable product and which could be delayed. This created internal conflict, as I wanted to 
include as many features as possible, but Agile methodology emphasizes delivering value quickly rather than building 
everything at once.

Effort estimation was also difficult because it required predicting how complex each feature would be without actual 
implementation. Assigning story points forced me to think carefully about the relative difficulty of each task.

Sprint planning highlighted the importance of focusing on achievable goals. It was tempting to include many features in 
the sprint, but doing so would reduce the chances of completing them successfully. Limiting the sprint to core features 
helped maintain focus and realism.

Overall, this assignment improved my understanding of how Agile methodology works in practice. It showed the importance 
of prioritization, incremental development, and continuous refinement of system requirements.


