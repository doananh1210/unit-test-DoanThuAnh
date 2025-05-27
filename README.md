# StudentAnalyzer - Unit Test
## 1. Mô tả bài toán
Viết chương trình Java với lớp StudentAnalyzer có 2 phương thức:
- `countExcellentStudents(List<Double> scores)`: đếm số học sinh điểm >= 8.0, bỏ qua điểm không hợp lệ (<0 hoặc >10).
- `calculateValidAverage(List<Double> scores)`: tính trung bình các điểm hợp lệ.

## 2. Cấu trúc thư mục
- `src/StudentAnalyzer.java`: Mã nguồn chính
- `test/StudentAnalyzerTest.java`: Test JUnit

## 3. Cách clone project
```sh
git clone https://github.com/doananh1210/unit-test-DoanThuAnh.git
cd unit-test-DoanThuAnh
```

## 4. Cách biên dịch chương trình
```sh
javac -cp ".;libs/junit-platform-console-standalone-1.10.0.jar" -d out src/StudentAnalyzer.java test/StudentAnalyzerTest.java
```

## 5. Cách chạy test
```sh
java -jar libs/junit-platform-console-standalone-1.10.0.jar --class-path out --scan-class-path
```

## 6. Đo và xem báo cáo bao phủ kiểm thử (Test Coverage)
### a. Chạy test với JaCoCo để sinh file coverage
```sh
java -javaagent:libs/org.jacoco.agent-0.8.11-runtime.jar=destfile=jacoco.exec -jar libs/junit-platform-console-standalone-1.10.0.jar --class-path out --scan-class-path
```
### b. Sinh báo cáo HTML từ file coverage
```sh
java -jar libs/org.jacoco.cli-0.8.11-nodeps.jar report jacoco.exec --classfiles out --sourcefiles src --html report
```
### c. Xem kết quả
- Mở file `report/index.html` để xem chi tiết mức độ bao phủ kiểm thử.
- Kết quả hiện tại: **100% coverage** cho các phương thức đã test.

## 7. Yêu cầu
- JDK 8 trở lên
- JUnit Jupiter (đã có sẵn file jar trong thư mục libs)