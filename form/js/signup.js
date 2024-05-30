const userform = document.getElementById(signupForm);

function signup() {
    var username = document.getElementById('username').value.trim();
    var email = document.getElementById('email').value.trim();
    var password = document.getElementById('password').value;
    var mobile = document.getElementById('mobile').value.trim();
    var address = document.getElementById('address').value.trim();

    var usernameError = document.getElementById('usernameError');
    var emailError = document.getElementById('emailError');
    var passwordError = document.getElementById('passwordError');
    var mobileError = document.getElementById('mobileError');
    var addressError = document.getElementById('addressError');

    // Reset error messages
    usernameError.textContent = '';
    emailError.textContent = '';
    passwordError.textContent = '';
    mobileError.textContent = '';
    addressError.textContent = '';

    // Validation
    var valid = true;
    if (!username) {
        usernameError.textContent = 'Please enter a username';
        valid = false;
    }
    if (!email) {
        emailError.textContent = 'Please enter an email';
        valid = false;
    } else if (!isValidEmail(email)) {
        emailError.textContent = 'Please enter a valid email address';
        valid = false;
    }
    if (!password) {
        passwordError.textContent = 'Please enter a password';
        valid = false;
    } else if (password.length < 8) {
        passwordError.textContent = 'Password must have at least 8 characters';
        valid = false;
    }
    if (!mobile) {
        mobileError.textContent = 'Please enter a mobile number';
        valid = false;
    } else if (!isValidMobile(mobile)) {
        mobileError.textContent = 'Please enter a valid 10-digit mobile number';
        valid = false;
    }
    if (!address) {
        addressError.textContent = 'Please enter your address';
        valid = false;
    }

    if (valid) {
        // Create user object
        var user = {
            username: username,
            email: email,
            password: password,
            mobile: mobile,
            address: address
        };

        // Store user object in local storage
        localStorage.setItem('user', JSON.stringify(user));
        alert("user registered successfully")

        // Inform user and clear form
        document.getElementById('signupForm').reset();
        document.getElementById('successMessage').style.display = 'block';        
    }
}

function isValidEmail(email) {
    // Basic email validation
    var emailRegex = /\S+@\S+\.\S+/;
    return emailRegex.test(email);
}

function isValidMobile(mobile) {
    // Basic mobile number validation (exactly 10 digits)
    var mobileRegex = /^\d{10}$/;
    return mobileRegex.test(mobile);
}
