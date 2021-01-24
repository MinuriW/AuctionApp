/* global data */
var isValidName = false;
var isValidDOB = false;
var isValidUsername = false;
var isValidEmail = false;
var isValidPassword = false;
var isValidConfirmPassword = false;
var doPasswordsMatch = false;
var isValidSecurityQuestion = false;
var isValidSecurityAnswer = false;
var isValidPhoto = false;
var isValidResume = false;

/* utilities */ 


function hasPresence(value) {
    return value != null && value.trim() != "";
}

function elemById(id) {
    var elem = document.getElementById(id);

    return elem;
}



function validatePresence(inputId, setIsValid) {
    
    var elem = String(elemById(inputId).value);

    if(hasPresence(elem)) {
        setIsValid(true);
    } else {
        setIsValid(false);
    }
	
}

function validateFirstName() {
    validatePresence('fname', function(value) {
        isValidName = value;
    });
    
}



function validateLastname() {
    validatePresence('lname', function(value) {
        isValidUsername = value;
    });	
}

function validateEmailFormat() {
    var email = String(document.getElementById('email').value);
    var found = email.match(/[a-zA-Z ]+\@[a-zA-Z ]+\.[a-zA-Z ]+/);
    return found != null && found.length != 0; 
}

function validateEmail() {
    validatePresence('email', function(value) {
        isValidEmail = value;
    });	

    isValidEmail = isValidEmail && validateEmailFormat();

}

function validatePassword() {
    validatePresence('password', function(value) {
        isValidPassword = value;
    });	
    if(isValidPassword && isValidConfirmPassword) {
        doPasswordsMatch = arePasswordsEqual();
    }
}

function arePasswordsEqual() {
    var password = document.getElementById('password').value;
    var confirmPassword = document.getElementById('confirmPassword').value;
    console.log(password);
    console.log(confirmPassword);
    return password == confirmPassword;
}

function validateConfirmPassword() {
    validatePresence('confirmPassword', function(value) {
        isValidConfirmPassword = value;
    });	

    if(isValidConfirmPassword) {
        doPasswordsMatch = arePasswordsEqual();
    }
}



// Validates every form field
function validateAll() {
    validateName();
    validateDOB();
    validateUsername();
    validatePassword();
    
}

// Returns whether the form values are valid
function isAllValid() {
    var isValid = isValidName;
    isValid = isValid && isValidUsername;
    isValid = isValid && isValidPassword;
    //isValid = isValid && isValidConfirmPassword;
    isValid = isValid && isValidEmail;
   
    
    return isValid;
    
}


validateAll();

var register = elemById('register');

register.addEventListener("click", function(e) {
    if(isAllValid()) {
        console.log("Valid form details!");
    } else {
        e.preventDefault();
        console.log("Invalid form details!");
    }
    
})
