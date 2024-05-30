const customers = []; 
function addCustomer() {
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const contactNo = document.getElementById("contactNo").value.trim();
    const accountType = document.getElementById("accountType").value; 
    const nameError = document.getElementById("nameError");
    const emailError = document.getElementById("emailError");
    const contactNoError = document.getElementById("contactNoError");
    const accountTypeError = document.getElementById("accountTypeError"); 
    let isValid = true; 
    nameError.textContent = "";
    emailError.textContent = "";
    contactNoError.textContent = "";
    accountTypeError.textContent = "";
 
    if (!/^[A-Za-z\s]+$/.test(name)) {
        nameError.textContent = "Please enter only alphabets.";
        isValid = false;
    }
 
    if (!/^\S+@\S+\.\S+$/.test(email)) {
        emailError.textContent = "Please enter a valid email.";
        isValid = false;
    }
 
    if (!/^[7-9][0-9]{9}$/.test(contactNo)) {
        contactNoError.textContent = "Please enter a valid contact number.";
        isValid = false;
    }
 
    if (!accountType) {
        accountTypeError.textContent = "Please select an account type.";
        isValid = false;
    }
 
    if (isValid) {
        const customer = {
            name,email,contactNo,accountType
        };
 
        customers.push(customer);
        console.log(customers); // Display customers array in console
        displayCustomers();
        document.getElementById("customerForm").reset();

    }

}
 
function displayCustomers() {
    const customerTableBody = document.querySelector("#customerTable tbody");
    customerTableBody.innerHTML = "";
    customers.forEach((customer, index) => {
        const row = document.createElement("tr"); 
        const nameCell = document.createElement("td");
        nameCell.textContent = customer.name;
        row.appendChild(nameCell); 
        const emailCell = document.createElement("td");
        emailCell.textContent = customer.email;
        row.appendChild(emailCell); 
        const contactNoCell = document.createElement("td");
        contactNoCell.textContent = customer.contactNo;
        row.appendChild(contactNoCell); 
        const accountTypeCell = document.createElement("td");
        accountTypeCell.textContent = customer.accountType;
        row.appendChild(accountTypeCell); 
        customerTableBody.appendChild(row);
    });

}
