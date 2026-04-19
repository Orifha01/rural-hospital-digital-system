rural Hospital Digital System
Introduction

This assignment forced me to shift from thinking about features to thinking about system behaviour over time. Instead of asking “what should the system do?”, I had to ask “what happens to the system when something happens?”. This difference made the assignment significantly more challenging than previous ones.

Challenge 1: Choosing the Right Level of Detail

One of the biggest struggles was deciding how detailed my diagrams should be. At first, I created very simple state diagrams with only a few states, but they did not fully capture real-world hospital processes. For example, an appointment is not just “booked” and “done.” There are situations like patients not showing up, cancelling, or arriving late.

Adding states like NoShow, Expired, and CheckedIn made the diagram more realistic but also more complex. I realized that complexity is necessary when it reflects real-world behaviour, especially in a healthcare system where every state matters for reporting and decision-making.

Challenge 2: Understanding System vs User Perspective

Another major difficulty was aligning diagrams with Agile user stories. User stories are written in simple language focusing on the user, such as “As a patient, I want to book an appointment.” However, the system must handle many hidden steps, such as checking availability, reserving slots, and handling conflicts.

This forced me to translate user intentions into system logic. It became clear that user stories only describe outcomes, while diagrams describe the actual processes that make those outcomes possible.

Challenge 3: Managing Workflow Complexity

Activity diagrams became difficult when workflows involved multiple actors like patients, doctors, and administrators. At first, my diagrams were too detailed and hard to read. I had to simplify them by focusing only on key actions and decisions.

This helped me understand that diagrams are not meant to show every technical detail, but rather to communicate system behaviour clearly.

State vs Activity Diagrams
Aspect	State Diagrams	Activity Diagrams
Focus	Object lifecycle	Process workflow
Purpose	Show states and transitions	Show steps and decisions
Strength	Good for tracking objects	Good for modelling processes

State diagrams helped me understand how system objects evolve, while activity diagrams showed how users interact with the system.

Key Lesson Learned

The most important lesson I learned is that diagramming exposes hidden requirements. For example, the need for a “Reserved” state in booking only became obvious when modelling the system. Without it, double-booking could occur.

This assignment showed me that good system design requires more than writing requirements — it requires visualizing how the system behaves under real conditions.

Conclusion

Although this assignment was difficult, it significantly improved my understanding of system design. It helped me bridge the gap between requirements and implementation, and it showed me how important modelling is in building reliable systems, especially in critical environments like rural hospitals.
