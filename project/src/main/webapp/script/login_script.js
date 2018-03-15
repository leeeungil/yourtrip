function titleOff_hide() {
	var objDiv = document.getElementById("company_in");
	var objDiv1 = document.getElementById("member_in");

	objDiv1.style.display = "none";

	if (objDiv.style.display == "block") {

	} else {
		objDiv.style.display = "block";
	}
}

function titleOn_hide() {
	var objDiv = document.getElementById("member_in");
	var objDiv1 = document.getElementById("company_in");

	objDiv1.style.display = "none";

	if (objDiv.style.display == "block") {

	} else {
		objDiv.style.display = "block";
	}
}

function login() {
	var loginForm = document.getElementById("loginmodal");

	if (loginForm.style.display == "none") {

		loginForm.style.display = "block";

	} else if (loginForm.style.display == "block") {

		loginForm.style.display = "none";
	}

}
