function resetPassword() {
  const password = document.getElementById('password').value;
  const confirmPassword = document.getElementById('confirmPassword').value;

  const passwordError = document.getElementById('passwordError');
  const confirmPasswordError = document.getElementById('confirmPasswordError');

  // Reset error messages
  passwordError.textContent = '';
  confirmPasswordError.textContent = '';

  // Validation
  let valid = true;

  if (!password) {
      passwordError.textContent = 'Please enter a new password';
      valid = false;
  }

  if (!confirmPassword) {
      confirmPasswordError.textContent = 'Please confirm your new password';
      valid = false;
  } else if (password !== confirmPassword) {
      confirmPasswordError.textContent = 'Passwords do not match';
      valid = false;
  }

  if (valid) {
      // Update password in local storage
      const userData = JSON.parse(localStorage.getItem('user'));
      userData.password = password;
      localStorage.setItem('user', JSON.stringify(userData));

      // Inform user about successful password reset
      alert("Password reset successful");

      // Redirect to sign-in page
      window.location.href = "../html/signin.html";
  }

  return false; // Prevent form submission
}
