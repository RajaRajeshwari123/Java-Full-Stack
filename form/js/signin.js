function signIn() {
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value;

    var emailError = document.getElementById('emailError');
    var passwordError = document.getElementById('passwordError');

    // Reset error messages
    emailError.textContent = '';
    passwordError.textContent = '';

    // Retrieve user data from local storage
    var userData = localStorage.getItem('user');
    if (userData) {
        var user = JSON.parse(userData);
        // Check if entered credentials match
        if (user.email === email && user.password === password) {
            // Sign in successful
            // Redirect to sign-out page
            alert("user logged successfully");
            window.location.href = "../html/signout.html";
            return false; // Prevent form submission
        } else {
            // Incorrect credentials
            emailError.textContent = 'Incorrect email or password';
            return false; // Prevent form submission
        }
    } else {
        // No user data found
        emailError.textContent = 'No user found with this email';
        return false; // Prevent form submission
    }
   
}