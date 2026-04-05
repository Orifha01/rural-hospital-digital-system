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

