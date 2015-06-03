var obj;
var sid;
$(function(){
	var stockNode = $("#stock");
	stockNode.css("border","1px solid blue")
	.css("width",150)
	.css("background-color","yellow")
	.css("color","blue")
	.css("position","absolute");
	stockNode.hide();
	$("a").mouseover(function(event){
		//alert($(this).parent().attr("id"));
		sid = $(this).parent().attr("id");
		stockNode.css("left",event.clientX).css("top",event.clientY);
		updateDiv();
		stockNode.show();
	});
	$("a").mouseout(function(){
		stockNode.hide();
	});
	getInfo();
	setInterval(getInfo,1000);
	
});
function getInfo(){
	$.get("StockServlet",null,function(data){
		//obj = eval(data); //如果get方法的最后一个参数没写,就写成前面这样
		obj = data;
		var szzs = obj['30000'];
		var pfyh = obj['00001'];
		//alert(szzs.yes);
		//alert(szzs['yes']);
		var szzsspan = $("#30000").children("span");
		if(szzs.now > szzs.tod){
			szzsspan.css("color","red");
		}else{
			szzsspan.css("color","green");
		}
		szzsspan.html(szzs.now);
		var pfyhspan = $("#00001").children("span");
		if(pfyh.now > pfyh.tod){
			pfyhspan.css("color","red");
		}else{
			pfyhspan.css("color","green");
		}
		pfyhspan.html(pfyh.now);
		updateDiv();
	},"json");
}
function updateDiv(){
	var objdata = obj[sid];
	for(var proname in objdata){
		if(proname != "name"){
			$("#"+proname).children("span").html(objdata[proname]);
		}
	}
}