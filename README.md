# fxpoi

fxpoi is a Flutter plugins for read/export excel, csv.

## Getting Started

1. Clone fxpoi repository to local
2. Copy fxpoi project to yourproject/plugins folder
3. Configure yourproject/pubspec.yaml as follows:

```yaml
dependencies:
  flutter:
    sdk: flutter

  fxpoi:
    path: ./plugins/fxpoi
 ```
 
 4. Read excel/csv to list
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
   debugPrint("item3: ${item[2]} \n");
 }
 
 ```
 
  5. Get the number of excel/csv rows
   ```dart
 import 'package:fxpoi/fxpoi.dart';
 
 var filePath = "/usr/local/users.xls"; // or users.csv|xlsx
 int rowCount = await Fxpoi.getRowCount(filePath);
 
 ```

