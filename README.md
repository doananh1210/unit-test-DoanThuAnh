# 

## 1. Mô tả bài toán
Viết chương trình Java với lớp StudentAnalyzer có 2 phương thức:
- `countExcellentStudents(List<Double> scores)`: đếm số học sinh điểm >= 8.0, bỏ qua điểm không hợp lệ (<0 hoặc >10).
- `calculateValidAverage(List<Double> scores)`: tính trung bình các điểm hợp lệ.

## 2. Cách clone project
```sh
git clone https://github.com/doananh1210/unit-test-DoanThuAnh.git
cd unit-test-DoanThuAnh
```

## 3. Cách biên dịch chương trình
```sh
javac -cp libs/junit-jupiter-api-5.10.0.jar;libs/junit-platform-console-standalone-1.10.0.jar -d . src/StudentAnalyzer.java test/StudentAnalyzerTest.java
```

## 4. Cách chạy test
```sh
java -jar libs/junit-platform-console-standalone-1.10.0.jar --class-path . --scan-class-path
```

## 5. Yêu cầu
- JDK 8 trở lên
- JUnit Jupiter (đã có sẵn file jar trong thư mục libs)

## 6. Tham khảo
- File mã nguồn: src/StudentAnalyzer.java
- File test: test/StudentAnalyzerTest.java