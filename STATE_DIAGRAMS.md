stateDiagram-v2
    [*] --> Idle
    Idle --> Active
    Active --> [*]
    Active --> Error
    Error --> Idle
    Error --> [*]