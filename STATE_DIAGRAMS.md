Rural Hospital Digital System
Overview

This document models the lifecycle of 7 critical objects in the Rural Hospital Digital System using UML state transition diagrams (Mermaid). Each diagram defines:

Object states
Transitions triggered by system/user events
Guard conditions ensuring valid state changes

These diagrams align directly with functional requirements (Assignment 4) and user stories (Assignment 6).

🧩 Object 1: Patient Appointment
Explanation
State	Description
Requested	Appointment submitted but not confirmed
Confirmed	Slot approved and scheduled
CheckedIn	Patient physically present
InConsultation	Doctor actively consulting
Completed	Consultation finished
NoShow	Patient failed to attend
Cancelled	Appointment terminated
Expired	Request timed out
Traceability
FR-03: Book appointment
FR-04: Cancel appointment
FR-11: Generate attendance reports
US-004, US-005
stateDiagram-v2
    [*] --> Requested : Patient requests appointment

    Requested --> Confirmed : [slot available] Staff approves
    Requested --> Cancelled : Patient cancels
    Requested --> Expired : No confirmation within 24h

    Confirmed --> CheckedIn : Patient arrives at hospital
    Confirmed --> Cancelled : Patient cancels before visit
    Confirmed --> NoShow : Patient does not arrive

    CheckedIn --> InConsultation : Doctor begins consultation
    InConsultation --> Completed : Doctor finishes consultation

    NoShow --> Cancelled : Admin closes appointment
    Cancelled --> [*]
    Completed --> [*]
    Expired --> [*]
    
🧩 Object 2: Patient Record
Explanation
stateDiagram-v2
    [*] --> Created : Patient registered

    Created --> Active : First visit recorded
    Active --> Updated : Doctor adds notes
    Updated --> Active : Save successful

    Active --> Archived : Patient inactive
    Archived --> Active : Patient returns

    Active --> PendingDeletion : Data removal request
    PendingDeletion --> Deleted : Data erased

    Deleted --> [*]
Tracks lifecycle of digital medical records.

Traceability
FR-10: Digital records
NFR-SEC: Data privacy compliance
🧩 Object 3: Doctor Availability
Explanation

Controls booking visibility and scheduling accuracy.

🧩 Object 4: Bed Allocation
Explanation
stateDiagram-v2
    [*] --> Available

    Available --> Busy : Assigned to patient
    Busy --> Available : Consultation finished

    Available --> OnLeave : Doctor unavailable
    OnLeave --> Available : Returns to work

    Available --> Suspended : Admin action
    Suspended --> Available : Reinstated

    Suspended --> [*]
    
Tracks hospital bed usage — critical for rural hospitals.

Traceability
FR-08: Patient admission
FR-09: Bed management
🧩 Object 5: Medication Schedule
Explanation
stateDiagram-v2
    [*] --> Free

    Free --> Reserved : Patient admitted
    Reserved --> Occupied : Patient assigned

    Occupied --> Cleaning : Patient discharged
    Cleaning --> Free : Ready for next patient

    Reserved --> Cancelled : Admission cancelled
    Cancelled --> Free

    Free --> [*]
Ensures proper medication adherence.

🧩 Object 6: Lab Test
Explanation
stateDiagram-v2
    [*] --> Requested

    Requested --> InProgress : Lab begins test
    InProgress --> Completed : Results ready

    Requested --> Cancelled : Test cancelled

    Completed --> Reviewed : Doctor reviews results
    Reviewed --> Archived

    Cancelled --> [*]
    Archived --> [*]
Tracks diagnostic workflows.

🧩 Object 7: Notification
Explanation
stateDiagram-v2
    [*] --> Queued

    Queued --> Sending
    Sending --> Delivered
    Sending --> Failed

    Failed --> Retrying
    Retrying --> Delivered
    Retrying --> Failed

    Delivered --> Read
    Read --> Archived

    Archived --> [*]
Handles reminders and alerts reliably.
