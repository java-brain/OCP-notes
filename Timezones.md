Greenwich Mean Time is a time zone in Europe that is used as time zone zero when discussing offsets. 

Figuring out how far apart are these moments in time, to approach a problem like this, you subtract the time zone from the time:

2015-06-20T07:50+02:00[Europe/Paris] // GMT 2015-06-20 5:50
2015-06-20T06:50+05:30[Asia/Kolkata] // GMT 2015-06-20 1:20

Note:
  The time zone offset can be listed in different ways: +02:00, GMT+2, and UTC+2 all mean the same thing. You might see any of them on the   exam.

  The examples in the book will be using U.S. date and time formats as will the questions on the exam. Java tends to use a 24-hour clock
  even though the United States uses a 12-hour clock with a.m./p.m

Method signatures:
  public static LocalDate of(int year, int month, int dayOfMonth)
  public static LocalDate of(int year, Month month, int dayOfMonth)
  
