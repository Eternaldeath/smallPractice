
// 获取元素
var total = document.querySelector("#total");
var rev = document.querySelector("#rev");

var subject = document.querySelectorAll(".subject");


// 设置全选
total.onclick = function(){
	if (total.checked == true) {
		for(var i=0;i<subject.length;i++){
			subject[i].checked = "true";
		}
	}
rev.onclick = function(){
	if(rev.checked == true){
		for(var i=0;i<subject.length;i++){
			if(subject[i].checked == true){
				subject[i].checked = false;
			}else if (subject[i].checked == false) {
				subject[i].checked = true;
			}
		}		
	}
}

}