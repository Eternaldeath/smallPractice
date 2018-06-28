// 获取当前年份
var myDate = new Date();
var year = myDate.getFullYear(); 
var month = myDate.getMonth()+1;
var date = myDate.getDate();
var week = ['星期天','星期一','星期二','星期三','星期四','星期五','星期六'];
var weekNumber = myDate.getDay();
var todayyear = document.querySelector(".query-today");
todayyear.innerHTML = year+"年	";
todayyear.innerHTML += month+"月	";
todayyear.innerHTML += date+"号	";
todayyear.innerHTML += week[weekNumber];



// 获取下拉框内容
var selectmonth = document.querySelector("#selectmonth");
selectmonth.onclick = function(){
	var choice = selectmonth.value;
	createcalendar(choice);
}

// 获取ul
var list = document.querySelector("#ul");

// 创建日历
function createcalendar(choice){
	list.innerHTML = '';
	var datenum;
	if(choice === '一月' || choice === '三月' || choice === '五月'|| choice === '七月' || choice === '九月' || choice === '十一月'){
		datenum = 31;
	}else if(choice === '二月'){
		datenum = 28;
	}else{
		datenum = 30;
	}

	for(var i=0;i<datenum;i++)
	{
		    var listItem = document.createElement('li');
    		listItem.textContent = i+1;
    		list.appendChild(listItem);
	}

}