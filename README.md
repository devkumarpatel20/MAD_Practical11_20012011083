# MAD_Practical11_20012011083

AIM: Create Note Android Application that can add Note, edit Note, delete Note, and set reminder date & time of note. By using Broadcast Receiver, AlarmManager set reminder of note. By using SQLite, store all notes data.

Create two Activities like MainActivity, NoteViewActivity according to below UI design.

Use RecyclerView Code from Practical-9 to display Note Data.

Use Broadcast Receiver, Time Picker Dialog, service & AlarmManager code from Practical-7

Create Note class with member variables like id, title, subTitle, Description, modifiedTime, reminderTime:Long, isReminderEnable:Boolean & create membor methods like getCurrentDateTime(), getMillis(), setReminder(), isValid(), getReminderText(), saveNote(), getHour(), getMinute(), calculateReminder() 

Create DatabaseHelper Class for SQlite with member methods like insertNote(), getNote(id), getAllNotes(), getNotesCount(), updateNote(), deleteNote().

Use Databinding in gradle file to easy way integrate xml into kotlin file

Use Material 3 design for UI

create class NotesData with companion object and it will store column name of table and create table query.

Create NoteViewActivity. It will show while reminder notification is turned up and user click on notification. It will also show when click on Note in recyclerView. After clicking on notification NoteViewActivity should be open with full description of that note. 

Note should be deleted by clicking on icon of Delete. Note should not be added if any one field of note is empty.

Some notes have reminder time so add reminder time in alarmManager with note id & it should be receive in broadcast receiver & in broadcast receiver notification should be generated with title & description of note.

If More than one notes have reminder time then notification should be displayed for each note separately.

Create Common Custom Dialog Box for add, edit note.

Create RecyclerView & its adapter to display all notes.

![image](https://user-images.githubusercontent.com/110648378/202483160-e9eda3aa-3c1a-4b0d-b391-d09e31186aa1.png)
![image](https://user-images.githubusercontent.com/110648378/202483303-c78c413a-18e3-48c9-a3ed-d20d564e86e3.png)
![image](https://user-images.githubusercontent.com/110648378/202483334-4218c21c-a5f4-43ae-8d1f-35321d95ce80.png)
![image](https://user-images.githubusercontent.com/110648378/202483349-ad8c4d3c-a6bc-4c09-8fba-3d8139aacf13.png)
![image](https://user-images.githubusercontent.com/110648378/202483382-cc675a14-650e-45e7-81b1-421788ba7c24.png)


