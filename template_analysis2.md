# template_analysis.md – GitHub Project Template Analysis and Selection

## Rural Hospital Digital Decision Support System

---

## 1. GitHub Project Templates — Comparison Table

| Feature | Basic Kanban | Automated Kanban | Bug Triage | Team Planning |
|---|---|---|---|---|
| **Default Columns** | To Do, In Progress, Done | To Do, In Progress, Done | Needs Triage, High Priority, Low Priority, Closed | Backlog, Ready, In Progress, In Review, Done |
| **Automation Features** | None | Auto-moves issues based on PR activity | Auto-closes issues and supports triage | Supports workflow automation and iteration tracking |
| **Sprint Support** | No | Limited | No | Yes (Iteration fields) |
| **Custom Fields** | No | Limited | Limited | Yes (Story points, priority, sprint) |
| **Workflow Complexity** | Simple | Moderate | Issue-focused | Full Agile workflow |
| **Best Use Case** | Small projects | Continuous delivery | Bug tracking | Agile development |
| **Agile Suitability** | Low | Medium | Low | High |
| **Ease of Setup** | Very easy | Easy | Easy | Moderate |
| **Suitable for This System** | No | Partial | No | Yes ✅ |

---

## 2. Template Selection Justification

The **Team Planning template** was selected as the most suitable option for the Rural Hospital Digital Decision Support System because it aligns closely with Agile development practices established in previous assignments.

### Reason 1: Sprint-Based Development Support
The system follows a structured Agile approach with defined sprints and backlog prioritisation. Team Planning provides **iteration (sprint) support**, allowing tasks to be grouped and tracked across development cycles.

### Reason 2: Realistic Workflow Representation
The default workflow (Backlog → Ready → In Progress → In Review → Done) reflects real-world software development processes. This is important for the system, where features such as patient record management and appointment scheduling must go through development, validation, and testing.

### Reason 3: Custom Fields for Agile Metrics
The template supports **story points, priority levels, and sprint assignment**, enabling better tracking of workload, progress, and performance.

### Reason 4: Integration with GitHub Issues
Each task can be linked directly to GitHub Issues, ensuring traceability from stakeholder requirements (Assignment 4) to implementation tasks (Assignment 6).

---

## 3. Customisation Strategy

The following customisations were made to adapt the template to the system:

| Customisation | Purpose |
|---|---|
| Added **Testing** column | Ensures system features are validated before completion |
| Added **Blocked** column | Highlights tasks with dependencies or delays |
| Added **Story Points field** | Tracks effort estimation |
| Added **Sprint field** | Links tasks to sprint cycles |
| Added labels (must-have, bug, feature) | Improves task prioritisation and tracking |

---

## 4. Conclusion

The Team Planning template provides the best balance between structure, flexibility, and Agile support. It enables efficient workflow management, improves visibility, and aligns with the system’s development process.
