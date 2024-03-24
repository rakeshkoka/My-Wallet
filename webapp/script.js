const container = document.getElementById('container');
const registerBtn = document.getElementById('register');
const loginBtn = document.getElementById('login');

registerBtn.addEventListener('click', () => {
    container.classList.add("active");
});

loginBtn.addEventListener('click', () => {
    container.classList.remove("active");
});

/*function sendRequestToServlet() {
	
	let urlLink = document.querySelectorAll(".myButton");
    
    // Create a new XMLHttpRequest object
    var xhr = new XMLHttpRequest();
    
    // Define the request parameters
    var url = "Sign"; // Replace "servlet_url" with the actual URL of your servlet
    
    // Configure the request
    xhr.open("POST", url + urlLink, true);
    
    // Send the request
    xhr.send();
}*/