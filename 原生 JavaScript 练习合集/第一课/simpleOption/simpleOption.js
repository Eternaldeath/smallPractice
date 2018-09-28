var option = document.querySelectorAll('.page');

window.onload = function(){
	for(var i=0;i<option.length;i++){
		(function(i){
			option[i].onmouseover = function(){
				option[i].style.backgroundColor = '#C0C0C0';
				loadXMLDoc(i);
			}
			option[i].onmouseleave = function(){
				option[i].style.backgroundColor = '#000000';
			}
		})(i);
	}

	function loadXMLDoc(i){
		var xmlhttp;
	//红框范围内就是检查是否有现代浏览器的 XMLHttpRequest
	//XMLHttpRequest对象用于和后台进行数据交换
	if (window.XMLHttpRequest)
	{
		//  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		// 创建 XMLHttpRequest 对象
		xmlhttp=new XMLHttpRequest();
	}
	else
	{
		// IE6, IE5 浏览器执行代码
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			document.querySelector(".showContent").textContent=xmlhttp.responseText;
		}
	}

	 if(i == "0"){
	 	xmlhttp.open("GET","one_page.txt",true);
	 	xmlhttp.send();
	 }else if (i == "1") {
	 	xmlhttp.open("GET","two_page.txt",true);
	 	xmlhttp.send();		
	 }else if (i == "2") {
		xmlhttp.open("GET","three_page.txt",true);
		xmlhttp.send();			
	 }
	
}

}