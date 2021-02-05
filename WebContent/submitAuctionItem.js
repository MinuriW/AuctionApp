var isValidTitle = false;
var isValidCondition = false;
var isValidPhoto = false;
var isValidTimePeriod = false;
var isValidStartingPrice = false;

/* Setters */
function setIsValidTitle(value) {
	value = Boolean(value);
	
	isValidTitle = value;
}

function setIsValidTimePeriod(value) {
	value = Boolean(value);
	
	isValidTimePeriod = value;
}

function setIsValidStartingPrice(value) {
	value = Boolean(value);
	
	isValidStartingPrice = value;
}

function setIsValidCondition(value) {
	value = Boolean(value);
	
	isValidCondition = value;
}

function setIsValidPhoto(value) {
	value = Boolean(value);
	
	isValidPhoto = value;
}

/* Utilities */ 
function hasPresence(value) {
    return value != null && value.trim() != "";
}

function isGreaterThanZero(value) {
	value = Number(value);
	
	return value > 0.0;
}

function isCorrectPhotoFileType(photo) {
	photo = String(photo);
    var isFound = false;
    var found = photo.match(/\.jpg/);
    if(found != null)
        isFound = isFound || found.length != 0;

    found = photo.match(/\.jpeg/);
    if(found != null)
        isFound = isFound || found.length != 0;

    found = photo.match(/\.jpe/);
    if(found != null)
        isFound = isFound || found.length != 0;
    
    found = photo.match(/\.jfif/);
    if(found != null)
        isFound = isFound || found.length != 0;

    return isFound;
}

function elemById(id) {
    var elem = document.getElementById(id);

    return elem;
}

function validateConditions(inputId, setIsValid, conditions) {
    var elem = String(elemById(inputId).value);
    
    var value = true;
    
    for(var i = 0; i < conditions.length; ++i) {
    	value = value && conditions[i](elem);
    }

    console.log(value);
    setIsValid(value);
}


function validateTitle() {
	validateConditions('title', setIsValidTitle, [hasPresence])
}

function validateTimePeriod() {
	validateConditions('timePeriod', setIsValidTimePeriod, [hasPresence, isGreaterThanZero]);
}

function validateStartingPrice() {
	validateConditions('startingPrice', setIsValidStartingPrice, [hasPresence, isGreaterThanZero]);
}

function validateCondition() {
	validateConditions('condition', setIsValidCondition, [hasPresence]);
}

function validatePhoto() {
	validateConditions('photo', setIsValidPhoto,[hasPresence, isCorrectPhotoFileType] );
}

function isValidForm() {
	var isValid = isValidTitle;
	isValid = isValid && isValidCondition;
	isValid = isValid && isValidPhoto;
	isValid = isValid && isValidTimePeriod;
	isValid = isValid && isValidStartingPrice;
	
	return isValid;
}

function submitAuctionItem(e) {
	if(isValidForm()) {
		console.log('valid form');
	} else {
		console.log('invalid form');
		e.preventDefault();
	}
}

var submit = elemById('submit');
submit.addEventListener('click', submitAuctionItem);