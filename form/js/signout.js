function signOut() {
    // Clear user data from local storag
    // Inform user and clear form
    document.getElementById('signoutMessage').style.display = 'block';
    // Redirect to sign-up page after 2 seconds
    setTimeout(function() {
        window.location.href = "../html/signin.html";
    }, 2000);
}