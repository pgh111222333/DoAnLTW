window.onload = function() {
    // Tải nội dung header từ file HTML riêng
    fetch('header.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('header-container').innerHTML = data;
        })
        .catch(error => console.error('Error loading header:', error));
};
