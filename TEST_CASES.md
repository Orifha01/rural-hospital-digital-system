# Test Cases

| Test Case ID | Requirement ID | Description | Steps | Expected Result | Actual Result | Status |
|------------|---------------|------------|------|---------------|--------------|-------|
| TC001 | FR1 | User login with valid credentials | Enter username and password | User logged in successfully |  |  |
| TC002 | FR1 | User login with invalid password | Enter wrong password | Error message displayed |  |  |
| TC003 | FR2 | View patient records | Search patient ID | Patient records displayed |  |  |
| TC004 | FR3 | Record vital signs | Enter patient vitals | Data saved successfully |  |  |
| TC005 | FR4 | Generate treatment recommendation | Select symptoms | System generates recommendation |  |  |
| TC006 | FR5 | Generate reports | Click generate report | Report displayed |  |  |
| TC007 | FR6 | Export anonymized data | Click export | File downloaded |  |  |
| TC008 | FR7 | Manage users | Add new user | User added successfully |  |  |

## Non-Functional Test Scenarios

Performance Test:
Simulate 1,000 users accessing the system at the same time.
Expected Result: System response time must be less than 2 seconds.

Security Test:
Attempt login using incorrect credentials multiple times.
Expected Result: System must block the user after 5 failed attempts.

