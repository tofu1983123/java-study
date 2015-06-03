$(function(){
	var ebtn=$("#ebtn");
	ebtn.click(function(){
		var email = $("#email").val();
		$.get("UserServlet",{action:"checkMail",email:email},function(data){
			//alert(data);
			if("true"==data){
				alert("email可以使用");
			}else{
				alert("email已经存在请重新输入!");
			}
		});
	});
	
	var lbtn = $("#lbtn");
	lbtn.click(function(){
		var username = $("#username").val();
		$.post("UserServlet",{action:"checkName",username:username},function(data){
			if("true"==data){
				alert("用户名可以使用");
			}else{
				alert("请重新输入用户名，用户名已经存在")
			}
		});
	});
});