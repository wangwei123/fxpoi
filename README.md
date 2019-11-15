# fxpoi

fxpoi is a Flutter plugins for read/export excel, csv.

## Getting Started

1. Depend on it 
Add this to your package's pubspec.yaml file:

```yaml
dependencies:
  fxpoi: ^1.0.0
```

2. Install it 
You can install packages from the command line: 

with Flutter:

```
$ flutter pub get
``` 
Alternatively, your editor might support flutter pub get. Check the docs for your editor to learn more.

3. Import it 
Now in your Dart code, you can use:

```dart

import 'package:fxpoi/fxpoi.dart';

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

