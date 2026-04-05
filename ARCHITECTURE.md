# 4. ARCHITECTURE.md

- Context Diagram
- Container Diagram
- Component Diagram

---

# 5. C4 Context Diagram

## System Architecture

```mermaid
graph TD

Doctor --> System
Nurse --> System
System --> Database
System --> ClinicalGuidelinesAPI
```

### Explanation

- **Doctor / Nurse** → Users of the system  
- **System** → Digital Decision Support System  
- **Database** → Stores patient records  
- **Clinical Guidelines API** → External medical data

---

# 6. Container Diagram

```mermaid
graph TD

User --> WebApp
WebApp --> BackendAPI
BackendAPI --> Database
BackendAPI --> DecisionSupportService
```

### Containers

- **Web Application** – Interface used by doctors and nurses  
- **Backend API** – Handles system logic and requests  
- **Decision Support Service** – Provides clinical recommendations  
- **Database** – Stores patient and medical data  

---

# 7. Component Diagram

```mermaid
graph TD

WebApp --> AuthComponent
WebApp --> PatientRecordComponent
PatientRecordComponent --> Database
DecisionSupportComponent --> ClinicalGuidelinesAPI
```

### Components

- **Authentication Component** – Manages login and user security  
- **Patient Record Component** – Handles patient information  
- **Decision Support Component** – Processes clinical guidelines  

---

# 8. End-to-End Components 

**User → Interface → Backend → Services → Database → External Systems**
