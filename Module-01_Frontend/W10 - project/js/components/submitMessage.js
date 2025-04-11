const formState = {
  name: false,
  email: false,
  phone: false,
  message: false,
};

function setError(inputId, errorId, message) {
  const input = document.getElementById(inputId);
  const error = document.getElementById(errorId);

  error.textContent = message;
  error.hidden = false;
  input.style.borderColor = "red";
}

function clearError(inputId, errorId) {
  const input = document.getElementById(inputId);
  const error = document.getElementById(errorId);

  error.hidden = true;
  input.style.borderColor = "";
}

function validateName() {
  const value = document.getElementById("contact-form-name").value.trim();

  if (!value) {
    setError("contact-form-name", "errorName", "Please enter your full name.");
    formState.name = false;
  } else if (value.toLowerCase() === "ironhack") {
    setError("contact-form-name", "errorName", "The name 'Ironhack' is not allowed.");
    formState.name = false;
  } else {
    clearError("contact-form-name", "errorName");
    formState.name = true;
  }

  checkFormState();
}

function validateEmail() {
  const value = document.getElementById("contact-form-email").value.trim().toLowerCase();
  const formatRegex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}(\.[0-9]{1,3}){3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

  if (!value) {
    setError("contact-form-email", "errorEmail", "Email is required.");
    clearError("contact-form-email", "errorFormatEmail");
    formState.email = false;
  } else if (!formatRegex.test(value)) {
    clearError("contact-form-email", "errorEmail");
    setError("contact-form-email", "errorFormatEmail", "Invalid email format.");
    formState.email = false;
  } else {
    clearError("contact-form-email", "errorEmail");
    clearError("contact-form-email", "errorFormatEmail");
    formState.email = true;
  }

  checkFormState();
}

function validatePhone() {
  const value = document.getElementById("contact-form-phone").value.trim();
  const isValid = /^\d{9}$/.test(value);

  if (!value) {
    setError("contact-form-phone", "errorPhone", "Phone number is required.");
    formState.phone = false;
  } else if (!isValid) {
    setError("contact-form-phone", "errorPhone", "Phone number must be exactly 9 digits.");
    formState.phone = false;
  } else {
    clearError("contact-form-phone", "errorPhone");
    formState.phone = true;
  }

  checkFormState();
}

function validateMessage() {
  const value = document.getElementById("contact-form-message").value.trim();

  if (value.length < 6) {
    setError("contact-form-message", "errorMessageUser", "Message must be at least 6 characters.");
    formState.message = false;
  } else {
    clearError("contact-form-message", "errorMessageUser");
    formState.message = true;
  }

  checkFormState();
}

function checkFormState() {
  const allValid = Object.values(formState).every(Boolean);
  document.getElementById("errorSubmit").hidden = allValid;
}

function sendForm(event) {
  event.preventDefault();

  validateName();
  validateEmail();
  validatePhone();
  validateMessage();

  const allValid = Object.values(formState).every(Boolean);
  const successMsg = document.getElementById("contact-form-success");

  if (allValid) {
    document.getElementById("errorSubmit").hidden = true;
    successMsg.style.display = "block";
    console.log("Form submitted:", {
      name: document.getElementById("contact-form-name").value,
      email: document.getElementById("contact-form-email").value,
      phone: document.getElementById("contact-form-phone").value,
      message: document.getElementById("contact-form-message").value,
    });
  } else {
    successMsg.style.display = "none";
  }
}
