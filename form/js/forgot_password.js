function forgotPassword() {
    var email = document.getElementById('email').value.trim();
    // Implement logic to check if email exists
    if (emailExists(email)) {
        // Redirect to reset password page
        window.location.href = "../html/reset_password.html";
        return false; // Prevent form submission
    } else {
        // Email not found, show error
        document.getElementById('emailError').textContent = 'Email not found';
        return false; // Prevent form submission
    }
}

function emailExists(email) {
    // Implement logic to check if email exists in your system
    return true; // Dummy logic, replace with actual implementation
}
