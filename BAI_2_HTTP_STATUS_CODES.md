### Chuẩn hóa mã lỗi HTTP cho Hệ thống Y tế

**TH1: Người dùng gửi yêu cầu đặt lịch khám nhưng bỏ trống tên bệnh nhân.**
* **Mã lỗi:** `400 Bad Request`
* **Giải thích:** Lỗi cú pháp hoặc thiếu dữ liệu bắt buộc từ phía Client (Validation error). Server từ chối xử lý do request không hợp lệ.

**TH2: Tìm kiếm hồ sơ bệnh án với ID là 999 nhưng trong Database không tồn tại.**
* **Mã lỗi:** `404 Not Found`
* **Giải thích:** Client gửi yêu cầu hợp lệ nhưng tài nguyên (hồ sơ mang ID 999) không được tìm thấy trên hệ thống.

**TH3: Hệ thống đang chạy thì Database MySQL bị sập, không thể truy vấn dữ liệu.**
* **Mã lỗi:** `500 Internal Server Error`
* **Giải thích:** Lỗi phát sinh từ phía Server (hệ thống backend gặp sự cố ngoài ý muốn, mất kết nối Database), khiến không thể thực hiện được yêu cầu.

**TH4: Người dùng nhập tuổi bệnh nhân là -5 (Dữ liệu không hợp lệ về mặt logic).**
* **Mã lỗi:** `400 Bad Request` (hoặc `422 Unprocessable Entity`)
* **Giải thích:** Yêu cầu gửi lên đúng định dạng nhưng chứa dữ liệu sai logic nghiệp vụ (vi phạm điều kiện Validation). Thuộc nhóm lỗi do Client cung cấp dữ liệu sai.