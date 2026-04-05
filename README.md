# rural-hospital-digital-system
This project proposes a digital system designed to support clinical decision-making in rural hospitals.  The system will allow healthcare workers to access patient records, receive clinical decision support,  and manage patient information through a centralized platform.
The goal of the system is to improve patient care, reduce medical errors, and support healthcare 
professionals in making informed clinical decisions.

## Project Documentation


# Use Case Specifications

## UC1: User Login
Actor: Doctor, Nurse, Administrator, IT Staff, Researcher  
Description: Allows authorized users to access the system securely.

Preconditions:
- User must be registered in the system.

Postconditions:
- User is successfully logged in.

Basic Flow:
1. User enters username and password.
2. System verifies credentials.
3. System grants access.

Alternative Flow:
- If credentials are incorrect, the system displays an error message.

---

## UC2: View Patient Records
Actor: Doctor

Preconditions:
- Doctor must be logged in.

Postconditions:
- Patient records are displayed.

Basic Flow:
1. Doctor searches for patient.
2. System retrieves patient information.
3. System displays patient records.

Alternative Flow:
- If patient does not exist, the system displays "Patient not found".

---

## UC3: Record Vital Signs
Actor: Nurse

Preconditions:
- Nurse must be logged in.

Postconditions:
- Patient vital signs are saved.

Basic Flow:
1. Nurse selects a patient.
2. Nurse enters vital signs.
3. System saves the data.

Alternative Flow:
- If required fields are missing, the system shows an error.

---

## UC4: Generate Treatment Recommendation
Actor: Doctor

Preconditions:
- Patient record must exist.

Postconditions:
- System generates a treatment suggestion.

Basic Flow:
1. Doctor selects patient symptoms.
2. System processes the information.
3. System displays treatment recommendations.

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


