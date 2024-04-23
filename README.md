# SmartDataSolution
## Java Programming Aptitude Test: Membership Data Converter

---

## Scenario

A client has provided us with a file named "Members.txt" containing basic information about their current membership. This file is in a fixed-column format, with fields ordered as follows:
- ID (12 characters)
- Last Name (25 characters)
- First Name (25 characters)
- Address (30 characters)
- City (20 characters)
- State (4 characters)
- ZIP (5 characters)

The client's business partner prefers to receive the member data in comma-separated value (CSV) file format. Additionally, they have requested the following:
- The member data file must be split by state, with each split file having a state prefix (e.g., 'NY_outputFile.csv', 'MN_outputFile.csv').
- They will not accept a file that has duplicate member records in it.
- The fields should be in the following order in the CSV file(s): [id, first name, last name, address, city, zip].

---

## Task

Complete the Main class to perform the conversion described above. You may need to work on the incomplete code in other classes as well.

### Note

- Use the classes MemberExporterImpl and MemberImporterImpl to avoid code duplication.
- You are not allowed to modify the input files.
- You are not allowed to add any additional class (except for utility functions).
- You may use Internet resources as required.

---

## Usage

To use this program, follow these steps:
1. Ensure that the input file "Members.txt" is available in the program directory.
2. Compile the Java program.
3. Run the Main class.
4. Check the output files in the same directory, named according to the state (e.g., "NY_outputFile.csv", "MN_outputFile.csv").

---

## File Structure

The structure of the project is as follows:
- *Main.java*: Entry point of the program.
- *Member.java*: Represents a member with ID, last name, first name, address, city, state, and ZIP fields.
- *MemberExporter.java*: Interface for exporting member data.
- *MemberExporterImpl.java*: Implementation of the member exporter interface.
- *MemberImporter.java*: Interface for importing member data.
- *MemberImporterImpl.java*: Implementation of the member importer interface.
- *Members.txt*: Input file containing membership data in fixed-column format.
- *README.md*: This documentation file.
