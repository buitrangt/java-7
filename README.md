# Dự Án Mô Hình Phương Tiện Giao Thông

Dự án này mô phỏng các loại phương tiện khác nhau trong hệ thống giao thông bằng ngôn ngữ Java.

## Chi Tiết Triển Khai

- Triển khai một giao diện chung `Moveable` để đại diện cho khả năng di chuyển.
- Sử dụng một lớp trừu tượng `Vehicle` để biểu diễn các đặc điểm chung và hành vi của phương tiện.
- Tạo các lớp phương tiện cụ thể (`Car`, `Bicycle`, `Truck`, `Boat`) kế thừa từ lớp trừu tượng `Vehicle` và triển khai giao diện `Moveable`.


## Lý Do Chọn Lớp Trừu Tượng và Giao Diện

### 1. Tính Linh Hoạt và Mở Rộng

- **Lớp Trừu Tượng:** sử dụng lớp trừu tượng để đóng gói các đặc điểm chung của các phương tiện. Điều này giúp duy trì tính chất linh hoạt trong quá trình thêm mới các loại phương tiện mà không cần sửa đổi cấu trúc cơ sở.

- **Giao Diện:** Giao diện `Moveable` giúp đảm bảo rằng tất cả các loại phương tiện đều có khả năng di chuyển. Nó cung cấp một sự thống nhất trong hành vi chung mà mọi phương tiện đều nên có.

### 2. Tính Kế Thừa và Đa Hình

- Sử dụng kế thừa giữa lớp cơ sở và các lớp con giúp giảm thiểu sự trùng lặp mã nguồn và tạo ra một cấu trúc hiệu quả với tính đa hình.
## Hướng Dẫn Chạy

1. Sao chép repository về máy của bạn.
2. Mở và biên dịch các tệp Java trong thư mục `src`.
3. Chạy ứng dụng và quan sát kết quả.


