# fxpoi

fxpoi is a Flutter plugins for read/export excel, csv.

## Getting Started
 
 1. Read excel/csv to list
 ```dart
 import 'package:fxpoi/fxpoi.dart';
 
 var filePath = "/usr/local/users.csv"; // or users.xls|xlsx
 int offsetLine = 0;
 int limitLine = 1000;
 var list = await Fxpoi.readExcelCSVByPage(
                          filePath, offsetLine, limitLine);
 for (int i = 0; i <= list.length; i++) {
   var item = list[i];
   debugPrint("item: $item \n");
   debugPrint("item1: ${item[0]} \n");
   debugPrint("item2: ${item[1]} \n");
 }
 
 ```
 
  2. Get the number of excel/csv rows
   ```dart
 import 'package:fxpoi/fxpoi.dart';
 
 var filePath = "/usr/local/users.xls"; // or users.csv|xlsx
 int rowCount = await Fxpoi.getRowCount(filePath);
 
 ```

