var displayedImage = document.querySelector('.displayed-img');
var thumbBar = document.querySelector('.thumb-bar');
var thumbBarImg = document.querySelectorAll('.thumb-bar img');
var imagesArray = ['images/pic1.jpg','images/pic2.jpg','images/pic3.jpg','images/pic4.jpg','images/pic5.jpg'];
var imgSrc;

btn = document.querySelector('button');
var overlay = document.querySelector('.overlay');

/* Looping through images */

function createThumBar(){
		for(var i=0;i<5;i++){
		  var newImage = document.createElement('img');
  		  newImage.setAttribute('src', imagesArray[i]);
  		  thumbBar.appendChild(newImage);
  		  newImage.onclick = function(e) {
    		 imgSrc = e.target.getAttribute('src');
    		displayImage(imgSrc);

    		
  		}

	}

	return imgSrc;
}

function displayImage(imgSrc) {
  displayedImage.setAttribute('src', imgSrc);
}



/* Wiring up the Darken/Lighten button */
btn.addEventListener('click', function(){
	if(btn.textContent == 'Darken'){
		btn.textContent = "Lighten";
		overlay.style.backgroundColor = '	#000000';
		overlay.style.opacity = '0.5';
	}else {
		btn.textContent = "Darken";
		overlay.style.backgroundColor = 'transparent';
		
	}
	
});

window.onload = function(){
	createThumBar();
	displayImage(imgSrc);
	displayedImage.setAttribute('src', imagesArray[0]);
}
