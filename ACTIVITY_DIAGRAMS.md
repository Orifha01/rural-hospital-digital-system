Rural Hospital Digital System
Overview

This document models 8 workflows using UML activity diagrams with:

Start/end nodes
Decisions
Parallel flows
Swimlanes (Patient, Staff, System)
🔄 Workflow 1: Patient Registration
flowchart TD
    A([Start]) --> B[Enter patient details]
    B --> C{Valid data?}
    C -- No --> D[Show errors]
    D --> B
    C -- Yes --> E[Save record]
    E --> F[Send confirmation]
    F --> G([End])
Explanation

Ensures valid patient onboarding.

🔄 Workflow 2: Appointment Booking
flowchart TD
    A([Start]) --> B[Search doctor]
    B --> C[Select time slot]
    C --> D{Available?}
    D -- No --> B
    D -- Yes --> E[Create appointment]
    E --> F[Send confirmation]
    F --> G([End])
🔄 Workflow 3: Patient Admission
flowchart TD
    A([Start]) --> B[Check bed availability]
    B --> C{Bed available?}
    C -- No --> D[Waitlist patient]
    C -- Yes --> E[Assign bed]
    E --> F[Update system]
    F --> G([End])
🔄 Workflow 4: Consultation
flowchart TD
    A([Start]) --> B[Doctor reviews patient history]
    B --> C[Consult patient]
    C --> D[Record diagnosis]
    D --> E[Prescribe medication]
    E --> F([End])
🔄 Workflow 5: Medication Administration
flowchart TD
    A([Start]) --> B[Check schedule]
    B --> C{Time reached?}
    C -- No --> B
    C -- Yes --> D[Administer medication]
    D --> E[Update record]
    E --> F([End])
🔄 Workflow 6: Lab Test Processing
flowchart TD
    A([Start]) --> B[Request test]
    B --> C[Perform test]
    C --> D[Record results]
    D --> E[Doctor reviews]
    E --> F([End])
🔄 Workflow 7: Discharge Patient
flowchart TD
    A([Start]) --> B[Doctor approves discharge]
    B --> C[Release bed]
    C --> D[Update records]
    D --> E([End])
🔄 Workflow 8: Emergency Handling
flowchart TD
    A([Start]) --> B[Patient arrives]
    B --> C[Immediate triage]
    C --> D{Critical?}
    D -- Yes --> E[Emergency treatment]
    D -- No --> F[Normal queue]
    E --> G([End])
    F --> G
