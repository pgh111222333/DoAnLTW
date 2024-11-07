window.onload = function() {
    const urlParams = new URLSearchParams(window.location.search);
    const alertMessage = urlParams.get('alert');
    if (alertMessage) {
        alert(alertMessage); // Hiển thị thông báo nếu có
    }

    // Event click cho login
    document.getElementById("loginButton").addEventListener("click", function(event) {
        event.preventDefault(); // Ngăn form submit nếu bạn muốn dùng JavaScript để kiểm soát chuyển hướng
        window.location.href = "aboutUs.html"; // Chuyển hướng đến trang đích
    });
};

// Hàm mở popup đăng ký
function openSignupPopup() {
    document.getElementById("signup-popup-container").style.display = "flex";
    document.getElementById("overlay").style.display = "block";
}

// Hàm đóng popup đăng ký
function closeSignupPopup() {
    document.getElementById("signup-popup-container").style.display = "none";
    document.getElementById("overlay").style.display = "none";
}
