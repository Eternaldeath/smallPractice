
window.onload = function(){
	var clickOn = document.querySelector('.clickOn');
	var clickOut = document.querySelector('.clickOut');
	var backgroundPopUp = document.querySelector('.background');

	clickOn.onclick = function(){
		backgroundPopUp.style.display = 'block';
	}	

	clickOut.onclick = function(){
		backgroundPopUp.style.display = 'none';
	}
}
