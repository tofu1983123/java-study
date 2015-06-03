var XMLHttp;
function createXMLHttpRequest(){
	if(window.XMLHttpRequest){
		XMLHttp = new XMLHttpRequest();
	}else if(window.ActiveObject){
		XMLHttp= new ActiveObject("Microsoft.XMLHTTP");
	}
}
function checkEmail(){
	var email = document.forms[0].email.value;
	//通过js向后台发送请求
	createXMLHttpRequest();
	//注册回调方法
	XMLHttp.onreadystatechange = callback;
	//get发送的方式
	XMLHttp.open("GET", "UserServlet?action=checkMail&email="+email, true);
	XMLHttp.send(null);
}
function callback(){
	//alert(XMLHttp.readyState);
	//必须正常响应
	if(XMLHttp.readyState == 4){
		//判断http的交互是否成功
		if(XMLHttp.status == 200){
			//获取响应的值
			if("true" == XMLHttp.responseText)
				alert("email可以使用");
			else
				alert("email已经被使用,请输入其他email");
		}
	}
}
function checkName(){
	var name = document.forms[0].username.value;
	createXMLHttpRequest();
	XMLHttp.onreadystatechange = function(){
		if(XMLHttp.readyState==4){
    		if(XMLHttp.status==200){
    			//alert(XMLHttp.responseText);
    			if("true"==XMLHttp.responseText)
    				alert("登陆名可以使用");
    			else
    				alert("登陆名已经存在，请填写其它登陆名");

    		}
    	}
	};
	XMLHttp.open("POST", "UserServlet?action=checkName", true);
	//POST方式需要自己设置http的请求头
	XMLHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	//POST方式发送数据可以放这里
	XMLHttp.send("username="+name);
}